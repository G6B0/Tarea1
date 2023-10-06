/**Clase netamente para la gestion de direccion de cliente en otras clases*/
public class Direccion {
    /**Direccion*/
    private String direccion;
    /**El constructor inicializa la direccion
     *@param direccion
     */
    public Direccion(String direccion){
        this.direccion=direccion;
    }
    /**toString al string direccion
     * @return direccion*/
    @Override
    public String toString() {
        return "Direccion: "+direccion;
    }
}
