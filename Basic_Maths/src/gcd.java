import java.util.Scanner;
//brute force approach will be to iterate from 1 to min(num1,num2) and then update the the divisor; ---TC(0(n));

//a better approach is to iterate from min(N1,N2) to 1 and once we find a divisor dividing both we return that answer

//a very optimal approach is Euclidean Algorithm
//Euclidean algorithm states that the gcd remains same even if we subtract the bigger number from smaller number
//so we keep on subtracting the number until one number became zero and the other with be the GCD
public class gcd {
    public static int gcdfind(int n1, int n2){
        if(n1==0) return n2;
        else if(n2==0) return n1;
        else if(n1>n2) return gcdfind(n1-n2,n2);
        else return gcdfind(n1, n2-n1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int k=gcdfind(n1,n2);
        System.out.println(k);
    }
}
