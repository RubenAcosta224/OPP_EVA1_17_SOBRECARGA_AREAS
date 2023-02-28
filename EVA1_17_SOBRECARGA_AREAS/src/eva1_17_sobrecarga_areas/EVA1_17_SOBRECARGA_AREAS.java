/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Area circulo: "+area(3));
        System.out.println("Area triangulo: "+area(3,2));
        System.out.println("Area trapecio: "+area(6,4,4));
        
    }
    
    public static double area(double radio){
        return radio*radio*Math.PI;
    }
    
    public static double area(double base,double altura){
        return (base*altura)/2.0;
    }
    
    public static double area(double baseMayor, double baseMenor,double altura){
        return (altura*(baseMayor+baseMenor))/2.0;
    }
    
    
}
