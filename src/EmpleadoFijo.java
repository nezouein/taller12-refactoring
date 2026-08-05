public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    @Override
    protected String getGenero() {
        return genero;
    }

    @Override
    protected void imprimirDetallesEspecificos() {
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
