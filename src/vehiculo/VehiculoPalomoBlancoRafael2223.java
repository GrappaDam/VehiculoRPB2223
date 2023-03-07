package vehiculo;

/**
 * Clase para la creación del objeto VehiculoPalomoBlancoRafael2223. Contiene
 * métodos para gestionar el objeto VehiculoPalomoBlancoRafael2223.
 *
 * @author Rafael Palomo Blanco
 * @version 1.1 07/03/2023
 */
public class VehiculoPalomoBlancoRafael2223 {

    /**
     * Método que devuelve el nombre del vehículo.
     *
     * @return Devuelve el nombre del vehículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del vehículo.
     *
     * @param nombre Nombre del vehículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el precio del vehículo.
     *
     * @return Precio del vehículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que establece el precio del vehículo.
     *
     * @param precio Precio del vehículo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el IVA del vehículo.
     *
     * @return IVA del vehículo.
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método que establece el IVA del vehículo.
     *
     * @param precioIVA IVA del vehículo.
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método que devuelve el stock de vehículos.
     *
     * @return Stock de vehículos.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método que establece el stock de vehículos.
     *
     * @param stock Stock de vehículos.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Variable que guarda el nombre del vehículo.
     */
    private String nombre;
    /**
     * Variable que guarda el precio del vehículo.
     */
    private double precio;
    /**
     * Variable que guarda el IVA del vehículo.
     */
    private double precioIVA;
    /**
     * Variable que guarda el stock del vehículos.
     */
    private int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoPalomoBlancoRafael2223() {
    }

    /**
     * Constructor con parámetros para iniciar todas las propiedades de la
     * clase.
     *
     * @param nom Nombre del vehículo.
     * @param precio Precio del vehículo.
     * @param stock Stock de vehículos.
     */
    public VehiculoPalomoBlancoRafael2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     *
     * Método para asignar el nombre del vehiculo.
     *
     * @param nom Nombre del vehículo.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que me devuelve el nombre del vehiculo
     *
     * @return Nombre del vehículo.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento.
     *
     * @return Stock de vehículos.
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Método para comprar vehículos. Modifica el stock. Este método va a ser
     * probado con Junit
     *
     * @param cantidad Cantidad de vehículos a comprar.
     * @throws Exception Este método puede lanzar una excepción si el número de
     * vehículos a comprar es negativo.
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehículos. Modifica el stock.
     *
     * @param cantidad
     * @throws Exception Lanza una excepción si el número de vehículos a vender
     * es negativo o la cantidad es mayor que el stock disponible.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        setStock(getStock() - cantidad);
    }

}
