package TietorakenteetJaAlgoritmit.Tehtävä5;

interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private ListItem  current;
    private Stack container;
    private int index = -1;

    StackIterator (Stack c) {
        container = c;
        current = container.top;
        index = container.getSize();
    }


    public boolean hasNext() {
        if (index == 0) {
            return false;
        } else {
            return true;
        }
    }

    public ListItem next() {
        current=container.getListItem(index - 1);
        index--;
        return current;
    }

}

