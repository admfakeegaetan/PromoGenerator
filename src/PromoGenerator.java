import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class PromoGenerator {

	SecureRandom random = new SecureRandom();
	
	List<Integer> accepted = new ArrayList<>();
	public int generate() {
		int code = random.nextInt(1000);
		accepted.add(code);
		return code;
	}

	
	public boolean verify(int code) {
		return accepted.remove(Integer.valueOf(code));
	}
}
