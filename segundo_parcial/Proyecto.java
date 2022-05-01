
package segundo_parcial;

import java.util.Scanner;


public class Proyecto {
    
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int opcion;
    
        
        System.out.println("Bienvenido al programa para el cálculo de areas, perimetros y volumenes de figuras geometricas en 3 dimensiones \n");
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectangulo");
        System.out.println("3-Triangulo \n");
       
        System.out.println("Ingresa el numero que le corresponde a la figura de la que deseas conocer sus datos: "); 
        opcion = entrada.nextInt();
        
        Clase_padre padre = new Clase_padre();
        Clase_hija hija = new Clase_hija();
        
         
    }
    
}
