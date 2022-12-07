public class Calcul {

    public int factorielle(int nb){
        if ((nb != 0) && (nb != 1) )return nb * factorielle(nb-1);
        return  1;
    }

    public float division(int x , int y) {
        if (y != 0) return (float) x / y;
        throw new ArithmeticException();
    }


}
