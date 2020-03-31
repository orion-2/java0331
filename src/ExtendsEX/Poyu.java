package ExtendsEX;

public class Poyu extends Zoo {
	
	Poyu(String name) {
		super(name);
	}

	public void baby() {
		System.out.println(this.name + "/ Poyu : baby");
	}
	
	public void eatting() {
		System.out.println(name+ "/ Poyu : eatting");
	}
}
