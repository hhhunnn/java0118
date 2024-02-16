package ch_03;

import java.util.Arrays;
import java.util.Scanner;

public class Mabangjin {

	public static void main(String[] args) {

		
		int[][] mabangjin = new int[5][5];

		// 마방진 시작위치 설정
		int row = 0;
		int col = 2;

		mabangjin[row][col] = 1;

		for (int i = 2; i <= 25; i++) {
			row--;
			col++;

			// row 행이 벗어난 경우
			if (row < 0 && col < 5) {
				row = 4;
			}
			// col 열이 벗어난 경우
			if (row >= 0 && col > 4) {
				col = 0;
			}
			// row, col 둘 다 벗어난 경우
			if (row < 0 && col > 4) {
				row += 2;
				col--;
			}
			// 이동 위치에 값이 이미 있는 경우
			if (mabangjin[row][col] != 0) {
				row += 2;
				col--;
			}
			mabangjin[row][col] = i;
		}
		for (int i = 0; i < mabangjin.length; i++) {
			System.out.println(Arrays.toString(mabangjin[i]));
		}
		

	}

}
