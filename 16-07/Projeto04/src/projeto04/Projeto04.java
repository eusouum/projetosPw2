package projeto04;

import javax.swing.JOptionPane;

public class Projeto04 {

    public static void main(String[] args) {
        
        int sla;
        sla = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ingresso normal \nDigite 2 para ingresso vip"));
        switch (sla) {
            case 1:
                Normal n = new Normal();
                n.mostraInfo();
                break;
            case 2:
                int slasla;
                slasla = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Camarote inferior\nDigite 2 para Camarote superior"));
                switch (slasla) {
                    case 1:
                        Vip vip = new Vip();
                        vip.vip();
                        vip.mostraInfo();
                        break;
                    case 2:
                        CamaroteSuperior s = new CamaroteSuperior();
                        s.vip();
                        s.mostraInfo();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite um número válido");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite um numero válido");
                System.exit(0);
        }
    }
    
}
