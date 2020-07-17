package projeto04;

public class CamaroteSuperior extends Vip {
    
    @Override
    public double vip(){
        this.valor = this.valor + 100;
        return this.valor;
    } 
    
}