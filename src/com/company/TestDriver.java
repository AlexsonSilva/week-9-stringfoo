package com.company;

public class TestDriver {
    public static void run(){
        testCustomer();
    }

    private static void testCustomer() {
        Customer c = new Customer("joe", "smith");
        c.addCustomer(c);
        Customer c1 = new Customer("alex", "silva");
        c1.addCustomer(c);

    }

}
