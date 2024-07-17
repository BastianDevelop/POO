package ejercicio_08_servientrega;

public class Sucursal {

  private int numeroSucursal;
  private String direccion;
  private String ciudad;

  public Sucursal(int numeroSucursal, String direccion, String ciudad){
    this.numeroSucursal = numeroSucursal;
    this.direccion = direccion;
    this.ciudad = ciudad;
  }

  public int getNumeroSucursal() { return numeroSucursal; }
  public String getDireccion() { return direccion; }
  public String getCiudad() { return ciudad; }

  public String mostrarDatosSucursal(){
    return "Número de Sucursal: "+numeroSucursal+"\nDirección: "+direccion+"\nCiudad: "+ciudad+"\n";
  }

  public double calcular_precio(Paquete t){
    double precio = 0;
    precio = t.getPeso();
    if (t.getPrioridad() == 1){
      precio += 0.1*precio;
    }
    if (t.getPrioridad()==2){
      precio += 20;
    }
    return precio;
  }




}
