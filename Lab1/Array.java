// MSSV: 20184092 
// Ho va ten: Le Anh Hao
// bai 6.5
import java.util.Scanner;
public class Array {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array:"); //nhap chieu dai mang
        int n = scanner.nextInt();

        int [] arr = new int [n];
        System.out.print("Enter the elements of the array: \n"); // nhap cac phan tu cua mang
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        sortArr(arr);
        System.out.println("Array Sort ");
        show(arr);
        SumArr(arr);
    }
 public static void sortArr(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    // khai bao bien tinh tong va trung binh
    public static void SumArr(int [] arr) {
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            k+=arr[i];// tinh tong
        }
        System.out.println("Sum of Array : "+k); //in tong cua mang
        System.out.println("Average of Array: "+(double)k/arr.length);// in trung binh cua mang
    }
    public static void show(int [] arr) { // in mang ra
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}