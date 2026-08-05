import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public Empleado buscarEmpleadoPorNombre(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        List<Empleado> empleadosPorTipo = new ArrayList<>();
        for (Empleado empleado : empleados) {
            agregarEmpleadoSiTieneHorasSuficientes(empleadosPorTipo, empleado, horas);
        }
        return empleadosPorTipo;
    }

    private void agregarEmpleadoSiTieneHorasSuficientes(List<Empleado> lista, Empleado empleado, int horas) {
        if (empleado.getHorasTrabajadas() > horas) {
            lista.add(empleado);
        }
    }

    // Más metodos
}

