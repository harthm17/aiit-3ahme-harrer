package kapitel5_datentypen;

/**
 *
 * @author Thomas Harrer
 */
public class kapitel5_nichtrechteckige_arrays {
    public static void main(String[] args) {
        int a[][] = { {1,4}, 
                      {0,8},
                      {2,0,0,3}
                    };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        }
}

