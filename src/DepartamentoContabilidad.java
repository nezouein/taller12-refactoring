public class DepartamentoContabilidad implements Departamento {
    @Override
    public String getNombre() {
        return "Contabilidad";
    }

    @Override
    public double calcularBono() {
        return 10;
    }
}