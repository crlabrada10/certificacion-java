package home.certification.exams.practice.testIII;

import java.util.Arrays;

public class Whiz7_ArrayWithSort {

	public static void main(String[] args) {
		int[] ints = {3,6,1,4,0};
		Arrays.sort(ints, 0, 4);
		for (int i : ints) {
			System.out.println(i);
		}
	}

}
