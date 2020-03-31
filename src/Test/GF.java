package Test;

public class GF extends PT{
	GF(String name, int energy){
		super(name, energy);
	}
	int energy = 50;
	
	public void walk() {
		System.out.println(this.name + "("+energy+") / °È´Â±â´É");
	}
	public void run() {
		System.out.println(this.name + "("+energy+")/ ¶Ù´Â±â´É");
	}
	
	
}
