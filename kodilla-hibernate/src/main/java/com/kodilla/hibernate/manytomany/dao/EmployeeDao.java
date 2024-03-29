package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeeByLastName(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> retrieveEmployeeByAnyLetters(@Param("LETTERS") String letters);

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1 OR e.lastName LIKE ?1")
    List<Employee> findEmployeesByNameFragment(String nameFragment);
}