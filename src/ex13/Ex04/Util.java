package ex13.Ex04;

public class Util {
	// how 1
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey() == k) { 
			return p.getValue();
		} else {
			return null;
		}
	} 
	
	// how 2
	/* public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	} */
}
