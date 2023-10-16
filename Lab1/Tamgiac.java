
// MSSV: 20184092
// Ho va ten: Le Anh Hao
// bai 6.3 
import java.util.Scanner;
public class Tamgiac {
    public static void main(String[] args) {
        int h; // Khai bao chieu cao của tam giac
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua tam giac: ");// nhap chieu cao
        h = scanner.nextInt();
        for (int i=1; i<2*h; i += 2)
{
    // ve tam giac 
    for (int k=0; k < (h-1 - i / 2); k++)
    {
        System.out.print(" ");
    }
    for (int j=0; j<i; j++)
    {
        System.out.print("*");
    }
    System.out.println("");
}}
}