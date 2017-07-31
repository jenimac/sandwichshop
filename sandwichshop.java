import static java.lang.System.out;
import java.util.Scanner;

public class sandwichshop
{
    public static void main(String[] arg)
    {
        //Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
    
            out.println("Checking sales goals.");
            out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
            out.println("How many veggie sandwiches were sold today?");
            int veggie;
            veggie = keyboard.nextInt();
            out.println("");
    if (veggie < goalForVeggies)
    {
        out.println("Fell short for veggies.");
    }else{
        out.println("Made goal for veggies.");
    }    
            out.println("The sales goal for burgers is " + goalForBurgers);
            out.println("How many burgers were sold today?");
            int burgers;
            burgers = keyboard.nextInt();
            out.println("");
    if (burgers < goalForBurgers)
    {
        out.println("Fell short for burgers.");
    }else{
        out.println("Made goal for burgers.");
    }  
            out.println("The sales goal for subs is " + goalForSubs);
            out.println("How many subs were sold today?");
            int subs;
            subs = keyboard.nextInt();
            out.println("");
    if (subs < goalForSubs)
    {
        out.println("Fell short for subs.");
    }else{
        out.println("Made goal for subs.");
    }
            out.println("The sales goal for soup is " + goalForSoup);
            out.println("How many soups were sold today?");
            int soup;
            soup = keyboard.nextInt();
            out.println("");
    if(soup < goalForSoup)
    {
        out.println("Fell short for soup.");
    }else{
        out.println("Made goal for soup.");
    }    
                if((veggie >= goalForVeggies) && (burgers >= goalForBurgers) && (subs >= goalForSubs) && (soup >= goalForSoup))
                {
                    out.print("Made goal for everything!");
                }
}
}
