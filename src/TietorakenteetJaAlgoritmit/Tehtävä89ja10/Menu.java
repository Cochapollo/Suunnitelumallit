/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TietorakenteetJaAlgoritmit.Tehtävä89ja10;

/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) {

                        printMenu();

        }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
private static void printMenu() {
    char select;
    BinaryTree tree = new BinaryTree();


    String data;
    do {
        System.out.print("\n\t\t1. Lisää avain.");
        System.out.print("\t\t\t2. Etsi avaimella.");
        System.out.print("\t\t\t3. Käy puu läpi sisäjärjestyksessä.");
        System.out.print("\t\t\t4. Poista avaimella.");
        System.out.println("\t\t\t5. lopetus ");
        select = Lue.merkki();
        switch (select) {
            case '1':
                System.out.println("Anna uusi avain (merkkijono)");
                data = new String(Lue.rivi());
                tree.insert(data);
                break;
            case '2':
                System.out.println("Anna etsittävä avain (merkkijono)");
                data = Lue.rivi();
                if (tree.find(data)!=null){
                    System.out.println("Avain löytyi.");
                }
                else
                    System.out.println("Avainta ei löytynyt.");

                break;
            case '3':
                tree.inOrder();
                System.out.println();
                break;
            case '4':
                data = Lue.rivi();
                tree.findForDelete(data);
                break;
            case '5':
                break;
        }
    }
    while (select != '5');
}
//printMenu loppuu ----------------------------------------------------------------
}


