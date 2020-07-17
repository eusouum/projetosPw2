package projeto05;

public class Imovel {
    
    public double valor;
    public String endereco;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void resultado(){
    
        System.out.println("Informações da compra:"
                + "\n\nLocalização: "+ this.getEndereco()
                + "\nValor: " + this.getValor()
                + "\nSituação: ");
        
    }
    
}
