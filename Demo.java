import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

    // using for loop 
      int number=0,reverse=0;
        System.out.println("Enter any digits and press enter");
        try (Scanner scan = new Scanner(System.in)) {
            number=scan.nextInt() ;
        }
        for(;number !=0; number= number/10) {
int remainder = number % 10;
         reverse = reverse * 10  +  remainder; 
        }
        System.out.println("The reverse of the given number is: "+ reverse );
// using while loop 

         int num =0, reversenum = 0;
         System.out.println("Enter any number and press enter");
         try (Scanner in = new Scanner(System.in)) {
            num=in.nextInt();
        }
         while (num !=0) {
             reversenum=reversenum * 10;
             reversenum=reversenum + num % 10;
             num=num / 10;
             
         }
         System.out.println("Reverse number of input number is :" + reversenum );

    }
}
