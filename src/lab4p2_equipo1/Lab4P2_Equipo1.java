
package lab4p2_equipo1;

import java.util.*;
public class Lab4P2_Equipo1 {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("--------Menu--------\n"
                    + "1.Agregar ser vivo\n"
                    + "2.Modificar ser vivo\n"
                    + "3.Eliminar ser vivo\n"
                    + "4.Agregar un planeta\n"
                    + "5.Modificar un planeta\n"
                    + "6.Eliminar un planeta\n"
                    + "7.Agregar un medio de transporte\n"
                    + "8.Modificar un medio de transporte\n"
                    + "9.Eliminar un medio de transporte\n"
                    + "10.Viaje\n"
                    + "11.Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    opcion = 11;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 11);
    }
    
}
