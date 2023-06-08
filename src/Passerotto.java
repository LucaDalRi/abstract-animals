public class Passerotto extends Animale {

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
}
