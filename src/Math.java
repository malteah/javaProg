import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class

public class Math {

public static void main(String[] args) {
   System.out.println("Provide 2 integers and the desired operation. If an incorrect operation is provided, division will be perfomed");

   Math.run();
   
}


public static void run() {

   //create a list where user input is recorded
   ArrayList<String> arguments = new ArrayList<>(); 

   //get user input via scanner
   Scanner scanner = new Scanner(System.in);

   System.out.println("Provide the first integer");
   String int1 = scanner.nextLine();
   arguments.add(int1);

   System.out.println("Provide the second integer");
   String int2 = scanner.nextLine();
   arguments.add(int2);

   System.out.println("Provide the operation");
   String op = scanner.nextLine();
   arguments.add(op);

   scanner.close();


   if (arguments.size() == 3) {
      // Parse the first and second command-line arguments as integers
      int num1 = Integer.parseInt(arguments.get(0));
      int num2 = Integer.parseInt(arguments.get(1));
      String operation =  arguments.get(2);


      if((operation.equals("subtraction")) || (operation.equals("Subtraction")) || (operation.equals("-"))) {
         System.out.println("Result: " + Math.subtract(num1,num2));
      } else if((operation.equals("addition")) || (operation.equals("Addition")) || (operation.equals("+"))) {
         System.out.println("Result: " + Math.add(num1,num2));
      } else if((operation.equals("multiplication")) || (operation.equals("Multiplication")) || (operation.equals("*"))) {
         System.out.println("Result: " + Math.multiply(num1,num2));
      } else { //Division
         System.out.println("Result: " + Math.divide(num1,num2));
      }

   } else{
      System.out.println("Provide 2 integers and the desired operation, separated by a comma. If an incorrect operation is provided, division will be perfomed (2)");
   }

}

public static int subtract(int Num1, int Num2) {
   return Num1-Num2;
}

public static int add(int Num1, int Num2) {
   return Num1+Num2;
}

public static int multiply(int Num1, int Num2) {
   return Num1*Num2;
}

public static double divide(int Num1, int Num2) {
   return 1.0 * Num1/Num2;
}


}



