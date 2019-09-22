import java.util.Scanner;

public class Encryption {

   public static int encrypt(int data)
   {
     int digit1, digit2, digit3, digit4;

     digit1 = data / 1000;
     digit1 = (digit1 + 7) % 10;
     digit2 = (data /100) % 10;
     digit2 = (digit2 + 7) % 10;
     digit3 = (data / 10) % 10;
     digit3 = (digit3 + 7) % 10;
     digit4 = (data % 10);
     digit4 = (digit4 + 7) % 10;
     
     data = (digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2);
     return data;
   }
     
   
   public static int decrypt_Helper(int data)
   {
	   if (data < 7)
		   data = (data + 10) - 7; 
	   
	   else 
		   data = (data - 7);
	   
	   return data;
   }
   
   public static int decrypt(int data)
   {
	   int digit1, digit2, digit3, digit4;
	   digit1 = data / 1000;
	   digit1 = decrypt_Helper(digit1);
	   digit2 = (data /100) % 10;
	   digit2 = decrypt_Helper(digit2);
	   digit3 = (data / 10) % 10;
	   digit3 = decrypt_Helper(digit3);
	   digit4 = (data % 10);
	   digit4 = decrypt_Helper(digit4);
	   
	   data = ((digit3 * 1000) + (digit4 * 100) + (digit1 * 10) + digit2);
	   return data;
   }
	   
	   
	   
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;

      System.out.println("Enter integer:");
      userNum = scnr.nextInt();

      if (userNum / 10000 > 0 || userNum / 1000 == 0)
        System.out.println("Value is not four digits");

      else
      {
        userNum = encrypt(userNum);
        System.out.printf("Encrypted Value: %d\n",userNum);
        userNum = decrypt(userNum); 
        System.out.printf("Decrypted Value: %d\n",userNum);
      }
      
      scnr.close();
   }
}
