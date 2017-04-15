package com.swiftbeard.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by edmac on 4/14/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
