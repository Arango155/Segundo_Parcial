
package segundo_parcial;

import java.util.Scanner;


public class Proyecto {
    
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int op,op2,op3;
    float l,b,h,a,ab;
    
        
        System.out.println("Bienvenido al programa para el cálculo de areas, perimetros y volumenes de figuras geometricas en 3 dimensiones \n");
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectangulo");
        System.out.println("3-Triangulo \n");
       
        System.out.println("Ingrese el numero que le corresponde a la figura de la que deseas conocer sus datos: "); 
        op = entrada.nextInt();
        
        Clase_Padre padre = new Clase_Padre();
        Clase_Hija hija = new Clase_Hija();
        
        switch(op){
  
        case 1:
          
           System.out.println("\nBienvenido, ha elegido la opcion de cuadrado en 3 dimensiones o cubo, por lo que se le pide llenar los datos que se le pediran a continuacion \n");
           
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
                        System.out.println("El area es de: "+padre.areaC(l));
               
                          break;
                }
                    case 2: {
                        
                        System.out.println("\n\nIngrese el valor de uno de los lados: "); 
                        l=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+padre.perimetroC(l));
               
                          break;
                }
                    case 3: {
                        
                        System.out.println("\n\nIngrese el valor de la arista: "); 
                        a=entrada.nextFloat();
                        System.out.println("El area es de: "+hija.volumenC(a));
               
                          break;
                }
                    
                }
        break;

        
        
        case 2:
          
           System.out.println("\nBienvenido, ha elegido la opcion de rectangulo en 3 dimensiones o cuboide rectangular, por lo que se le pide llenar los datos que se le pediran a continuacion \n");
           
           System.out.println("MENU DE FUNCIONES");
           System.out.println("1-Area");
           System.out.println("2-Perimetro");
           System.out.println("3-Volumen \n");
           
           
           System.out.println("Ingrese el numero que le corresponde a la funcion que desea ejecutar:");
           op2=entrada.nextInt();
            
                switch(op2){
                    
                    case 1: {
                        
                        System.out.println("\n\nIngrese el valor de la base: "); 
                        b=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de la altura: "); 
                        h=entrada.nextFloat();
                        System.out.println("El area es de: "+padre.areaC(h,b));
                        
                  break;
                }
                    case 2: {
                        
                        System.out.println("\n\nIngrese el valor de la base: "); 
                        b=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de la altura: "); 
                        h=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+padre.perimetroC(h,b));
                 break;
                }
                    
                    case 3: {
                        
                        System.out.println("\n\nIngrese el valor de la anchura: "); 
                        a=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de la base: "); 
                        b=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de la altura: "); 
                        h=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+hija.volumenR(h,b,a));
               
                          break;
                }
                    
                   
                   
                }
        break;

           case 3:
          
           System.out.println("\nBienvenido, ha elegido la opcion de traingulo en 3 dimensiones o piramide, por lo que se le pide llenar los datos que se le pediran a continuacion \n");
           
           System.out.println("MENU DE FUNCIONES");
           System.out.println("1-Area");
           System.out.println("2-Perimetro");
           System.out.println("3-Volumen \n");
           
           
           System.out.println("Ingrese el numero que le corresponde a la funcion que desea ejecutar:");
           op2=entrada.nextInt();
            
                switch(op2){
                    
                    case 1: {
                        
                        System.out.println("\n\nIngrese el valor de la base: "); 
                        b=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de la altura: "); 
                        h=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+padre.areaT(h,b));
               
                          break;
                }
                    case 2: {
                        
                        System.out.println("\n\nIngrese el valor de la base: "); 
                        b=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de uno de los lados del triangulo: "); 
                        l=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+padre.perimetroT(l,b));
                 break;
                }
                    
                     case 3: {
                         
                        System.out.println("\n\nConoce el valor del area de la base?, si=1, no=2: "); 
                        op3=entrada.nextInt();
                        
                    switch (op3){
                   
                        case 1: 
                            
                        System.out.println("\n\nIngrese el valor del area de la base: "); 
                        ab=entrada.nextFloat();
                        System.out.println("\n\nIngrese el valor de la altura: "); 
                        h=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+hija.volumenC(h,ab));
                    
                      break;
                      
                    case 2:
                    
                        System.out.println("\n\nIngrese el valor de la base: "); 
                        b=entrada.nextFloat();
                        System.out.println("El area de la base es de: "+hija.areaB(b));
                        ab=hija.areaB(b);
                       
                        System.out.println("\n\nIngrese el valor de la altura: "); 
                        h=entrada.nextFloat();
                        System.out.println("El perimetro es de: "+hija.volumenC(h,ab));
                      break;
                       
                       
                }
                 
                break;
                   
                  
        
        
    }

}
      break;
    
        }
        
        
    }

}