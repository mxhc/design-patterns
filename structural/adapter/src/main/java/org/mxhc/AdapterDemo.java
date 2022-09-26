package org.mxhc;

import org.mxhc.adapter.EmployeePersonAdapter;
import org.mxhc.date.BirthdayCelebrator;
import org.mxhc.date.Person;
import org.mxhc.external.Employee;

import java.time.LocalDate;

public class AdapterDemo {
    public static void main(String[] args) {
        Person person = new Person("Dragoslav", LocalDate.of(1978, 4, 4));
        
        //we get this from third party source
        Employee employee = new Employee("Milan", "21.12.1992.",5579 );
    
        BirthdayCelebrator birthdayCelebrator = new BirthdayCelebrator();
        
        birthdayCelebrator.congratulateBirthday(person);
    
        EmployeePersonAdapter employeePersonAdapter = new EmployeePersonAdapter(employee);
        
        birthdayCelebrator.congratulateBirthday(employeePersonAdapter);
    
    
    }
}