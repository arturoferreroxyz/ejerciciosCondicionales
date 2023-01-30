package PaqueteClases;

public class Raices {
    //Atributos
    int a;
    int b;
    int c;
    //Constructores
    public Raices(int a, int b, int c){
        a=a;
        b=b;
        c=c;
    }
    //Metodos

    /**
     * @return imprime las 2 posibles soluciones
     */
    public void obtenerRaices(){
        System.out.println(-b+(Math.sqrt((b+b)-(4*a+c))/2*a));
        System.out.println(-b-(Math.sqrt((b+b)-(4*a+c))/2*a));
    }

    /**
     *
     * @return imprime unica raiz, que sera cuando solo tenga una solucion posible.
     * eso quiere decir que el discriminante es cero.
     */
    public void obtenerRaiz(){
        System.out.println((-b+(Math.sqrt((b+b)-(4*a+c))/2*a)));
    }

    /**
     *
     * @return devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
     */
    public double getDiscriminante(){
        return (Math.pow(this.b,2)-4*this.a*this.c);
    }

    /**
     *
     * @return devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
     * el discriminante debe ser mayor o igual que 0
     */
    public boolean tieneRaices(){
        if(this.getDiscriminante()>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @return devuelve un booleano indicando si tiene una unica solución, para que esto ocurra,
     * el discriminante debe ser igual que 0
     */
    public boolean tieneRaiz(){
        return true;
    }

    /**
     * mostrara por consola las posibles soluciones que tiene nuestra ecuación,
     * en caso de no existir solución, mostrarlo tambien
     */
    public void calcular(){
        if(tieneRaices()==true){
            obtenerRaices();
        }else{
            obtenerRaiz();
        }
    }

}
