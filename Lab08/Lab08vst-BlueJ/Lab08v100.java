// Lab08v100.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08v100
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));

            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));// used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        }
        while (notFinished);
    }
}

class Palindrome
{
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
     * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
     */
    public static boolean isPal(String s)
    {
        s = s.toUpperCase();
        int len = s.length();
        boolean palindrome = true;
        String reverse = "";
        int space = s.indexOf(" ");
        boolean isLetter = true;
        String newS = "";
        for (int i = 0; i < len; i++){
            isLetter = Palindrome.isLetter(s.substring(i,i+1));
            if(isLetter){
                newS = newS + s.substring(i, i+1);
            }
        } 
        if (newS.length() < len){
            palindrome = false;
        }
        else{
                if (space != -1 || s.equals("")){
                    palindrome = false;
                }
                else{

                    for (int i = 0; i < len; i++){
                        reverse = reverse + s.substring(len-i-1,len-i);

                    }
                    if(reverse.equals(s))
                        palindrome = true;
                    else
                        palindrome = false;

                }
            }
        

        return palindrome;
    } 

    /*
     * Precondition:  letter is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static boolean isLetter(String letter)
    {
        letter = letter.toUpperCase();
        
        boolean isLetter = (letter.compareTo("A") >= 0) && (letter.compareTo("Z") <= 0);
        return isLetter; 
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static String purge(String s)
    {
        int len = s.length();
        String newS = "";
        boolean isLetter = true;
        for (int i = 0; i < len; i++){
            isLetter = Palindrome.isLetter(s.substring(i,i+1));
            if(isLetter){
                newS = newS + s.substring(i, i+1);
            }
        } 
        return newS; 
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        boolean almostPal = true;
        String newS = Palindrome.purge(s);
        newS = newS.toUpperCase();
        String reverse = "";
        int space = newS.indexOf(" ");
        int len = newS.length();
        if(Palindrome.isPal(s) == false){
            if (space != -1 || newS.equals("")){
                    almostPal = false;
                }
                else{

                    for (int i = 0; i < len; i++){
                        reverse = reverse + newS.substring(len-i-1,len-i);

                    }
                    if(reverse.equals(newS))
                        almostPal = true;
                    else
                        almostPal = false;

                }  

            return almostPal;
        }
        return false;
    }

}

