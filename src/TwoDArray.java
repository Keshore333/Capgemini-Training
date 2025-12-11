import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        pw.println("2D Array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pw.print(arr[i][j]);
                pw.print(" ");
            }
            pw.println();
        }
        pw.flush();
        sc.close();
    }
}
