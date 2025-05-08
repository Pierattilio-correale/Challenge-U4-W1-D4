package Esercizio;

public class DipendentePartTime extends Dipendente{
    private double oreLavorate;
    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }
    public double  calculateSalary(){
        return (getStipendio() * oreLavorate);

    }
}
