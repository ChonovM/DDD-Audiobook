package com.example.billingmanagement.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import com.example.sharedkernel.domain.financial.Currency;
import com.example.sharedkernel.domain.financial.Length;
import com.example.sharedkernel.domain.financial.Money;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public class AudioBook implements ValueObject {

    private final String audioBookName;

    private final Money audioBookPrice;

    private final Length audioBookLength;

    @JsonCreator
    public AudioBook(){
        this.audioBookName = "";
        this.audioBookPrice = Money.valueOf(Currency.MKD, 0);
        this.audioBookLength = Length.valueOf(0,0,0);
    }

}
