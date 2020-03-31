package Test;

public class AF extends PT {
	AF(String name, int energy) {
		super(name, energy );
	}

	public void fly() {
		System.out.println(name + "("+energy+") / 나는기능");
	}
}
