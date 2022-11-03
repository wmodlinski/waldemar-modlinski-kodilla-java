package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesWithThreeFirstLettersAsGiven(@Param("FIRSTLETTERS") String firstLetters);

    @Query
    List<Company> retrieveCompaniesWithLettersAsGiven(@Param("LETTERS") String letters);

    @Query("SELECT c FROM Company c where c.name like ?1")
    List<Company> findCompaniesByNameFragment( String nameFragment);

}