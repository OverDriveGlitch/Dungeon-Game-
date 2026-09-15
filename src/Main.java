
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int PlayerHealth = 60;

        int Monster1Health = 70;

        int Monster2Health = 70;

        int physicalattack1;

        int critical_attack_chance;

        String PlayerName;

        String decision1;

        int MonsterAttackChance;

        int MonsterPhysicalAttack;

        int Defense;

        int MonsterCriticalAttack;

        String decision2;

        Boolean HolyBlade = false;


        System.out.println("Welcome to Dungeon Quest");
        System.out.println("What is your name");
        PlayerName = scanner.nextLine();
        System.out.println("Welcome " + PlayerName);
        System.out.println("A dangerous monster approached what will you do? ");

        do {
            MonsterPhysicalAttack = random.nextInt(5, 20);
            physicalattack1 = random.nextInt(5, 20);
            critical_attack_chance = random.nextInt(1, 5);

            MonsterCriticalAttack = random.nextInt(1, 5);

                System.out.println("What will you do?(Attack, Defend) ");
                decision1 = scanner.nextLine();
                switch (decision1) {
                    case "Defend" -> {
                        MonsterAttackChance = random.nextInt(1, 3);
                        Defense = random.nextInt(5, 11);
                        MonsterPhysicalAttack = MonsterPhysicalAttack - Defense;
                        if(MonsterAttackChance == 1) {
                            System.out.println("The Monster has attacked!");
                            System.out.println("The Monster has dealt " + MonsterPhysicalAttack + " points of damage");
                            PlayerHealth = PlayerHealth - MonsterPhysicalAttack;
                            continue;
                        }
                        else{
                            System.out.println("Monster has missed!");
                        }
                    }
                    case "Attack" -> {
                        MonsterAttackChance = random.nextInt(1, 3);
                       if (critical_attack_chance == 1) {
                            physicalattack1 = 2 * physicalattack1;
                            System.out.println("Critical Attack!");
                        }
                        if (MonsterCriticalAttack == 1 && MonsterAttackChance == 1) {
                            MonsterCriticalAttack = 2 * MonsterPhysicalAttack;
                            System.out.println("Critical Attack!");
                            System.out.println("Monster dealt " + MonsterCriticalAttack + " points of damage");
                        }

                        System.out.println("You attacked the monster and dealt " + physicalattack1 + " points of damage");
                        Monster1Health = Monster1Health - physicalattack1;
                        System.out.println("The monster has " + Monster1Health + " health points left");
                        if (MonsterAttackChance == 1) {
                            System.out.println("Monster decided to attack and dealt " + MonsterPhysicalAttack + " points of damage");
                            PlayerHealth = PlayerHealth - MonsterPhysicalAttack;
                            System.out.println(PlayerName + " Has " + PlayerHealth + " health points left");

                        }
                        if (MonsterAttackChance == 2) {
                            System.out.println("Monster has missed");

                        }
                    }
                }

        }while (Monster1Health > 0 && PlayerHealth > 0) ;
        if (Monster1Health < 0) {
            System.out.println("You have killed the monster congrats!");
        }
        if (PlayerHealth < 0) {
            System.out.println("You have died");
            System.out.println("Game Over!");

        }


        System.out.println("You walk into the next town and see a chest");
        PlayerHealth = 60;
        System.out.println("Will you open it?(Yes/No)");
        decision2 = scanner.nextLine();
        switch(decision2){
            case "Yes" ->{
                System.out.println("You opened the chest and received the Holy Blade! (Damage is now +5)");
                HolyBlade = true;

            }
            case "No" ->{
                System.out.println("You skipped the chest and moved on forth to the next town!");
            }

        }
        System.out.println("You walk and find the town of Orsted, Home of the Deadly Orcs.");
        System.out.println("You have encountered a Dangerous Orc");

        do{

            MonsterPhysicalAttack = random.nextInt(5, 20);
            physicalattack1 = random.nextInt(5, 20);
            critical_attack_chance = random.nextInt(1, 5);

            MonsterCriticalAttack = random.nextInt(1, 5);
            if(HolyBlade = true){
                physicalattack1 = physicalattack1 + 5;
            }

            System.out.println("What will you do?(Attack, Defend) ");
            decision1 = scanner.nextLine();
            switch (decision1) {
                case "Defend" -> {
                    MonsterAttackChance = random.nextInt(1, 3);
                    Defense = random.nextInt(5, 11);
                    MonsterPhysicalAttack = MonsterPhysicalAttack - Defense;
                    if(MonsterAttackChance == 1) {
                        System.out.println("The Monster has attacked!");
                        System.out.println("The Monster has dealt " + MonsterPhysicalAttack + " points of damage");
                        PlayerHealth = PlayerHealth - MonsterPhysicalAttack;
                        continue;
                    }
                    else{
                        System.out.println("Monster has missed!");
                    }
                }
                case "Attack" -> {
                    MonsterAttackChance = random.nextInt(1, 3);
                    if (critical_attack_chance == 1) {
                        physicalattack1 = 2 * physicalattack1;
                        System.out.println("Critical Attack!");
                    }
                    if (MonsterCriticalAttack == 1 && MonsterAttackChance == 1) {
                        MonsterCriticalAttack = 2 * MonsterPhysicalAttack;
                        System.out.println("Critical Attack!");
                        System.out.println("Monster dealt " + MonsterCriticalAttack + " points of damage");
                    }

                    System.out.println("You attacked the monster and dealt " + physicalattack1 + " points of damage");
                    Monster2Health = Monster2Health - physicalattack1;
                    System.out.println("The monster has " + Monster2Health + " health points left");
                    if (MonsterAttackChance == 1) {
                        System.out.println("Monster decided to attack and dealt " + MonsterPhysicalAttack + " points of damage");
                        PlayerHealth = PlayerHealth - MonsterPhysicalAttack;
                        System.out.println(PlayerName + " Has " + PlayerHealth + " health points left");

                    }
                    if (MonsterAttackChance == 2) {
                        System.out.println("Monster has missed");

                    }
                }
            }

        }while(Monster2Health > 0 && PlayerHealth > 0);
        if (Monster2Health < 0) {
            System.out.println("You have killed the monster congrats!");
        }
        if (PlayerHealth < 0) {
            System.out.println("You have died");
            System.out.println("Game Over!");

        }

    }

}