package org.mxhc.adapter;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.mxhc.date.BirthdayInterface;
import org.mxhc.external.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@Data
public class EmployeePersonAdapter implements BirthdayInterface {
    
    public static final String DATE_TEMPLATE = "dd.MM.yyyy.";
    private final Employee employee;
    
    @Override
    public LocalDate getBirthday() {
        return convertStringToDate(employee.getDate());
    }
    
    private LocalDate convertStringToDate(String dateString) {
        var formatter = DateTimeFormatter.ofPattern(DATE_TEMPLATE);
        return LocalDate.parse(dateString, formatter);
    }
    
}

