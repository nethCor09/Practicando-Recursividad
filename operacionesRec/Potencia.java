package operacionesRec;
/**
 * Encuentra un metodo que permita definir la potencia de un numero. 
 * Los datos son 'a' y 'b' y lo que se desea es calcular 'a' elevado a la 'b'.
*/
public class Potencia {
    public int potencia(int base, int exponente) {
        int res;
        if(exponente == 0){
            res = 1;
        }else{
            res = base * potencia(base, exponente-1);
        }
        return res;
    }
}
