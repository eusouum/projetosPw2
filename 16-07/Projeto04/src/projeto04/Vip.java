package projeto04;

public class Vip extends Ingresso {
    
    public double vip(){      
    
        this.valor = this.valor + 50;
        return this.valor;
        
    }
    
    @Override
    public void mostraInfo(){
        
        System.out.println("Informações da compra:"
                + "\n\nValor: R$" + this.valor);
        }
    
}