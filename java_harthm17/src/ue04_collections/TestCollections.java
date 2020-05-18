package ue04_collections;

/**
 *
 * @author Thomas Harrer
 */
public class TestCollections {

    public TestCollections() {
        Double x1 = 3.14;
        double x2 = 3.14;
        System.out.println("1: x1 == x2 -> " + (x1 == x2));
        System.out.println("2: x1 == x2 -> " + (x1.equals(x2)));
        
        String s1 = "Hallo";
        String s2 = "Hallo"; //new String("Hallo");
        System.out.println("1: s1 == s2 -> " + (s1 == s2));
        System.out.println("2: s1 == s2 -> " + (s1.equals(s2)));
    }
    
    
    public static void main(String[] args) {
        new TestCollections();
    }
    
}
