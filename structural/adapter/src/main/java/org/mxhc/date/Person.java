package org.mxhc.date;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Person implements BirthdayInterface {
    
    private String name;
    private LocalDate birthday;
    
    @Override
    public LocalDate getBirthday() {
        return birthday;
    }
    
}
