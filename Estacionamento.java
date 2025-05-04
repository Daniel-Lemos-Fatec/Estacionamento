import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha estacionamento = new Pilha(10);

        while (sc.hasNext()) {
            // pegar o que foi digitado e dividir em 2 partes
            // a primeira parte se é entrada ou saida
            // a segunda é a placa
            // se o digitado for 0 e a pilha nao estiver cheia adiciona essa placa
            // se o digitado for 1 remover ate chegar na placa digitada e ir contando as manobras
        }

        sc.close();
    }
}