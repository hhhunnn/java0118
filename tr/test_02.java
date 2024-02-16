package tr;

class Test02 {
	int array[];
	int queries[][];
	
	int i;
	int s;
	int e;
	int value;
	
	void solution (int array[], int queries[][]) {
		
		queries = new int [s][e];
		array [i] = value;
		
		
		for (s = 0; s < 3; s++) {
			if (i == s) {
				array[i] = value + 1;
			}
		}

		for (e = 1; e <= 3; e++) {
			if (i == e) {
				array[i] = value + 1;
				
			}
		}
		

	}

}

public class test_02 {

	public static void main(String[] args) {
		
		int s = 0;
		int e = 0;
		int i = 0;
		int value = 0;

		int queries[][] = {{0,1},{1,2},{2,3}};
		int array[] = {0, 1, 2, 3, 4};
		queries = new int [s][e];
		array[i] = value;
		Test02 test02 = new Test02();
		test02.solution(array, queries);
		
		for(i = 0; i <= array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length) {
				System.out.print(", ");
			}
			i++;
		}
		
		
	}

}
