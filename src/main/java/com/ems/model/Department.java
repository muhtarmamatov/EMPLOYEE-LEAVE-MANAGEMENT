package com.ems.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TBL_DEPARTMENT")
@Data
@EqualsAndHashCode(callSuper = false)
public class Department extends AbstractEntity{

    @Column(name = "DEPARTMENT_NAME_EN")
    private String departmentNameEN;

    @Column(name = "DEPARTMENT_NAME_RU")
    private String departmentNameRU;

    @Column(name = "DEPARTMENT_DESCRIPTION")
    private String departmentDescription;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    private List<Position> positions;

    @OneToOne(mappedBy = "department")
    private Employee employee;
}
