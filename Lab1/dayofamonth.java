// MSSV: 20184092
// Ho va ten: Le Anh Hao
// bai 6.4 
import java.util.Scanner;
 
public class dayofamonth {
 
    public static void main(String[] args) {
        int month; // khai bao thang
        int year; // khai bao nam
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Month: "); // nhap thang
        month = scanner.nextInt();
        System.out.println("Year: ");// nhap nam
        year = scanner.nextInt();
         
        switch (month) {
            // thang 1 3 5 7 8 10 12 co 31 ngay
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + month + " year " + year + " have 31 days.");
                break;
            // thang 4 6 9 11 co 30 ngay
            case 4:
            case 6:
            case 9:
            case 11:
                 System.out.println("Month " + month + " year " + year + " have 30 days.");
                break;
                 
            // thang 2 co 28 hoac 29 ngay tinh theo nam nhuan
            case 2:
                
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Month " + month + " year " + year + " have 29 days.");
                } else {
                    System.out.println("Month " + month + " year " + year + " have 28 days.");
                }
                break;
            default:
                System.out.println("Error");
            }
    }
 
}