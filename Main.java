public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Perez");
        cliente.setEdad(30);
        cliente.setTelefono("(0973)166410");
        cliente.setCredito(5000000);

        String nombreC = cliente.getNombre();
        int edadC = cliente.getEdad();
        String telefonoC = cliente.getTelefono();
        int creditoC = cliente.getCredito();

        System.out.println("CLIENTE\nNombre: " + nombreC + "\nEdad: " + edadC + "\nTelefono: " + telefonoC +
                "\nCredito: " + creditoC);

        //------------------------------------------------------
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Rosalino Toledo");
        trabajador.setEdad(35);
        trabajador.setTelefono("(0983)166077");
        trabajador.setSalario(3500000);

        String nombreT = trabajador.getNombre();
        int edadT = trabajador.getEdad();
        String telefonoT = trabajador.getTelefono();
        int salarioT = trabajador.getSalario();

        System.out.println("\n\nTRABAJADOR\nNombre: " + nombreT + "\nEdad: " + edadT +
                "\nTelefono: " + telefonoT + "\nSalario: " + salarioT);
    }
}

class Persona{
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}