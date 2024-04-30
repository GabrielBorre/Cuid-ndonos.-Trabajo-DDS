import java.util.List;

abstract class CalculadorDemora {
    public abstract Integer calcularDemoraEnMinutos(List<String> direccione);
    public abstract Integer calcularDemoraEntreDosDistancias(String direccionPartida, String direccionLLegada);
    // aclaración: este último método debería ser un void (es decir, no deberia ser abstracto) dado que devolvería la demora en minutos entre dos direcciones. Dicho método será utilizado para cada forma de calcular la demora de un trayecto, ya sea calculando las demoras parciales entre los elementos contiguos de la lista direcciones de la Clase Trayecto, o calculando  entre la primera dirección de la lista de la clase Trayecto y la ultima.
}

