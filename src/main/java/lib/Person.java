package lib;

import java.util.List;

public class Person {

    private final String fName;
    private final String lName;
    private final int  id;

    /*constructor*/
    public Person(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
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
    
    @Override
    public String toString() {
        return fName + " " + lName;
    }

    public static void main(String[] args) {
        
    }

    public float getTotalMisthos(List<String> months) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
