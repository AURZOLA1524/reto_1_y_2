package com.mycompany.ejercicio;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @authores:
 * MIRABAI
 * ANTHONY URZOLA BANQUEZ
 * JUAN SEBASTIAN BUSTAMANTE CASILIMAS
 */

public class EJERCICIO{
    double num1;
    double num2;
    double resultado;
    double resultadoRedon;
    DecimalFormat df=new DecimalFormat("#.00");
    
    void verificarNum(){
        try{
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 1: "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 2: "));
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            verificarNum();
        }
    }
    void verificarNumR(){
        try{
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número 1: "));
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            verificarNumR();
        }
    }
    
    void suma(){
        verificarNum();
        resultado=num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma da como resultado: "+df.format(resultado));
    }
    
    void resta(){
        verificarNum();
        resultado=num1 - num2;
        JOptionPane.showMessageDialog(null, "La resta da como resultado: "+df.format(resultado));
    }
     
    void multiplicacion(){
        verificarNum();
        resultado=num1 * num2;
        JOptionPane.showMessageDialog(null, "La multiplicación da como resultado: "+df.format(resultado));
    }
    
    void division(){
        verificarNum();
        if(num2!=0){
            resultado= num1 / num2;
            
            JOptionPane.showMessageDialog(null, "La división da como resultado: "+df.format(resultado));
        } else{
            JOptionPane.showMessageDialog(null, "En el número 2 debe ingresar un número diferente a 0");
        }
    }
    void potencia(){
        verificarNum();
        resultado=Math.pow(num1, num2);
        JOptionPane.showMessageDialog(null, "La potencia da como resultado: "+df.format(resultado));
    }
    
    void raiz(){
        verificarNumR();
        resultado=Math.sqrt(num1);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada da como resultado: "+df.format(resultado));
    }
    
    void imprimir(){
        String mensaje = JOptionPane.showInputDialog("Seleccione una Opción:"+"\n"+
                "1. Suma"+"\n"+"2. Resta"+"\n"+"3. Multiplicación"+"\n"+
                "4. División"+"\n"+"5.Potencia"+"\n"+"6. Raíz cuadrada de un número"+"\n");
        if (mensaje.equals("1")| mensaje.equals("2")| mensaje.equals("3")
                | mensaje.equals("4")| mensaje.equals("5")| mensaje.equals("6")){
            switch(mensaje){
            case "1":
                this.suma();
                imprimir();
            case "2":
                this.resta();
                imprimir();
            case "3":
                this.multiplicacion();
                imprimir();
            case "4":
                this.division();
                imprimir();
            case "5":
                this.potencia();
                imprimir();
            case "6":
                this.raiz();
                imprimir();
        }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingesar uno de los valores presentados en el menú");
            imprimir();
        }
        
        
        
    }

    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Seleccione una Opción:"+"\n"+
                "1. Realizar una operación"+"\n"+"2. Salir"+"\n");     
        if(mensaje.equals("1")|mensaje.equals("2")){
            switch(mensaje){
            case "1":
                EJERCICIO calculadora = new EJERCICIO();
                
                calculadora.imprimir();
            case "2":
                break;
        }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingesar uno de los valores presentados en el menú");
        }
        
        
    }
}
