
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//mapOrnek();
		DBOrnek();
	}

	private static void DBOrnek() {
		
	}

	private static void mapOrnek() {
		// TODO Auto-generated method stub
//		Set<Person> kisiler = new HashSet<>();
		Map<Integer, Person> kisiler = new HashMap<>();
		kisiler.put(1, new Person(23, "Musa"));
		kisiler.put(2, new Person(33, "Numan"));
		
		for (Entry<Integer,Person> kisi : kisiler.entrySet()) {
			System.out.println(kisi.getKey() + " - " + kisi.getValue().getYas() + " - " + kisi.getValue().getIsim());
			System.out.println("------------------------");
		}
		for (Integer key : kisiler.keySet()) {
			System.out.println(key + " - " + kisiler.get(key).getYas() + " - " + kisiler.get(key).getIsim());
			System.out.println("------------------------");
		}
		
	}

}
class Person
{
	private int yas;
	private String isim;
	
	public Person(int yas,String isim) 
	{
		this.yas = yas;
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
}