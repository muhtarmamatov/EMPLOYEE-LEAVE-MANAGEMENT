package com.ems.model;

import lombok.Getter;

@Getter
public enum  Gender {
    MALE("Male"),FEMALE("Female");
    private String description;

    Gender(String description) {
        this.description = description;
    }
    public String getName(){
        return super.toString();
    }
}
