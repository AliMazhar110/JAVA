import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char exit = 'y';
        DeckOfCards deck = new DeckOfCards();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nMain Menu - ");
            System.out.println("1. Deal top Card");
            System.out.println("2. Shuffle Deck.");
            System.out.println("3. Print Deck.");
            System.out.println("4. Deal Cards(5 Cards).");
            System.out.println("5. Sort Deck.");
            System.out.println("6. Compare Cards.");
            System.out.println("7. Same Cards");
            System.out.println("8. Find Card");
            System.out.println("9. Create new deck.");
            System.out.println("10. Exit.");
            System.out.print("Enter your Choice = ");
            int d = scan.nextInt();
            switch(d){
                case 1:
                    System.out.println("\nCard = "+deck.dealCard().toString());
                    break;
                case 2:
                    deck.shuffle();
                    break;
                case 3:
                    deck.printDeck();
                    break;
                case 4:
                    System.out.println("\nCards :- ");
                    for(int i=0;i<5;i++){
                        deck.shuffle();
                        System.out.println("Card = "+deck.dealCard().toString());
                    }
                    break;
                case 5:
                    deck.sortDeck();
                    break;
                case 6:
                    scan.nextLine();
                    System.out.print("\nEnter 1st card = ");
                    String card1 = scan.nextLine();
                    System.out.print("Enter 2nd card = ");
                    String card2 = scan.nextLine();
                    deck.compareTwoCards(card1,card2);
                    break;
                case 7:
                    scan.nextLine();
                    System.out.print("\nEnter the card = ");
                    String card = scan.nextLine();
                    deck.sameCards(card);
                    break;
                case 8:
                    scan.nextLine();
                    System.out.print("\nEnter the card = ");
                    String cardToFind = scan.nextLine();
                    deck.find(cardToFind);
                    break;
                case 9:
                    deck = new DeckOfCards();
                    break;
                case 10:
                    exit='n';
                    break;
                default:
                    System.out.println("\nOps!! Wrong Choice.");
            }

        }while(exit=='y');
        scan.close();
    }
}
