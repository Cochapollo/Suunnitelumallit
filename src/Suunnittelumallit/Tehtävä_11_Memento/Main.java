package Suunnittelumallit.Tehtävä_11_Memento;

public class Main {

    public static void main(String[] args) {
        Riddler r = new Riddler(); // MTIrMS8oMTAwLzIpJQ==
        Customer a = new Customer(r,"Joni");
        Customer b = new Customer(r,"Toni");
        Customer c = new Customer(r,"Roni");
        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
    }
}

