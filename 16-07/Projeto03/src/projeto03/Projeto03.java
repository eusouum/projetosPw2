package projeto03;

public class Projeto03 {

    public static void main(String[] args) {
        
        Miseravel raul = new Miseravel();
        Pobre joao = new Pobre();
        Rico rafael = new Rico();
        
        rafael.setDinheiro(50000);
        rafael.fazCompras();
        joao.trabalha();
        raul.mendiga();
        
    }
    
}
