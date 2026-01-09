import java.util.ArrayList;
import java.util.Scanner;

//TC-0(sqrt(N))

public class print_all_divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1; i*i<=number; i++){
            if(number%i==0){
                res.add(i);
                if(i!=number/i){
                    res.add(number/i);
                }
            }
        }
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
