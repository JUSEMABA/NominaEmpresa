package empresa.vista;
import empresa.modelo.*;
import java.util.Scanner;

public class Menu {
    private Scanner input = null;
    private Empleado empleado = null;
    private Empresa empresa = null;
    private Nomina nomina = null;
    
    public Menu(){
        input = new Scanner(System.in);
        empleado = new Empleado();
        empresa = new Empresa();
        nomina = new Nomina();
    }
    
    private int menu(){
        int opt = -1;
        System.out.println("########MENU PRINCIPAL########");
        System.out.println("# 1. AGREGAR EMPLEADO                  #");
        System.out.println("# 2. MODIFICAR EMPLEADO               #");
        System.out.println("# 3. AUMENTAR VALOR HORA           #");
        System.out.println("# 4. DISMINUEIR VALOR HORA         #");
        System.out.println("# 5. CALCULAR SALARIO                    #");
        System.out.println("# 6. SALIR                                                 #");
        System.out.println("########MENU PRINCIPAL########");        
        opt = input.nextInt();
        return opt;
    }    
    
    public void menuPrincupal(){
        int opt = -1;
        do{
             opt = menu();
             switch(opt){
                 case 1:
                     agregarObjetoEmpleado();
                     break;
                 case 2:
                     modificarObjetoEmpleado();
                     break;
                 case 3:
                     aumentarValorHora();
                     break;
                 case 4:
                     disminuirValorHora();
                     break;
                 case 5:
                     calcularSueldo();
                     break;
                 default:
                    System.out.println("Salir...");
                     opt=7;
                     
             }
        }while(opt >=1 && opt < 6);
        
    }
    
    
    public void agregarObjetoEmpleado (){
        System.out.println("Escriba el codigo del empleado");
          String codigo = input.next();
          System.out.println("Escriba el nombre del empleado");
          String nombre = input.next();    
          System.out.println("Escriba la edad del empleado");
          int edad = input.nextInt();        
          System.out.println("Escriba el numero de horas trabajadas");
          int numH = input.nextInt();  
          System.out.println("Escriba el valor de la hora");
          double valor = input.nextDouble();       
          empresa.agregarObjetoEmpleado(empleado, codigo, nombre, edad, numH, valor);
        
    }
   
    private void modificarObjetoEmpleado(){
          System.out.println("Escriba el codigo del empleado");
          String codigo = input.next();
          System.out.println("Escriba el nombre del empleado");
          String nombre = input.next();    
          System.out.println("Escriba la edad del empleado");
          int edad = input.nextInt();        
          System.out.println("Escriba el numero de horas trabajadas");
          int numH = input.nextInt();  
          System.out.println("Escriba el valor de la hora");
          double valor = input.nextDouble();       
          empresa.modificarEmpleado(empleado, codigo, nombre, edad, numH, valor);
    }
    
   private void aumentarValorHora(){
       System.out.println("Indique el incremento que se quiere hacer...");
       nomina.incrementarValorHora(empleado,  input.nextDouble());
   }
   private void disminuirValorHora(){
       System.out.println("Indique el decremento que se quiere hacer...");
       nomina.decrementarValorHora(empleado,  input.nextDouble());
   }
   public void calcularSueldo(){
        System.out.println("Numero de horas trabajadas");
        int numeroHoras = input.nextInt();
        System.out.println("Escriba el valor de la hora");
        double valorhora = input.nextDouble();
        double salario = nomina.calcularSueldo(numeroHoras, valorhora);
        System.out.println("El salario es "+salario);
        
    }


   
    
}
