package com.ems.model;

import com.ems.model.constants.AccountStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TBL_EMPLOYEE")
@Data
@EqualsAndHashCode(callSuper = false)
public class Employee extends AbstractEntity {

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "PHOTO")
    private String photo;

    @Column(name = "ACTIVATION_CODE")
    private String activationCode;

    @Column(name = "NAME_EN")
    private String nameEN;

    @Column(name = "NAME_RU")
    private String nameRU;

    @Column(name = "ACCOUNT_STATUS")
    private AccountStatus status;

    @Column(name = "EMPLOYEE_GENDER")
    private Gender gender;

    @Column(name = "PHONE_EXTENSION")
    private String phoneExt;

    @Column(name = "MOBILE_NUMBER")
    private String mobilePhone;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "DATE_OF_JOINING")
    private LocalDate dateOfJoining;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employee")
    private List<Address> addresses;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Contact> contacts;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_role",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @OneToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @OneToOne
    @JoinColumn(name = "POSITION_ID")
    private Position position;
}
