import java.util.Scanner;

public class Practice{
public static void main(String[] args) {
    System.out.println("practice");
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter your name : ");
        scan.nextLine();
System.out.println("Enter Your Age :");
int x =scan.nextInt();
if(x >18){
System.out.println("You are welcome");
}else{   
System.out.println("you are not welcome");
}
    }}}
