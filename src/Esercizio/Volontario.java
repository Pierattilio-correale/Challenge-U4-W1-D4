package Esercizio;

public class Volontario implements CheckInable {
   private String nome;
   private int eta;
   private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("il volontario ha inziato il suo turno");
    }
}
