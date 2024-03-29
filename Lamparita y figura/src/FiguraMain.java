import java.util.ArrayList;

import LamparitayFigura.Circulo;
import LamparitayFigura.Figura;
import LamparitayFigura.Lamparita;
import LamparitayFigura.Rectangulo;



public class FiguraMain {
    public static void main(String[] args) {
        // Crear un objeto Rectangulo
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 5.0, 3.0);
        // Calcular y mostrar su área
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        // Crear un objeto Circulo
        Circulo circulo = new Circulo("Círculo", 4.0);
        // Calcular y mostrar su área
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
