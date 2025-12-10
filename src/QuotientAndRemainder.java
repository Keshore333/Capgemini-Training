import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divident: ");
        int divident =sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor =sc.nextInt();

        while(divisor==0){
            System.out.println("Enter a valid divisor: ");
            divisor =sc.nextInt();
        }

        int quotient = divident/divisor;
        int remainder = divident%divisor;

        System.out.println("The quotient is "+quotient);
        System.out.println("The remainder is "+remainder);
        sc.close();
    }
}
