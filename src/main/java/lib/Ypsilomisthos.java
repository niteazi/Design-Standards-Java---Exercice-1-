package lib;

import java.util.List;

public class Ypsilomisthos extends Person implements Misthos {
    private static final int SALARY = 2000;

    public Ypsilomisthos(String fName, String lName, int id) {
        super(fName, lName, id);
    }

    @Override
    public float getTotalMisthos(List<String> months) {
        return months.size() * SALARY;
    }
}
