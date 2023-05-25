package com.example.audiobookmanagement.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import lombok.NonNull;

public class Length implements ValueObject {

    private int lengthHours;

    private int lengthMinutes;

    private int lengthSeconds;

    protected Length(){
        this.lengthHours = 0;
        this.lengthMinutes = 0;
        this.lengthSeconds = 0;
    }

    public Length(@NonNull int lengthHours, @NonNull int lengthMinutes, @NonNull int lengthSeconds){
        this.lengthHours = lengthHours;
        this.lengthMinutes = lengthMinutes;
        this.lengthSeconds = lengthSeconds;
    }

}
