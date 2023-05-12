
package lab4p2_equipo1;

import java.util.*;
import javax.crypto.AEADBadTagException;
public class Lab4P2_Equipo1 {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Ingenieros> ingenieros = new ArrayList();
    static ArrayList<Primates> primatesAsignados = new ArrayList();
    static ArrayList<MediosTransporte> mediosT = new ArrayList();
    static ArrayList<Planetas> planetas = new ArrayList();
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
                            System.out.println("Ingrese el nombre: ");
                            read.nextLine();
                            String nombre = read.nextLine();
                            System.out.println("Ingrese el grupo sanguineo: ");
                            String grupoSanguineo = read.next();
                            System.out.println("Ingrese el sexo: ");
                            String sexo = read.next();
                            System.out.println("Ingrese la altura: ");
                            double altura = read.nextDouble();
                            System.out.println("Ingrese el peso: ");
                            double peso = read.nextDouble();
                            System.out.println("Ingrese el numero RRHH: ");
                            int numRRHH = read.nextInt();
                            System.out.println("Ingrese el nombre de usuario: ");
                            read.nextLine();
                            String nombreUsuario= read.nextLine();
                            System.out.println("Ingrese la contraseña: ");
                            String contraseña = read.nextLine();
                            ingenieros.add(new Ingenieros(numRRHH, nombreUsuario, contraseña, nombre, grupoSanguineo, sexo, altura, peso));
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre: ");
                            read.nextLine();
                            nombre = read.nextLine();
                            System.out.println("Ingrese el grupo sanguineo: ");
                            grupoSanguineo = read.next();
                            System.out.println("Ingrese el sexo: ");
                            sexo = read.next();
                            System.out.println("Ingrese la altura: ");
                            altura = read.nextDouble();
                            System.out.println("Ingrese el peso: ");
                            peso = read.nextDouble();
                            System.out.println("Ingrese el indice del medio de transporte a asignar: ");
                            int index = read.nextInt();
                            System.out.println("Ingrese la cantidad de comida: );");
                            double cantComida = read.nextDouble();
                            System.out.println("Ingrese la cantidad de comida por Km: ");
                            double cantComidaKm = read.nextDouble();
                            System.out.println("Ingrese el lugar de nacimiento: ");
                            read.nextLine();
                            String lugarNacimiento = read.nextLine();
                            primatesAsignados.add(new Primates(mediosT.get(index), cantComida, cantComidaKm, lugarNacimiento, nombre, grupoSanguineo, sexo, altura, peso));
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
                            System.out.println("Ingrese el nombre del ingeniero a modificar: ");
                            read.nextLine();
                            String nombreN = read.nextLine();
                            boolean realizado = false;
                            for (Ingenieros t : ingenieros) {
                                if (t.getNombreUsuario().equals(nombreN)) {
                                    System.out.println("Ingrese el nuevo numero RRHH: ");
                                    int numRRHH = read.nextInt();
                                    System.out.println("Ingrese el nuevo nombre de usuario: ");
                                    read.nextLine();
                                    String nombreUsuario = read.nextLine();
                                    System.out.println("Ingrese la nueva contraseña: ");
                                    String contraseña = read.nextLine();
                                    realizado = true;
                                    break;
                                }else{
                                    realizado = false;
                                }
                            }
                            if (realizado) {
                                System.out.println("Realizado con exito");
                            }else{
                                System.out.println("El nombre de usuario no existe");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el indice del primate a modificar: ");
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
                    boolean realizado = false;
                    switch (tipo) {
                        case 1:
                            System.out.println("Ingrese el nombre del ingeniero: ");
                            read.nextLine();
                            String nombreN = read.nextLine();
                            for (Ingenieros t : ingenieros) {
                                if (t.getNombreUsuario().equals(nombreN)) {
                                    ingenieros.remove(t);
                                    realizado = true;
                                    break;
                                }else{
                                    realizado = false;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del primate: ");
                            read.nextLine();
                            nombreN = read.nextLine();
                            for (Primates t : primatesAsignados) {
                                if (t.getNombre().equals(nombreN)) {
                                    primatesAsignados.remove(t);
                                    realizado = true;
                                    break;
                                }else{
                                    realizado = false;
                                }
                            }
                            if (realizado) {
                                System.out.println("Eliminado con exito");
                            }else{
                                System.out.println("El nombre no existe");
                            }
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
                    planetas.add(new Planetas(nombre, distancia));
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del planeta a modificar: ");
                    String nombreN = read.next();
                    realizado = false;
                    for (Planetas t : planetas) {
                        if (nombreN.equals(t.getNombre())) {
                            System.out.println("Ingrese el nombre del planeta: ");
                            nombre = read.next();
                            System.out.println("Ingrese la distancia entre la tierra y el planeta: ");
                            distancia = read.nextInt();
                            realizado = true;
                            break;
                        }else{
                            realizado = false;
                        }
                    }
                    if (realizado) {
                        System.out.println("Realizado con exito ");
                    }else{
                        System.out.println("El planeta no existe");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el nombre del planeta a eliminar: ");
                    nombreN = read.next();
                    for (Planetas t : planetas) {
                        if (nombreN.equals(t.getNombre())) {
                            planetas.remove(t);
                            realizado = true;
                            break;
                        }else{
                            realizado = false;
                        }
                        if (realizado) {
                            System.out.println("Realizado con exito");
                        }else{
                            System.out.println("El planeta no existe");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad de porcentaje a la que esta lleno el tanque: ");
                    int cantTanque = read.nextInt();
                    System.out.println("Ingrese la cantidad de Km que puede recorrer un tanque lleno: ");
                    int kmsTanque = read.nextInt();
                    mediosT.add(new MediosTransporte(cantTanque, kmsTanque, cantTanque,primatesAsignados) {
                    });
                    break;
                case 8:
                    System.out.println("Ingrese la nueva cantidad de porcentaje a la que esta lleno el tanque: ");
                    int cantTanqueN = read.nextInt();
                    System.out.println("Ingrese la nueva cantidad de Km que puede recorrer un tanque lleno: ");
                    int kmsTanqueN = read.nextInt();
                    break;
                case 9:
                    System.out.println("Ingrese el indice del medio de transporte a eliminar: ");
                    int index = read.nextInt();
                    mediosT.remove(index);
                    System.out.println("Eliminado con exito");
                    break;
                case 10:
                    System.out.println("Ingrese el nombre de usuario: ");
                    read.nextLine();
                    String nombreUsuario = read.nextLine();
                    System.out.println("Ingrese la contraseña: ");
                    String contraseña = read.nextLine();
                    for (Ingenieros t : ingenieros) {
                        if (nombreUsuario.equals(t.getNombreUsuario()) && contraseña.equals(t.getContraseña()) ) {
                            System.out.println("Que tipo de medio de transporte desea utilizar(1-AereoN/2-AereoE): ");
                            tipo = read.nextInt();
                            System.out.println("Ingrese el indice del planeta a viajar: ");
                            index = read.nextInt();
                            if (tipo == 1) {
                                AereoNormal an = new AereoNormal();
                                an.viaje(planetas.get(index));
                            }else if(tipo == 2){
                                AeroEspacial ae = new AeroEspacial();
                                ae.viaje(planetas.get(index));
                            }else{
                                System.out.println("Tipo no valido");
                            }
                        }else{
                            System.out.println("Usuario no valido");
                        }
                    }
                    break;
                case 11:
                    for (MediosTransporte t : mediosT) {
                        System.out.println(t);
                    }
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
