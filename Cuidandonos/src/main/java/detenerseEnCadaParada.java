import java.util.List;

public class DetenerseEnCadaParada extends CalculadorDemora {
    private Integer cantidadDeMinutosADetenerse;

    public Integer calcularDemoraEnMinutos(List<String> direcciones){
        Integer tiempoDemoradoEnMinutos=0;
        for(int i=0;i<direcciones.size() - 1;i++){
            tiempoDemoradoEnMinutos+=calcularDemoraEntreDosDistancias(direcciones.get(i),direcciones.get(i+1));
        }
        return tiempoDemoradoEnMinutos;

    }


}
