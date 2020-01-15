package fr.legobrick;

public class Application {
    /**
     * Do not change.
     */
    private final static String[] TOP = {"╔═", "══", "╗"};

    /**
     * Do not change.
     */
    private final static String[] INTERMEDIATE = {"║ ", "O ", "║"};

    /**
     * Do not change.
     */
    private final static String[] BOTTOM = {"╚═", "══", "╝"};

    /**
     * Main method, do not change but the brick's dimensions.
     */
    public static void main(String[] args) {
        // Hard-coded example of a 2x4 brick
        System.out.println("Hard-coded example:");
        System.out.println("╔═════════╗");
        System.out.println("║ O O O O ║");
        System.out.println("║ O O O O ║");
        System.out.println("╚═════════╝");
        System.out.println("Brain-coded example:");
        // Can change to test other dimensions
        LegoBrick brick = new LegoBrick(4, 6);
        displayBrick(brick);
    }

    /**
     * Displays the given {@code LegoBrick} into the console.
     * <p>
     * Should work what ever the {@code brick}'s dimensions are.
     * <p>
     * Implementation should not declare another {@code StringBuilder} neither
     * use concatenation, and the one that is already declared should be the one
     * printed.
     * <p>
     * Make use of the 3 arrays declared as constants in this class.
     */
    private static void displayBrick(LegoBrick brick) {
        StringBuilder sb = new StringBuilder();
        // Implement here :)


        // 2 X 4 = 2 etages et 4 rond
/*
        //debut du haut
        sb.append(TOP[0]);


        // middle fois le brick.width exemple 4
        sb.append(TOP[1]);
        sb.append(TOP[1]);
        sb.append(TOP[1]);
        sb.append(TOP[1]);

        // fin du middle
        sb.append(TOP[2] + "\n");
        // fin du haut
        //nombre detage fois brick.height
        //1er etage
        //debut detage
        sb.append(INTERMEDIATE[0]);
        //middle etage brick.widht = 4
        sb.append(INTERMEDIATE[1]);
        sb.append(INTERMEDIATE[1]);
        sb.append(INTERMEDIATE[1]);
        sb.append(INTERMEDIATE[1]);
        //Fin d'etage
        sb.append(INTERMEDIATE[2]+ "\n");
        //2ieme etage
        //debut detage
        sb.append(INTERMEDIATE[0]);
        //middle fois brick.width = 4
        sb.append(INTERMEDIATE[1]);
        sb.append(INTERMEDIATE[1]);
        sb.append(INTERMEDIATE[1]);
        sb.append(INTERMEDIATE[1]);
        //Fin d'etage
        sb.append(INTERMEDIATE[2]+ "\n");
        //Etage du bas
        //Debut du bas
        sb.append(BOTTOM[0]);
        //Middle du haut fois brick.width = 4
        sb.append(BOTTOM[1]);
        sb.append(BOTTOM[1]);
        sb.append(BOTTOM[1]);
        sb.append(BOTTOM[1]);
        //fin du bas
        sb.append(BOTTOM[2]);
*/

/*
        int nbEtage = brick.getHeight();
        int nbRangee = brick.getWidth();

        //BUILD THE TOP
        sb.append(TOP[0]);
        //MIDDLE TOP fois BRICK.WIDTH
        for (int index = 0; index < nbRangee ; index++){
            sb.append(TOP[1]);
            //sb.append(INTERMEDIATE[1]);
        }
        sb.append(TOP[2]+"\n");
        //FIN DU TOP
        //MIDDLE
        //Boucle selon nbEtage qui  =  Brick.getHeight()

         for (int i = 0; i < nbEtage ; i++){
             //DEBUT
             sb.append(INTERMEDIATE[0]);
             //MIDDLE du MIDDLE
             for (int index = 0; index < nbRangee ; index++){
                 sb.append(INTERMEDIATE[1]);
             }
             //FIN du Middle
             sb.append(INTERMEDIATE[2]+"\n");
        }
        //Autre Etage ou fin

        //Bottom
        //Debut Bottom
        sb.append(BOTTOM[0]);
        //Middle du bottom
        for (int index = 0; index < nbRangee ; index++){
            sb.append(BOTTOM[1]);
            //sb.append(INTERMEDIATE[1]);
        }
        sb.append(BOTTOM[2]+"\n");

 */
        buildTopLayer(sb,brick);
        buildMiddleLayer(sb,brick);
        buildBottomLayer(sb, brick);
        System.out.print(sb);
    }


        public static void multiplyRangee(StringBuilder sb,LegoBrick brick, boolean middle){
            int nbRangee = brick.getWidth();
            String strToAdd = ( middle) ? INTERMEDIATE[1].repeat(nbRangee) : TOP[1].repeat(nbRangee);
            sb.append(strToAdd);
        }
        private static void buildTopLayer(StringBuilder sb, LegoBrick brick){
            //BUILD THE TOP
            sb.append(TOP[0]);
            //MIDDLE TOP fois BRICK.WIDTH
            multiplyRangee(sb,brick,false);
            sb.append(TOP[2]+"\n");
            //FIN DU TOP
        }
    private static void buildBottomLayer(StringBuilder sb, LegoBrick brick){
        //BUILD THE BOTTOM
        sb.append(BOTTOM[0]);
        //MIDDLE TOP fois BRICK.WIDTH
        multiplyRangee(sb,brick,false);
        sb.append(BOTTOM[2]+"\n");
        //FIN DU BOTTOM
    }
    private static void buildMiddleLayer(StringBuilder sb, LegoBrick brick){
        //BUILD THE BOTTOM
        int nbEtage = brick.getHeight();
        for (int i = 0; i < nbEtage ; i++){
            sb.append(INTERMEDIATE[0]);
            //MIDDLE TOP fois BRICK.WIDTH
            multiplyRangee(sb,brick,true);
            sb.append(INTERMEDIATE[2]+"\n");
            //FIN DU BOTTOM
        }
    }
}

