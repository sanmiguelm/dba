package dba_exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exam1 {
	
	public static void main(String []args) {
		int numbers[] = new int[]{5, 1, 4, 6, 7, 3, 5, 7, 3};
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		Set<Integer> read = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (read.contains(numbers[i])) {
				duplicates.add(numbers[i]);
			}
			read.add(numbers[i]);
		}
		System.out.println(duplicates);
	}
	
}
