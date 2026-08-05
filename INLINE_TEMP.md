# Inline Temp

## Candidato principal: `EmpleadoPorHoras.calcularSalario()`

Archivo: `src/EmpleadoPorHoras.java`
Método: `public double calcularSalario()`

### Por qué aplicar Inline Temp aquí
- El método crea una variable temporal `salario` que solo se usa para almacenar el resultado de una expresión simple.
- Inmediatamente después, la variable se devuelve sin ninguna transformación adicional.
- Esto indica que la variable temporal no aporta claridad y puede ser eliminada.

### Consecuencias de mantenerlo tal como está
- Genera código innecesario y ligeramente más largo.
- Produce una variable con un alcance mayor del necesario.
- Dificulta el análisis rápido del método, porque el lector debe seguir un valor intermedio que no agrega significado.

### Beneficio de refactorizar con Inline Temp
- Reduce el ruido en el método y concentra la lógica en una única expresión legible.
- Hace el código más directo: el cálculo se devuelve sin pasar por una variable artificial.
- Mejora la simplicidad y el mantenimiento del método.

## Recomendación final
Aplicar `Inline Temp` en `EmpleadoPorHoras.calcularSalario()` es la mejor opción del proyecto. El método puede simplificarse eliminando la variable temporal y devolviendo directamente el resultado del cálculo de horas trabajadas por tarifa.
