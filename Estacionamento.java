import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha estacionamento = new Pilha(10);
        Pilha estacionamentoAuxiliar = new Pilha(10);

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

                if (tipoMovimento.equals("1")) {
                    if (!estacionamento.contains(placa)) {
                        System.out.println("Carro " + placa + " não está no estacionamento.");
                    } else if (!estacionamento.isEmpty()) {
                        int manobras = 0;
                
                        while (!estacionamento.isEmpty()) {
                            String topo = estacionamento.pop();
                            if (topo.equals(placa)) {
                                System.out.println("Carro " + placa + " saiu do estacionamento com " + manobras + " manobras.");
                                break;
                            } else {
                                estacionamentoAuxiliar.push(topo);
                                manobras++;
                            }
                        }
                
                        while (!estacionamentoAuxiliar.isEmpty()) {
                            estacionamento.push(estacionamentoAuxiliar.pop());
                        }
                    } else {
                        System.out.println("Carro " + placa + " não saiu: estacionamento vazio.");
                    }
                }                
            }
        }
        sc.close();
    }
}