import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = sc.nextInt();
        while(year<1000 || year>9999){
            System.out.println("enter a valid year: ");
            year = sc.nextInt();
        }
        if((year%400 ==0) || (year%4==0 && year%100!=0) ){
            System.out.println("it is a leap year");
        }else System.out.println("it is not a leap year");
    }
}
