package operation;

public interface ICreditManager {//interfaceler referans tiptir interface in amacı yazılımdaki bağımlılıktan kurtulmak ve if lerden kurtulmaktır
	//bir sınıf sadece bir sınıfı inherate edebilir
	//bir sınıf birden fazla interface i implemente edebilir

	void calculate(); // bunlara imza denir
	void save();
	
}
