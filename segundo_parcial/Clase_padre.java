/*
 * Esta es la clase padre y aqui estaran contenidas las funciones comunes de las figuras geometricas 
 */
package segundo_parcial;

/**
 *
 * @author jdara
 */
public class Clase_padre {
    
    
    public float areaC(float l){
    float areaC=l*l;
    return areaC;
    }
    
    public float areaR(float h, float b){
    
        float areaR=b*h;
        return areaR;
    }
    
    public float areaT(float h, float b){
     float areaT=(b*h)/2;
     return areaT;
    }
    

    public float perimetroC(float l){
    float perimetroC = l+l+l+l;
        return perimetroC;
    }
    
      public float PerimetroR(float h, float b){
     float PerimetroR=(b+h)*2;
     return PerimetroR;
    }
    

    public float PerimetroT(float h, float b){
     float PerimetroT=(b+h)*2;
     return PerimetroT;
    }

}
