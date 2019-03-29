package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmpoyeeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyAndEmpoyeeFacade.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmployeeByPartOfName(String partOfName) {
        LOGGER.info("Start finding employees with a name containing: " + partOfName);
        List<Employee> employees = employeeDao.findByPartOfName(partOfName);
        LOGGER.info("Found " + employees.size() + " employees.");
        return employees;
    }

    public List<Company> findCompanyByPartOfName(String partOfName) {
        LOGGER.info("Start finding companies with a name containing: " + partOfName);
        List<Company> companies = companyDao.findByPartOfName(partOfName);
        LOGGER.info("Found " + companies.size() + " companies.");
        return companies;
    }
}
