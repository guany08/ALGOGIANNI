import java.util.ArrayList;

import LamparitayFigura.Figura;
import LamparitayFigura.Lamparita;

public class Lamparita {
    public static void main(String[] args) {
        ArrayList<String> sarandonga = new ArrayList<>();
        Lamparita Lampara1 = new Lamparita();
        Lamparita Lampara2 = new Lamparita();
        Lamparita Lampara3 = new Lamparita();
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