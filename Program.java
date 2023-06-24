import Pacote.PrintList;

public class Program {
    public static void main(String[] args) {

        PrintList printList = new PrintList(0);

        printList.append(1);
        printList.append(2);
        printList.append(3);

        printList.printList();

        System.out.println(printList.get(2));

        printList.set(3, 10);
        printList.printList();

    }
}
