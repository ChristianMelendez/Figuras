/*
Crea una aplicación que nos calcule el area de un círculo, cuadrado o triángulo.
Pediremos que figura queremos calcular su area
y segun lo introducido pedira los valores necesarios para calcular el area. 
Crea un metodo por cada figura para calcular cada area, muestra el resultado por pantalla
*/

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Figuras {
    
    String opcion;
    double base;
    double altura;
    double radio;
    
    Scanner sc=new Scanner(System.in);
    
    public void pregunta(){
        System.out.print("¿De qué figura desea saber el area? : ");//JOptionPane.showMessageDialog(null,"");
        opcion=sc.nextLine();
    }
    public void figura(){  
        switch(opcion){
            case "triangulo":
                System.out.print("Ingrese la base : ");
                //JOptionPane.showInputDialog("Ingrese la base", base);
                base=sc.nextDouble();
                System.out.print("Ingrese la altura : ");
                altura=sc.nextDouble();
                System.out.println("El area es: "+(base*altura)/2);
                break;
            case "cuadrado":    
                System.out.print("Ingrese la base : ");
                 base=sc.nextDouble();
                System.out.print("Ingrese la altura : ");
                altura=sc.nextDouble();
                System.out.println("El area es: "+base*altura);
                break;
            case "circulo":
                System.out.print("Ingrese el radio : ");
                radio=sc.nextDouble();
                System.out.println("El area es: "+3.14*radio*radio);
                break;
                
        }
    }
    
public static void main (String[]args){
    
    Figuras ob1 = new Figuras();
    
    ob1.pregunta();
    ob1.figura();
    
    }    
}
