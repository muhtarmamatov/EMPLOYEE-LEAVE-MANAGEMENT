package com.ems.model.constants;

import lombok.Getter;

@Getter
public enum AccountStatus {

    ACTIVE("Active"),DISABLED("Disabled"),PENDING("Pending");

    private String description;

    AccountStatus(String description) {
        this.description = description;
    }

    public String getName(){
        return super.toString();
    }
}
