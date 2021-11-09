import java.util.*;

public class Customer {
	private String username,password,address,phonenumber;
	private Vector<String> brand = new Vector<>();
	private Vector<Long> price=new Vector<>();
	private Vector<Integer> id=new Vector<>();
	private Vector<Integer> qty=new Vector<>();
	private Vector<Double> total=new Vector<>();
	private float cgst=9.0f, sgst=9.0f;
	private double finaltotal;
	public Customer(String username, String password, Vector<String> brand, Vector<Long> price, Vector<Integer> id,
			Vector<Integer> qty) {
		this.username = username;
		this.password = password;
		this.brand = brand;
		this.price = price;
		this.id = id;
		this.qty = qty;
		finaltotal=0;
		for(int i=0;i<brand.size();i++) {
			double t=price.get(i)*qty.get(i);
			total.add(t);
			finaltotal+=total.get(i);
		}
	}
	public float getCgst() {
		return cgst;
	}

	public void setCgst(float cgst) {
		this.cgst = cgst;
	}

	public float getSgst() {
		return sgst;
	}

	public void setSgst(float sgst) {
		this.sgst = sgst;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Vector<Double> getTotal() {
		return total;
	}

	public void setTotal(Vector<Double> total) {
		this.total = total;
	}

	public double getFinaltotal() {
		return finaltotal;
	}

	public void setFinaltotal(double finaltotal) {
		this.finaltotal = finaltotal;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Vector<String> getBrand() {
		return brand;
	}
	public void setBrand(Vector<String> brand) {
		this.brand = brand;
	}
	public Vector<Long> getPrice() {
		return price;
	}
	public void setPrice(Vector<Long> price) {
		this.price = price;
	}
	public Vector<Integer> getId() {
		return id;
	}
	public void setId(Vector<Integer> id) {
		this.id = id;
	}
	public Vector<Integer> getQty() {
		return qty;
	}
	public void setQty(Vector<Integer> qty) {
		this.qty = qty;
	}
	
}
