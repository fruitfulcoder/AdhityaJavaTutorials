public class BasicofObjects {
	public int age;
	public String name;
	public double weight;
	public BasicofObjects(int a, String n, double w) {
		age = a;
		name = n;
		weight = w;
	}
	public double AgeandWeight() {
		return age + weight;
	}
	public void changeName(String z) {
		name = z;
	}
	public static void main(String[] args) {
		BasicofObjects a = new BasicofObjects(10, "Busteri", 25.3);
		System.out.println(a.AgeandWeight());
		System.out.println(a.age);
		a.changeName("Bartholomew");
	}


}