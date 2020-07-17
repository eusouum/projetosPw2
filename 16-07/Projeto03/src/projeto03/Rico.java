package projeto03;

public class Rico extends Pessia {
    
    public double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;        
        
    }
    
    public void fazCompras(){
        System.out.println("Hoje eu tenho R$" +dinheiro+ " para gastar");
    }
    
}
