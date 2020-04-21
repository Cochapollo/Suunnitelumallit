package TietorakenteetJaAlgoritmit.Tehtävä5;

public class Stack {

    ListItem top;
    private int size;
    private ListItem[] stuff = new ListItem[10];

    public Stack() {
        top = null;
        size = 0;
    }

    public StackIterator iterator() {
        return new StackIterator(this);
    }

    public int getSize() {
        return size;
    }

    public void push(String aData) {
        top = new ListItem();
        top.setData(aData);
        stuff[size] = top;
        size++;
    }

    public ListItem pop() {
        top = new ListItem();
        if (size != 0) {
            stuff[size] = null;
            size--;
            top = stuff[size];
            return top;
        }
        return null;
    }

    public void printItems() {
        for (int i = size-1; i >= 0; i--) {
            System.out.println(stuff[i].getData());
        }
    }

    public ListItem getListItem(int i) {
        return stuff[i];
    }
}
