package kapitel5_datentypen;

/**
 *
 * @author Thomas Harrer
 */
public class kapitel5_mehrdimensionale_arrays {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
                
        a[0][0] = 1;
        a[0][1] = 4;
        a[1][0] = 0;
        a[1][1] = 8;
        a[2][0] = 2;
        a[2][1] = 0;
        a[2][2] = 0;
        a[2][3] = 3;
        
        System.out.println("Tag: "+a[0][0]+a[0][1]);
        System.out.println("Monat: "+a[1][0]+a[1][1]);
        System.out.println("Jahr: "+a[2][0]+a[2][1]+a[2][2]+a[2][3]);
        
        System.out.println("Mein Geburtsdatum: "+a[0][0]+a[0][1]+a[1][0]+a[1][1]+a[2][0]+a[2][1]+a[2][2]+a[2][3]);
    }
    
}
