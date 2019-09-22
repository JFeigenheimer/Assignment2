import java.util.Scanner;

public class bmi {

   public static double calcStand(int weight, double height)
   {
	 
     double bmi = (double) (703 * weight) / (height * height);

     return bmi;
   }

   public static double calcMet(int weight, double height)
   {
     double bmi = (double)(weight) / (height * height);

     return bmi;
   }

   public static void displayBmi()
   {
      System.out.println("BMI Categories: ");
      System.out.println("Underweight =< 18.5 ");
      System.out.println("Normal weight = 18.5 - 24.9");
      System.out.println("Overweight = 25 - 24.9");
      System.out.println("Obese = BMI of 30 or greater");
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int choice = 0, userWeight = 0;
      double bmi = 0, userHeight;

        System.out.println("Enter 1 for standard or 2 for metric: ");
        choice = scnr.nextInt();

        if (choice == 1)
        {
          System.out.println("Enter weight in pounds: ");
          userWeight = scnr.nextInt();

          System.out.println("Enter height in inches: ");
          userHeight = scnr.nextDouble();

          bmi = calcStand(userWeight,userHeight);
          System.out.printf("%.1f\n", bmi);
          displayBmi();
        }

        else if (choice == 2)
        {
          System.out.println("Enter weight in kilograms: ");
          userWeight = scnr.nextInt();

          System.out.println("Enter height in meters: ");
          userHeight = scnr.nextDouble();

          bmi = calcMet(userWeight,userHeight);
          System.out.printf("%.1f\n", bmi);
          displayBmi();
        }

        else
          System.out.println("That is an incorrect option.");

        scnr.close();
        
      
      
   }
}

