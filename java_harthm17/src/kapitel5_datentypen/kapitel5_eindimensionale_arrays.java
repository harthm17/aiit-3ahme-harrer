package kapitel5_datentypen;

/**
 *
 * @author Thomas Harrer
 */
public class kapitel5_eindimensionale_arrays {
    public static void main(String[] args) {
       int[] schulnoten = new int[5];
       schulnoten[0] = 1;
       schulnoten[1] = 2;
       schulnoten[2] = 3;
       schulnoten[3] = 4;
       schulnoten[4] = 5;
       
        System.out.println("Schulnoten hat "+schulnoten.length+" Elemente");
        System.out.println(schulnoten[0]);
        System.out.println(schulnoten[1]);
        System.out.println(schulnoten[2]);
        System.out.println(schulnoten[3]);
        System.out.println(schulnoten[4]);
        
        boolean[] b = {true, false, true, true, false, false, true};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
        System.out.println(b[6]);
    }
}
