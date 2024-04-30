import java.util.ArrayList;
import java.util.List;

//Aclaración: el código escrito tiene como fin resolver el segundo requerimiento de modelo de dominio.
//no escribí dentro de la clase trayecto los atributos y métodos que no estuvieran relacionados con la resolución de este requerimiento, dado que estos elementos ya se encuentran expresados en el diagrama de clases.
public class Trayecto{


    private List <String> direcciones;
    private CalculadorDemora calculadorDemora;

    public Trayecto(String direccionPartida,String direccionLlegada){

        direcciones=new ArrayList<>();
        direcciones.add(direccionPartida);
        direcciones.add(direccionLlegada);
    }
    public void agregarDireccion(String direccion){
        direcciones.add(direccion);
    }

    public void calcularDistancia(){
        calculadorDemora.calcularDemoraEnMinutos(direcciones);
    }




}