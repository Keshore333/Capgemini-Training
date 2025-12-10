import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = sc.nextInt();
        while(n<0 || n>30){
            System.out.println("enter an integer between 0 and 30");
            n = sc.nextInt();
        }
        int value = 1;
        for(int i=0;i<=n;i++){
            System.out.println(value);
            value = value *2;
        }
    }
}
