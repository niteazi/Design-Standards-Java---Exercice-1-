package lib;

import java.util.List;

public class Symvasiouxos extends Person implements Misthos {
    private final ReadTxt reader;

    public Symvasiouxos(String fName, String lName, int id, ReadTxt reader) {
        super(fName, lName, id); 
        this.reader = reader;
    }

    @Override
    public float getTotalMisthos(List<String> months) {
        float totalMisthos = 0;
        //for each month in the list 
        for (String month : months) {
            //add to totalmisthos the month's salary coresponding for the id...from ReadTxt
            totalMisthos += reader.getTotalMisthosForMonthAndId(month, getId());
        } 
        return totalMisthos;
    }
}
