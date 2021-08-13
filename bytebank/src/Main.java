import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(new Usuario("Rodrigo", 30), new Usuario("Gustavo", 7));
        usuarios.stream().forEach(e -> System.out.println(e.getNome()));

        List<Usuario> maiorQueDez = usuarios.stream().filter(u -> u.getIdade() > 10).collect(Collectors.toList());
        maiorQueDez.forEach(System.out::println);
    }
}

class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
