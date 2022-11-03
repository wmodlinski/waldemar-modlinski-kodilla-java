package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private final EmployeeDao employeeDb;

    @Autowired
    public EmployeeFacade(EmployeeDao employeeDb) {
        this.employeeDb = employeeDb;
    }

    public List<Employee> findEmployeeBy(String nameFragment){
        String searchFragment = "%" + nameFragment + "%";
        return employeeDb.findEmployeesByNameFragment(searchFragment);
    }
}
