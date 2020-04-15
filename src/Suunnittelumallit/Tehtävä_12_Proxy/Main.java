package Suunnittelumallit.Tehtävä_12_Proxy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Image> album = Arrays.asList(new ProxyImage("Photo.png"), new ProxyImage("Gif.gif"));
        album.forEach(Image::showData);
        album.forEach(Image::displayImage);
    }
}

