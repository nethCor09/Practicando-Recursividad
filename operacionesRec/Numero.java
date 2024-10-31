package operacionesRec;

public class Numero {
    /**
     * Escribe un proceso recursivo que permita calcular
     * la cantidad de digitos que tiene un numero positivo.
     */
    public int cantidadDigitos(int numero) {
        int res;
        
        if(numero < 10) {
            res =  1;
        }else {
            res = 1 + cantidadDigitos(numero/10);
        }
        return res;
    }
    
    /**
     * Escriaba un metodo que permita saber si todos
     * los digitos se un numero, son pares;
     */
    public boolean existeDigitoPar(int numero) {
        boolean res;
        
        if(numero == 0) {
            res = true;
        }else if(!esPar(numero%10)) {
            res = false;
        }else {
            res = existeDigitoPar(numero/10);
        }
        return res;
    }
    
    private boolean esPar(int numero) {
        return ((numero%2) == 0)? true:false;
    }
    
    /**
     * invertir un numero
     */
    public int invertirNumero(int numero) {
        return invertirNumero(numero, 0);
    }

    private int invertirNumero(int numero, int invertido) {
        int res;
        
        if (numero == 0) {
            res = invertido;
        }else{
            invertido = invertido * 10 + (numero % 10);
            res = invertirNumero(numero/10, invertido);
        }
        return res;
    }
}
