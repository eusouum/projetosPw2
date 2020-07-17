package projeto01;

public class Tecnico extends Assistente {
    
    public double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double aumento(){
        this.salario = this.salario + this.bonus;
        return this.salario;
    
    }
    
}
