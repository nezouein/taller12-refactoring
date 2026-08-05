public class DepartamentoFactory {
    public static Departamento crear(String nombre) {
        if (nombre == null) {
            return new DepartamentoGenerico(null);
        }
        switch (nombre) {
            case "Sistemas":
                return new DepartamentoSistemas();
            case "Contabilidad":
                return new DepartamentoContabilidad();
            default:
                return new DepartamentoGenerico(nombre);
        }
    }
}