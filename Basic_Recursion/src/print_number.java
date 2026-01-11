import java.util.Scanner;

public class print_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        print(number,1);
    }
    public static void print(int number, int iter){
        if(iter>number) return;
        System.out.println(iter);
        print(number, iter+1);
    }
}
