package app;

import java.util.List;
import lib.ReadTxt;
import lib.Symvasiouxos;
import lib.Misthos;
import lib.Ypsilomisthos;
import lib.Person; 
import lib.Xamilomisthos;

public class App {
    
    
    static void createInstances() {
        
        //pass filepath into reader
        ReadTxt reader = new ReadTxt("C:/Users/nitea/Desktop/IHU/sxediastika protypa/1/contracts.txt");

        // Store employee information
        Person[] employees = new Person[4];
        employees[0] = new Person("Jim", "Black", 1);
        employees[1] = new Person("Mary", "Green", 2);
        employees[2] = new Person("Nick", "Yellow", 5);
        employees[3] = new Person("Kelly", "Red", 7);

        // Create different types of employees
        Misthos[] misthosArray = new Misthos[employees.length];
        for (int i = 0; i < employees.length; i++) {
            switch (employees[i].getId()) {
                case 2:
                    //Ypsilomisthos
                    misthosArray[i] = new Ypsilomisthos(employees[i].getFName(), employees[i].getLName(), employees[i].getId());
                    break;
                case 1:
                    //Xamilomisthos
                    misthosArray[i] = new Xamilomisthos(employees[i].getFName(), employees[i].getLName(), employees[i].getId());
                    break;
                default:
                    /*Symvasiouxos*/
                    misthosArray[i] = new Symvasiouxos(employees[i].getFName(), employees[i].getLName(), employees[i].getId(), reader);
                    break;
            }
        }

        // calculate total misthos for each employee 
        calculateTotalMisthos(misthosArray);
    }

    static void calculateTotalMisthos(Misthos[] misthosArray) {
        List<String> months = List.of("JUNE", "JULY", "AUGUST");

        
        for (Misthos employee : misthosArray) {
            float totalMisthos = employee.getTotalMisthos(months);
            //toString method from Person combines fname and lname
            System.out.println(employee.toString() + ": " + totalMisthos);
        }
    }
    
    public static void main(String[] args) {
        createInstances();
    }
}
