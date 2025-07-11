
package proyecto1;

/**
 *
 * @author DELL
 */
public class Proyecto1 {
    public static void main(String[] args) {
       
        //instancia un objeto de clase Mascota
        Mascota ma1 = new Mascota();
        System.out.println("Valores en los atributos de ma1:");
        System.out.println("Direccion de memoria: "+ma1);
        System.out.println("nombre: "+ma1.nombre);
        System.out.println("especie: "+ma1.especie);
        System.out.println("edad: "+ma1.edad);
        System.out.println("genero: "+ma1.genero);
        
        Mascota ma2 = new Mascota();
        //colocar valores a los atributos de ma2:
        ma2.nombre = "Chispita";
        ma2.especie = "Gato";
        ma2.edad = 2;
        ma2.genero = 'H';
        System.out.println("Valores en los atributos de ma2:");
        System.out.println("Direccion de memoria: "+ma2);
        System.out.println("nombre: "+ma2.nombre);
        System.out.println("especie: "+ma2.especie);
        System.out.println("edad: "+ma2.edad);
        System.out.println("genero: "+ma2.genero);
        
        Persona per1 = new Persona();
        System.out.println("Valores en los atributos de per1:");
        per1.imprimir();
        System.out.println("per1 es mayor de edad? "+per1.esMayorDeEdad());
        
        Persona per2 = new Persona("Gerardo", 42, 'M', "1401198201055");
        System.out.println("Valores en los atributos de per2:");
        per2.imprimir();
        System.out.println("per2 es mayor de edad? "+per2.esMayorDeEdad());
        
        Carro car1 = new Carro();
        car1.imprimir();
        
        Carro car2 = new Carro("Honda", "Civic", "Negro", 2004);
        car2.imprimir();
        
        Empleado em1 = new Empleado("Filomeno Colinas", 77, 'M', 100000, 'P');
        em1.imprimir();
        //no se tiene acceso a la edad desde fuera de la clase porque es private:
        System.out.println("La edad de em1 es: "+em1.getEdad());
        //sobreescribir la edad de em1
        em1.setEdad(18);
        System.out.println("La edad de em1 es: "+em1.getEdad());
        
        Estudiante es1 = new Estudiante("Estevancito Maravilla","20012002049","1401198201055",18,'M',0,"Ing. Sistemas");
        //se puede tambien cambiar los datos despues de construir:
        es1.setCarrera("Ingeniería en Sistemas");
        es1.imprimir();
    
    }
    
}
