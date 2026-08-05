public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
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
