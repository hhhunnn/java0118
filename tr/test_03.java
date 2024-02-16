package tr;

class Test03 {
	int count= 1;
	int sum = 0;
	int solution (int number) {
		if (number <= 0) {
			return number = 0;
		} else {
			
			for (number = 1; number > 10; number /= 10) {
				count++;
				sum += count;
			}
			
			return sum;
		}
	}
}
public class test_03 {

	public static void main(String[] args) {
		
		int number = 123456789;
		int sum = 0;
		Test03 test3 = new Test03();
		sum = test3.solution(number);
		
		System.out.println(sum);

		

	}

}
