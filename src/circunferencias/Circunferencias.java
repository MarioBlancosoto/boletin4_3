
package circunferencias;


public class Circunferencias {


    public static void main(String[] args) {
      
        Circulo Circulo1 = new Circulo();
        Circulo1.setRadio(100);
        Double calcularArea = Circulo1.calcularArea();
        System.out.println(" El area de la Circunferencia es "+calcularArea);
        Double calcularLonxitude = Circulo1.calcularLonxitude();
        System.out.println("La longitud del círculo es " + calcularLonxitude );
    }
    
    
    
}
