public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.credito = "Si";
        cliente.edad = 35;
        cliente.nombre = "Laureano";
        cliente.telefono = 1544940453;
        Trabajador trabajador = new Trabajador();
        trabajador.salario = 18000;
        trabajador.edad = 35;
        trabajador.nombre = "Laureano";
        trabajador.telefono = 1544940453;

        System.out.println( "Cliente: " +  cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
        System.out.println("Trabajador: " + trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);


    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;

}

class Cliente extends Persona {
    String credito;
}

class Trabajador extends Persona {
    int salario;
}