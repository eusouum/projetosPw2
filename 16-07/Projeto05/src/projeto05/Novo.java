package projeto05;

public class Novo extends Imovel{
    
    private double acrescimo;

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }
    private String situacao = "Novo";

    public String getSituacao() {
        return situacao;
    }
    
    public double adicional(){
        this.valor = this.valor + this.acrescimo;
        return this.valor;
    }
    
    @Override
    public void resultado(){
    
        System.out.println("Informações da compra:"
                + "\n\nLocalização: "+ this.getEndereco()
                + "\nValor: " + this.getValor()
                + "\nSituação: " + this.getSituacao());
        
    }
    
    
    
}
