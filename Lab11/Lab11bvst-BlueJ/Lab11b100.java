// Lab11b100.java
// This is the Student starting version of the <Deck> class lab11b assignment. 

public class Lab11b100
{
    public static void main(String[] args)
    { 
        Deck deck = new Deck();
        System.out.println(deck);
    }
}

class Deck 
{
    private Card[] cards;
    private int size;
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] faces = {"Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    public Deck() 
    {
        size = 52;
        cards = new Card[size];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                int index = j + (i * 13);
                if (j > 7){
                    if (j < 12){
                        cards[index] = new Card(suits[i], faces[j], 10); 
                    } 
                    else{
                        cards[index] = new Card(suits[i], faces[j], 11); 
                    }
                }
                else{
                  cards[index] = new Card(suits[i], faces[j], j + 2); 
                }
            }
        }
        shuffle();
    } 
    
    public String toString(){
        String thing = "";
        for (int i = 0; i <52; i++){
            thing += cards[i]  + "\n";
        }
        return thing;
    }
    
    public void shuffle(){
        Card temp;
        for (int i = 0; i < 1000; i++){
            int first = (int) (Math.random() * 52);
            int last = (int) (Math.random() * 52);
            temp = cards[first];
            cards[first] = cards[last];
            cards[last] = temp;
        }
    }
}
