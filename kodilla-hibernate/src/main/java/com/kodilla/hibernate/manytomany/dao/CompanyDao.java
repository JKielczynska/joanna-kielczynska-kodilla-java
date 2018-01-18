package com.kodilla.hibernate.manytomany.dao;

import javax.transaction.Transactional;

import java.util.List;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveCompaniesByFirstThreeCharacters(@Param("THREEFIRSTCHARACTERS") String threeFirstCharacters);

    @Query
    List<Company> retrieveCompaniesByPartOfName(@Param("PARTOFNAME") String partOfName);
}
