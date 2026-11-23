public class VeiculoCarro extends Veiculo {

    private final int portas;
    
    public VeiculoCarro (String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int portas){

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);

        this.portas = portas;
    }
    
    public int getPortas(){
        return portas;
    }
    
}
