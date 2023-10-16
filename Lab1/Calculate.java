// MSSV: 20184092
// Ho va ten: Le Anh Hao 
// bai 2.2.5
// Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users
import javax.swing.JOptionPane;
public class Calculate{
    public static void main(String[] args){
        String strNum1, strNum2; // Khai bao 2 xau ki tu so 
        // Hien thi thong bao nguoi dung nhap va doc data   
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ", "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        // Chuyen doi String sang double    
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Khai bao cac bien tong, hieu, tich, thuong
        double sum = num1+num2;
        double sub = num1-num2;
        double multiply = num1*num2;
        double div = num1/num2;
        // Hien thi ket qua
        JOptionPane.showMessageDialog(null, 
        "The sum is: " + sum + "\nThe Sub is: " + sub + "\nThe Multipl is: " + multiply + "\nThe Div is: " 
        + div + "\n","Result", JOptionPane.INFORMATION_MESSAGE);
        
    }

}