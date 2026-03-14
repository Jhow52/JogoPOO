public class Guerreiro extends Personagem{

    private int forca;

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com espada!");
        atacarComEspada();
        ganharExperiencia(20);
        System.out.println("Sua experiencia atual é: " + getExperiencia());
    }

    public void atacarComEspada(){
        forca = 10;
    }


}
