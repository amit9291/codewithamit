import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
      /*  int number=0,reverse=0;
        System.out.println("Enter any digits and press enter");
        Scanner scan= new Scanner(System.in);
        number=scan.nextInt() ;
        for(;number !=0; number= number/10) {
int remainder = number % 10;
         reverse = reverse * 10  +  remainder; 
        }
        System.out.println("The reverse of the given number is: "+ reverse );*/
         int number =0, reversenum = 0;
         System.out.println("Enter any number and press enter");
         try (Scanner scan = new Scanner(System.in)) {
            number=scan.nextInt();
        }
         while (number !=0) {
             reversenum=reversenum*10;
             reversenum=reversenum+number%10;
             number=number/10;
             
         }
         System.out.println("Reverse number of input number is :" + reversenum );

    }
}
