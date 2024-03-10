package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxt {
    private final String filePath;

    public ReadTxt(String filePath) {
        this.filePath = filePath;
    }

    public float getTotalMisthosForMonthAndId(String month, int id) {
        float totalMisthos = 0;
        try {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                //columns are split by whitespace 
                String[] columns = line.split("\\s+");
                int employeeId = Integer.parseInt(columns[0]);
                String contractMonth = columns[1];
                float amount = Float.parseFloat(columns[2]);
                
                //equalsIgnoreCase compares months ignoring uppercase or lowercase letters
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
}
