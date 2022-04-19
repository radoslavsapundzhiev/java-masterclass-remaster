import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        String stringData = "Sofia Plovdiv Varna Varna Bourgas Russe Pleven";
        String[] data = stringData.split(" ");
        for (String town: data) {
            CustomListItem customListItem = new CustomListItem(town);
            customLinkedList.add(customListItem);
        }
        System.out.println(customLinkedList.toString());
    }
}
