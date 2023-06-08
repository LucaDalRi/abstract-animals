package esercizio1;

public class Delfino extends Animale implements Nuotatore {

    public Delfino(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Cri Cri");
    }

    @Override
    void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void nuota() {
        System.out.println("Sto Nuotando!");
    }
}
