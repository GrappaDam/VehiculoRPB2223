
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoPalomoBlancoRafael2223 miVehiculoPalomoBlancoRafael2223;
        int stockActual;
        
        miVehiculoPalomoBlancoRafael2223 = new VehiculoPalomoBlancoRafael2223("Seat",18000,100);
        operativaVehiculosPalomoBlancoRafael2223(miVehiculoPalomoBlancoRafael2223, 50); 
    }

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
    
