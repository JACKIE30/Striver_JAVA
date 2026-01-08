import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int reversedNumber=0;
        int originalNumber=number;
        while(number!=0){
            reversedNumber=reversedNumber*10+(number%10);
            number=number/10;
        }
        if(originalNumber==reversedNumber) System.out.println("It is a palindrome");
        else System.out.println("It is not a palindrome");
    }
}
