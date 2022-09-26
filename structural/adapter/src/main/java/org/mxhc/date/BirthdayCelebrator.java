package org.mxhc.date;

import java.time.LocalDate;

public class BirthdayCelebrator {
    
    protected static boolean isBirthdayToday(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return today.getMonth().equals(birthday.getMonth()) && today.getDayOfMonth() == birthday.getDayOfMonth();
    }
    
    public void congratulateBirthday(BirthdayInterface person) {
        if(isBirthdayToday(person.getBirthday())){
            System.out.println("Srecan srecan rodjendan, jos dugo da slavis!!!");
        }else {
            System.out.println("Danas nije tvoj rodjendan.");
        }
    }
    
}
