import java.util.*;

public class ShopManager {
	public Customer create() {
		Scanner sc = new Scanner(System.in);
		Products pr = new Products();
		Customer cust = null;
		System.out.println("Enter username:");
		String user = sc.next();
		System.out.println("Enter password:");
		String pass = sc.next();
		System.out.println("Enter Phone number:");
		String phn = sc.next();
		System.out.println("Enter address:");
		sc.nextLine();
		String adrs = sc.nextLine();
		Vector<String> brand = new Vector<>();
		Vector<Long> price = new Vector<>();
		Vector<Integer> id = new Vector<>();
		Vector<Integer> qty = new Vector<>();
		int ch = 0;
		do {
			System.out.println("\n\n\n\t\t\t Hello "+user+" Welcome to Electronic city ");
			System.out.println(
					"\n1> Phone \n2> Television \n3> Refrigerator \n4> Display cart \n5> Search item in cart \n6> Proceed to payment");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price");
				for (int i = 0; i < 5; i++) {
					System.out.println("\n--------------------------------------------------------------------------------\n");
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n--------------------------------------------------------------------------------\n");
				System.out.println("6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				int ids = sc.nextInt();
				for (int j = 0; j < 5; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price");
				for (int i = 5; i < 10; i++) {
					System.out.println("\n--------------------------------------------------------------------------------\n");
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n--------------------------------------------------------------------------------\n");
				System.out.println("6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 5; j < 10; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 3: 
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price");
				for (int i =10; i < 15; i++) {
					System.out.println("\n--------------------------------------------------------------------------------\n");
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n--------------------------------------------------------------------------------\n");
				System.out.println("6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 10; j < 15; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case  4:
				cust=new Customer(user, pass, brand, price, id, qty);
				display(cust);
				break;
			}
		} while (ch != 6);
		return cust;
	}
	public void display(Customer cust) {
		double finalTotal=0;
		System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price  \tQuantity \t Cgst \t Sgst \t Total");
		for(int i=0;i<cust.getBrand().size();i++) {
			System.out.println("\n----------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(cust.getId().get(i) + " \t\t " + cust.getBrand().get(i) + " \t\t " + cust.getPrice().get(i)+"\t\t"+cust.getQty().get(i)+"\t\t"+cust.getCgst()+"\t"+cust.getSgst()+"\t"+cust.getTotal().get(i));		
			finalTotal=finalTotal+cust.getTotal().get(i);
		}
		cust.setFinaltotal(finalTotal);
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Final Total is:"+cust.getFinaltotal());
	}
}
