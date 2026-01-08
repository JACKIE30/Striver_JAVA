import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int ans=0;
        while(m!=0){
            ans=ans*10+(m%10);
            m=m/10;
        }
        System.out.println(ans);
    }
}
