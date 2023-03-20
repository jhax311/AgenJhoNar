package GestionAge;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
import java.util.*;

public class GesJhoNar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgeJhoNar a1 = new AgeJhoNar();
        String nombre, apellidos, telefono, email;
        
        boolean salir = false;
        do {
            //menu
            System.out.println("-----------------------------------------");
            System.out.println("\t\t1\tCrear contacto");
            System.out.println("\t\t2\tModificar un contacto por teléfono");
            System.out.println("\t\t3\tBuscar un contacto por nombre y apellidos");
            System.out.println("\t\t4\tEliminar un contacto");
            System.out.println("\t\t5\tMostrar información de todos los contactos");
            System.out.println("\t\t6\tMostrar información de un contacto dado el telefono");
            System.out.println("\t\t7\tSalir");
            System.out.println("-----------------------------------------");
            System.out.print("ELIGE UNA OPCIÓN: ");
            byte opc = sc.nextByte();
            //elegir opción
            switch (opc) {
                case 1:
                    //coge los parametros
                    sc.nextLine();
                    System.out.print("Inserta el nombre: ");
                     nombre = sc.nextLine();
                    System.out.print("Inserta los apellidos: ");
                     apellidos = sc.nextLine();
                    System.out.print("Inserta numero de telefono: ");
                    telefono = sc.nextLine();
                    System.out.print("Inserta el e-mail: ");
                    email = sc.nextLine();
                    //llama a la funcion inst contact que crea el contacto
                    System.out.println(a1.insContac(nombre, apellidos, telefono, email));
                    break;
                case 2:
                    //Modificar por telefono
                    sc.nextLine();
                    System.out.print("Inserte el número de telefono que quiere modificar: ");
                    telefono = sc.nextLine();
                    System.out.print("Inserte el nuevo número: ");
                    String newPhone=sc.nextLine();
                    //llama a modificar contacto
                    System.out.println(a1.modiCont(telefono, newPhone));
                    break;
                case 3:
                    //buscar por nombre y apellidos
                    sc.nextLine();
                    System.out.print("Ingresa el nombre: ");
                    String name= sc.nextLine();
                    System.out.print("Ingresa el apellido: ");
                    String lastName= sc.nextLine();
                    System.out.println(a1.busCont(name, lastName));
                    break;
                case 4:
                    //eliminar contacto
                    sc.nextLine();
                    System.out.print("Ingresa el nombre: ");
                    nombre= sc.nextLine();
                    System.out.print("Ingresa el apellido: ");
                    apellidos= sc.nextLine();  
                    System.out.println(a1.borraCont(nombre,apellidos));
                    break;
                case 5:
                    //llama a listar contactos
                    a1.listCont(a1);
                    break;
                case 6:
                    //info de un contacto por telefono
                    sc.nextLine();
                    System.out.print("Inserte el número de telefono: ");
                    nombre= sc.nextLine();
                    //llama a buscar contacto por telefono
                    System.out.println(a1.busContTel(nombre));
                    break;
                case 7:
                    //Salidaa
                    salir = true;
                    break;

                default:
                    System.out.println("Introduce una opción correcta: ");
                //ingrese una opcion correcta
            }

        } while (!salir);
 

    }

}
