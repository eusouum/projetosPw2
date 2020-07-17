package projeto05;

public class Velho extends Imovel {
    
    public double desconto;
    public String situacao = "Velho";
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public double reducao(){
        this.valor = this.valor - this.desconto;
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
