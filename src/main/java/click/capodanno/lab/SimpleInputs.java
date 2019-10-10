package click.capodanno.lab;

import java.util.LinkedList;
import java.util.List;

public class SimpleInputs {

	public List<String> simple(int a, int b) {
		List<String> result = new LinkedList<>();
		if (a > 20) {
			if (a % 2 == 0) {
				result.add("A is a large even number");
			} else {
				result.add("A is a large uneven number");
			}
		}

		if (b > 100) {
			if (b % 2 == 0) {
				result.add("B is a large even number");
			} else {
				result.add("B is a large uneven number");
			}
		}
		return result;
	}
}