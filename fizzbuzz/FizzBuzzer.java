import java.util.Scanner;

class FizzBuzzer {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextInt()) {
         int n = scanner.nextInt();
         // TODO: if n is divisible by 3 then print "fizz"
         //       if n is divisible by 5 then print "buzz"
         //       if n is divisible by both 3 and 5 then print "fizzbuzz"
         //       if none of the above is true then print n as a decimal
      }

   }

}
