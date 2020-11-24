package com.company;

public class TestDriver {
    public static void run(){
        testCustomer();
        testWriteToFile();
    }

    private static void testWriteToFile() {
        WriteToFile wf = new WriteToFile();
        wf.OpenFile();
        wf.AddRecords();
        wf.CloseFile();
    }

    private static void testCustomer() {
        Customer c = new Customer("joe", "smith");
        c.addCustomer(c);
        Customer c1 = new Customer("alex", "silva");
        c1.addCustomer(c);

    }

}
