package lib;

import java.util.List;

public class Symvasiouxos extends Ypallhlos implements Misthos {
    private final ReadTxt reader;

    public Symvasiouxos(String fName, String lName, int id,String employeeType, ReadTxt reader) {
        super(fName, lName, id,employeeType); 
        this.reader = reader;
    }

    @Override
    public float getTotalMisthos(List<String> months) {
        float totalMisthos = 0;
        // For each month in the list get the result from getTotalMisthosForSymvasiouxos in the Readtxt class
        for (String month : months) {
            totalMisthos += reader.getTotalMisthosForSymvasiouxos(month, getId(), getEmployeeType());
        } 
        return totalMisthos;
    }
}
