package operation;

import feature.Customer;

public class CustomerManager {
	
	/// private demek sadece bu classın içinde kullanılır demek
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer,ICreditManager creditManager) {  ///constracter clasın aynı ismiyle oluştururuz 
		 
		_creditManager = creditManager;
	}
	
	public void save() {
		
		System.out.println("Musteri kaydedildi : ");
		
	}
	
    public void delete() {
		
		System.out.println("Musteri silindi : ");
		
	}
    
    public void giveCredit() {
    	
    	_creditManager.calculate();
    	System.out.println("Kredi verildi");
    	
    }
 
}
