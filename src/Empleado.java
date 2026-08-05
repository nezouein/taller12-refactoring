public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private double tarifaHora;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
    this.nombre = nombre;
    this.salarioBase = salarioBase;
    this.horasTrabajadas = horasTrabajadas;
    this.tarifaHora = tarifaHora;
    this.departamento = DepartamentoFactory.crear(departamento);
    }


    public double calcularSalario() {
        validarDatos();

        double salarioTotal = salarioBase;
        salarioTotal += calcularPagoHorasExtra();
        salarioTotal += calcularBonificacionDepartamento();

        return salarioTotal;
    }

    private void validarDatos() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }

    private double calcularPagoHorasExtra() {
        if (horasTrabajadas > 40) {
            return (horasTrabajadas - 40) * 50; // Pago de horas extra
        }
        return 0;
    }

    private double calcularBonificacionDepartamento() {
    return departamento.calcularBono();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getDepartamento() {
    return departamento.getNombre();
    }

public void setDepartamento(String departamento) {
    this.departamento = DepartamentoFactory.crear(departamento);
    }

}
