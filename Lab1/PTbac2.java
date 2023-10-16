
// MSSV: 20184092
// Ho va ten: Le Anh Hao
// bai 2.2.6 
// The second-degree equation with one variable
import javax.swing.JOptionPane;
import java.lang.Math;
public class PTbac2 {
    public static void main(String[] args) {
        String stra, strb, strc; // Khai bao xau ki tu la tham so cua phuong trinh bac hai
        // Hien thi thong bao nguoi dung nhap va doc data
        stra = JOptionPane.showInputDialog(null, "Nhap phuong trinh bac hai ax^2+bx+c=0\nNhap a = ", 
        "Nhap tham so a", JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null, "Nhap phuong trinh bac hai ax^2+bx+c=0\nNhap b = ", 
        "Nhap tham so b", JOptionPane.INFORMATION_MESSAGE);
        strc = JOptionPane.showInputDialog(null, "Nhap phuong trinh bac hai ax^2+bx+c=0\nNhap c = ", 
        "Nhap tham so c", JOptionPane.INFORMATION_MESSAGE);
        
        // Chuyen doi String sang double 
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        double c = Double.parseDouble(strc);
        // Xet a=0 thi co nghiem la pt bac 1
        if (a == 0){
            double x1 = -c/b; // khai bao nghiem x1 cua pt
            JOptionPane.showMessageDialog(null, "Ket qua cua  " + stra + "x^2 + " + strb +"x + " + strc + " = 0 la: " + x1, 
            "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }
 
        if (a != 0){
        // Khai bao bien x la denta cua pt
            double x = b*b - 4*a*c;
            if (x < 0){ // Xet denta < 0 thi cho ket qua vo nghiem
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem", 
                "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (x==0){ // Xet denta = 0 thi cho ket qua nghiem kep y
                double y = (-b)/(2*a); 
                JOptionPane.showMessageDialog(null, "Ket qua cua  " + stra + "x^2 + " + strb +"x + " + strc + " = 0 la: " + y, 
                "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (x > 0){ // Xet denta > 0 thi cho ket qua la 2 nghiem y1 y2
                double y1 = (-b + Math.sqrt(x))/(2*a);
                double y2 = (-b - Math.sqrt(x))/(2*a);
                JOptionPane.showMessageDialog(null, "Ket qua cua  " + stra + "x^2 + " + strb +"x + " + strc + " = 0 la: " + y1 + "va" + y2,
                "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

