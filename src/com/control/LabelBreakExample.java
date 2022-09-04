package com.control;

public class LabelBreakExample {

	public static void  main(String[] abc) {
		Loop1:
		for(int i=0;i<=3;i++) {
			Loop2:
			for(int j=0; j<=3;j++) {
				if(i==2 && j==2) {
					break Loop1;
				}
				
				System.out.println(i + " "+ j);
			}
		}
	}

}
