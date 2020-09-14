import java.util.Scanner;
import java.math.BigInteger;
public class src {
  public static void main(String[] args) {
    //This method is complete. Do not change it.
    src m = new src();
    String number = m.getTheNumber();
    int d = m.getTheDigit();
    m.add(number, d);
  }
	
  private String getTheNumber() {
   String number; //As long as the user does not enter a string of digits keep asking the
   while(true){ // user to enter an unsigned integer.
    System.out.println("Enter an unsigned integer.");
    Scanner keyboard = new Scanner(System.in);
    number = keyboard.nextLine();
    Boolean flag = false;
     for(int i=0; i < number.length(); i++) {
         flag = Character.isDigit(number.charAt(i));
         if(!flag) {
           break;
         }
      }
      if(flag){
          break;
      }
   }
    return number;//Complete the rest of this method.
  }
	
  private int getTheDigit() {
    //As long as the user does not enter a digit keep asking the user to enter
    int number = 0;
    while (true){
        System.out.println("Enter a single digit."); // a digit.
        Scanner keyboard = new Scanner(System.in);
        if (keyboard.hasNextInt()) {
            number = keyboard.nextInt();
            break;
         }
        else{
         System.out.println("Please Enter a Valid Number");  
    }
    }
    
    return number; //Complete the rest of this method.
  }
	
  private void add(String number, int d) {
    BigInteger a = new BigInteger(number);
    BigInteger b = BigInteger.valueOf(d);
    System.out.println(a.add(b));//Complete the this method. At the end of this method
    //print the result.
  }
}
