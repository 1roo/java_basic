package etc.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 Object타입으로 선언하면 무엇이든 저장할 수는 있지만 반대로 저장했던 값을 꺼내올 때는 타입별로 일일이 형변환을 해야하는 문제가 발생한다.
		 형 변환을 잘못 했을 때에는 예외가 발생할 수도 있다.
		 */
		
		
		
		Box box = new Box();
		box.setObj("홍길동");
		
		Box box2 = new Box();
		box2.setObj("김철수");
		
		if(box.getObj().equals(box2.getObj())) {
			System.out.println("이름이 같다");
		} else {
			System.out.println("이름이 다르다");
		}
		
		
		System.out.println(((String)box.getObj()).charAt(0));
		
		
		Box p = new Box();
		p.setObj(new Person());
		
		Person p2 = (Person) p.getObj();
		
		

	}

	
}




