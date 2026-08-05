# Move Method Analysis

## 1. `BuscadorEmpleado.buscarEmpleadoPorNombre`

### Consecuencias de mantenerlo así
- Menor cohesión de la clase `Empresa`.
- Más difícil localizar la lógica de búsqueda de empleados porque está separada del dominio empresarial.
- Aumenta la probabilidad de que existan múltiples utilitarios similares en lugar de un único comportamiento de dominio.
- Complica el mantenimiento y las pruebas; el método no puede usar directamente el estado interno de `Empresa`.

### Beneficios de moverlo
- `Empresa` se convierte en el responsable natural de buscar empleados en su propia colección.
- Se mejora la cohesión: la lógica de búsqueda queda donde está el dato.
- Reduce la necesidad de pasar `List<Empleado>` como parámetro, haciendo el método más simple y menos propenso a errores.
- Facilita refactorizaciones futuras, por ejemplo, si se cambia el almacenamiento interno de empleados.

---

## 2. `imprimirDetalles()` en las subclases de `Empleado`

### Consecuencias de mantenerlo así
- Mayor esfuerzo de mantenimiento: cualquier cambio en la impresión de campos comunes debe aplicarse en varias clases.
- Riesgo de inconsistencias entre implementaciones.
- Difícil escalar si se agregan más tipos de empleado con campos comunes adicionales.

### Beneficios de moverlo
- Mover la parte común a `Empleado` reduce repetición.
- Mejora la cohesión de la clase base: la información compartida de empleados se imprime desde donde existen los datos.
- Las subclases conservan solo la lógica específica de su tipo, lo que simplifica la jerarquía.
- Facilita futuros refactors, como extraer el patrón de impresión común en un método base (`imprimirDetallesBasicos`) y dejar los detalles específicos en overrides.

---

## Recomendación general

### Prioridad alta
- Mover `buscarEmpleadoPorNombre` desde `BuscadorEmpleado` hacia `Empresa`.

### Prioridad media
- Mover la parte común de `imprimirDetalles()` desde las subclases hacia `Empleado`, dejando solo los detalles específicos en cada subclase.
