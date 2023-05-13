package Vetores;

public class Program {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {

            vetor.adiciona("Joel");
            vetor.adiciona("Jose");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            throw new RuntimeException("Erro ao adicionar elemento");
        }

        System.out.println(vetor.modificaTamanho());

        System.out.println(vetor);
    }
}
