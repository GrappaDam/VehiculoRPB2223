package vehiculo;

/**
 * Clase principal del programa, define un objeto VehiculoPalomoBlancoRafael2223
 * con unos parámetros y realiza las acciones de comprar, vender y control de 
 * stock de vehículos.
 *
 * @author Rafael Palomo Blanco
 * @version 1.1 07/03/2023
 */
public class Main {
    
    /**
     * Método main. Método principal de la ejecución del programa.
     * 
     * @param args
     */
    public static void main(String[] args) {
        VehiculoPalomoBlancoRafael2223 miVehiculoPalomoBlancoRafael2223;
        int stockActual;
        
        miVehiculoPalomoBlancoRafael2223 = new VehiculoPalomoBlancoRafael2223("Seat",18000,100);
        operativaVehiculosPalomoBlancoRafael2223(miVehiculoPalomoBlancoRafael2223, 50); 
    }
    /**
     * Método que realiza las operaciones de comprar, vender y control de 
     * stock de vehículos. Lanza una excepción si no se puede realizar alguna de
     * las operaciones.
     * 
     * @param miVehiculoPalomoBlancoRafael2223
     * @param cantidad 
     */
    private static void operativaVehiculosPalomoBlancoRafael2223(VehiculoPalomoBlancoRafael2223 miVehiculoPalomoBlancoRafael2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoPalomoBlancoRafael2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoPalomoBlancoRafael2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoPalomoBlancoRafael2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
