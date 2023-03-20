package GestionAge;
/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class ConJhoNar {

    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    //por defecto vacio
    public ConJhoNar() {
        this.nombre = "";
        this.apellidos = "";
        this.telefono = "";
        this.email = "";
    }

    /**
     * 
     * @param name indica el nombre
     * @param ape  indica los apellidos
     * @param nume indica el número de teléfono 
     * @param ema indica el email
     */
    public ConJhoNar(String name, String ape, String nume, String ema) {
        this.nombre = name.toUpperCase();
        this.apellidos = ape.toUpperCase();
        this.telefono = nume;
        this.email = ema.toUpperCase();
    }

    /**
     * 
     * @return  devuelve el apellido
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * 
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return devuelve el telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * 
     * @return devuelve el email
     */
    public String getEmail() {
        return email;
    }

    public void setNombre(String name) {
        this.nombre = name.toUpperCase();
    }

    public void setApellidos(String ape) {
        this.apellidos = ape.toUpperCase();
    }

    public void setTelefono(String tel) {
        this.telefono = tel;
    }

    public void setEmail(String correo) {
        this.email = correo.toUpperCase();
    }

    /**
     * El metodo de to string de contactos
     */
    @Override
    public String toString() {
        return "CONTACTO " + "\nnombre= " + nombre
                + ", \napellidos= " + apellidos + ", \ntelefono= " + telefono
                + ",\nemail= " + email + "\n";
    }

    /**
     *
     * @param obj sera el objteo de bruena
     * @return devolvera true si coincide todo y falso si no EQUALS
     */
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConJhoNar) {
            ConJhoNar a = (ConJhoNar) obj;
            return a.nombre.equals(this.nombre) && a.apellidos.equals(this.apellidos)
                    && a.telefono.equals(this.telefono) && a.email.equals(this.email);
        } else {
            return false;
        }

    }
//no metemos el telefono, porque si no calcula un hashcode distinto al cambiar el telefono y no lo borra
    @Override
    public int hashCode() {
        int hash = nombre.hashCode() + apellidos.hashCode() + email.hashCode()+telefono.hashCode() * 2222;
        return hash;
    }

}
