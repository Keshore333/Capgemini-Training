import java.util.*;
public class CoinFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of flips: ");
        int n = scanner.nextInt();
        while(n<=0){
            System.out.println("enter a positive integer: ");
            n = scanner.nextInt();
        }

        int heads = 0;
        int tails = 0;

        for(int i = 0; i < n; i++){
            double r = Math.random();
            if(r<0.5){
                tails++;
            }else{
                heads++;
            }

        }
        double headsPercentage = (heads*100.0)/n;
        double tailsPercentage = (tails*100.0)/n;

        System.out.println("heads: " +headsPercentage);
        System.out.println("tails: " +tailsPercentage);
    }
}
