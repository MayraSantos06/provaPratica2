import java.util.ArrayList;

public class AluguelExecutivo extends Aluguel implements Avaliavel{
    
    private final String motorista;
    private ArrayList<Veiculo> veiculos;

    public AluguelExecutivo (String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status){

        super(nomeCliente, quantidadeDias, valorTotal, status);
        
        this.motorista = motorista;
    }

    public String getMotorista(){
        return motorista;
    }

    @Override
    public abstract void exibirDetalhes(){

        System.out.println("Nome do cliente:"+ getNomeCliente());
        System.out.println("Quant. de dias:"+ getQuantidadeDias());
        System.out.println("Valor Total: $"+ getValorTotal());
        System.out.println("Status:"+ getStatus()); 
        System.out.println("Motorista:"+ motorista); 
        System.out.println("Avaliação:"+ avaliacao); 

        boolean encontrou = false;
        for (Veiculo veiculo : veiculos) {

                System.out.println(
                    "Placa: " + veiculo.getPlaca()
                    + " | Modelo: " + veiculo.getModelo()
                    + " | Ano de Fabricação " 
                    + veiculo.getAnoFabricacao()
                    + " | Valor da diaria: " + veiculo.getValorDiaria()
                    + " | Quilometragem: " + veiculo.getQuilometragem()
                    + " | Status do veiculo: " + veiculo.getStatus()
                );

                encontrou = true;
            }

            if (!encontrou) {
            System.out.println("Nenhum veiculo para exibir.");
        }
            
        @Override
        public abstract void avaliar(int nota){
            
        }
        
        }
    
    }
}
