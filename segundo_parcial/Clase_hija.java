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
    
    public float volumenC(float ab, float h){
    float volumenC=ab*h;
        return volumenC;
    }
    
    public float volumenR(float b, float h, float a){
    float volumenR=a*b*h;
        return volumenR;
    }
    
    @Override
    public float areaC(float b){
    float areaB=(float)Math.pow(b,2);
    return areaB;
    }
    
    
    
}
