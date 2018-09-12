// Lab03v80.java
// Student 80-point version of the Lab03 assignment.


public class Lab03v80
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 80 Point Version\n");
      int seconds = 10000;
      int hours;
      int minutes;
      System.out.println("Starting seconds:   " + seconds);
      hours = seconds / 3600;
      seconds = seconds % 3600;
      minutes = seconds / 60;
      seconds = seconds % 60;
      System.out.println("Hours:              " + hours);
      System.out.println("Minutes:            " + minutes);
      System.out.println("Seconds:            " + seconds);
      
    }
}

