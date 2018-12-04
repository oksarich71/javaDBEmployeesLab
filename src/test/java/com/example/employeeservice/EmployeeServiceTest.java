package com.example.employeeservice;

import com.example.employeeservice.models.Department;
import com.example.employeeservice.models.Employee;
import com.example.employeeservice.models.Project;
import com.example.employeeservice.repositories.DepartmentRepository;
import com.example.employeeservice.repositories.EmployeeRepository;
import com.example.employeeservice.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeeServiceTest {

        @Autowired
        EmployeeRepository employeeRepository;

        @Autowired
        DepartmentRepository departmentRepository;

        @Autowired
        ProjectRepository projectRepository;

        @Test
        public void contextLoads() {

        }
        @Test
        public void cancreateemployeeAndDepartment(){
            Department department = new Department("Engineering");
            departmentRepository.save(department);

            Employee employee = new Employee("Jack Wills", 45, 678, "JWills@gmail.com", department);

            employeeRepository.save(employee);

        }
        @Test
        public void canCreateEmployeeAndProject(){
            Department department = new Department("Engineering");
            departmentRepository.save(department);
            Employee employee = new Employee("Jack Brown", 34, 875, "JBrown@gmail.com", department);
            employeeRepository.save(employee);


            Project project = new Project("Java HR", 30);
            project.addEmployeeToProject(employee);
            projectRepository.save(project);

        }


}
