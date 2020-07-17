package projeto05;

import javax.swing.JOptionPane;

public class Projeto05 {

    public static void main(String[] args) {
             
        Novo n = new Novo();
        Velho v = new Velho();                
        n.setValor(5000000);
        v.setEndereco("Av. Paulista");        
        v.setValor(5000000);
        n.setEndereco("Av. Paulista");
        n.setAcrescimo(10000);
        v.setDesconto(10000);
        int queijo;
        queijo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Para comprar Imóvel novo\nDigite 2 para comprar Imóvel Velho"));
        
        switch(queijo){
            
            case 1:
                n.adicional();
                n.resultado();
                break;
            case 2:
                v.reducao();
                v.resultado();
                break;
            default:
                break;
            
        }
        
    }
    
}
