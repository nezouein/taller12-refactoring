public class EmpleadoTemporario extends Empleado {
    private String genero;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.mesesContrato = mesesContrato;
    }

    @Override
    protected String getGenero() {
        return genero;
    }

    @Override
    protected void imprimirDetallesEspecificos() {
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    // Más metodos
}
