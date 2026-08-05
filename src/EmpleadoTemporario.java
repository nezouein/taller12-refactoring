public class EmpleadoTemporario extends Empleado {
    private String genero;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    @Override
    protected String getGenero() {
        return genero;
    }

    @Override
    protected void imprimirDetallesEspecificos() {
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
