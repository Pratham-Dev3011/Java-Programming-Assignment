package Advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
    public static void main(String[] args) {
        String filePath = "data.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

        
            while ((line = br.readLine()) != null) {
                
                String[] values = line.split(",");

                
                for (String value : values) {
                    System.out.print(value.trim() + "  ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
