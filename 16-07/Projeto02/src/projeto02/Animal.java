package projeto02;

public class Animal {
    
    public String nome;
    public String raca;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void caminha(){
        System.out.println("Estou caminhando!!!");   
    }

    
    
}
