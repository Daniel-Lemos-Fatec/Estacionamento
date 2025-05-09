public class Pilha {
    private String[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public void push(String valor) {
        if (!isFull()) {
            elementos[++topo] = valor;
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return elementos[topo--];
        }
        return null;
    }

    public String peek() {
        if (!isEmpty()) {
            return elementos[topo];
        }
        return null;
    }

    public int size() {
        return topo + 1;
    }

    public boolean contains(String placa) {
        for (int i = 0; i <= topo; i++) {
            if (elementos[i].equals(placa)) {
                return true;
            }
        }
        return false;
    }
    
    public void print() {
        for (int i = 0; i <= topo; i++) {
            System.out.println((i+1)+": "+elementos[i]);
        }
    }
}