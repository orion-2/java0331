package Test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<PT> uList = new ArrayList<>();
		PT g1 = null;
		g1 = new GF("질럿",50);
			uList.add(g1);
		g1 = new GF("드라군",50);
			uList.add(g1);
		g1 = new GF("리버",50);
			uList.add(g1);
		
		g1 = new AF("커세어",60);
			uList.add(g1);
		g1 = new AF("스카웃",60);
			uList.add(g1);
		g1 = new AF("캐리어",60);
			uList.add(g1);
			 
		for (int i = 0; i < uList.size(); i++) {
			 uList.get(i).attack();
			if(uList.get(i) instanceof GF) {
				GF g = (GF)uList.get(i);
				g.walk();
				g.run();
			}
			if (uList.get(i) instanceof AF) {
					AF a = (AF) uList.get(i);
					a.fly();
			}
			
		}
		
	}

}
