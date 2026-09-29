import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String cor;
    private List<Comodo> comodos; // Relação de composição: a Casa tem Cômodos

    public Casa(String cor) {
        this.cor = cor;
        this.comodos = new ArrayList<>(); // Inicializa a lista para evitar erros
    }

    // Método para adicionar um cômodo à casa
    public void adicionarComodo(String nome, double tamanho) {
        Comodo novoComodo = new Comodo(nome, tamanho);
        comodos.add(novoComodo);
    }

    public void exibirDetalhes() {
        System.out.println("Casa cor: " + cor);
        System.out.println("Cômodos da casa:");
        for (Comodo c : comodos) {
            System.out.println("- " + c.getNome() + " (" + c.getTamanho() + " m²)");
        }
    }
}
