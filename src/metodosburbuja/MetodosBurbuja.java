package metodosburbuja;
import java.util.Arrays;

public class MetodosBurbuja {
    /*En unidimensionales, tanto en string como en Int, el meto Arrays.sort();
    funciona perfectamente*/
    static int tb [] = new int [10];
    static String tb1[] = new String[3];
    
    /*
    En bidimensional hay que aplicar el metodo de la burbuja
    */
    static int tb2[][] = new int [5][3];
    static String tb3[][] = new String[3][2];
    
    public static void main(String[] args) {
        //
        unidimensionalInt();
        unidimensionalString();
        //
        bidimensionalInt();
        bidimensionalString();
    }
    public static void unidimensionalInt(){
        for (int i = 0; i < tb.length; i++) {
            tb[i] = alea(0, 9);
        }
        System.out.println("desordenado");
        System.out.println(Arrays.toString(tb));
        Arrays.sort(tb);
        System.out.println("ordenadoooo");
        System.out.println(Arrays.toString(tb));
    }
    
    public static void unidimensionalString(){
        tb1[0] = "Roy";
        tb1[1] = "Alex";
        tb1[2] = "Carolina";

        System.out.println("desordenado");
        System.out.println(Arrays.toString(tb1));
        Arrays.sort(tb1);
        System.out.println("ordenadooo");
        System.out.println(Arrays.toString(tb1));
    }     
    
    public static void bidimensionalInt(){
        for (int i = 0; i < tb2.length; i++) {
            for (int j = 0; j < tb2[i].length; j++) {
                tb2[i][j] = alea(0, 9);
            }
        }
        //Aplico el metodo de la burbuja Ascendente
        
        boolean ordenado = false;
        int cCambios = 0;
        
        while (!ordenado) {
            cCambios = 0;
            for (int i = 0; i < tb2.length - 1; i++) {
                if (tb2[i][0] < tb2[i + 1][0]) {
                    for (int j = 0; j < tb2[i].length; j++) {
                        int temp = tb2[i][j];
                        tb2[i][j] = tb2[i + 1][j];
                        tb2[i + 1][j] = temp;
                    }
                    cCambios++;
                }
            }
            if (cCambios == 0) {
                ordenado = true;
            }
        }
        System.out.println("La tabla ordenada es:");
        for (int[] fila : tb2) {
            System.out.println(Arrays.toString(fila));
        }
    }
    
    public static void bidimensionalString(){
        tb3[0][0]="Roy Rebuffo";
        tb3[1][0]="Ines Ruiz";
        tb3[2][0]="Fabian Luna";
        tb3[0][1]="123";
        tb3[1][1]="456";
        tb3[2][1]="789";
        
        String nombres[] = new String[tb3.length];
        String nombresSeparados[] = new String[tb3.length];
        for (int i = 0; i < tb3.length; i++) {
            nombres[i] = tb3[i][0]; // Guardar los nombres en el array
            nombresSeparados=tb3[i][0].split(" ");
            System.out.println("Nombre: " + nombresSeparados[0] +"\t|"+ " Apellidos: "
            + nombresSeparados[1]);
            
           
    }
        // Ordenar los nombres
        Arrays.sort(nombres);
        System.out.println("Los nombres ordenados son: " + Arrays.toString(nombres));
    }
    
    public static int alea(int li, int ls) {//función (método)
        return (int) ((Math.round(Math.random() * (ls - li)) + li));
    }
    
}
