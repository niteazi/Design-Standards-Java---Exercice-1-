package lib;

import java.util.List;

public class Ypsilomisthos extends Ypallhlos implements Misthos {
    private static final int SALARY = 2000;

    public Ypsilomisthos(String fName, String lName, int id,String employeeType) {
        super(fName, lName, id,employeeType);
    }

    @Override
    public float getTotalMisthos(List<String> months) {
        return months.size() * SALARY;
    }
}
