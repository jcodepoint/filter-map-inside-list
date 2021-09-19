import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapExample2 {

	public static void main(String[] args) {
		Map<Integer, Animal> animales = new HashMap<Integer, Animal>();
		animales.put(1, new Animal("Tigre", "Felino"));
		animales.put(2, new Animal("Leopardo", "Felino"));
		animales.put(3, new Animal("Ballena", "Cetaceo"));
		animales.put(4, new Animal("Orca", "Cetaceo"));
		
		List<Animal> animales2 = animales.values().stream()
				.filter(a -> !"Cetaceo".equals(a.getCategoria())).collect(Collectors.toList());

		animales2.forEach(System.out::println);
	}

}

class Animal {
	
	private String especie;
	private String categoria;
	
	public Animal(String especie, String categoria) {
		this.especie = especie;
		this.categoria = categoria;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "-> Especie: " + this.especie + " | Categoria: " + this.categoria;
	}
}
