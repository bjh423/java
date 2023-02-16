package 생성자;

public class 직원 {
	static int count;
	static int ageSum;
	String name;
	int age;
	String gen;
	
	
	public 직원(String name, int age, String gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		count++;
		ageSum += age;
		
	}
	
	public static void getAvg() {
		System.out.println((double)ageSum/count);
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
}
