import java.util.*;
public class NumberGuessingGame{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int lowerNumber=1;
	int higherNumber=100;
	int targetNumber=(int)(Math.random()*100);
	System.out.println("Target number is "+targetNumber);
	int guess,diff;
	int attempts=0;
	int maxAttempts=5;
	System.out.println("Guess the Number between  "+lowerNumber+" and "+higherNumber);


        while(attempts<maxAttempts)
	{
	System.out.println("Guess the number:");
	guess=sc.nextInt();
	diff = Math.abs(targetNumber-guess);
	attempts++;
	if(guess==targetNumber)
        { 

	System.out.println("Congrats you guessed correct number");
	break;
	}
	else if(guess<targetNumber)
	{
	System.out.println("Target number is greater than "+guess);
	System.out.println("Guessed number is "+diff+" near to target number");
	}
	else
	{
	System.out.println("Target number is less than "+guess);
	System.out.println("Guessed number is "+diff+" near to target number");
	}
	if(attempts==maxAttempts)
	{
	System.out.println("sorry you have used all"+maxAttempts+"attempts.the correct number was"+targetNumber);
	}
      }
      }
}
