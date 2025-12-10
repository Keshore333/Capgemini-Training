import java.util.*;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        while(n==0){
            System.out.print("enter a number: ");
            n = sc.nextInt();
        }
        double value = 0;
        for(int i=1;i<=n;i++){
            value = value + (1.0)/i;
        }
        System.out.println("The harmonic number is "+value);
        sc.close();
    }
}
