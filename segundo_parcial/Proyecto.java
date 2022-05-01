
package segundo_parcial;

import java.util.Scanner;


public class Proyecto {
    
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int op;
    int op2;
    float l;
    
        
        System.out.println("Bienvenido al programa para el cálculo de areas, perimetros y volumenes de figuras geometricas en 3 dimensiones \n");
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectangulo");
        System.out.println("3-Triangulo \n");
       
        System.out.println("Ingrese el numero que le corresponde a la figura de la que deseas conocer sus datos: "); 
        op = entrada.nextInt();
        
        Clase_padre padre = new Clase_padre();
        Clase_hija hija = new Clase_hija();
        
        switch(op){
  
        case 1:
          
           System.out.println("\nBienvenido, ha elegido la opcion de cuadrado por lo que se le pide llenar los datos que se le pediran a continuacion \n");
           
           System.out.println("MENU DE FUNCIONES");
           System.out.println("1-Area");
           System.out.println("2-Perimetro");
           System.out.println("3-Volumen \n");
           
           
           System.out.println("Ingrese el numero que le corresponde a la funcion que desea ejecutar:");
           op2=entrada.nextInt();
            
                switch(op2){
                    
                    case 1: {
                        
                        System.out.println("\n\nIngrese el valor de uno de los lados: "); 
                        l=entrada.nextFloat();
                        System.out.println("El radio es de: "+padre.areaC(l));
               
                }
                    case 2: {
                        
                        System.out.println("\n\nIngrese el valor de uno de los lados: "); 
                        l=entrada.nextFloat();
                        System.out.println("El radio es de: "+padre.perimetroC(l));
               
                }
                    
                   
                   
                }
        break;

        
    }
    
    }
}
