public class VeiculoMoto extends Veiculo{

    private final int cilindradas;

    public VeiculoMoto (String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int cilindradas ){

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);

        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return cilindradas;
    }
}
