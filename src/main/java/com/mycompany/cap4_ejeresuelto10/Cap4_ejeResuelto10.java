package com.mycompany.cap4_ejeresuelto10;
import java.util.Scanner;
public class Cap4_ejeResuelto10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entraNom = new Scanner(System.in);
        int numIns, patri;
        float valMatri;
        byte esSo;
        String nombre;
        
        System.out.println("dame el numero de inscripciones");
        numIns = entrada.nextInt();
        System.out.println("dame el nombre del estudiante");
        nombre = entraNom.nextLine();
        System.out.println("dame el valor del patrimonio");
        patri = entrada.nextInt();
        System.out.println("dame el estrato social del estudiante");
        esSo = entrada.nextByte();
        
        
        valMatri = 50000;
        if((patri > 2000000) && (esSo > 3)){
            valMatri = (float) (valMatri + 0.03*patri);
        }
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + numIns + "\n" + "Y NOMBRE: " + nombre +"\n"+ "DEBE PAGAR: $" + valMatri);
    }
}
