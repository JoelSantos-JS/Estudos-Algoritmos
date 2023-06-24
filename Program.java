import Pacote.PrintList;
import Pacote.PrintList.Node;

public class Program {
    public static void main(String[] args) {

        PrintList printList = new PrintList(0);

        printList.append(1);
        printList.append(2);
        printList.append(3);

        printList.printList();
        Node temp = printList.get(2);
        System.out.println("Valor  " + temp.value);

        printList.set(3, 10);
        printList.printList();

        printList.delete(3);
        printList.printList();
    }
}
