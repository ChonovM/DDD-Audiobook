package com.example.billingmanagement.domain.model;

import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order-audiobook")
public class OrderAudioBook extends AbstractEntity<OrderAudioBookId>{

    private Money audioBookPrice;

    private OrderAudioBookId orderAudioBookId;
}
