public class MetodoDeBusquedaBinaria {
    public static int busquedaBinaria(int[] arreglo, int numero) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == numero) {
                return medio;
            } else if (arreglo[medio] < numero) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
