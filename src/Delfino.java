public class Delfino extends Animale {

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
}
