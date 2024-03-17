package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxt {

    private final String filePath;

    public ReadTxt(String filePath) {
        this.filePath = filePath;
    }

    public float getTotalMisthosForSymvasiouxos(String month, int id, String employeeType) {
        //initialize total misthos of symvasiouxos
        float totalMisthos = 0;
        try {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                //split by whitespace
                String[] columns = line.split("\\s+");
                //id is first column in txt file.Integer.parseInt converts the string into int aka converts employee id into int
                int employeeId = Integer.parseInt(columns[0]);
                //month is second column in txt file
                String contractMonth = columns[1];
                //amount is third column in txt file converts into float
                float amount = Float.parseFloat(columns[2]);
                
                if (employeeId == id && contractMonth.equalsIgnoreCase(month)) {
                    totalMisthos += amount;
                }
            }
        scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found or not accessible: " + filePath);
        }

        return totalMisthos;
    }

    float getBonusForManager(int id) {
        try {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                //split by whitespace               
                String[] columns = line.split("\\s+");
                //first column is id. converts into int
                int employeeId = Integer.parseInt(columns[0]);
                //second column is bonus. converts into float
                float bonus = Float.parseFloat(columns[1]);

                if (employeeId == id) {
                    return bonus;
                }
            }
        scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Bonus file not found or not accessible" + filePath);
        }

        // Return 0 if bonus not found for the given id
        return 0;
    }
}
