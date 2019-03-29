package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephabcnie", "Clabcrckson");
        Employee lindaKovalsky = new Employee("Lindabc", "Kovalskya");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
//        try {
//            companyDao.delete(softwareMachineId);
//            companyDao.delete(dataMaestersId);
//            companyDao.delete(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
    }

    @Test
    public void testRetrieveCompaniesWithFirstThreeChars() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company softwareMaesters = new Company("Software Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(softwareMaesters);
        companyDao.save(greyMatter);

        int softwareMachineId = softwareMachine.getId();
        int softwareMaestersId = softwareMaesters.getId();
        int greyMatterId = greyMatter.getId();

        //When

        List<Company> companiesStartingWithSof = companyDao.retrieveCompaniesWithFirstThreeChars("Sof");
        List<Company> companiesStartingWithGre = companyDao.retrieveCompaniesWithFirstThreeChars("Gre");

        //Then

        try {
            Assert.assertEquals(2, companiesStartingWithSof.size());
            Assert.assertEquals(1, companiesStartingWithGre.size());
        } finally {
            //CleanUp
            companyDao.delete(softwareMachineId);
            companyDao.delete(softwareMaestersId);
            companyDao.delete(greyMatterId);
        }
    }

    @Test
    public void testRetrieveEmployeesWithLastname() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaSmith = new Employee("Linda", "Smith");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaSmith);

        int johnSmithId = johnSmith.getId();
        int stephanieClarcksonId = stephanieClarckson.getId();
        int lindaSmithId = lindaSmith.getId();

        //When
        List<Employee> employeesWithLastNameClarckson = employeeDao.retrieveEmployeesWithLastname("Clarckson");
        List<Employee> employeesWithLastNameSmith = employeeDao.retrieveEmployeesWithLastname("Smith");

        //Then
        try {
            Assert.assertEquals(1, employeesWithLastNameClarckson.size());
            Assert.assertEquals(2, employeesWithLastNameSmith.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmithId);
            employeeDao.delete(stephanieClarcksonId);
            employeeDao.delete(lindaSmithId);
        }
    }

    @Test
    public void testFindByPartOfName(){
        List<Employee> employees = employeeDao.findByPartOfName("abcada");
        System.out.println(employees.size());
    }
}