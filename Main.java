import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
//		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(new Solution().solution(numbers));
	}

}
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
        	numStrs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(numStrs, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return - Integer.parseInt(s1+s2) + Integer.parseInt(s2+s1);
			}
		});
        for (String numStr : numStrs)
        	answer += numStr;
        if (answer.charAt(0) == '0')
        	return "0";
        else
        	return answer;
    }
}