import paquete1.Lamparita;
import java.util.ArrayList;
import paquete1.Figura;
import paquete1.Rectangulo;
import paquete1.Circulo;


public class Main {
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