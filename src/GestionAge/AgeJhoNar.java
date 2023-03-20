package GestionAge;

import java.util.HashSet;
import java.util.regex.*;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class AgeJhoNar {

    private HashSet<ConJhoNar> contactos;

    /**
     * Inicializa agenda
     */
    public AgeJhoNar() {
        contactos = new HashSet<ConJhoNar>();
    }

/**
 * 
 * @param name define el nombre
 * @param ape define apellidos
 * @param nume define teléfono
 * @param email define email
 * @return devuelve 0 si se agrega -1 si no
 */
    public int insContac(String name, String ape, String nume, String email) {
        //si mail y telefono es true (validado) lo mete en el hashset
        if (valMail(email) && valTel(nume) && !exisTel(nume)) {
            this.contactos.add(new ConJhoNar(name, ape, nume, email));
            return 0;
        } else {
            return -1;
        }
    }

    /**
     *
     * @param email
     * @return devuelve true o false si valida el email
     */
    public Boolean valMail(String email) {
        boolean opc = true;
        Pattern pat = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher mat = pat.matcher(email);
        if (mat.matches()) {
            return opc;
        } else {
            return opc = false;
        }
    }

    /**
     *
     * @param num
     * @return devuelve true o false segun si valida el numero
     */
    public Boolean valTel(String num) {
        Pattern pat = Pattern.compile("^[6-9][0-9]{8}$");
        Matcher mat = pat.matcher(num);
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return devuelve los contactos
     */
    @Override
    public String toString() {
        return "Contactos=\n" + contactos + "\n";
    }

    /**
     *
     * @return devuelve la agenda
     */
    public HashSet<ConJhoNar> getContactos() {
        return contactos;
    }
    /**
     * 
     * @param ag  define agenda, e imprime contactos
     */
    public void listCont(AgeJhoNar ag) {

        for (ConJhoNar cont : contactos) {
            System.out.println(cont);
        }

    }
    /**
     * 
     * @param existe valida si esxiste el teléfono
     * @return  devuelve true si es existe, false si no
     */
    public boolean exisTel(String existe) {
        for (ConJhoNar cont : contactos) {
            if (cont.getTelefono().equals(existe)) {
                return true;
            }
        }
        return false;
    }
    /**
     * 
     * @param num define el numero actual
     * @param newNum define el numero nuevo
     * @return devuelve true si se ha modificado y false si no
     */
    public boolean modiCont(String num, String newNum) {
        for (ConJhoNar cont : contactos) {
            if (valTel(newNum) && exisTel(num)) {
                cont.setTelefono(newNum);
                cont.hashCode();
                return true;
            }
            
        }
        return false;
    }
    /**
     * 
     * @param nombre define nombre
     * @param apellidos define apellidos
     * @return devuelve 0 si lo encuentra y -1 si no
     */
    public int busCont(String nombre, String apellidos) {
        for (ConJhoNar cont : contactos) {
            if ((cont.getNombre().equals(nombre.toUpperCase()))
                    && (cont.getApellidos().equals(apellidos.toUpperCase()))) {
                System.out.println(cont.toString());
                return 0;
            } else {
                System.out.println("No existe el contacto");

            }
        }
        return -1;
    }
    /**
     * 
     * @param nombre define nombre
     * @param apellidos define apellidos
     * @return devuelve true si se ha borrado y false si no
     */

    public boolean borraCont(String nombre, String apellidos) {
        for (ConJhoNar cont : contactos) {
            if ((cont.getNombre().equals(nombre.toUpperCase()))
                    && (cont.getApellidos().equals(apellidos.toUpperCase()))) {
                contactos.remove(cont);
                return true;
            }
        }
        return false;
    }
    /**
     * 
     * @param tele define telefono
     * @return devuelve true si existe y false si no
     */
    public boolean busContTel(String tele) {
        for (ConJhoNar cont : contactos) {
            if ((valTel(tele)) && (cont.getTelefono().equals(tele))
                    && exisTel(tele)) {
                System.out.println(cont.toString());
                return true;
            } else {

                System.out.println("No existe el telefono insertado");
            }
        }
        return false;
    }

    //////////FINNNNNNNN   
}
