package projeto01;

public class Assistente extends Funcionario {
    
    public void dados(){
            System.out.println("Dados do assistente:\n"                  
                    + "\nNumero: " + this.matricula
                    + "\nNome: " + this.nome
                    + "\nIdade: " + this.idade
                    + "\nSalário: R$" + this.salario);
        
    }
    
}
