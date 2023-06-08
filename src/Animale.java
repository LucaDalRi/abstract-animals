public abstract class Animale {

    private String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void dormi() {
        System.out.println("ZzzzZzzz");
    }

    abstract void verso();

    abstract void mangia();


}
