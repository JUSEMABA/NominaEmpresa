package empresa.modelo;

public class Empresa {
    
    public Empleado agregarEmpleado(String codigo, String nombre,int edad, int horasTrbajadas, double valorHora){
       Empleado emp = new Empleado();
       emp.setCodigo(codigo);
       emp.setNombre(nombre);
       emp.setEdad(edad);
       emp.setHorasTrabajadas(horasTrbajadas);
       emp.setValorHora(valorHora);
       return emp;
    }    
    
    public void modificarEmpleado(Empleado emp, String codigo, String nombre,int edad, int horasTrbajadas, double valorHora){
       emp.setCodigo(codigo);
       emp.setNombre(nombre);
       emp.setEdad(edad);
       emp.setHorasTrabajadas(horasTrbajadas);
       emp.setValorHora(valorHora);        
    }   

    public void agregarObjetoEmpleado(Empleado empleado, String codigo, String nombre, int edad, int numH, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
