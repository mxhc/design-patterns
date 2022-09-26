package org.mxhc.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BirthdayCelebratorTest {
    
    @Test
    void isBirthdayTodayTrue() {
        // given persons birthday
        LocalDate personsBirthday = LocalDate.now();
        // then
        assertTrue(BirthdayCelebrator.isBirthdayToday(personsBirthday));
    }
    
    @Test
    void differentYearSameDate() {
        // given
        LocalDate birthday = LocalDate.now();
        birthday = birthday.minusYears(44);
        // then
        assertTrue(BirthdayCelebrator.isBirthdayToday(birthday));
    }
    
    @Test
    void differentYearNotSameDate() {
        // given
        LocalDate birthday = LocalDate.now();
        birthday = birthday.minusYears(44);
        birthday = birthday.minusDays(1);
        // then
        assertFalse(BirthdayCelebrator.isBirthdayToday(birthday));
    }
}