package Esercizio;

public class Dirigente extends Dipendente{
    private final double bonus = 1500.0;
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
    public double calculateSalary(){
        return getStipendio() + bonus;
    }
}
