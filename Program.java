import Pacote.PrintList;

public class Program {
    public static void main(String[] args) {

        PrintList printList = new PrintList(1);

        printList.append(2);
        printList.printList();
        printList.pretend(5);

        printList.printList();

    }
}
