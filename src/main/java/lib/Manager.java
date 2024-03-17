package lib;

import java.util.List;

public class Manager extends Ypallhlos implements Misthos {
    private static final int BASE_SALARY = 3000;
    private final ReadTxt readTxt;

    public Manager(String fName, String lName, int id,String employeeType, ReadTxt readTxt) {
        super(fName, lName, id,employeeType);
        this.readTxt = readTxt;
    }

     private float getBonus() {
        //getBonusForManager from ReadTxt class
        return readTxt.getBonusForManager(getId());
    }
     
    @Override
    public float getTotalMisthos(List<String> months) {
        //bonus is the same for every month
        float totalMisthos = months.size() * (BASE_SALARY  + getBonus());
        
        return totalMisthos;
    }

   
}
