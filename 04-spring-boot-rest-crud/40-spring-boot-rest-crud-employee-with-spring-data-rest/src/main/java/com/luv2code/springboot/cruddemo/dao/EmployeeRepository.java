package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // spring rest data would auto create endpoint from employee's'
    // but spring rest data wont create complex pluriaztion
    // you can also manually setup path by @RepositoryRestResource(path = "members")

    // that's it ... no need to write any code LOL!

}
