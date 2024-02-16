package ch02;

// 캡슐화 : 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음

// 가장 강력한 캡슐화, 조작을 전혀 할수 없음 - get메서드 사용
class FootballPlayerB {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	// 생성자
	FootballPlayerB (String name, String birth, String team, int goal){
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	// String, int 반환타입 + get메서드
	String getName () {
		return this.name;
	}
	
	// 변하지 않는 경우는 set 메서드 만들지 않음
	String getBirth () {
		return this.birth;
	}
	
	String getTeam () {
		return this.team;
	}
	int getGoal () {
		return this.goal;
	}
	
//	set 메서드 사용, 반환타입X, 매개변수 사용
	// 매개변수는 필드명사용(관습적으로 사용)
	void setName (String name) {
		this.name = name;
	}
	void setTeam (String team) {
		this.team = team;
	}
	void setGoal (int goal) {
		if (goal < 0) return;
		this.goal = goal;
	}
	
}

class FootballPlayerC {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	// 자바에서만 사용가능 source
	// source > generate construtor using fields
	public FootballPlayerC(String name, String birth, String team, int goal) {
		// super(); 지워도 됨
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	// source > generate get/set
	// package 가 default 와 동일
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	int getGoal() {
		return goal;
	}
	void setGoal(int goal) {
		this.goal = goal;
	}
	String getBirth() {
		return birth;
	}	
	
}

// 데이터의 무결성 보장
// 데이터를 변경했는지 알 수 없는데, 변경 하지 않았다고 보장해줌
public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민", "920000", "토트넘 홋스퍼", 0);
//		son.name = "손흥민"; -- 무결성 보장X
//		son.team = "토트넘 훗스퍼";
//		son.goal = 0;
		
		son.setGoal(-1);
		
//		System.out.println(son.name); -- Error
		System.out.println(son.getName()); // 메서드로 가져옴
		System.out.println(son.getTeam());
		System.out.println(son.getGoal());
		
	}

}
