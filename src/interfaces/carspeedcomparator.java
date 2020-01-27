package interfaces;

import java.util.Comparator;

public class carspeedcomparator implements Comparator<car> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(car tcar, car ocar) {
		// TODO Auto-generated method stub
		return tcar.speed-ocar.speed;
	}

}
