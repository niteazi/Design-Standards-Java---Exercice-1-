package lib;

import java.util.List;

public class Xamilomisthos extends Ypallhlos implements Misthos {
    private static final int SALARY = 1000;

    public Xamilomisthos(String fName, String lName, int id,String employeeType) {
        super(fName, lName, id,employeeType);
    }

    @Override
    public float getTotalMisthos(List<String> months) {
        return months.size() * SALARY;
    }
}
