import java.util.ArrayList;

import LamparitayFigura.Figura;
import LamparitayFigura.Lamparita;

public class LamparitaMain {
    public static void main(String[] args) {
        ArrayList<String> sarandonga = new ArrayList<>();
        LamparitaMain Lampara1 = new LamparitaMain();
        LamparitaMain Lampara2 = new LamparitaMain();
        LamparitaMain Lampara3 = new LamparitaMain();
        Lampara1.estado();
        Lampara1.encender();
        Lampara1.estado();
        Lampara1.apagar();
        System.out.print("La lampara ");
        Lampara1.estado();
        System.err.println(Lampara1.cantidadDeLamparas());
        System.out.println(Lampara1.toString());
    }
}