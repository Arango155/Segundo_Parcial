/*
 * Esta es la clase hija, aqui estan contenidas las funciones especificas a cada figura
 */
package segundo_parcial;

/**
 *
 * @author jdara
 */
public class Clase_Hija extends Clase_Padre {
    
    
    public float volumenC(float a){ 
    float volumenC = (float)Math.pow(a,3);
    return volumenC;
    }
    
    public float volumenR(float b, float h, float a){
    float volumenR=a*b*h;
        return volumenR;
    }
    
    public float volumenT(float ab, float h){
    float volumenT=ab*h;
        return volumenT;
    }
    
    public float areaB(float b){
    float areaB=b*b;
    return areaB;
    }
    
    
    
}
