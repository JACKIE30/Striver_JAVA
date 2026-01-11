import java.util.Scanner;

public class print_reverse_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        print(number,1);
    }
    public static void print(int number, int iter){
        if(iter>number) return;
        print(number, iter+1);
        System.out.println(iter);
    }
}
