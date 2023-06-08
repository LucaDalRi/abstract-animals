package esercizio1;

public class Aquila extends Animale implements Volante {

    public Aquila(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Skiit");
    }

    @Override
    void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto Volando!");
    }
}
