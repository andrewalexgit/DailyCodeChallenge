import java.util.*;

public class Answer_20190305 {

	public static void main(String[] args) {

		// Given input (assuming it is valid).
		String input = "1111";

		// If the input is valid then there is always 1 message to be made from individual letters
		int ans_count = 1;

		// All of the pairs less than 26 added up plus the individual case
		// is the answer.
		for (int i = 0; i < input.length()-1; i++) {
			int check = Integer.valueOf(input.substring(i, i+2));
			if (check < 26) {
				ans_count++;
			}
		}

		System.out.println(ans_count);
	} 
}