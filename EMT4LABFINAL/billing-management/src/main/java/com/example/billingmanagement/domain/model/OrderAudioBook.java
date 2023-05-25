package com.example.billingmanagement.domain.model;

import com.example.billingmanagement.domain.valueobjects.AudioBookId;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order-audiobook")
public class OrderAudioBook extends AbstractEntity<OrderAudioBookId>{

    private Money audioBookPrice;

    @AttributeOverride(name="id", column = @Column(name = "audiobook_id", nullable = false))
    private AudioBookId audioBookId;

    public Money subtotal(){
        return audioBookPrice;
    }
}
