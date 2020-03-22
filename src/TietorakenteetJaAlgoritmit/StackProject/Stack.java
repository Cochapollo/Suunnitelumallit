package TietorakenteetJaAlgoritmit.StackProject;

public class Stack {
    private ListItem top;
    private int size;

    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData){
        ListItem oldTop = top;
        top = new ListItem();
        top.setData(aData);
        top.setNext(oldTop);
        size++;
    }
    // poistetaan alkio pinon huipulta ja palautetaan null arvo
    // jos pino tyhjä palauta null
    public ListItem pop() throws NullPointerException{
        try{
            ListItem oldTop = top;
            top = top.getNext();
            size--;
            return oldTop;
        }catch (NullPointerException e){
            return null;
        }
    }
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems(){
        ListItem temp = top;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    public int getSize(){
        return size;
    }
}
