package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeFacadeTest {

    @Autowired
    private EmployeeFacade employeeFacade;

    @Autowired
    private EmployeeDao employeeDb;

    @Test
    void findEmployeeByNameFragment() {

        //Given
        Employee employee = new Employee("Zdzisław", "Kubica");
        employeeDb.save(employee);

        //When
        int searchByFirstNameFragment   = employeeFacade.findEmployeeBy("dzi").size();
        int searchByLastNameFragment    = employeeFacade.findEmployeeBy("ica").size();

        //Then
        assertEquals(1, searchByFirstNameFragment);
        assertEquals(1, searchByLastNameFragment);

        //CleanUp
        employeeDb.deleteById(employee.getId());
    }
}
