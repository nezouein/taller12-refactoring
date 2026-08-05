public class DepartamentoGenerico implements Departamento {
    private final String nombre;

    public DepartamentoGenerico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularBono() {
        return 0;
    }
}