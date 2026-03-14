import java.util.Scanner;

public class Menu {

    Scanner entrada = new Scanner(System.in);
    Personagem personagem = new Personagem();

    public void montarPersonagem(){
        boolean escolha = true;
        System.out.println("Insira o seu nome: ");
        String nome = entrada.next();
        do{
            int escolhaPersonagem = 0;
            System.out.println("\nEscolha o seu personagem");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Mago");
            System.out.println("3 - Arqueiro");
            escolhaPersonagem = entrada.nextInt();

            if(escolhaPersonagem == 1){
                System.out.println("Bem vindo aos Barbaros!");
                personagem = new Guerreiro(nome);
                escolha = false;
            }else if(escolhaPersonagem == 2){
                System.out.println("Bem vindo aos Magos!");
                personagem = new Mago(nome);
                escolha = false;
            }else if(escolhaPersonagem == 3){
                System.out.println("Bem vindo aos Arqueiros");
                personagem = new Arqueiro(nome);
                escolha = false;
            }else if(escolhaPersonagem >= 4){
                System.out.println("Insira um valor valido");
            }
        }while (escolha);
        System.out.println("\nBora Jogar " + personagem.getNome() + "!");
        jogar();
    }

    public void jogar(){
        int op = 0;
        do {
            System.out.println("\n -------- Menu de Ações -------");
            System.out.println("1 - Atacar");
            System.out.println("2 - Receber Dano");
            System.out.println("3 - Curar");
            System.out.println("4 - Ver Status");
            System.out.println("5 - Sair");
            op = entrada.nextInt();

            switch (op){
                case 1 : personagem.atacar(); break;
                case 2 :
                    System.out.println("Dano : ");
                    personagem.receberDano(entrada.nextInt());
                    if(personagem.getVida() <= 0){
                        op = 5;
                    }
                    break;
                case 3 :
                    System.out.println("Curar: ");
                    personagem.curar(entrada.nextInt());
                    break;
                case 4 :
                    System.out.println("\n Ver Status: ");
                    personagem.verificarStatus();
                    break;
                case 5 :
                    System.out.println("Saindo...");
                    break;
                default :
                    System.out.println("Insira um valor valido");
            }

        }while (op != 5);
    }
}
