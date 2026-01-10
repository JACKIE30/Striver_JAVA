import java.util.Scanner;

public class print_names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.next();
        name(k, 0);
    }
    public static void name(String k, int iter){
        if(iter==5) return;
        System.out.println(k);
        name(k, iter+1);
    }
}
