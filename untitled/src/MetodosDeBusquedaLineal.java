public class MetodosDeBusquedaLineal {
    public static int busquedaSecuencial(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
