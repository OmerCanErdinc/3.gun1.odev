package feature;

public class Company extends Customer{
	
	public String companyName;
	public String taxNumber;

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumaber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

}
