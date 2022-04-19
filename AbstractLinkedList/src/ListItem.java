public abstract class ListItem {
    private ListItem nextItem;
    private ListItem previousItem;
    private String itemValue;

    public ListItem(String itemValue) {
        this.itemValue = itemValue;
    }

    public abstract boolean moveToNextItem();
    public abstract boolean moveToPreviousItem();

    public ListItem getNextItem() {
        return nextItem;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public int compareTo(ListItem itemToCompare){
        return this.itemValue.compareTo(itemToCompare.getItemValue());
    }
}
