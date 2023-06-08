package esercizio1;

public class Cane extends Animale {

    public Cane(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Bau Bau");
    }

    @Override
    void mangia() {
        System.out.println("Carne");
    }
}
