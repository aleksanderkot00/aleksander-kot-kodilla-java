package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmpoyeeFacadeTestSuite {

    @Autowired
    private CompanyAndEmpoyeeFacade facade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    @Transactional
    public void testFindEmployeesByPartOfName() {
        //Given
        Employee employee1 = new Employee("ABCDJohn", "Smith");
        Employee employee2 = new Employee("Stephanie", "ClabcrcksonABCD");
        Employee employee3 = new Employee("Linda", "KovaABCDlskya");
        Employee employee4 = new Employee("LindABCa", "Kovalskya");

        Company company1 = new Company("Software Machine");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company1.getEmployees().add(employee3);
        company1.getEmployees().add(employee4);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);
        employee3.getCompanies().add(company1);
        employee4.getCompanies().add(company1);

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        //When
        List<Employee> employees1 = facade.findEmployeeByPartOfName("ABCD");
        List<Employee> employees2 = facade.findEmployeeByPartOfName("ABC");

        //Then
        Assert.assertEquals(3, employees1.size());
        Assert.assertEquals(4, employees2.size());
    }

    @Test
    @Transactional
    public void testFindCompaniesByPartOfName() {
        //Given
        Employee employee1 = new Employee("John", "Smith");

        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data MaestersXYZ");
        Company company3 = new Company("XYGrey Matter");
        Company company4 = new Company("GreXYZatter");

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee1);
        company3.getEmployees().add(employee1);
        company4.getEmployees().add(employee1);
        employee1.getCompanies().add(company1);
        employee1.getCompanies().add(company2);
        employee1.getCompanies().add(company3);
        employee1.getCompanies().add(company4);

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        //When
        List<Company> companies1 = facade.findCompanyByPartOfName("XYZ");
        List<Company> companies2 = facade.findCompanyByPartOfName("XY");

        //Then
        Assert.assertEquals(2, companies1.size());
        Assert.assertEquals(3, companies2.size());
    }
}