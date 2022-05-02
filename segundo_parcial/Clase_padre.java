/*
 * Esta es la clase padre y aqui estaran contenidas las funciones comunes de las figuras geometricas 
 */
package segundo_parcial;

/**
 *
 * @author jdara
 */
public class Clase_Padre {
    
    
    public float areaC(float l){
    float areaC=l*l;
    return areaC;
    }
    
    public float areaC(float h, float b){
    
        float areaC=b*h;
        return areaC;
    }

    public float perimetroC(float l){
    float perimetroC = l+l+l+l;
        return perimetroC;
    }
    
     public float perimetroC(float h, float b){
     float PerimetroC=(b+h)*2;
     return PerimetroC;
    }
    
     public float areaT(float h, float b){
     float areaT=(b*h)/2;
     return areaT;
    }
    

    public float perimetroT(float l, float b){
     float perimetroT=(b+(2*l));
     return perimetroT;
    }

}
