package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        
        dados dados = new dados();
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do veiculo: "));
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do veiculo: "));
        
        dados.setHora_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada: ")));
        dados.setMin_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de entrada: ")));
        
        dados.setHora_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saida: ")));
        dados.setMin_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de saida: ")));
        
        dados.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço por hora: ")));
        
        double tempo_total = dados.calcula_tempo(dados.getHora_entrada(), dados.getMin_entrada(), dados.getHora_saida(), dados.getMin_saida());
        dados.gera_nota(tempo_total);
        
    }
    
}
