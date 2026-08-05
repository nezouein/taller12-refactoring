# Extract Methods

## 1. Candidato principal: `Empleado.calcularSalario()`

Archivo: `src/Empleado.java`
Método: `public double calcularSalario()`

### Por qué aplicar Extract Method aquí
- El método combina varias responsabilidades:
  - validación de datos (`salarioBase` y `horasTrabajadas`)
  - cálculo de horas extra
  - cálculo de bonificación por departamento
- Tiene múltiples bloques `if` anidados y un `switch`, lo que dificulta su lectura.
- Extraer métodos como `validarDatos()`, `calcularPagoHorasExtra()` y `calcularBonificacionDepartamento()` hace que el código sea más explícito.

### Consecuencias de mantenerlo tal como está
- Más difícil de entender y modificar.
- Si se necesita cambiar la lógica de cálculo de horas extra o de departamento, se puede introducir un error en el método completo.
- Hace pruebas unitarias menos precisas, porque no hay componentes pequeños y con responsabilidad única.

### Beneficio de refactorizar con Extract Method
- Mejora la legibilidad: cada método extraído tiene un propósito claro.
- Facilita el mantenimiento: errores localizados en métodos más pequeños.
- Permite reutilizar lógica en otros lugares si es necesario.

## 2. Candidato secundario: `Empresa.obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas)`

Archivo: `src/Empresa.java`
Método: `public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas)`

### Por qué aplicar Extract Method aquí
- El cuerpo del método contiene una lógica de filtrado en el bucle `for`.
- Extraer la condición en un método como `empleadoTieneHorasSuficientes(Empleado empleado, int horas)` mejora la intención del código.

### Consecuencias de mantenerlo tal como está
- La lógica de filtrado permanece dentro del ciclo, reduciendo la claridad.
- El método combina el recorrido y la condición sin separar responsabilidades.

### Beneficio de refactorizar con Extract Method
- Deja el método principal más legible.
- Facilita cambios futuros en la condición de filtrado.
- Hace el método más fácil de leer y testear.

## 3. Candidato adicional: `imprimirDetalles()` en empleados

Archivos:
- `src/EmpleadoFijo.java`
- `src/EmpleadoPorHoras.java`
- `src/EmpleadoTemporario.java`

Método: `public void imprimirDetalles()` en cada clase

### Por qué aplicar Extract Method aquí
- Los tres métodos repiten la misma estructura de impresión de datos.
- Aunque no es exactamente el mismo código en cada clase, hay una parte común que puede extraerse a un método compartido en la superclase `Empleado`.

### Consecuencias de mantenerlo tal como está
- Duplica código en múltiples clases.
- Cada cambio en el formato de impresión debe hacerse en varios lugares.
- Aumenta el riesgo de inconsistencias entre clases.

### Beneficio de refactorizar con Extract Method
- Reduce la duplicación.
- Centraliza la lógica común para imprimir atributos básicos.
- Mejora la coherencia entre las implementaciones de impresión.

## 4. Oportunidad menor: `BuscadorEmpleado.buscarEmpleadoPorNombre()`

Archivo: `src/BuscadorEmpleado.java`
Método: `public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados)`

### Por qué aplicar Extract Method aquí
- La comparación de nombres puede extraerse a un método auxiliar como `nombresCoinciden(Empleado empleado, String nombre)`.
- Esto mejora la intención y facilita la adaptación si se cambia la lógica de búsqueda.

### Consecuencias de mantenerlo tal como está
- El método es corto, pero mezcla el bucle y la condición de comparación.

### Beneficio de refactorizar con Extract Method
- Aumenta la claridad del bucle.
- Hace la condición de búsqueda explícita y reutilizable.

---

## Recomendación final
El mejor lugar para aplicar `Extract Method` es `Empleado.calcularSalario()` por su complejidad y múltiples responsabilidades. Después de eso, conviene revisar `Empresa.obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas)` y los métodos `imprimirDetalles()` de los empleados para separar responsabilidades y reducir duplicación.