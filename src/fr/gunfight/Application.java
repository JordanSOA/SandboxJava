package fr.gunfight;


import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Cowboy luckyLuke = createLuckyLuke();
        Cowboy joeDalton = createJoeDalton();
        System.out.println("Before shooting:");
        print(luckyLuke, joeDalton);
        shootUntilDeath(luckyLuke, joeDalton);
        System.out.println("After shooting:");
        print(luckyLuke, joeDalton);
    }

    /**
     * Les cowboys en param�tres se tirent dessus al�atoirement jusqu'� la mort
     * de l'un des deux.
     * <p>
     * Note: plusieurs solutions possibles pour impl�menter un tire al�atoire,
     * aller au plus simple.
     */
    private static void shootUntilDeath(Cowboy luckyLuke, Cowboy joeDalton) {
        while (!joeDalton.isDead() && !luckyLuke.isDead()){
            Random random = new Random();
            int nb;
            nb = random.nextInt(2);

            if (nb == 0) if (!joeDalton.isDead()) luckyLuke.shoot(joeDalton);
            else break;
            else if (!luckyLuke.isDead()) joeDalton.shoot(luckyLuke);
             else break;

            //Each Round Output
            System.out.println(luckyLuke);
            System.out.println(joeDalton);
        }
    }

    private static Cowboy createLuckyLuke() {
        // To be implemented
        Weapon magnum = new Weapon("Magnum357",4,3);
        Cowboy luckyLuke = new Cowboy("Lucky", 15, magnum );
        return luckyLuke;
    }

    private static Cowboy createJoeDalton() {
        // To be implemented
        Weapon dEagle = new Weapon("DesertEagle",10,3);
        Cowboy joeDalton = new Cowboy("Joe", 15, dEagle );
        return joeDalton;
    }

    private static void print(Cowboy luckyLuke, Cowboy joeDalton) {
        System.out.println(luckyLuke);
        System.out.println(joeDalton);
        System.out.println();
    }
}
