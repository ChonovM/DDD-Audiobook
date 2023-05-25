package com.example.audiobookmanagement.domain.models;

import com.example.audiobookmanagement.domain.valueobjects.Length;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "audiobook")
public class AudioBook extends AbstractEntity<AudioBookID>{

    private AudioBookID audioBookID;

    private String audioBookName;

    private Money audioBookPrice;

    private Length audioBookLength;
}
