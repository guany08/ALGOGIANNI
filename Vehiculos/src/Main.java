import Vehic.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo autito = new Vehiculo("Audi", "TT", 1500);
        System.out.println(autito.calcularCostoAlquiler(10));
    }
}