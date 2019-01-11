// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.

// this is kate's work

import java.util.Scanner;

public class Lab09avst
{
    private static int num, den;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}


class Rational
    {
    int reducedNum; 
    int firstNum;
    int reducedDen; 
    int firstDen;
    int gcf;
    
    public Rational (int n, int d){
        firstNum = n;
        firstDen = d;
        reducedNum = n;
        reducedDen = d;
    }
    
    public int getNum(){
        return firstNum;
    }
    
    public int getDen(){
        return firstDen;
    }
    
    public double getDecimal(){
        return (double)firstNum/(double)firstDen;
    }
    
    public String getOriginal(){
        return firstNum + "/" + firstDen;
    }
    
    public void reduce ()
    {
        getGCF(firstNum, firstDen);
        reducedNum = firstNum / gcf;
        reducedDen = firstDen / gcf;
    }
    
    public String getReduced()
    {
        reduce();
        return reducedNum + "/" + reducedDen;
    }
    
    public void displayData()
    {
        System.out.println();
        System.out.println(getOriginal() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to " + getReduced());
    }

    private void getGCF(int n1,int n2)
    {
        int rem = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
    }
}




