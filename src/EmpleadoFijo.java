public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.bonoAnual = bonoAnual;
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
