import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println((int)Math.log10(number)+1);
    }
}
