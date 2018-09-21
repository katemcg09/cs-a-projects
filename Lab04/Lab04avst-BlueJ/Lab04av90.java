// Lab04av90.java
// The Mortgage Payment Program
// This the 90 point version of the assignment

public class Lab04av90
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 90 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double rate = annualRate / 100.0 / 12;
        double numYears   = 30;
        double numMonths  = numYears * 12;
        double topDivision = rate * Math.pow((1+ rate),numMonths);
        double bottomDivision = Math.pow((1 + rate),numMonths)-1;
        double monthlyPayment = topDivision / bottomDivision * principal;
        double totalPayment = monthlyPayment * numMonths;
        double totalInterest = totalPayment - principal;
        System.out.println("Principal:         $" + principal);
        System.out.println("Annual Rate:       " + annualRate + "%");
        System.out.println("Number of Years:   " + numYears);
        System.out.println("Monthly Payment:   $" + monthlyPayment);
        System.out.println("Total Payment:     $" + totalPayment);
        System.out.println("Total Interest:    $" + totalInterest);









        System.out.println();
    }
}

