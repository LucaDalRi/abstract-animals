public class Aquila extends Animale {

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
}
