package com.company;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteToFile {
    private static Formatter output;

        private static String fileName = "customers.txt";


        private void OpenFile() {
            try {
                output = new Formatter(fileName);
            } catch (SecurityException securityException) {
                System.out.println("Write permission denied");
                System.exit(1);
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("Error opening file, Terminating");
                System.exit(1);
            }
        }

        private void AddRecords(){



        }

        private void CloseFile() {
            if (output != null) {
                output.close();
            }
        }

}

