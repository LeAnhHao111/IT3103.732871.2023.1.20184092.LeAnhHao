// MSSV: 20184092 
// Ho va ten: Le Anh Hao
// bai 6.6 
// Cong hai ma tran
import java.util.Scanner;
public class Add_Matrices {
 public static void main(String args[])
   {
      int m, n, c, d; // Khai bao hang cot, 2 bien lap
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input number of rows of matrix");
      m = in.nextInt();
      System.out.println("Input number of columns of matrix");
      n  = in.nextInt();
 
      int array1[][] = new int[m][n]; // Khai bao ma tran 1
      int array2[][] = new int[m][n]; // Khai bao ma tran 2
      int sum[][] = new int[m][n]; // Khai bao tong ma tran
     // Nhap ma tran 1
      System.out.println("Input elements of first matrix");
    
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array1[c][d] = in.nextInt();
         // Nhap ma tran 2
      System.out.println("Input the elements of second matrix");
   
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array2[c][d] = in.nextInt();
        // Tong hai ma tran
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 
 // in ma tran tong
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}
