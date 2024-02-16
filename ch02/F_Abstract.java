package ch02;

// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스
// 추상 클래스 자체로 인스턴스를 생성할 수 없음, 반드시 추상클래스를 상속한 하위 클래스로 인스턴스를 생성해야 함
// abstract class 추상클래스명 { }

// 추상 메서드 : 선언부만 존재하고 구현부는 존재하지 않는 메서드 {}X
// 반드시 추상 클래스를 상속받은 하위 클래스에서 오버라이딩 해서 구현해야함
// abstract 반환타입 추상메서드명 (매개변수);

// Player
// 이름 : 문자열
// 종족 : 문자열
// 성별 : 문자열
// 경험치 : 정수

// 대화 - 입력 : (메세지 - 문자열) / 출력 : void
// 사냥 - 입력 : (수치 - 정수) / 출력 : (경험치 - 정수)
abstract class Player {
	String name;
	String species; 
	String gender;
	double experience;
	
	// 추상클래스에서도 생성자를 만들수는 있지만
	// 하위클래스에서 호출하는 용도로만 사용
	
	// 생성자 > generate constructor fields..
	public Player(String name, String species, String gender, double experience) {
		super();
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.experience = experience;
	}

	// 다 똑같이 적용됨 : 일반 메서드
	// final
	final void chat (String message) {
		System.out.println(this.name + ": " + message);
	}
	
	// 각각 다름 : 추상 메서드
	abstract double hunt (int figure);
}

class Dealer extends Player {
	
	// 생성자 > generate constructor super ..
	public Dealer(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
		// TODO Auto-generated constructor stub
	}

	// 추상메서드가 포함된 추상클래스를 상속받으면 반드시 추상메서드를 구현해야함
	double hunt (int figure) {
		System.out.println(figure + "만큼의 공격을 했습니다.");
		this.experience += (figure * 0.8);
		return this.experience;
	}
}

class Tanker extends Player {
	
	// 생성자 > generate constructor super ..
	public Tanker(String name, String species, String gender, double experience) {
		super(name, species, gender, experience);
		// TODO Auto-generated constructor stub
	}

	@Override
	double hunt(int figure) {
		System.out.println(figure + "만큼의 공격을 받습니다.");
		this.experience += figure;
		return this.experience;
	}
	
}


public class F_Abstract {

	public static void main(String[] args) {
		
		// 추상 클래스는 인스턴스를 생성할 수 없음 -- static으로는 사용 가능,  !변수의 타입으로는 사용가능!
		// Player player = new Player("이름", "인간", "남", 0); -- 생성자에 Error 생성자를 사용할 수 없음
		
		// 반드시 추상클래스를 상속하여 구현한 하위클래스로 인스턴스를 생성
		Dealer dealer = new Dealer("이름", "인간", "남", 0);
			

	}

}
