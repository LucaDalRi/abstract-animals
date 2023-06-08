package esercizio1;

public class Passerotto extends Animale implements Volante {

    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Cip Cip");
    }

    @Override
    void mangia() {
        System.out.println("Vermetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto Volando!");
    }
}
