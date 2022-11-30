import java.util.Scanner;

public class Projeto3 {
        public static void main(String[] args) {
                Scanner nm = new Scanner(System.in);
                Scanner op = new Scanner(System.in);
                String nome, opc;

                System.out.println("Bem-Vindo ao Projeto3 de Programação!");
                ;
                System.out.println("Você irá andentrar em uma aventura curta, porém desafiadora!");
                System.out.println("\nPara começarmos a aventura digite o seu nome, mero camponês(a):");
                nome = nm.nextLine();

                System.out.println(
                                "\n\n-Você foi o encarregado de matar um filhote de dragão perto da vila em que você e seus familiares moram.\n "
                                                + "Você avista a besta dormindo encima de uma pilha de corpos e algo te chama atenção");
                System.out.println(
                                "-Você percebe algo estranho perto do dragão! Pretende se aproximar e procurar por algo?\n *OPÇÕES: "
                                                + "A:Que a aventura começe! ||\n||  B:Componeses não lutam contras dragões! ");
                opc = op.nextLine();

                if (opc.equals("A")) {
                        Scanner iop = new Scanner(System.in);
                        String iopc;
                        System.out.println("Você optou pela aventura! 'audaces fortuna juvat'...");
                        System.out.println(
                                        "O pobre campones se aproxima do dragao e percebe que oque te chamava atencao era na verdadae um bau! ");
                        System.out.println(
                                        "Voce precisa fazer alguma coisa! Mas oque fazer?\n OPCOES: A:O dragao dever morrer!(lutar contra o dragao). ||\n|| "
                                                        +
                                                        "B: Linguas draconicas sao minha especialidades!(tentar conversar com o dragao). ||\n|| "
                                                        + "C:Vasculhar o bau e achar algo para lutar.");
                        iopc = iop.nextLine();

                        if (iopc.equals("A")) {
                                System.out.println(
                                                "Matar pequenos repteis para se alimentar nao e o mesmo que matar um dragao!\n Sua luta foi curta e breve!"
                                                                + "Sem gloria para aqueles que morrem como voce...");
                                System.out.println("Você " + nome +
                                                " tentou cegar o dragao, mas nao contou com o fato de que o dragao ja sabia da sua presenca."
                                                + "A besta com um bafo quente transformou-lhe em po em aguns poucos segundos!");
                        }
                        if (iopc.equals("B")) {
                                System.out.println(
                                                "Que tolinho... Mero campones falar de maneira 'esquesita' nao permite que voce fale com animais ou criaturas e muito menos anjos...");
                                System.out.println(
                                                "Parece que a 'lingua' que sua irma mais velha ensinou dizendo ser draconica nao funcionou muito bem... Por isso"
                                                                + nome
                                                                + " voce esta morto! Ps: Dragoes sao surdos e essa tal 'lingua draconica' nunca existiu! ");
                        }
                        if (iopc.equals("C")) {
                                Scanner iop2 = new Scanner(System.in);
                                String iopc2;
                                System.out.println("A curiosidade matou o gato, mas você não é um!");
                                System.out.println(
                                                "Você descobre que dentro do baú duas armas estão guardadas! Uma espada e um axe.");
                                System.out.println(
                                                "Escolha uma das armas para seguir na sua jornada! OPCOES: A: ESPADA ou B: AXE");
                                iopc2 = iop2.nextLine();
                                if (iopc2.equals("A")) {
                                        System.out.println("“Houve a batalha final, e você" + nome
                                                        + "achou que ia perder, porque o Dragão era muito forte e muito poderoso. "
                                                        + "Então o Dragão de escamas vermelhas e olhos negros começou a lutar com você."
                                                        + "E depois de uma longa batalha, " + nome
                                                        + "se viu de frente para o Dragão, e falou."
                                                        + "'Tanto lugar pra dormir e comer e você veio logo pra minha vila?!'."
                                                        + "O Dragão não entendeu por que é surdo, mas seguiu o seu instinto de destruir e sobreviver e"
                                                        + "  então lançou uma lança de chamas.");
                                        if (iopc2.equals("B")) {
                                                System.out.println("“Houve a batalha final, e você" + nome
                                                                + "achou que ia perder, porque o Dragão era muito forte e muito poderoso. "
                                                                + "Então o Dragão de escamas vermelhas e olhos negros começou a lutar com você."
                                                                + "E depois de uma longa batalha, " + nome
                                                                + "se viu de frente para o Dragão, e falou."
                                                                + "'Tanto lugar pra dormir e comer e você veio logo pra minha vila?!'."
                                                                + "O Dragão não entendeu por que é surdo, mas seguiu o seu instinto de destruir e sobreviver e  então"
                                                                + "lançou uma lança de chamas.");
                                        }
                                }
                        }
                }
                if (opc.equals("B")) {
                        System.out.println(
                                        "Ó camponês escolheste o caminho covarde e as consequências virão em breve...");
                        System.out.println(
                                        "Você " + nome + " retornou para a vila e foi condenado por traição! Morte por empalamento!");

                } else {
                        System.out.println("Vc é burro");

                }
        }
}
