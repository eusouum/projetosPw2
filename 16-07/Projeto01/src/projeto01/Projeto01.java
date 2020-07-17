package projeto01;

public class Projeto01 {

    public static void main(String[] args) {
        
        Tecnico t = new Tecnico();
        Admin a = new Admin();
        
        t.setMatricula(1);
        t.setNome("Emily");
        t.setIdade(21);
        t.setSalario(2500);
        t.setBonus(500);
        t.aumento();
        t.dados();
        
        a.setMatricula(2);
        a.setNome("Sandro");
        a.setIdade(20);
        a.setSalario(2000);
        a.setBonus(500);
        a.setTurno("noite");
        a.aumento();
        a.dados();
        
    }
    
}
