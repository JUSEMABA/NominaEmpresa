package empresa.modelo;

public class Empleado {
   private String codigo;
   private String nombre;
   private int edad;
   private int horasTrabajadas;
   private double valorHora;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
