import br.com.alura.bytebanck.modelo.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTeste {

    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(new Usuario("Rodrigo", 30), new Usuario("Gustavo", 7));
        usuarios.stream().forEach(e -> System.out.println(e.getNome()));

        List<Usuario> maiorQueDez = usuarios.stream().filter(u -> u.getIdade() > 10).collect(Collectors.toList());
        maiorQueDez.forEach(System.out::println);
    }
}

