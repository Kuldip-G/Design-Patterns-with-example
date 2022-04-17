package solid_principles.encapsulation;

/**
 * This class has a single purpose of illustrating example of first solid principle.
 * @author kuldip
 *
 *P.D : try to write different classes as much as possible for different things.
 *
 */
public class OrderClass {
 
	
	
	//Old way
	
	//This is order function which takes all input values and return tax calculation as a result
	//it is possible tax might change in future w.r.t counties and product 
	public static double order(String _to, String _form, String _country ,int _price) {
		
		if (_country == "US") {
			return _price*1.12;
		}
		else if (_country == "EU")
			return  _price*1.20;
			
		return _price*1.10;
		
	}
	
	// Better way to create a new class with purpose of tax calculation so that if there are
	// any changes in future we can do it there.
	

	public static double order(String _country ,int _price) {
		
		TaxCalculator taxx = new TaxCalculator(_country,_price);
		
		double tax = taxx.getUsTax();
		
		return tax;
		
	}
}
