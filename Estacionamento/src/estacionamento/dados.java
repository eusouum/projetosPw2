package estacionamento;

import javax.swing.JOptionPane;

public class dados {
    public String placa;
    public String modelo;
    public double hora_entrada;
    public double min_entrada;
    public double hora_saida;
    public double min_saida;
    public int preco;
    public double tempo;
    
    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    //10 reais a hora

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(double hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public double getMin_entrada() {
        return min_entrada;
    }

    public void setMin_entrada(double min_entrada) {
        this.min_entrada = min_entrada;
    }

    public double getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(double hora_saida) {
        this.hora_saida = hora_saida;
    }

    public double getMin_saida() {
        return min_saida;
    }

    public void setMin_saida(double min_saida) {
        this.min_saida = min_saida;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public double calcula_tempo (double hora_entrada, double min_entrada, double hora_saida, double min_saida){
        
        double conv_ent = hora_entrada + min_entrada/60;
        double conv_saida = hora_saida + min_saida/60;
        
        this.tempo = Math.ceil(conv_saida - conv_ent);
        
        return this.tempo;
    }
    
    public void gera_nota(double preco){
        
           double pano = this.tempo * preco;            
        JOptionPane.showMessageDialog(null, "Todo Duro Estacimento \n" + "Dados do Veiculo: \n" + "Placa: " + this.placa + "\nModelo: " + this.modelo + "\nHora de entrada: " + this.hora_entrada + "\nMinuto de entrada: " + this.min_entrada + "\nHora de saida: " + this.hora_saida + "\nMinuto de saida: " + this.min_saida + "\nValor cobrado por horas cheias: " + this.preco + "\nPreço total: " + pano);
    }
    
}
