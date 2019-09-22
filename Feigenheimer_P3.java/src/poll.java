import java.util.Scanner;

public class poll 
{

   public static double calcAverage(int[] responses)
   {	
	   double value = 0; 
	   int count = 0;
	   for (int i = 0; i < 10; i++)
	   {
		   value += (i + 1) * (responses[i]);
		   count += responses[i];
	   }
	   System.out.println(value);
	   value /= count;
	   System.out.println(value);
	return value;
   }
   public static void displayPolls(String[] topics, int[][] responses)
   {
	   int[][] r = responses; 
	   
	   double [] average = new double[5];
	   for (int i = 0; i < 5; i++)
	   {
		   average[i] = calcAverage(responses[i]);
	   }
	   
	   System.out.printf("%10s %-30s %8s\n", "Summary:", "Importance Value (1-10)","Average\n");
	   System.out.printf("%10s %2d %2d %2d %2d %2d %2d %2d %2d %2d %2d %8s\n", "Topic:",1,2,3,4,5,6,7,8,9,10,"Average");
	   for (int i = 0; i < 5; i++)
		   System.out.printf("%10s %2d %2d %2d %2d %2d %2d %2d %2d %2d %2d %8f\n", topics[i], r[i][0],r[i][1],r[i][2],r[i][3],r[i][4],r[i][5],
				   r[i][6],r[i][7],r[i][8],r[i][9],average[i]);
   }
   
   public static void main(String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      boolean flag = false;
      String check = "y";
      String[] topics = new String[5];
      int[][] responses = new int[5][10];
      int response;
      topics[0] = "Politics";
      topics[1] = "Climate";
      topics[2] = "Videogames";
      topics[3] = "Sports";
      topics[4] = "Food";

      System.out.println("Please rate these topics from 1-10 on how important they are to you.");
      
      while (flag == false)
      {
        for(int i = 0; i < 5; i++)
        {
          System.out.printf("%s: \n", topics[i]);
          response = scnr.nextInt();
          responses[i][response - 1]++;
        }
        
        System.out.println("Do you wish to continue? y/n");
        check =scnr.next();
        if (check.toLowerCase().equals("n"))
        	flag = true;
        else if(check.toLowerCase().equals("y"))
        	continue;

        
      }
      
      scnr.close();
      
      displayPolls(topics, responses);
   }
	
}