package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Задача 1 + 2
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = middleName + firstName + lastName;
        fullName = fullName.toUpperCase();
        System.out.println("full name is " + fullName);
    // Задача 3
        String fullName2 = "Семён Семёнович Семёнов";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("employee full name is " + fullName2);









        String phone = "+903 018 99 18";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length()==10) {
          //  phone = "7" + phone;
        } else if(phone.length()>11){
            throw new RuntimeException("phone number too long");
        } else if (phone.length() < 10) {
            throw new RuntimeException("phone number too short");
        } else if (phone.length() ==11 && phone.charAt(0) != '7') {
            throw new RuntimeException("traitor");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79030189918";
        if (phone.equals(expectedPhone)) {
            System.out.println("success");
        } else {
            System.out.println("bruh");
        }
    }
}
