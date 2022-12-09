import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Personagem Rattata = new Personagem("Rattata",100);

        System.out.println("Bem-Vindo a uma mini aventura Pokemon!\n Qual é o seu nome?");
        Scanner read = new Scanner(System.in);
        String nome = read.nextLine();

        System.out.println("Sua aventura "+nome+" COMEÇOU!");
        System.out.println("Espero que você encontre o comapnheeiro certo para sua jornada!");
        System.out.println("Vamos escolher um companheiro(Pokemon) para inciarmos a jornada!\nPokemons:\n[PIDGEY]\n[GEODUDE]\n[METAPOD]\nR:");
        Scanner pok = new Scanner(System.in);
        String pokemon = pok.nextLine();
        
        if(pok.equals("[PIDGEY]")){
            System.out.println("Seu Pokemon é o PIDGEY!");
        }if(pok.equals("[GEODUDE]")){
                    System.out.println("Seu Pokemon é o GEODUDE!");
        }if(pok.equals("[METAPOD]")){
                    System.out.println("Seu Pokemon é o METAPOD!");
        }
        
        System.out.println("O seu" + pok + "tem um nickname! Ela se chama 'Love'!");

        Personagem pokemon1 = new Personagem("Love",100);        
        System.out.println("Você está pronto para sua primeira batalha!");
        
        System.out.println("A BATALHA COMEÇOU!");
        System.out.println("O oponente lançou um Rattata!");
        Scanner atk = new Scanner(System.in);
        String ataque;
        System.out.println("Escolha entre uma das opções para continuar! (TACKLE ou ROAR)");
        ataque = atk.nextLine();
        
        if(ataque.equals("TACKLE")){
            System.out.println("Seu ataque foi massivo!E arrancou 50 de life do usuario!");
            
            Rattata.damage(50);
            Rattata.PokC();

            System.out.println("O Ratta tenta te atacar, mas não consegue!");
            System.out.println("A 'LOVE' está assim:");
            pokemon1.PokC();
            
            System.out.println("A batalha cotinua!");
            System.out.println("Escolha entre uma das opções para continuar! (TACKLE ou ROAR)");
            Scanner atk_2 = new Scanner(System.in);
            String ataque_2;
            ataque_2 = atk_2.nextLine();
            
            if(ataque_2.equals("TACKLE")){
                System.out.println("A BATALHA CHEGOU AO FIM!");
                Rattata.damage(50);
                Rattata.PokC();

            }if(ataque_2.equals("ROAR")){
                System.out.println("ROAR is a non-damaging Normal-type move!");
            System.out.println("O seu ROAR não causou efeito nenhum no Rattata!\n Ele usou TACKLE e foi muito forte para o seu Pokemon!");
            pokemon1.damage(100);
            pokemon1.PokC();


            }


        }
        if(ataque.equals("ROAR")){
            System.out.println("ROAR is a non-damaging Normal-type move!");
            System.out.println("O seu ROAR não causou efeito nenhum no Rattata!\n Ele usou TACKLE e foi muito forte para o seu Pokemon!");
            pokemon1.damage(100);
            pokemon1.PokC();

        }else{
            System.out.println("Essa opção não existe!");

        }
}
}
