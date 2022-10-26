import java.util.ArrayList;
import java.util.List;

public class PromoGenerator {

	static class QuickRandom {
		int n = 1982;
		
		public int next() {
			n = (n * 17) % 1000;
			return n;
		}
	}

	QuickRandom random = new QuickRandom();
	
	List<Integer> accepted = new ArrayList<>();
	public int generate() {
		int code = random.next();
		accepted.add(code);
		return code;
	}

	
	public boolean verify(int code) {
		return accepted.remove(Integer.valueOf(code));
	}
}
