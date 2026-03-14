public class Arqueiro extends Personagem{

    private int precisao;

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " dispara flecha!");
        atirarFlecha();
        ganharExperiencia(20);
        System.out.println("Sua experiencia atual é: " + getExperiencia());
    }

    public void atirarFlecha(){
        precisao = 15;
    }
}
