package empresa.modelo;

public class Nomina {
    
    public double calcularSueldo(int numeroHoras, double valorHora){
        double sueldo =0;
        if(numeroHoras > 40){
             sueldo = (numeroHoras - 40)*(valorHora*2) + (40*valorHora);
        }else{
             sueldo = (40*valorHora);
        }
        return sueldo;
    }
    
    public void incrementarValorHora(Empleado emp, double incremento){
         double nuevoValor = 0;
         nuevoValor = emp.getValorHora() +  (emp.getValorHora() * incremento);
         emp.setValorHora(nuevoValor);
    }
    
    public void decrementarValorHora(Empleado emp, double incremento){
         double nuevoValor = 0;
         nuevoValor = emp.getValorHora() -  (emp.getValorHora() * incremento);
         emp.setValorHora(nuevoValor);
    }    

    public void calcularSueldo(Empleado empleado, double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
