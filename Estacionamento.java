import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha estacionamento = new Pilha(10);
        Pilha estacionamentoAuxiliar = new Pilha(10);

        char opcao = 'A';
        while (opcao != '2') {
            System.out.println("Bem-vindo ao Estacionamento do Bololo Haha! Temos capacidade para 10 carros!");
            System.out.println("Digite '0' se deseja adicionar um carro ao estacionamento.");
            System.out.println("Digite '1' se deseja remover um carro do estacionamento, seguido da placa do carro (ex: 0 ABC1234):");
            System.out.println("Digite '2' para sair do programa.");

            String linha = sc.nextLine();

            if (linha.isEmpty()) break;

            linha = linha.toUpperCase().replace(" ", "");
            opcao = linha.charAt(0);

            if (opcao == '2') {
                System.out.println("Saindo do estacionamento...");
                break;
            }
            if (opcao != '0' && opcao != '1') {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            String placa = linha.substring(1).trim();

            if (placa.isEmpty()) {
                System.out.println("Placa inválida! Tente novamente.");
                continue;
            }
            
                if (opcao=='0') {
                    if (estacionamento.contains(placa)) {
                        System.out.println("-- O carro " + placa + " já está no estacionamento.");
                    } else if (!estacionamento.isFull()) {
                        estacionamento.push(placa);
                        System.out.println("-- O carro " + placa + " entrou no estacionamento.");
                    } else {
                        System.out.println("-- O carro " + placa + " não entrou; estacionamento cheio!");
                    }
                }    

                if (opcao=='1') {
                    if (!estacionamento.contains(placa)) {
                        System.out.println("-- O carro " + placa + " não está no estacionamento.");
                    } else if (!estacionamento.isEmpty()) {
                        int manobras = 0;
                
                        while (!estacionamento.isEmpty()) {
                            String topo = estacionamento.pop();
                            if (topo.equals(placa)) {
                                System.out.println("-- O carro " + placa + " saiu do estacionamento com " + manobras + " manobras.");
                                System.out.println("Os carros voltaram para o estacionamento após mais " + manobras + " manobras, totalizando " + manobras*2 + " manobras.");
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
                        System.out.println("-- O carro " + placa + " não saiu: estacionamento vazio.");
                    }
                }
                System.out.println("O estacionamento tem " + estacionamento.size() + " carros atualmente:");
                estacionamento.print();
                System.out.println("//\n\n");
            }
        System.out.println("Estacionamento fechado.");
        sc.close();
    }
}