package fr.formation.basics.tp3;

public class Application {
    /**
     * Ecrire le programme qui calcule pour chaque prix TTC le prix HT et
     * affiche le tout dans la console exactement comme dans les exemples
     * donnés. Un exemple quand la mathode calculateWithoutTax est appelé avec
     * rounded = false et un autre quand la mathode calculateWithoutTax est
     * appelé avec rounded = true. Ainsi pour chaque price et rate il faut
     * appeler la méthode calculateWithoutTax avec les paramètres correspondants
     * ce qui permettra d'afficher tout ce qui est attendu dans la console.
     */
    public static void main(String[] args) {
        /*
         * Prices contient des prix TTC (With VAT) et rates les taux de TVA
         * correspondant, ainsi le taux du premier price (49.99) est 20.0.
         */
        double[] prices = { 49.99, 19.99, 9.99, 14.59, 99.99 };
        double[] rates = { 20.0, 10.0, 10.0, 5.0, 20.0 };

        System.out.println("Prices without VAT Not Rounded :");
        vatNotRounded(prices,rates);
        System.out.println();
        System.out.println();
        System.out.println("Prices without VAT Rounded :");
        vatRounded(prices, rates);
    }

    private static void vatNotRounded(double[] pList, double[] rList) {
        int i = 0;
        for ( double p : pList ) {
            System.out.println("With VAT =€"+ pList[i] + " , Without VAT =€"+ calculateWithoutTax(pList[i], rList[i], false)+ "(rate ="+ rList[i] +"%)");
            i++;
        }
    }


    private static void vatRounded(double[] pList, double[] rList) {
        int i = 0;
        for ( double p : pList ) {
            System.out.println("With VAT =€"+ pList[i] + " , Without VAT =€"+ calculateWithoutTax(pList[i], rList[i], true)+ "(rate ="+ rList[i] +"%)");
            i++;
        }
    }


    private static double calculateWithoutTax(double price, double rate,
                                              boolean rounded) {
        // Implémenter pour que result = price HT basé sur rate
        double result = 0.0;

        result = price - ((price / 100)* rate);
        /*
         * Retourne le résultat arrondi ou non en fonction de rounded = false ou
         * rounded = true. Rien à changer ci-dessous.
         */
        return rounded ? round(result) : result;
    }

    private static double round(double result) {
        /*
         * Implémenter pour retourner result arrondi à 2 décimales. Il existe
         * plusieurs méthodes pour arrondir en Java, travail de recherche sur
         * Google...
         */
        result = (double) Math.round(result*100)/100;
        return result;
    }
}

