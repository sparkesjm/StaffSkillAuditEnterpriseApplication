package com.example.allocation.domain.staff;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import com.example.allocation.domain.common.ValueObject;

@EqualsAndHashCode
@ToString
@Getter
public class StaffName extends ValueObject {
    private String firstName;
    private String surname;

    public StaffName(String firstName, String surname){
        setFirstName(firstName);
        setSurname(surname);
    }
    //unit test//
    public StaffName(StaffName fullName){
        this(fullName.firstName, fullName.surname);
    }

    private void setFirstName(String firstName){
        this.assertArgumentNotEmpty(firstName,"First Name cannot be empty");
        this.assertArgumentLength(firstName, 1,24,"first name must be no more than 24 characters, please validate input and try again");
        this.firstName = firstName;
    }

    private void setSurname(String surname){
        this.assertArgumentLength(surname, 1,24,"Surname must be no more than 24 characters, please validate input and try again");
        this.surname = surname;
    }

    public String toString(){
        return String.format("%s %s", firstName, surname);
    }
    public String firstName(){
        return this.firstName;
    }
    public String surname(){
        return this.surname;
    }
}
