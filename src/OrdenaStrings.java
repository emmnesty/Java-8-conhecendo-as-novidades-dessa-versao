import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// #Primeira forma
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;

			return 0;
		});

		// #Segunda forma
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}

		// Com lambda ->
		palavras.forEach(s -> System.out.println(s));

		// Sem lambda ->
//		class ImprimeNaLinha implements Consumer<String> {
//
//			@Override
//			public void accept(String s) {
//
//			}
//		}
	}
}
