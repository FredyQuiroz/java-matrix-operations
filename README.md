# Operaciones con matrices en Java / Matrix operations in Java

[Español](#español) · [English](#english)

## Español

Ejercicio de consola que muestra cómo un programa realiza cálculos con matrices, tablas de números organizadas en filas y columnas.

### Qué puedes hacer

- Suma y multiplica matrices de ejemplo.
- Transpone una matriz cambiando la posición de sus filas y columnas.
- Usa clases separadas para los datos, las operaciones y el menú.

### Ejemplo

Ejecuta el ejercicio y compara una tabla original con su transpuesta. La primera fila original se convierte en la primera columna.

### Cómo empezar

Instala un JDK y empieza en la clase principal de la edición que quieras explorar.

Puntos de entrada en el código. [`src/matriz.java`](src/matriz.java), [`src/operaciones_matriz.java`](src/operaciones_matriz.java), [`src/principal.java`](src/principal.java).

En PowerShell desde la raíz del repositorio.

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out src/matriz.java src/operaciones_matriz.java src/principal.java
java -cp out principal
```

Elige **5** en el menú para transponer.

Las fechas del historial se apoyan en Git o en la evidencia disponible de los respaldos. Las fechas reconstruidas a partir de archivos sin zona horaria usan las 12:00 UTC como referencia.

## English

A console exercise that shows how a program computes with matrices, grids of numbers organized into rows and columns.

### What you can do

- Add and multiply the sample matrices.
- Transpose a matrix by exchanging its rows and columns.
- Uses separate classes for data, operations, and the menu.

### Example

Run the exercise and compare an original matrix with its transpose. The original first row becomes the first column.

### Getting started

Install a JDK and start with the main class of the edition you want to explore.

Entry points in the source. [`src/matriz.java`](src/matriz.java), [`src/operaciones_matriz.java`](src/operaciones_matriz.java), [`src/principal.java`](src/principal.java).

In PowerShell from the repository root.

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out src/matriz.java src/operaciones_matriz.java src/principal.java
java -cp out principal
```

Choose **5** in the menu to transpose.

History dates come from Git or available backup evidence. Reconstructed dates from files with no time zone use 12:00 UTC as a reference.
