package lab2;

// Họ và tên: Lê Anh Hào
// MSSV: 20184092
// 

public class Aims {
	
    public static void  main(String[] args){
//Create a new cart
    	Cart anOrder = new Cart();
    	// Create new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc
        		("The Lion King","Animation","Roger Allers",87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc
        		("Star Wars","Science Fiction","George Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc
        		("Aladin","Animation","George Lucas",87,18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        //Print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        
//Xoá giỏ hàng
        // Hiển thị giỏ hàng trước khi xoá
        System.out.println("My cart:");
        anOrder.getItemsOdered();
     // Hiển thị giỏ hàng sau khi xoá
        System.out.println("My cart after removed:");
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.getItemsOdered();        

    }
}