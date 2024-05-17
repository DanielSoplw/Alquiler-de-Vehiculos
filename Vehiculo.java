import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vehiculo{
    private String modelo;
    private String año;
    private String placa;
    private double tarifa;
    private boolean disponibilidad;
    private int id;
    
    private static List<Vehiculo> vehiculos = new ArrayList<>();
    
    //Constructor
    public Vehiculo(String modelo, String año, String placa, double tarifa, boolean disponibilidad, int id) {
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.tarifa = tarifa;
        this.disponibilidad = disponibilidad;
        this.id = id;
        agregarVehiculo(this);
    }
    
    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public String getAño() {
        return año;
    }

    public String getPlaca() {
        return placa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // Métodos de registro de vehículos
    private static void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    
    // Métodos de búsqueda de vehículos
    public static List<Vehiculo> buscarVehiculosDisponibles(Date fechaInicio, Date fechaFinal, String ubicacion, String tipoVehiculo) {
        List<Vehiculo> vehiculosDisponibles = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            // lógica para verificar disponibilidad, ubicación, tipo de vehículo, etc.
            if (vehiculo.isDisponibilidad()) {
                vehiculosDisponibles.add(vehiculo);
            }
        }
        return vehiculosDisponibles;
    }
}
