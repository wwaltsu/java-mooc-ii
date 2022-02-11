
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Viihde
 */
public class Abbreviations {

   
    HashMap<String, String> abbrevationCollection = new HashMap<>();

    public Abbreviations() {
       
    }
    

    public void addAbbreviation(String abbreviation, String explanation) {
        abbrevationCollection.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbrevation) {
        if (abbrevationCollection.containsKey(abbrevation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbrevation) {
        if (abbrevationCollection.containsKey(abbrevation)) {
            return abbrevationCollection.get(abbrevation);
        } else {
            return null;
        }
    }

}
