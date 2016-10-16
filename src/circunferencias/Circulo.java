
package circunferencias;


public class Circulo {
    
   private final double pi = 3.14; 
   private double radio;
   private double m;
   
   
   
   public  Circulo(){
       radio = 0;
      
   }
   public Circulo (double rad,double m){
       radio = rad;
       m= Math.pow(radio,2);
   }
   
   
     public void setRadio(double radio) {
        this.radio = radio;
    }
   
  
   public double calcularArea(){
       return (pi*Math.pow(radio, 2));
   }
   
   public double calcularLonxitude(){
       return pi*2*Math.pow(radio,2);
   }
}

