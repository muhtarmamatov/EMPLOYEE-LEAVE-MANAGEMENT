package com.ems.repository;

import com.ems.model.Employee;
import com.ems.repository.projections.AccountStatusView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<AccountStatusView> getAccountStatusByEmailAddress(String emailAddress);
}
