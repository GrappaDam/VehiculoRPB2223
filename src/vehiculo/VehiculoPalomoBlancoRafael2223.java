
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class VehiculoPalomoBlancoRafael2223 {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public VehiculoPalomoBlancoRafael2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    
    public VehiculoPalomoBlancoRafael2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del vehiculo
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del vehiculo
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

