public class DepartamentoSistemas implements Departamento {
    @Override
    public String getNombre() {
        return "Sistemas";
    }

    @Override
    public double calcularBono() {
        return 20;
    }
}