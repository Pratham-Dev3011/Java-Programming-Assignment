package Advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
    public static void main(String[] args) {
        String filePath = "data.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Split line by comma
                String[] values = line.split(",");

                // Print each value
                for (String value : values) {
                    System.out.print(value.trim() + "  ");
                }
                System.out.println(); // move to next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
