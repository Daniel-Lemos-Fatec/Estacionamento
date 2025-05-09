import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha estacionamento = new Pilha(10);

        System.out.println("Bem-vindo ao Estacionamento do Bololo Haha!");
        System.out.println("Digite '0' se deseja adicionar um carro ao estacionamento.");
        System.out.println(
                "Digite '1' se deseja remover um carro do estacionamento, seguido da placa do carro (ex: 0 ABC1234):");

        while (sc.hasNext()) {

            String linha = sc.nextLine();
            String[] partes = linha.split(" ");

            if (linha.isEmpty())
                break;

            while (partes.length != 2) {
                System.out.println("   (o_o)   ");
                System.out.println("  /| |\\   ");
                System.out.println("  / \\ \\   ");
                System.out.println(" (_____)  ");
                System.out.println("  |   |   ");


                System.out.println("BOLOLO HAHA BOLOLO HAHAHAHA");
                System.out.println("Por favor, verifique se o formato da entrada está correto!");
                System.out.println("Digite '0' se deseja adicionar um carro ao estacionamento.");
                System.out.println(
                        "Digite '1' se deseja remover um carro do estacionamento, seguido da placa do carro (ex: 0 ABC1234):");
                break;
            }

            if (partes.length == 2) {
                String tipoMovimento = partes[0];
                String placa = partes[1];
                if (tipoMovimento.equals("0")) {
                    if (estacionamento.contains(placa)) {
                        System.out.println("Carro " + placa + " já está no estacionamento.");
                    } else if (!estacionamento.isFull()) {
                        estacionamento.push(placa);
                        System.out.println("Carro " + placa + " entrou no estacionamento.");
                    } else {
                        System.out.println("Carro " + placa + " não entrou: estacionamento cheio.");
                    }
                }    
            }

            // se o digitado for 1 remover ate chegar na placa digitada e ir contando as
            // manobras
        }

        sc.close();
    }
}