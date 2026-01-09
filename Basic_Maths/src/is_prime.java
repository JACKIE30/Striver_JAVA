import java.util.Scanner;
import java.util.*;
public class is_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isPrime = checkPrime(number);  // Function call to check if the number is prime

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean checkPrime(int n) {
        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to the square root of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;  // If n is divisible by i, increment the counter

                // If n is not a perfect square, count its reciprocal factor
                if (n / i != i) {
                    cnt++;
                }
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt == 2;
    }
}

