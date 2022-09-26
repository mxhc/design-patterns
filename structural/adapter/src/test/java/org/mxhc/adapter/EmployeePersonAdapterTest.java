package org.mxhc.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mxhc.external.Employee;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeePersonAdapterTest {
    
    EmployeePersonAdapter employeePersonAdapter;
    Employee employee;
    
    @BeforeEach
    void setup() {
        employee = new Employee("Milan", "21.12.1992.", 555);
        employeePersonAdapter = new EmployeePersonAdapter(employee);
    }
    
    @Test
    void testMethod() {
        var date = employeePersonAdapter.getBirthday();
        assertEquals(LocalDate.of(1992, 12, 21), date);
    }
    
    
}