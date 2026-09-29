import static java.lang.IO.*;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto todo (Casa)
        String cor = readln("Qual a cor da casa ?: ");
        Casa minhaCasa = new Casa(cor);

        for (int i = 1;i <= 3; i++){
            String comodo = readln("Qual o nome do " + i + "° comodo ? :");
            Float tamanho = Float.parseFloat(readln("Qual o tamanho do comodo " + i + "° ?:"));

            // Adicionando partes (Cômodos) por meio da composição
            minhaCasa.adicionarComodo(comodo, 12.5);
        }
        // Exibindo o resultado
        minhaCasa.exibirDetalhes();
    }
}