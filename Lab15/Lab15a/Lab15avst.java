// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15avst
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
        magic.checkRows();          // for 100 & 110 Point Version Only
        magic.checkColumns();        // for 100 & 110 Point Version Only
        magic.checkDiagonals();      // for 100 & 110 Point Version Only
    }
}

class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
    }

    public void computeMagicSquare()
    {
        int c = (size/2);
        int r = 0;
        magic [0][(size/2)] = 1;
        for (int i = 2; i <= size*size; i++){
            r--;
            c++;
            if(i%size == 1){
                r+=2;
                c--;;
            }
            if(r < 0){
                r = size-1;
            }
            if(c > size - 1 ){
                c = 0;
            } 
            magic [r][c] = i;
        }

    }

    public void displayMagicSquare()
    {
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        for (int r = 0; r < magic.length; r++) 
        { 
            for (int c = 0; c < magic.length; c++) {
                customFormat("000", magic[r][c]);

            }
            System.out.println();
        } 
        System.out.println();
    }

    static public void customFormat(String pattern, int value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.print(output + " ");
    }

    public void checkRows()
    {
        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("=============");
        System.out.println();
        int sum = 0;
        String str ="";
        for (int i = 0; i < size; i++){
            sum = 0;
            str ="";
            for (int j = 0; j < size; j++){
                sum += magic[i][j];
                str += output.format(magic[i][j]) + "+";
            }
            System.out.println(str.substring(0, str.length() - 1)+ " = "+ sum);
        }
    }

    public void checkColumns()
    {
        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("================");
        System.out.println();
        int sum = 0;
        String str = "";
        for (int i = 0; i < size; i++){
            sum = 0;
            str = "";
            for (int j = 0; j < size; j++){
                sum += magic[j][i];
                str += output.format(magic[j][i]) + "+";
            }
            System.out.println(str.substring(0, str.length() - 1)+ " = "+ sum);
        }
    }

    public void checkDiagonals()
    {
        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("==================");
        System.out.println();
        int sum = 0;
        String str = "";
        for (int i = 0; i < size ; i++){
            for (int j = 0; j < size; j++){
                if(j==i){
                    sum += magic[j][i];
                    str += output.format(magic[j][i]) + "+";
                }
            }
        }
        System.out.println(str.substring(0, str.length() - 1)+ " = "+ sum);
        String str2 ="";
        sum = 0;
        for (int i = 0; i < size; i++){
            for (int j = size-1; j >= 0 ; j--){
                if(j+i==size-1){
                    sum += magic[j][i];
                    str2 += output.format(magic[j][i]) + "+";
                }
            }
        }
        System.out.println(str2.substring(0, str2.length() - 1)+ " = "+ sum);
    }
    }


