public class CustomListItem extends ListItem {
    public CustomListItem(String itemValue) {
        super(itemValue);
    }

    @Override
    public boolean moveToNextItem() {
        if(this.getNextItem() != null){
            this.setPreviousItem(this);
            return true;
        }
        return false;
    }

    @Override
    public boolean moveToPreviousItem() {
        if(this.getPreviousItem() != null){
            this.setNextItem(this);
            return true;
        }
        return false;
    }
}
