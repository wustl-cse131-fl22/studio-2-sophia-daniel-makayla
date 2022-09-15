package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//accept primary inputs
		System.out.println("How much money do you start with?");
			double startAmount = scan.nextDouble();
		System.out.println("How many simulations do you want to run?");
			int totalSimulations = scan.nextInt();
		System.out.println("What is the win chance?(input as a decimal)");
			double winChance = scan.nextDouble();
		System.out.println("What amount of money will you need to leave with?");
			double winLimit = scan.nextDouble();
				//create loop to run while the user still has money
			int simDayNumber=0;
			int simNumber=0;
			int loseCounter=0;
			int outputTotalSimulations = totalSimulations;
			while(totalSimulations>0)
			{
				
				simDayNumber++;
				totalSimulations--;
				
				while((startAmount > 0)&&(winLimit >= startAmount))
				{
					//create program to create a variable to test a boolean as true or false later 
					double winTest = Math.random();
					boolean winTestResult = (winTest<winChance);
					
					simNumber++;
					if(winTestResult==true)
					{
						startAmount++;
						
					}
					else if(winTestResult==false)
					{
						startAmount--;
					}
				}
				System.out.print("Simulation " +simDayNumber + ": " + simNumber +" "  );
				if(winLimit >= startAmount)
				{
					System.out.println("WIN");
				}
				else if(startAmount <= 0)
				{
					System.out.println("LOSE");
					loseCounter++;
				}
				
				
			}
			System.out.println("Losses: "+ loseCounter + " Simulations: " + outputTotalSimulations );
		// TODO Auto-generated method stub

	}

}
