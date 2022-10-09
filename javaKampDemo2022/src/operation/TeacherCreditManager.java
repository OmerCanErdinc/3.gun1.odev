package operation;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override  // üstüne yaz demek
	public  void calculate() {
		System.out.println("Ogretmen kredisi hesaplandi");
		
	}

	@Override
	public void save() {
		
		
	}

}
