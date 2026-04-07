package practice5;

//1. create a main class
//2. create a main method
//3. create another class
//4. create states/variables in both the classes (main and another class)
//5. create constructors (3)


public class misc {
	
	String name;
	int age;
	
	public misc() {
		
	}
	
	public misc(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public static void main(String[] args) {
		vehicle harrier = new vehicle();
		vehicle citrus = new vehicle("citreonv", true, 545);
		vehicle mercedes = new vehicle(true, 434);
		
		System.out.println(harrier.isInGoodCondition + harrier.modelName);
		System.out.println(citrus.isInGoodCondition + citrus.modelName + citrus.range);
		System.out.println(mercedes.isInGoodCondition + " " +  mercedes.range);
		
		
		misc m = new misc();
		misc n = new misc("usman", 15);
		
		System.out.println(n.age + " | " + n.name);
	}
}


class vehicle{
	String modelName;
	boolean isInGoodCondition;
	double range;
	
	public vehicle() {
		
	}
	public vehicle( boolean i, double r) {
		this.isInGoodCondition = i;
		this.range = r;
	}
	public vehicle(String m, boolean i, double r) {
		this.modelName = m;
		this.isInGoodCondition = i;
		this.range = r;
	}
}