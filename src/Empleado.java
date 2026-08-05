public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private double tarifaHora;
    private String genero;

    public Empleado() {}

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this(nombre, salarioBase, horasTrabajadas, tarifaHora, departamento, "");
    }

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = DepartamentoFactory.crear(departamento);
        this.genero = genero;
    }


    public double calcularSalario() {
        validarDatos();
        return salarioBase + calcularPagoHorasExtra() + calcularBonificacionDepartamento();
    }

    private void validarDatos() {
        validarSalarioBase();
        validarHorasTrabajadas();
    }

    private void validarSalarioBase() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
    }

    private void validarHorasTrabajadas() {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimirDetalles() {
        imprimirDetallesBasicos();
        imprimirDetallesEspecificos();
    }

    private void imprimirDetallesBasicos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento.getNombre());
    }

    protected void imprimirDetallesEspecificos() {
        // Subclases pueden agregar detalles adicionales
    }

    // Más metodos
}
