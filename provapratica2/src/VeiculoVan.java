public class VeiculoVan extends Veiculo implements Avaliavel, Inspecionavel{



    private final int maxPassageiros;

    public VeiculoVan(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int maxPassageiros){

        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
    }
    
    public int getMaxPassageiros(){
        return maxPassageiros;
    }

    @Override
    public abstract void realizarInspecao(){

    }

    @Override
    public abstract void avaliar(int nota){

    }
}

