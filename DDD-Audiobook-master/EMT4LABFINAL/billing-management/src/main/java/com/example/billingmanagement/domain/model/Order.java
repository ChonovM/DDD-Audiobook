package com.example.billingmanagement.domain.model;

import com.example.billingmanagement.domain.valueobjects.AudioBook;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Currency;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity<OrderId> {

    private Instant orderedOn;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    @Transient
    private Money total;

    @Column(name = "order_currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<OrderAudioBook> orderAudioBookList;

    public Order(){

    }

    public Money total(){
        return orderAudioBookList.stream().map(OrderAudioBook::subtotal).reduce(new Money (currency, 0), Money::add);
    }

    public OrderAudioBook addAudioBook(@NonNull AudioBook audioBook){
        Objects.requireNonNull(audioBook, "Audiobook must not be null");
        var book = new OrderAudioBook(audioBook.getAudioBookName(), audioBook.getAudioBookPrice(), audioBook.getAudioBookLength() );
        orderAudioBookList.add(book);
        return book;
    }

    public OrderAudioBook removeAudioBook(@NonNull OrderAudioBookId orderAudioBookId){
        orderAudioBookList.removeIf(v->v.getId().equals(orderAudioBookList));
    }
}
