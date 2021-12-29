package com.ems.model.constants;

import lombok.Getter;

@Getter
public enum  Roles {

    ADMIN("Admin"),HR("Human Resource"),
    MANAGER("Manager"),EMPLOYEE("Employee");

    private String description;

    Roles(String description) {
        this.description = description;
    }
    public String getName(){
        return super.toString();
    }
}


