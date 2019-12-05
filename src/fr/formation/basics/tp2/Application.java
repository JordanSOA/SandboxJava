
package fr.formation.basics.tp2;
public class Application {
    public static void main(String[] args) {
        String java = "Java";
        System.out.println("Found 'J' : " + countChars(java, 'J')+" times in Java");
        System.out.println("Found 'a' : " +countChars(java, 'a')+" times in Java");
        System.out.println("Found 'v' : " +countChars(java, 'v')+" times in Java");
        System.out.println("Found 'x' : " +countChars(java, 'x')+" times in Java");
    }

    public  static int countChars(String src,  char val){
        int count = 0;
        for (int i = 0; i < src.length(); i++){
            boolean isFound = (src.charAt(i) == val) ? true : false;
            if (isFound) count++;
        }
        return count;
    }
}
