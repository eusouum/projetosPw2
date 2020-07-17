package projeto01;

public class Admin extends Assistente{
    
    public double bonus;
    public String turno;
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public double aumento(){
     this.salario = this.salario + this.bonus;
     return this.salario;
    }
   
    
}
