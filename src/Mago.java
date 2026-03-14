public class Mago extends Personagem{

    private int magia;

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança bola de fogo!");
        lancarMagia();
        ganharExperiencia(20);
        System.out.println("Sua experiencia atual é: " + getExperiencia());
    }

    public void lancarMagia(){
        magia = 50;
    }
}
