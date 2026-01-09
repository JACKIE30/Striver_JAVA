import java.util.Scanner;

//TC: 0(log10(N));

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int originalNumber=number;
        int cubicNumber=0;
        while(number!=0){
            cubicNumber+=(int)Math.pow((number%10),3);
            number/=10;
        }
        System.out.println(cubicNumber==originalNumber);
    }
}
