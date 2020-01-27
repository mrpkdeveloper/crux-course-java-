package time_comp;

public class count_pallindromic_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substring_pallindrome_time_comp("nittin"));
	}

	public static int substring_pallindrome_time_comp(String str) {
		int count = 0;
		// odd substrings
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; (axis + orbit) < str.length() && (axis - orbit) >= 0; orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else
					break;
			}
		}

		// even substrings
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; (axis + orbit) < str.length() && (axis - orbit) >= 0; orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else
					break;
			}
		}

		return count;

	}

}
