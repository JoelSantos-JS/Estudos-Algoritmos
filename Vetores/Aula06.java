package Vetores;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d");
        vetor.adiciona("e");

        System.out.println(vetor);
        vetor.adiciona(0, "A");
        System.out.println(vetor);

    }
}
