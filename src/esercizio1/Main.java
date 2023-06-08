package esercizio1;

public class Main {
    public static void main(String[] args) {

        Cane cane = new Cane("Cane");
        Passerotto passerotto = new Passerotto("Passerotto");
        Aquila aquila = new Aquila("Aquila");
        Delfino delfino = new Delfino("Delfino");


        System.out.println("Il cane fa");
        cane.verso();
        System.out.println("e mangia");
        cane.mangia();
        System.out.println("e ora va a dormire");
        cane.dormi();
        System.out.println("----------------------");
        System.out.println("Il passerotto fa");
        passerotto.verso();
        System.out.println("e mangia");
        passerotto.mangia();
        System.out.println("e ora va a dormire");
        passerotto.dormi();
        System.out.println("----------------------");
        System.out.println("L'aquila fa");
        aquila.verso();
        System.out.println("e mangia");
        aquila.mangia();
        System.out.println("e ora va a dormire");
        aquila.dormi();
        System.out.println("----------------------");
        System.out.println("Il delfino fa");
        delfino.verso();
        System.out.println("e mangia");
        delfino.mangia();
        System.out.println("e ora va a dormire");
        delfino.dormi();
        System.out.println("----------------------");


    }
}
