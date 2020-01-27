package interfaces;

import java.util.Comparator;

public class carcolorcomparator implements Comparator<car> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(car o1, car o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}

}
