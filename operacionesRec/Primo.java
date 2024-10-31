package operacionesRec;
import java.util.ArrayList;


/**
 * 2. Escribe un proceso recursivo que permita decir
 * si un numero natural 'n' es primo p no
*/
public class Primo {
    public boolean esPrimo(int numero) {
        boolean res;
        
        if(numero <= 1) {
            res = false;
        }else{
            res = esPrimo(numero,2);
        }
        return res;
    }
    
    private boolean esPrimo(int num, int div) {
        boolean res;
        
        if(div == num) {
            res = true;
        }else if((num%div) == 0) {
            res = false;
        }else{
            res = esPrimo(num, div+1);
        }
        return res;
    }
    
    /**
     * Suma de los numeros primos en un rango de ini - fin;
     */
    public int rangoNumPrimos(int ini, int fin) {
        int res;
        
        if(ini > fin) {
            res = 0;
        }else if(esPrimo(ini)){
            res = rangoNumPrimos(ini+1, fin) + ini;
        }else{
            res = rangoNumPrimos(ini+1, fin);
        }
        
        return res;
    }
    
    /**
     * Se desea encontrar los factores primos de un numero;
     */
    public ArrayList<Integer> factoresPrimos(int numero) {
        return factoresPrimos(new ArrayList<Integer>(), 2, numero);
    }
    
    private ArrayList<Integer> factoresPrimos(ArrayList<Integer> res, int prim, int numero) {
        if(numero != 1) {
            if((numero%prim) == 0) {
                res.add(prim);
                factoresPrimos(res, prim, numero/prim);
            }else{
                factoresPrimos(res, prim+1, numero);
            }
        }
        return res;
    }
}
