public class Contrato
{
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fechaInicio;
    private Date fechaFinal;
    private double costoTotal;

    // Constructor
    public Contrato(Cliente cliente, Vehiculo vehiculo, Date fechaInicio, Date fechaFinal, double costoTotal) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.costoTotal = costoTotal;
    }

    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
}
