import java.util.*;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(){
        ArrayList<String> suits = Card.getValidSuitNames();
        ArrayList<String> faceNames = Card.getValidFaceNames();
        deck = new ArrayList<>();
        for(String suit:suits){
            for(String faceName:faceNames){
                deck.add(new Card(faceName,suit));
            }
        }
    }
    public Card dealCard(){
        if(deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public void printDeck(){
        System.out.println("Deck :-");
        for(Card card: deck){
            System.out.println(card.toString());
        }
    }
    public void sortDeck(){
        Collections.sort(deck,new SortByFaceNames());
    }
    public void compareTwoCards(String card1, String card2){
        List<String> card1List = Arrays.asList(card1.split(" "));
        List<String> card2List = Arrays.asList(card2.split(" "));
        int card1FaceNameIndex, card2FaceNameIndex;
        if(Card.getValidFaceNames().contains(card1List.get(0)) && Card.getValidSuitNames().contains(card1List.get(2)))
            card1FaceNameIndex = Card.getValidFaceNames().indexOf(card1List.get(0));
        else
            throw new IllegalArgumentException("Valid face names and suits are : "+Card.getValidFaceNames()+Card.getValidSuitNames());
        if(Card.getValidFaceNames().contains(card2List.get(0)) && Card.getValidSuitNames().contains(card2List.get(2)))
            card2FaceNameIndex = Card.getValidFaceNames().indexOf(card2List.get(0));
        else
            throw new IllegalArgumentException("Valid face names and suits are : "+Card.getValidFaceNames()+Card.getValidSuitNames());
        if(card1FaceNameIndex>card2FaceNameIndex){
            System.out.println(card1+" is greater than " + card2);
        }
        else if(card1FaceNameIndex<card2FaceNameIndex){
            System.out.println(card2+" is greater than " + card1);
        }
        else{
            System.out.println("Both are equal");
        }
    }
    public void sameCards(String card){
        List<String> cardList = Arrays.asList(card.split(" "));
        if(Card.getValidFaceNames().contains(cardList.get(0)) && Card.getValidSuitNames().contains(cardList.get(2))) {
            for (Card c : deck) {
                if (c.getFaceName().equals(cardList.get(0)) && !c.getSuit().equals(cardList.get(2)))
                    System.out.println(c.toString());
            }
        }
        else
            throw new IllegalArgumentException("Valid face names and suits are : "+Card.getValidFaceNames()+Card.getValidSuitNames());
    }
    public void find(String card){
        for(Card c:deck) {
            if (c.toString().equals(card)) {
                System.out.println(card + " Found in the deck.");
                return;
            }
        }
        System.out.println("No Match Found.");
    }
}
class SortByFaceNames implements Comparator<Card>{
    @Override
    public int compare(Card card1, Card card2) {
        int one = Card.getValidFaceNames().indexOf(card1.getFaceName());
        int two = Card.getValidFaceNames().indexOf(card2.getFaceName());
        return one - two;
    }
}

