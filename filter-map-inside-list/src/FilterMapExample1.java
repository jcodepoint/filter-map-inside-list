import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> animales = new HashMap<Integer, String>();
		animales.put(1, "Tigre");
		animales.put(2, "Leopardo");
		animales.put(3, "Ballena");
		animales.put(4, "Orca");

		List<String> animales2 = animales.values().stream()
				.filter(a -> !"Orca".equals(a)).collect(Collectors.toList());
		
		animales2.forEach(System.out::println);
	}

}
