
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
                    + "11.Imprimir medios de transporte\n"
                    + "12.Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    int tipo;
                    System.out.println("Ingrese el tipo de ser vivo a agregar(1-Ingeniero/2-Primate): ");
                    tipo =  read.nextInt();
                    switch (tipo) {
                        case 1:
                            System.out.println("Ingrese el numero RRHH: ");
                            int numRRHH = read.nextInt();
                            System.out.println("Ingrese el nombre de usuario: ");
                            read.nextLine();
                            String nombreUsuario= read.nextLine();
                            System.out.println("Ingrese la contraseña: ");
                            String contraseña = read.nextLine();
                            break;
                        case 2:
                            System.out.println("Ingrese el metodo de transporte asignado: ");
                            
                            System.out.println("Ingrese la cantidad de comida: );");
                            double cantComida = read.nextDouble();
                            System.out.println("Ingrese la cantidad de comida por Km: ");
                            double cantComidaKm = read.nextDouble();
                            break;
                        default:
                            System.out.println("Opcion no valida");;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el tipo de ser vivo a modificar(1-Ingeniero/2-Primate): ");
                    tipo =  read.nextInt();
                    switch (tipo) {
                        case 1:
                            System.out.println("Ingrese el numero RRHH: ");
                            int numRRHH = read.nextInt();
                            System.out.println("Ingrese el nombre de usuario: ");
                            read.nextLine();
                            String nombreUsuario= read.nextLine();
                            System.out.println("Ingrese la contraseña: ");
                            String contraseña = read.nextLine();
                            break;
                        case 2:
                            System.out.println("Ingrese el metodo de transporte asignado: ");
                            
                            System.out.println("Ingrese la cantidad de comida: );");
                            double cantComida = read.nextDouble();
                            System.out.println("Ingrese la cantidad de comida por Km: ");
                            double cantComidaKm = read.nextDouble();
                            break;
                        default:
                            System.out.println("Opcion no valida");;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el tipo de ser vivo a eliminar(1-Ingeniero/2-Primate): ");
                    tipo =  read.nextInt();
                    switch (tipo) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del planeta: ");
                    String nombre = read.next();
                    System.out.println("Ingrese la distancia entre la tierra y el planeta: ");
                    int distancia = read.nextInt();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del planeta a modificar: ");
                    String nombreN = read.next();
                    System.out.println("Ingrese el nombre del planeta: ");
                    nombre = read.next();
                    System.out.println("Ingrese la distancia entre la tierra y el planeta: ");
                    distancia = read.nextInt();
                    break;
                case 6:
                    System.out.println("Ingrese el nombre del planeta a eliminar: ");
                    nombreN = read.next();
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad de porcentaje a la que esta lleno el tanque: ");
                    int cantTanque = read.nextInt();
                    System.out.println("Ingrese la cantidad de Km que puede recorrer un tanque lleno: ");
                    int kmsTanque = read.nextInt();
                    break;
                case 8:
                    System.out.println("Ingrese la nueva cantidad de porcentaje a la que esta lleno el tanque: ");
                    int cantTanqueN = read.nextInt();
                    System.out.println("Ingrese la nueva cantidad de Km que puede recorrer un tanque lleno: ");
                    int kmsTanqueN = read.nextInt();
                    break;
                case 9:
                    System.out.println("");
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    opcion = 12;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 12);
    }
    
}
