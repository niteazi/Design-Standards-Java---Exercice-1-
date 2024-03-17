package app;

import java.util.ArrayList;
import java.util.List;
import lib.EmployeeFactory;
import lib.Misthos;
import lib.Ypallhlos; 
import lib.MisthosFactory;

public class App {
    // create instances of employees using a factory (MisthosFactory)   
    static void createInstances(MisthosFactory factory) {
        
        // store employee information in a list
        List<Ypallhlos> employees = new ArrayList<>();
        employees.add(new Ypallhlos("Jim", "Black", 1, "xamilomisthos"));
        employees.add(new Ypallhlos("Mary", "Green", 2, "ypsilomisthos"));
        employees.add(new Ypallhlos("Nick", "Yellow", 5, "symvasiouxos"));
        employees.add(new Ypallhlos("Kelly", "Red", 7, "symvasiouxos"));
        employees.add(new Ypallhlos("Meredith", "Gray", 12, "manager"));
        employees.add(new Ypallhlos("Alabaster", "White", 13, "manager"));
        employees.add(new Ypallhlos("Purpureus", "Purple", 14, "manager"));
        employees.add(new Ypallhlos("Cinnabar", "Vermilion", 15, "manager"));
     
        // create different types of employees using the factory
        List<Misthos> misthosList = new ArrayList<>();
        for (Ypallhlos employee : employees) {
            misthosList.add(factory.createMisthos(employee));
        }

        // calculate total misthos for each employee 
        calculateTotalMisthos(misthosList);
    }
    //calculate total misthos for each employee
    static void calculateTotalMisthos(List<Misthos> misthosList) {
        List<String> months = List.of("JUNE", "JULY", "AUGUST");

        for (Misthos employee : misthosList) {
            float totalMisthos = employee.getTotalMisthos(months);
            // toString method from Person combines fname and lname
            System.out.println(employee.toString() + ": " + totalMisthos);
        }
    }
    
    public static void main(String[] args) {
        // create an instance of the EmployeeFactory, which implements MisthosFactory
        MisthosFactory factory = new EmployeeFactory();
        
        // call createInstances method to create employee instances using the factory
        createInstances(factory);
    }
}