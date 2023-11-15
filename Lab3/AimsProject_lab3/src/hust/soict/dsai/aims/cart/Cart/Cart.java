package AimsProject_lab3.src.hust.soict.dsai.aims.cart.Cart;

import AimsProject_lab3.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

// Họ và tên: Lê Anh Hào
// MSSV: 20184092
// 
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;// Khai báo biến đếm số sản phẩm trong giỏ
	//Thêm đĩa vào giỏ
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// Kiểm tra số đĩa không vượt quá Max
		if ( qtyOrdered < MAX_NUMBERS_ORDERED) {
			
		// Thêm 1 đĩa thì tăng qtyOrdered lên 1
			itemsOrdered[qtyOrdered] = disc;
			
			qtyOrdered +=1 ;
		System.out.println("The disc has been added");//Hiển thị thông báo khi thêm thành công
		}
		else
		System.out.println("The cart is almost full");//Hiển thị khi đầy 		
	}
	
	// Thêm Làm quá tải 2.1
	
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	// Kiểm tra số đĩa không vượt quá Max
	    for(int i=0; i<dvdList.length; i++){
	    	if ( qtyOrdered < MAX_NUMBERS_ORDERED) {
	    				
	    	// Thêm 1 đĩa thì tăng qtyOrdered lên 1
	    	itemsOrdered[qtyOrdered] = dvdList[i];
	    				
	    	qtyOrdered +=1 ;
	    	System.out.println("The disc has been added");//Hiển thị thông báo khi thêm thành công
	    	}
	    	else
	    	System.out.println("The cart is almost full");//Hiển thị khi đầy 		
	    }
    }
    
// Thêm quá tải 2.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
    	// Kiểm tra số đĩa không vượt quá Max
    	if ( qtyOrdered < MAX_NUMBERS_ORDERED) {
    				
    	// Thêm 1 đĩa thì tăng qtyOrdered lên 1
    	itemsOrdered[qtyOrdered] = dvd1;
    				
    	qtyOrdered +=1 ;
    	System.out.println("The disc has been added");//Hiển thị thông báo khi thêm thành công
    	}
    	else
    	System.out.println("The cart is almost full");//Hiển thị khi đầy 		

 // Kiểm tra số đĩa không vượt quá Max
 		if ( qtyOrdered < MAX_NUMBERS_ORDERED) {
 			
 		// Thêm 1 đĩa thì tăng qtyOrdered lên 1
 		itemsOrdered[qtyOrdered] = dvd2;
 			
 		qtyOrdered +=1 ;
 		System.out.println("The disc has been added");//Hiển thị thông báo khi thêm thành công
 		}
 		else
 		System.out.println("The cart is almost full");//Hiển thị khi đầy 		
 	}
	
	//Xoá đĩa
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean error = false;
		//Kiểm tra xem còn đĩa không thì mới bắt đầu cho xoá
		if ( qtyOrdered > 0 ) {
			for(int i=0; i < qtyOrdered; i++) {// Vòng lặp
				// Gán DVD cuối cùng cho vị trí xoá và giảm qtyOrdered đi 1
				if (this.itemsOrdered[i].equals(disc)) { 
					this.itemsOrdered[i] = this.itemsOrdered[qtyOrdered - 1];
					qtyOrdered--;
					error = true;
					System.out.println("The DVD has been deleted"); // Hiển thị khi xoá thành công
				}
			}
		}
		if (!error) {
			System.out.println("This DVD isn't in your cart");// hiển thị khi giỏ không có DVD nào
		}
	}
	
	//Xem thông tin DVD trong giỏ của bạn
	public void getItemsOdered() {
		if (qtyOrdered > 0) {
			System.out.print("My cart: ");
			// Cho i chạy đến từng phần tử là DVD và in thông tin DVD đến khi hết giỏ hàng
			for (int i = 0; i < qtyOrdered; i++) {
				System.out.println((i + 1)+ ". Title : " + itemsOrdered[i].getTitle() + " - Category : " 
						+ itemsOrdered[i].getCategory() + " - Cost : " + itemsOrdered[i].getCost() );
			}
		}
		else
			System.out.println("My cart haven't anything");// khi không có đĩa nào trong giỏ hàng
		
	}
	//Tính tổng giá trị trong giỏ
	public double totalCost() {
		double total = 0; // Khai báo biến đển tính tổng
		//Tính tổng giá trị các DVD
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
		
	//In giỏ hàng 
	//LeAnhHao-20184092
	public void printCart() {
		float total = 0; // biến tính tổng giá trị giỏ
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i]);
			total += itemsOrdered[i].getCost();//tính tổng trong giỏ
		}
		System.out.println("Total cost: " + total + "$");
		System.out.println("**************************************************");
		
	}
	//tìm kiếm bằng id
	//LeAnhHao-20184092
	public void SearchId(int id) {
	boolean search = false;
	for(int i=0; i < qtyOrdered; i++) {
		if (itemsOrdered[i].getId() == id) {
			System.out.println(itemsOrdered[i]);
			search =true;
			break;
		}
	}
	if (!search) 
		System.out.println("Not Search");
	}
}