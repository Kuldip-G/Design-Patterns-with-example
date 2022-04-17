package solid_principles.encapsulation;

/**
 * This class is created with purpose of creating classes with single use.
 * this will calculate tax based on coountries.
 * 
 * @author kuldip
 *
 */
public class TaxCalculator {
	private String country;
	private Integer price;
	
	public TaxCalculator(String _country, int _price) {
		this.country=_country;
		this.price=_price;
	}

	public double getUsTax(){
		return price*1.12;
	}
	
	public double getEuTax() {
		return price*1.12;
	}
}
