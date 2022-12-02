import java.util.Scanner;

public class Projeto3 {
        public static void main(String[] args) {
                Scanner nm = new Scanner(System.in);
                Scanner op = new Scanner(System.in);
                String nome, opc;

                System.out.println("Bem-Vindo ao Projeto3 de Programação!");
                System.out.println("JOGUE O JOGO EM CAPSLOCK PARA UMA MELHOR OTIMIZAÇÃO!");
                ;
                System.out.println("Você irá andentrar em uma aventura curta, porém desafiadora!");
                System.out.println("\nPara começarmos a aventura digite o seu nome, mero camponês(a):");
                nome = nm.nextLine();

                System.out.println(
                                "\n\n-Você foi o encarregado de matar um filhote de dragão perto da vila em que você e seus familiares moram.\n "
                                                + "Você avista a besta dormindo encima de uma pilha de corpos e algo te chama atenção");
                System.out.println(
                                "-Você percebe algo estranho perto do dragão! Pretende se aproximar e procurar por algo?\n *OPÇÕES: "
                                                + "\n|| AVENTURA:Que a aventura começe! ||\n|| RUN FOREST:Componeses não lutam contras dragões! ||\nResposta: ");
                opc = op.nextLine();

                if (opc.equals("AVENTURA")) {
                        Scanner iop = new Scanner(System.in);
                        String iopc;
                        System.out.println("\n\n\nVocê optou pela aventura! 'audaces fortuna juvat'...");
                        System.out.println(
                                        "-O pobre camponês se aproxima do dragão e percebe que oque te chamava atenção era na verdadae um bau! ");
                        System.out.println(
                                        "-Voce precisa fazer alguma coisa! Mas oque fazer?\n *OPÇÕES: \n|| LUTAR: O dragao dever morrer!(lutar contra o dragao). ||\n|| "
                                                        +
                                                        "CONVERSINHA: Linguas draconicas sao minha especialidades!(tentar conversar com o dragao). ||\n|| "
                                                        + "BAUZINHOOW: Vasculhar o bau!. ||");
                        iopc = iop.nextLine();

                        if (iopc.equals("LUTAR")) {
                                System.out.println(
                                                "\n\n\nMatar pequenos repteis para se alimentar nao e o mesmo que matar um dragao!\n Sua luta foi curta e breve!"
                                                                + "-Sem gloria para aqueles que morrem como voce...");
                                System.out.println("\n-Você " + nome +
                                                " tentou cegar o dragao, mas não contou com o fato de que o dragão já sabia da sua presença."
                                                + "A besta com um bafo quente transformou-lhe em póG em alguns poucos segundos!");
                        }
                        if (iopc.equals("CONVERSINHA")) {
                                System.out.println(
                                                "\n\n\n\n\n-Que tolinho... Mero campones falar de maneira 'esquesita' nao permite que voce fale com animais ou criaturas e muito menos anjos...");
                                System.out.println(
                                                "-Parece que a 'lingua' que sua irma mais velha ensinou, dizendo ser draconica nao funcionou muito bem... Por isso "
                                                                + nome
                                                                + " você está morto!\nOlhe pelo lado bom, pelo menos o dragão gostou do sabor da sua carne! \nPs: Dragoes são surdos e essa tal 'língua dracônica' nunca existiu! ");
                        }
                        if (iopc.equals("BAUZINHOOW")) {
                                Scanner iop2 = new Scanner(System.in);
                                String iopc2;
                                System.out.println("\n\n\n\n-A curiosidade matou o gato, mas você não é um!");
                                System.out.println(
                                                "-Você descobre que dentro do baú duas armas estão guardadas! Uma espada e um axe.");
                                System.out.println(
                                                "-Escolha uma das armas para seguir na sua jornada! \n*OPÇÕes: \n|| A: ESPADA || ou B: Lança");
                                iopc2 = iop2.nextLine();
                                if (iopc2.equals("A")) {
                                        System.out.println("Houve a batalha final, e você " + nome
                                        + " achou que ia perder, porque o Dragão era muito forte e muito poderoso. "
                                        + "Então o Dragão de escamas vermelhas e olhos negros começou a lutar com você."
                                        + "E depois de uma longa batalha, " + nome
                                        + "se viu de frente para o Dragão, e falou."
                                        + "'Tanto lugar pra dormir e comer e você veio logo pra minha vila?!'."
                                        + "O Dragão não entendeu por que é surdo, mas seguiu o seu instinto de destruir e sobreviver e então "
                                        + "lançou uma chama que chamou a atenção até das pessoas da vila!. "
                                        + "mas a sua " +iopc2+" magicamente absorveu a labareda e fez com que o dragão"
                                        +"sentisse por você algo diferente...");
                                        System.out.println("Fim?")
                                        if (iopc2.equals("B")) {
                                                System.out.println("Houve a batalha final, e você " + nome
                                                + " achou que ia perder, porque o Dragão era muito forte e muito poderoso. "
                                                + "Então o Dragão de escamas vermelhas e olhos negros começou a lutar com você."
                                                + "E depois de uma longa batalha, " + nome
                                                + "se viu de frente para o Dragão, e falou."
                                                + "'Tanto lugar pra dormir e comer e você veio logo pra minha vila?!'."
                                                + "O Dragão não entendeu por que é surdo, mas seguiu o seu instinto de destruir e sobreviver e então "
                                                + "lançou uma chama que chamou a atenção até das pessoas da vila!. "
                                                + "Mas a sua " +iopc2+" magicamente absorveu a labareda e fez com que o dragão "
                                                +"sentisse por você algo diferente...");
                                                System.out.println("FIM?");
                                        }
                                }
                        }
                }
                if (opc.equals("RUN FOREST")) {
                        System.out.println(
                                        "\n\n\n\n\n-Ó camponês, escolheste o caminho covarde e as consequências virão em breve...");
                        System.out.println(
                                        "-Você " + nome + " retornou para a vila e foi condenado por traição! Morte por empalamento!");

                } else {
                        System.out.println("***");

                }
        }
}
