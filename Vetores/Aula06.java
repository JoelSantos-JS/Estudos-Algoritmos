package Vetores;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d");
        vetor.adiciona("e");
        vetor.adiciona("f");

        System.out.println(vetor);
        vetor.adiciona(2, "Aqui");
        System.out.println(vetor);

    }
}
