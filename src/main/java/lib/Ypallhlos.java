package lib;

import java.util.List;

public class Ypallhlos {

    private final String fName;
    private final String lName;
    private final int  id;
    private final String employeeType; 

    /*constructor*/
    public Ypallhlos(String fName, String lName, int id,String employeeType) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.employeeType = employeeType;

    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }
    
    public int getId() {
        return id;
    }
    public String getEmployeeType() {
        return employeeType;
    }
    
    
    @Override
    public String toString() {
        return fName + " " + lName;
    }

    public static void main(String[] args) {
        
    }

    public float getTotalMisthos(List<String> months) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
