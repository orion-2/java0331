package Test;

public class PT {
	
	int id;
	String name;
	int energy;
	
	PT(String name, int energy) {
		this.name = name;
		this.energy = energy;
	}
	
	public void energy() {
	
	}
	public void attack() {
		System.out.println(name + "("+energy+") / 공격기능");
	}
	
	
}
