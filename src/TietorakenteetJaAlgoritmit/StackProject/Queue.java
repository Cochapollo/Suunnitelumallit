package TietorakenteetJaAlgoritmit.StackProject;

public class Queue {
    private ListItem head;
    private ListItem tail;
    private int size;

    public void push(String aData){
        ListItem oldTail = tail;
        tail = new ListItem();
        tail.setData(aData);
        tail.setNext(null);
        if(size == 0){
            head = tail;
        }else {
            oldTail.setNext(tail);
        }
        size++;
    }
    public ListItem pop(){
        try {
            ListItem oldHead = head;
            head = head.getNext();
            if(size == 0){
                tail = null;
            }
            size--;
            return oldHead;
        }catch (NullPointerException e){
            return null;
        }

    }
    public void printItems(){
        ListItem temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    public int getSize(){
        return size;
    }
}
