package Suunnittelumallit.Tehtävä_6_Decorator;

import Suunnittelumallit.Tehtävä_6_Decorator.Decorator.Crypto;
import Suunnittelumallit.Tehtävä_6_Decorator.Decorator.StringDecorator;
import Suunnittelumallit.Tehtävä_6_Decorator.File.FileManager;
import Suunnittelumallit.Tehtävä_6_Decorator.File.PepegaFileManager;

public class Main {

    public static void main(String[] args) {
        String s = "Todella salainen koodi: 1234-5678-9101-1121";
        StringDecorator encrypted = new Crypto(new PepegaFileManager("out/SuperSecretFile.txt"));
        encrypted.writeFile(s);
        FileManager plain = new PepegaFileManager("out/SuperSecretFile.txt");

        System.out.printf("Input: %s\n", s);
        System.out.printf("Encrypted: %s\n", plain.readFile());
        System.out.printf("Decrypted: %s", encrypted.readFile());
    }
}
