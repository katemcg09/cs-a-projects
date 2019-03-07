// Lab12av100.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab12av100
{
    public static void main(String[] args)
    {
        MagpieLab12a maggie = new MagpieLab12a();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}


class MagpieLab12a
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        ArrayList<String> responses = new ArrayList<String>();
        responses.add("Tell me more about your family.");
        responses.add("Your family sounds super supportive.");
        responses.add("Wow do you have any siblings?");
        responses.add("Do you have pets?");
        responses.add("What are your parents' names?");
        responses.add("Where are you from?");
        responses.add("What's your favorite uncle named?");
        responses.add("Are you close to your extended family?");
        responses.add("Is your family close?");
        responses.add("How often do you see your family?");
        
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0 
                || statement.indexOf("family") >= 0
                || statement.indexOf("parent") >= 0)
        {
            int numResponses = responses.size();
            double r = Math.random();
            int whichResponse = (int)(r * numResponses);
            response = responses.get(whichResponse);
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        String responses[] = {"Interesting, tell me more.", "Hmmm.", "Do you really think so?", "You don't say.", "What else is up?",
            "Really?", "No way!", "That's so cool!", "You're literally so interesting.", "So, uh, do you like Star Wars?"};
        response = responses[whichResponse];
        return response;
    }
}
