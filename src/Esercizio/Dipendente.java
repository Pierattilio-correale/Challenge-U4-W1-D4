package Esercizio;

abstract class Dipendente implements CheckInable{
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }



    public double getStipendio() {
        return stipendio;
    }



    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + calculateSalary() +
                '}';
    }
    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Il dipendente ha iniziato il suo turno");
    }
}
