package entities;

import feature.Customer;
import operation.CustomerManager;
import operation.TeacherCreditManager;

public class Main {

	public static void main(String[] args) {
		
		//Değer tipler
		//int sayi1 = 10; //
		//int sayi2 = 20;//
		//sayi1 = sayi2; // bu kodla sayi1 in değeri = sayi2in değeri demiş oluyoruz yani sayi1 = 20
						// değerine atanmış olur
		//sayi2 = 100;// üsteki kod tan sonra yazdığımız için sayi2 nin değeri 100 olur ama sayi1 20
					// atanmıştır sayi 2 100 atanmıştır 
		           //SONUÇ= sayi1 20 sayi2=100

		//System.out.println(sayi1);// sayi1 20dir
		
//---------------------------------------------------------------------------------------------------------------------------------
		
		//Arrayler referans tiptir 
		//int[] sayilar1 = { 1, 2, 3 }; // bu kod belleğe referans olarak kaydedilir orda mesela 101 numaralı referans
										// aldığını düşünebiliriz
		//int[] sayilar2 = { 10, 20, 30 };// bu kod ta 102 diye düşünebiliriz
		//sayilar1 = sayilar2; // burda sayilar1 yani bellekte tutulan 101 = sayilar2 yani bellekte tutulan 102
								// numaralı refenastır //// en başta yazdığımız sayilar1 deki 101 numaralı
								// referası tutan olmadığı için bellekte işe yaramayan referasları çöp toplayıcı
								// temizler

		//sayilar2[0] = 1000;// bu kod ta 102 numaralı referansı 0. değerini 1000 olarak atamış oluruz

		//System.out.println(sayilar1[0]);/// sonuç olarak sayilar2 nin 0. değeri 1000dir sayilar1 in referansı
										/// sayilar2nin referansı olduğu için SONUÇ=1000dir..
		
		
//---------------------------------------------------------------------------------------------------------------------------------
		
		//CreditManager creditManager = new CreditManager();/// new lemek refarans oluşturmak anlamına gelir 
		//creditManager.calculate();
		//creditManager.calculate();
		//creditManager.save();
		
		//Customer customer = new Customer(); //örneğini oluşturmak , instance oluşturmak, instance creation
		//customer.id = 1;
		//customer.city = "Edirne";
		
		//Company company = new Company();
		//company.taxNumber = "100000";
		//company.companyName = "Arçelik";
		//company.id = 100;
			
		//Person person = new Person();
		//person.firstName = "Zeynep";
		//person.nationalIdentity = "123456789";
		
		//CustomerManager customerManager = new CustomerManager(person);
		//customerManager.save();
		//customerManager.delete();
		
		//Customer c1 = new Customer();
		//c1.id = 123;
		//c1.city = "Edirne";
		
		//Customer c2 = new Person();
		//c2.id = 1234;
		//c2.city = "Kırklareli";
		
		//Customer c3 = new Company();
		//c3.id = 12345;
		
//---------------------------------------------------------------------------------------------------------------------------------
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		customerManager.save();
		
		
	}
	
	
	

}
