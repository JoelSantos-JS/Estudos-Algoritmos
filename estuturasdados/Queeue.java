package estuturasdados;

import java.util.Queue;

public class Queeue {

    public static void main(String[] args) {
        Queue<Double> fila = new java.util.LinkedList<>();

        fila.offer(3.0);
        fila.offer(4.0);
        fila.offer(5.0);
        fila.offer(5.0);

        System.out.println(fila);
    }
}
