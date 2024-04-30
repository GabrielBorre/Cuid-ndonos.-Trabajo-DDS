import java.util.List;

public class CalculoAproximadoTotal extends CalculadorDemora{
    public Integer calcularDemoraEnMinutos(List<String> direcciones){
        String direccionPartida=direcciones.get(0);
        String direccionLLegada=direcciones.get(direcciones.size() - 1);
        Integer calculadorDemora;
        calculadorDemora=calcularDemoraEntreDosDistancias(direccionPartida,direccionLLegada);
        return calculadorDemora;
    }

}
