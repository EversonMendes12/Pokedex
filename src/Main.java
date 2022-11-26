import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        boolean continuar = true;
        Player p = new Player();

        System.out.println(" ///////// BEM VINDO! /////////"
                +"\nEu sou a Pokedex."
                + "\n Vamos iniciar nossa aventura Pokemon.");


        p.registrarPlayer();

        boolean c = true;
        while (c) {
        System.out.print(p.nome + " este é o menu da sua Pokedex: "
                + "\n1 - CATCH"
                + "\n2 - MEUS DADOS");

        escolha = scan.nextInt();
            switch (escolha){
                case 1:
                    p.catchPokemon();
                break;
                case 2:
                    p.dethesPlayer();
                break;
                default:
                    System.out.print("Digite uma alternativa valida \n \n \n");
                    escolha = 0;
            }
            if (!(escolha == 0)){
                c = false;
            }
        }


    }

}
