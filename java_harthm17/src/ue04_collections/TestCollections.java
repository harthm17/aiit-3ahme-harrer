package ue04_collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Thomas Harrer
 */
public class TestCollections/*<E>*/ {
    /*
    private E value;
    
    public TestCollections(E value) {
        this.value = value;
     // E v2 = [wert]; funktioniert nicht
    }
    */

    public TestCollections() {
        Double x1 = 3.14;
        double x2 = 3.14;
        System.out.println("1: x1 == x2 -> " + (x1 == x2));
        System.out.println("2: x1 == x2 -> " + (x1.equals(x2)));
        System.out.println("-------------------------------------");
        
        String s1 = "Hallo";
        String s2 = "Hallo"; //new String("Hallo");
        System.out.println("3: s1 == s2 -> " + (s1 == s2));
        System.out.println("4: s1 == s2 -> " + (s1.equals(s2)));
        System.out.println("-------------------------------------");
        
        ArrayList liste1 = new ArrayList(); // auch verwendbar Collection oder List statt ArrayList
        System.out.println("5: liste1.size() = " + liste1.size());
        liste1.add(x1);
        liste1.add(x2);
        liste1.add(s1);
        System.out.println("6: Liste1 gefüllt mit " + liste1);
        System.out.println("7: liste1.size() = " + liste1.size());
        liste1.remove(1); // beginnt wie bei der Zählung von Feldern bei 0
        System.out.println("8: Liste1 gefüllt mit " + liste1);
        System.out.println("-------------------------------------");
        
        ArrayList liste2 = (ArrayList)liste1.clone(); // clone nur mit ArrayList möglich
        System.out.println("9: Liste2 gefüllt mit " + liste2);
        System.out.println("10: liste1 == liste2 -> " + (liste1 == liste2));
        System.out.println("11: liste1 Hashcode: " + liste1.hashCode() + "\n    liste2 Hashcode: " + liste2.hashCode());
        System.out.println("12: liste1 Identity Hashcode: " + System.identityHashCode(liste1) + "\n    liste2 Identity Hashcode: " + System.identityHashCode(liste2));
        System.out.println("-------------------------------------");
        
        ArrayList<Double> liste3 = new ArrayList<Double>();
        liste3.add(2.0);
        liste3.add(x1);
        liste3.add(10.0);
        
        ArrayList liste4 = liste3;
        liste4.add("Hallo");
        System.out.println("13: liste3 gefüllt mit = " + liste3);      
    }
    
    
    public static void main(String[] args) {
        new TestCollections/*<String>("Hallo")*/();
        //new TestCollection<Double>(2.0);
    }
    
}
