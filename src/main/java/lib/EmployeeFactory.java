package lib;

public class EmployeeFactory implements MisthosFactory {

    @Override
    public Misthos createMisthos(Ypallhlos person) {
        //to avoid mistakes such as Xamilomisthos instead of xamilomisthos we turn Employee Type into lowercase 
        String lowerCaseType = person.getEmployeeType().toLowerCase();

        return switch (lowerCaseType) {
            case "xamilomisthos" -> new Xamilomisthos(person.getFName(), person.getLName(), person.getId(),person.getEmployeeType());
            case "ypsilomisthos" -> new Ypsilomisthos(person.getFName(), person.getLName(), person.getId(),person.getEmployeeType());
            case "symvasiouxos" -> new Symvasiouxos(person.getFName(), person.getLName(), person.getId(),person.getEmployeeType(), new ReadTxt("C:/Users/nitea/Desktop/IHU/sxediastika protypa/1/contracts.txt"));
            case "manager" -> new Manager(person.getFName(), person.getLName(), person.getId(),person.getEmployeeType(), new ReadTxt("C:/Users/nitea/Desktop/IHU/sxediastika protypa/1/bonus.txt"));
            default ->throw new IllegalArgumentException("Invalid employee type: " + person.getEmployeeType());
        };
    }
}
