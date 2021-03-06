package com.company;

import java.util.ArrayList;

public class Customer {
    private String fName;
    private String lName;
    private static char[] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    ArrayList<Customer> customers = new ArrayList<Customer>();


    public Customer(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        int countFName = 0;
        int countLName = 0;

        for (int i = 0; i < letters.length; i++) {
            if (fName.charAt(0) == letters[i]) {
                countFName = (i + 1);
            }
            if (lName.charAt(0) == letters[i]) {
                countLName = (i + 1);
            }

        }
        System.out.printf("The account number is: %c%c-%s-%s-%s, pin code is %s%s\n", fName.charAt(0), lName.charAt(0), fName.length() + lName.length(), countFName, countLName, countFName, countLName);
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }
}
