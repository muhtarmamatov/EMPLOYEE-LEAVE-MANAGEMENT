package com.ems.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "TBL_POSITION")
@Data
@EqualsAndHashCode(callSuper = false)
public class Position extends AbstractEntity{

    @Column(name = "POSITION_NAME_EN")
    private String positionNameEN;

    @Column(name = "POSITION_NAME_RU")
    private String positionNameRU;

    @Column(name = "POSITION_DESCRIPTION")
    private String positionDescription;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @OneToOne(mappedBy = "position")
    private Employee employee;
}
