// Lab03v100.java
// Student 100-point version of the Lab03 assignment.


public class Lab03v100
{
	public static void main(String[] args)
	{
          System.out.println("Lab03, 100 Point Version\n");
          int milliseconds = 10000123;
          int hours;
          int minutes;
          int seconds;
          System.out.println ("Starting milli-seconds:   " + milliseconds);
          hours = milliseconds / 3600000;
          milliseconds = milliseconds % 3600000;
          minutes = milliseconds / 60000;
          milliseconds = milliseconds % 60000;
          seconds = milliseconds / 1000;
          milliseconds = milliseconds % 1000;
          System.out.println ("Hours:                    " + hours);
          System.out.println ("Minutes:                  " + minutes);
          System.out.println ("Seconds:                  " + seconds);
          System.out.println ("Milli Seconds:            " + milliseconds);
      
	}
}

