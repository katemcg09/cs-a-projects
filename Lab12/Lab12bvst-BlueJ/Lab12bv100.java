// Lab12bv100.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.

import java.util.ArrayList;
public class Lab12bv100
{
    public static void main(String[] args)
    {   
        Deck deck = new Deck();
        System.out.println(deck);
    }
}

class Deck 
{
    private ArrayList<Card> cards;
    private int size;   
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] faces = {"Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    public Deck() 
    {
        size = 52;
        cards = new ArrayList<Card>();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                int index = j + (i * 13);
                if (j > 7){
                    if (j < 12){
                        cards.add(index, new Card(suits[i], faces[j], 10)); 
                    } 
                    else{
                        cards.add(index, new Card(suits[i], faces[j], 11)); 
                    }
                }
                else{
                    cards.add(index, new Card(suits[i], faces[j], j + 2)); 
                }
            }
        }
        shuffle();
    } 

    public String toString(){
        String thing = "";
        for (int i = 0; i <52; i++){
            thing += cards.get(i)  + "\n";
        }
        return thing;
    }

    /*public void shuffle(){
        Card temp;
        for (int i = 0; i < 1000; i++){
            int first = (int) (Math.random() * 52);
            int last = (int) (Math.random() * 52);
            temp = cards.get(first);
            cards.set(first,cards.get(last));
            cards.set(last, temp);
        }
    }*/

    public void shuffle(){
        Card temp;
        for (int i = 0; i < 52; i++){
            int index = (int) (Math.random() * 52);
            temp = cards.remove(i);
            cards.add(index, temp);
        }
    }
}

/*
 * I think that the second shuffle might be faster but not 
 * consequentially faster when 1000 swaps are done in the first shuffle. 
 * When only 500 swaps are done in the first shuffle, the time difference 
 * is no longer even barely noticable. The results in the second shuffle 
 * are more clumped by suit than the results from the first shuffle method 
 * with 1000 swaps. When only 500 swaps are done in the first shuffle, the 
 * results are similarly clumped. For me, the quality of the shuffle is more 
 * important than the speed, especially since the difference in speed was 
 * inconsequential. Because the first shuffle has more random results, 
 * I think it is the better shuffle method.
 */

