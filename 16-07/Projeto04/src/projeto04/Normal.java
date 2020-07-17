package projeto04;

public class Normal extends Ingresso {
    
    @Override
    public void mostraInfo(){
        
        System.out.println("Informações da compra:"
                + "\n\nValor: R$" + this.valor);
    
        }
    
}