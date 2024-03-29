package LamparitayFigura;

public class Lamparita {
    private boolean estaEncendida = false;
    private static int contador = 0;

    public Lamparita(){
        contador = contador + 1;
    }
    public void estado(){
        if (estaEncendida == true){
            System.out.println("está encendida");
        }
        else{
            System.out.println("está apagada");
        }
    }
    public void encender(){
        this.estaEncendida = true;
    }
    public void apagar(){
        this.estaEncendida = false;
    }
    public int cantidadDeLamparas(){
        return contador;
    }

}
