package lib;

import java.util.List;

public class Xamilomisthos extends Person implements Misthos {
    private static final int SALARY = 1000;

    public Xamilomisthos(String fName, String lName, int id) {
        super(fName, lName, id);
    }

    @Override
    public float getTotalMisthos(List<String> months) {
        return months.size() * SALARY;
    }
}
