// MSSV: 20184092
// Ho va ten: Le Anh Hao 
// bai 2.2.6
// The first-degree equation (linear equation) with one variable
import javax.swing.JOptionPane;
public class PTbac1motan {
    public static void main(String[] args) {
        String stra, strb; // Khai bao xau ki tu la 2 tham so a va b
        // Hien thi thong bao nguoi dung nhap va doc data
        stra = JOptionPane.showInputDialog(null, "Nhap phuong trinh bac nhat ax+b=0\nNhap a = ",
        "Nhap tham so a", JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null, "Nhap phuong trinh bac nhat ax+b=0\nNhap b = ", 
        "Nhap tham so b", JOptionPane.INFORMATION_MESSAGE);
        // Chuyen doi String sang double 
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        
        if (a == 0) { // xet a=0 thi hien thi ket qua vo ngiem
            JOptionPane.showMessageDialog(null, "Vo nghiem", "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }
        else {    
        // Khai bao bien x la ket qua phuong trinh
        double x = -b / a;
        // Hien thi ket qua
        JOptionPane.showMessageDialog(null, "Ket qua cua  " + stra + "x + " + strb + " = 0 la: " + x, 
        "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}