package Esercizio;

public class MainDitutto {
    public static void main(String[] args) {
        Dipendente d1 = new DipendenteFullTime("293448",1300.23,Dipartimento.VENDITE);
        Dipendente d2 = new DipendentePartTime("243478",10 ,Dipartimento.PRODUZIONE,80.0);
        Dipendente d3 = new Dirigente("292648",1300.23,Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti= new Dipendente[3];
        dipendenti[0]=d1;
        dipendenti[1]=d2;
        dipendenti[2]=d3;

        double totale = 0;


        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i]);
            totale += dipendenti[i].calculateSalary();
        }

        Volontario d4 = new Volontario("Luca",22,"professionista");
        Volontario d5 = new Volontario("Riccardo",28,"professionista");

        System.out.println("Il calcolo totale degli stipendi è " + totale);

        CheckInable [] volontarieDipendenti = new CheckInable[5];
        volontarieDipendenti[0]= d1;
        volontarieDipendenti[1]= d2;
        volontarieDipendenti[2]= d3;
        volontarieDipendenti[3]= d4;
        volontarieDipendenti[4]= d5;
for (int i = 0 ; i< volontarieDipendenti.length;i++){
    volontarieDipendenti[i].checkIn();
}
    }
}
