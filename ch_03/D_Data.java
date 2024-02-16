package ch_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
	String name;
	int age;
	
	Member (String name, int age) {
		this.name = name;
		this.age = age;
	}

	// source - toString 생성
	@Override // Object 상속
	public String toString() {
		return "Member [name =" + name + ", age =" + age + "]";
	}
	
	
}



public class D_Data {
	//			member은 ArrayList의 인스턴스
	static List<Member> members = new ArrayList<>();
	
	public static void main(String[] args) {
		
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("작업 : ");
			String input = scanner.nextLine();
			if (input.equals("종료")) break;
			if (!input.equals("입력") && !input.equals("보기")) continue;
			
			// '입력'이라는 입력을 받으면 members 리스트에 요소 추가
			if (input.equals("입력")) {
				
				System.out.print("이름 : ");
				String name = scanner.nextLine();
				
				System.out.print("나이 : ");
				int age = scanner.nextInt();
				
				System.out.println(name + " " + age);
				
				// member은 Member의 인스턴스
				Member member = new Member(name, age);
				members.add(member);
			}
			// '보기'라는 입력을 받으면 members 리스트를 보여줌
			if (input.equals("보기")) {
				System.out.println(members);
			}
			
			
		}

	}

}
