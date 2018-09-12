// Lab03v80.java
// Student 80-point version of the Lab03 assignment.


public class Lab03v80
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 80 Point Version\n");
      int seconds = 10000; //finding hours, minutes, seconds from starting seconds
      int hours;
      int minutes;
      System.out.println("Starting seconds:   " + seconds);
      hours = seconds / 3600;
      seconds = seconds % 3600; //removing the hours from the intermediate value
      minutes = seconds / 60; 
      seconds = seconds % 60; //removing the minutes from the final second value
      System.out.println("Hours:              " + hours);
      System.out.println("Minutes:            " + minutes);
      System.out.println("Seconds:            " + seconds);
      
    }
}

