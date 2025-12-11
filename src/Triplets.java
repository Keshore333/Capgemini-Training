import java.util.*;
public class Triplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=i+2;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
