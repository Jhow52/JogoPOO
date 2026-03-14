public class Personagem {
    private String nome;
    private int vida = 100;
    private int nivel = 1;
    private int experiencia = 0;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public Personagem() {
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void atacar(){}

    public int receberDano(int dano){
        vida -= dano;
        if(vida <= 0){
            System.out.println(getNome() + " Morreu!");
        }else{
            System.out.println(getNome() + " Tomou dano, sua vida atual é : " + vida);
        }
        return vida;
    }

    public int curar(int cura){
        if(vida > 100){
            System.out.println(getNome() + " Já está com o maximo de vida");
        }else{
            vida += cura;
            if(vida > 100){
                vida = 100;
            }
            System.out.println(getNome() + " Curou, sua vida atual é: " + vida);
        }
        return vida;
    }

    public int ganharExperiencia(int XP){
        experiencia += XP;
        verificarSubirNivel();
        return experiencia;
    }

    private void verificarSubirNivel(){
        if(experiencia >= 100){
            nivel += 1;
            System.out.println("Parabens você subiu de nivel!!! nivel: " + nivel);
            experiencia = 0;
        }
    }

    public void verificarStatus(){
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Experiencia: " + getExperiencia());
    }
}
