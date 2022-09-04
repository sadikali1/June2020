package com.control;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}

		Loop1: for (int i = 0; i <= 3; i++) {
			Loop2: for (int j = 0; j <= 3; j++) {
				if (i == 2 && j == 2) {
					continue Loop1;
				}

				System.out.println(i + " " + j);
			}
		}
	}

}
