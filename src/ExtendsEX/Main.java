package ExtendsEX;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sub클래스의 자원과 슈퍼클래스의 자원을 모두 사용가능
		ArrayList<Zoo> pList = new ArrayList<>();
		Zoo p1 = new Poyu("사자"); 
		pList.add(p1);
		
		Zoo p2 = new Poyu("호랑이");  
		pList.add(p2);
		
		Zoo b1 = new Birds("오리");
		pList.add(b1);
		
		Zoo b2 = new Birds("참새");
		pList.add(b2);
		
		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).eatting();
			if (pList.get(i) instanceof Poyu ) {
				Poyu p = (Poyu)pList.get(i); //객체 형변환
				p.baby();
			}	
		}
		
						
		//슈퍼클래스의 객체는 sub클래스의 기능 사용이 불가능 
//		Zoo z1 = new Poyu();
//		z1.eatting();
		//z1.baby();
	}

}
