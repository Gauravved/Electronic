
public class Products {
	private String brands[]={"Onelpus Nord                               ","Samsung A71                                  ","Samsung A51                                ","Samsung M31s                              ","Nokia X6                                   ","Sony bravia 55 inches UHD Led             ","LG 55 inches Smart UHD OLED               ","Sony Curved TV 55 inches              ","Samsung 55 Inches Super 6 Series UHD QLED","Panasonic 43 inches Full HD Smart     ","Lg 260L Double door                       ","Samsung 265L Inverter Double Door            ","Whirpool 292L Inverter Double Door          ","Haier 320L Inverter Double Door              ","Haier 570L Side-bySide                    "};
	private long prices[]={27999,30999,25999,21499,23300,63999,126990,59999,93800,59000,30690,31150,34400,40300,105000};
	private int id[]={101,102,103,104,105,201,202,203,204,205,301,302,303,304,305};
	public String[] getBrands() {
		return brands;
	}
	public void setBrands(String[] brands) {
		this.brands = brands;
	}
	public long[] getPrices() {
		return prices;
	}
	public void setPrices(long[] prices) {
		this.prices = prices;
	}
	public int[] getId() {
		return id;
	}
	public void setId(int[] id) {
		this.id = id;
	}
}
