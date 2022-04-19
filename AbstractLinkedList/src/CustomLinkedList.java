import java.util.ArrayList;
import java.util.List;

public class CustomLinkedList {
    private List<ListItem> listItems;
    private CustomListItem currentItem;

    public CustomLinkedList() {
        this.listItems = new ArrayList<ListItem>();
    }

    public boolean add(ListItem listItem) {
        if(findListItem(listItem) == null){
            if(this.currentItem != null) {
                if(this.currentItem.compareTo(listItem) < 0) {
                    int currentPosition = this.listItems.indexOf(currentItem);
                    this.listItems.add(currentPosition, listItem);
                } else {
                    this.listItems.add(listItem);
                }
            } else {
                this.listItems.add(listItem);
            }
            return true;
        }
        return false;
    }

    private ListItem findListItem(ListItem listItem){
        if(listItems.contains(listItem)){
            return listItem;
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.listItems.size(); i++) {
            result += this.listItems.get(i).getItemValue() + " ";
        }
        return result;
    }
}
