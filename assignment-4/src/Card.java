import java.util.ArrayList;
import java.util.Arrays;

public class Card {
    private String faceName, suit;

    public Card(String faceName, String suit){
        setFaceName(faceName);
        setSuit(suit);
    }
    public void setFaceName(String faceName) {
        ArrayList<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();
        if(validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are : "+validFaceNames);
    }

    public void setSuit(String suit) {
        ArrayList<String> validSuitNames = getValidSuitNames();
        suit = suit.toLowerCase();
        if(validSuitNames.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Valid suit names are : "+validSuitNames);
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public static ArrayList<String> getValidFaceNames(){
        return new ArrayList<>(Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace"));
    }

    public static ArrayList<String> getValidSuitNames(){
        return new ArrayList<>(Arrays.asList("hearts","diamonds","spades","clubs"));
    }

    public String toString(){
        return String.format("%s of %s",faceName,suit);
    }
}

