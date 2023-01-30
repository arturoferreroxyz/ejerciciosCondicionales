package EjerciciosEstructurasControl;

import java.sql.SQLOutput;
import java.util.Scanner;
public class EjemploBucles {
    public static void main(String[] args) {
        System.out.println("Bienvenido a los ejercicios con bucles(WHILE/DOWHILE/FOR): ");
        //ejercicioUno();
        //////////////////////ejercicioDos();
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
        //ejercicioSiete();
        //ejercicioOcho();
        //ejercicioNueve();
        //ejercicioDiez();
        //ejercicioOnce();
        //ejercicioDoce();
        //ejercicioTrece();
        //ejercicioCatorce();
        //ejercicioQuince();
        //ejercicioDiecisiete();
        //ejercicioDieciocho();
        //ejercicioDiecinueve();
        ejercicioVeinte();
    }

    /**
     * Se trata de mostrar los números desde el 1 hasta el 100
     */
    public static void ejercicioUno(){
        int contador=1;
        while(contador<=100){
            System.out.println(contador++);
        }
    }

    /**Se desea elegir un numero por teclado y comprobar si es primo.
     * En caso contrario de no ser primo, dividir el mismo en sus factores primos
     */
    public static void ejercicioDos(){//ESTA PEDAZO DE PUTA MIERDA
        Scanner leer= new Scanner(System.in);
       int numero=0;
        System.out.println("Indique un numero para detectar si es primo o no: ");
        numero=leer.nextInt();
        int contador=2;
        boolean primo=true;
        //Bucle que comprueba que con que solamente haya un divisor extra indica que no es primo
        while(contador<numero){
            if(numero%contador==0){
                primo=false;
            }
            contador++;
        }
        if(primo==true) {
            System.out.println("El num " + numero + " SI es primo");
        }else{
            /*
            Aqui al comprobarse que no es primo se comprueba sus factores primos
             */
            System.out.println("El num "+numero+" NO es primo");
            System.out.println("Ahora vamos a hallar sus factores primos: ");
            contador=2;
            //Esta cadena almacena los factores primos
            String cadenaFactoresPrimos="";
            //Esta variable almacena los cambios que dividen entre numeros primos
            int numeroDividido=numero;
            //Bucle que comprueba cuales son los factores primos, si el numero dividido es 1 se sale del bucle
            while(contador<=numeroDividido){
                //Aqui se comprueba que se pueda dividir de forma entera, dentro si es primo o no
                if(numero%contador==0){
                    //Aqui se trata la excepcion tanto del num 2, porque SOLO puede dividirse entre 1 y 2
                    if(contador==2){
                        cadenaFactoresPrimos+=contador+"*";
                        numeroDividido/=contador;
                    }else{//Aqui se comprueba que el numero que lo divide del contador es primo
                        int contador2=2;
                        boolean divisorPrimo=true;
                        //Se comprueba que el contador solo se pueda dividir entre si mismo y la unidad
                        //para hacer factores primos con numero
                        while(contador2<contador || divisorPrimo==true){
                            if(contador%contador2==0){
                                divisorPrimo=false;
                            }
                            contador2++;
                        }
                        //Se hace la division con el primo del numero
                        if(divisorPrimo==true){
                            cadenaFactoresPrimos+=contador+"*";
                            numeroDividido/=contador;
                        }
                    }
                    //Este contador empieza de nuevo al haberse dividido el numero entre un primo
                    contador=2;
                }else{
                    contador++;
                }
            }
            System.out.println("Los factores primos de "+numero+" son "+cadenaFactoresPrimos+""+numeroDividido);
        }

    }

    /**
     *
     */
    public static void ejercicioTres(){
    }

    /**
     *  Elaborar un programa para ingresar dos números enteros positivos y reportar su máximo común divisor
     *  y el minimo comun multiplo
     *
     *  Un número entero d se llama máximo común divisor (M.C.D) de los números a y b cuando:
     *          *
     *          *    1. d es divisor común de los números a y b
     *          *    2. d es divisible por cualquier otro divisor común de los números a y b.
     */
    public static void ejercicioCuatro(){
        Scanner leer= new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        while(numero1<=0){
            System.out.println("Por favor introduzca el primer numero: ");
            numero1=leer.nextInt();
        }
        while(numero2<=0){
            System.out.println("Por favor introduzca el segundo numero: ");
            numero2=leer.nextInt();
        }







    }
    /**
     *Hacer un programa para ingresar un número entero positivo y reportar la sumatoria de sus dígitos.
     *
     * Ejemplo: Del numero 12, la sumatoria de sus digitos es 3
     */
    public static void ejercicioCinco(){
        Scanner leer= new Scanner(System.in);
        int numero=0;
        while(numero<=0){
            System.out.println("Por favor introduzca el numero entero positivo: ");
            numero=leer.nextInt();
        }
        //Se asigna en una cadena de caracteres el integer convertido
        String cadenaNumero=Integer.toString(numero);
        int contador=cadenaNumero.length();
        int suma=0;
        while(contador>0){
            suma+=Integer.parseInt(cadenaNumero.substring(contador-1,contador));
            contador--;
        }
        System.out.println("La suma del numero "+numero+" es "+suma);
    }
    /**
     * Hacer un programa para ingresar un numero entero positivo comprobando que sea capicua.
     * (Un número capicúa se lee igual de izquierda a derecha que derecha a izquierda)
     * Ejemplos:121 5665 123321
     */
    public static void ejercicioSeis(){
        Scanner leer= new Scanner(System.in);
        int numero=0;
        while(numero<=0){
            System.out.println("Por favor introduzca el numero entero positivo: ");
            numero=leer.nextInt();
        }
        String cadenaNumero=Integer.toString(numero);
        int contador=cadenaNumero.length();
        String cadenaNumeroInvertido="";
        while(contador>0){
            cadenaNumeroInvertido+=cadenaNumero.substring(contador - 1, contador);
            contador--;
        }
        System.out.println("El numero "+numero+" invertido es "+cadenaNumeroInvertido);
        if(cadenaNumero.equals(cadenaNumeroInvertido)){
            System.out.println("SI es un numero capicula");
        }else{
            System.out.println("NO es un numero capicua");
        }
    }

    /**
     *Desarrollar un programa que muestre los numeros del 1 al numero positivo(mayor que 1)
     * que nosotros pidamos y viceversa
     */
    public static void ejercicioSiete(){
        Scanner leer= new Scanner(System.in);
        int numero=0;
        while(numero<1 || numero>100){
            System.out.println("Indique un numero entre 1 y 100: ");
            numero=leer.nextInt();
        }
        int contador=1;
        while(contador<=numero){
            System.out.println(contador);
            contador++;
        }
        contador=numero;
        while(contador>=1){
            System.out.println(contador);
            contador--;
        }
    }

    /**
     * Hacer un programa para ingresar un numero, si el número es mayor a 10,
     * multiplique por los 10 primeros números, sino, sumar los 10 primeros números.
     */
    public static void ejercicioOcho(){
        Scanner leer = new Scanner(System.in);
        int numero=0;
        while(numero<=0) {
            System.out.println("Introduzca un numero entero positivo: ");
            numero=leer.nextInt();
        }
        int contador=1;
        //Opcion que multiplica los 10 primeros numeros
        if(numero>10){
            System.out.println("Vamos a multiplicar los 10 primeros numeros a "+numero);
            while(contador<=10){
                numero*=contador;
                System.out.println(numero);
                contador++;
            }
        }else{//Opcion que suma los 10 primeros numeros
            System.out.println("Vamos a sumar los 10 primeros numeros a "+numero);
            while(contador<=10){
                numero+=contador;
                System.out.println(numero);
                contador++;
            }
        }
    }
    /**
     *  Hacer un programa para ingresar dos numeros enteros n y m y reportar la sumatoria de pares desde n hasta m.
     */
    public static void ejercicioNueve(){
        Scanner leer = new Scanner(System.in);
        int numN=0,numM=0;
        System.out.println("Introduzca el primer numero entero n: ");
        numN= leer.nextInt();
        System.out.println("Introduzca el segundo numero entero m: ");
        numM= leer.nextInt();
        //Ahora sumatorio de pares desde numN a numM
        int sumaNM=0;
        int contador=numN;
        System.out.println("Ahora procedemos a hacer el sumatorio de pares desde "+numN+" a "+numM);
        while(contador<=numM){
            //Detecta que los numeros de 1 a 1 de n a m sean pares ara sumarlos
            if(contador%2==0){
                sumaNM+=contador;
                System.out.println("El numero "+contador+" es par");
            }
            contador++;
        }
        System.out.println("La suma total es "+sumaNM);
    }

    //A Partir de aqui con ejercicios DO WHILE

    /**
     *  Hacer un programa para ingresar un numero y reportar cuantos digitos tiene
     */
    public static void ejercicioDiez(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int numero=leer.nextInt();
        boolean digitos=true;
        int contadorDigitos=0;
        do{
            if(numero<10){
                contadorDigitos++;
                digitos=false;
            }else{
                numero/=10;
                contadorDigitos++;
            }
        }while(digitos==true);
        System.out.println("El numero de digitos es "+contadorDigitos);
    }
    /**
     * Hacer un programa para ingresar N num enteros.
     * Si se ingresa el número 0 el programa se detiene y se debe reportar la suma de los numeros ingresados.
     *
     *Realizar un programa que indique el numero de elementos que se desea sumar
     * En el momento que uno de los numeros sea 0, se acaba el bucle y se hace la suma completa
     */
    public static void ejercicioOnce(){
        Scanner leer = new Scanner(System.in);
        int cantidadNumeros=0;
        while(cantidadNumeros<=0) {
            System.out.println("Por favor, indique cuantos numeros enteros desea introducir: ");
            cantidadNumeros = leer.nextInt();
        }
        int contador=1;
        int numeroTemporal=0;
        int sumaNumeros=0;
        do{
            System.out.println("Ahora indique el nº "+contador+": ");
            numeroTemporal=leer.nextInt();
            sumaNumeros+=numeroTemporal;
            if(numeroTemporal==0){
            contador=cantidadNumeros+1;
            }else{
                contador++;
            }
        }while(contador<=cantidadNumeros);
        System.out.println("La suma total es: "+sumaNumeros);
    }
    /**
     * Desarrollar un programa que ingrese X numeros enteros y mostrarlos por pantalla
     * de forma aleatoria
     */
    public static void ejercicioDoce(){
    Scanner leer = new Scanner(System.in);
        int cantidadNum=0;
        while(cantidadNum<=0) {
            System.out.println("Indique el numero de enteros que desea mostrar: ");
            cantidadNum = leer.nextInt();
        }
        int contador=1;
        do{
        //Imprime numeros de 0 a cantidadNum y se fuerzan a ser integer y no decimal
        System.out.println((int)(Math.random()*cantidadNum));
        contador++;
        }while(contador<=cantidadNum);
    }

    /**
     * Desarrollar un programa para ingresar X num enteros, mostrando la multiplicacion de todos los numeros
     * que sean impares.
     */
    public static void ejercicioTrece(){
        Scanner leer = new Scanner(System.in);
        int cantidadNum=0;
        while(cantidadNum<=0) {
            System.out.println("Indique el numero de enteros que desea mostrar: ");
            cantidadNum = leer.nextInt();
        }
        int contador=1;
        int numero=0;
        int totalMultiplicacion=1;
        do{
            //Ahora vamos a introducir los numeros
            System.out.println("Por favor ingrese el numero "+contador+" de "+cantidadNum+": ");
            numero=leer.nextInt();
            if(numero%2!=0){
                System.out.println("El numero "+numero+" es impar");
                totalMultiplicacion*=numero;
            }
            contador++;
        }while(contador<=cantidadNum);
        System.out.println("La multiplicacion total de los impares es "+totalMultiplicacion);
    }
    /**
     * Desarrollar un programa que ingrese X num eneros, que pare de ingresar cuando
     * se escribe el ZERO, para finalmente muesre la suma total de todos ellos
     */
    public static void ejercicioCatorce(){
       Scanner leer= new Scanner(System.in);
       int numero=0;
       int sumaNum=0;
       do{
           System.out.println("Introduce el numero del que se desea sumar: ");
           numero=leer.nextInt();
           sumaNum+=numero;
       }while(numero>0);
        System.out.println("La suma total de los num es "+sumaNum);
    }
    /**
     * Crear un programa que calcule el factorial del numero que se pida por teclado
     */
    public static void ejercicioQuince(){
        Scanner leer= new Scanner(System.in);
        int numFactorial=0;
        while(numFactorial<=0) {
            System.out.println("Por favor, indique el numero del que se desea sacar su factorial: ");
            numFactorial=leer.nextInt();
        }
        int contador=numFactorial;
        int factorial=1;
        do{
            factorial*=contador;
            contador--;
        }while(contador>1);
        System.out.println("El factorial de "+numFactorial+" es "+factorial);
    }

    //EJERCICIOS FOR

    /**
     * Desarrollar un programa que permita escribir un numero minimo y un maximo que se pueda ir compronado
     * por medio de un ciclo for cuales son pares y cuales son impares, haciendo una suma por separado de
     * ambos
     * Nota: En el caso de que el minimo y el maximo no sigan ese orden, se cambiaran esos valores para poder
     * seguir el orden indicado por el nombre de las variabless
     */
    public static void ejercicioDieciseis(){
        Scanner leer = new Scanner(System.in);
        int minimo=0,maximo=0,variableAuxiliar=0,sumaPares=0,sumaImpares=0;
        while(minimo<=0 || maximo<=0 || minimo==maximo){
            System.out.println("Introduzca un minimo y un maximo que sean mayores de 0 y no iguales entre si");
            System.out.println("Por favor indique el valor minimo: ");
            minimo=leer.nextInt();
            System.out.println("Por favor indique el valor maximo: ");
            maximo=leer.nextInt();
        }
        //Ahora ordenara las variables si estan desordenadas
        if(minimo>maximo){
            variableAuxiliar=minimo;
            minimo=maximo;
            maximo=variableAuxiliar;
            System.out.println("El minimo y el maximo han sido ordenados");
        }
        System.out.println("Comprobaremos entre el minimo y el maximo cuales son pares/impares:");
        //Bucle controlado entre el valor minimo y el maximo
        for(int i=minimo;i<=maximo;i++){
        if(i%2==0){
            System.out.println(i+" es par.");
            sumaPares+=i;
        }else{
            System.out.println(i+" es impar.");
            sumaImpares+=i;
        }
        }
        System.out.println("La suma de los pares es: "+sumaPares+" y la de los impares "+sumaImpares);
    }
    /**
     * Desarrollar un programa que permita escribir por teclado un numero X y que permita reportar esa cantidad de
     * numeros y que cuente cuales son positivos, cuales negativos y cuales son cero.
     */
    public static void ejercicioDiecisiete(){
        Scanner leer= new Scanner(System.in);
        int numeros=0,sumaPositivos=0,sumaNegativos=0,sumaCeros=0;
        while(numeros<=0){
            System.out.println("Indique la cantidad de numeros para escribir: ");
            numeros=leer.nextInt();
        }
        //Variable para almacenar los valores del bucle for
        int valoresFor=0;
        for(int i=1;i<=numeros;i++){
            System.out.println("Indique el valos del numero "+i+": ");
            valoresFor=leer.nextInt();
            if(valoresFor==0){
               sumaCeros++;
            }
            if(valoresFor>0){
                sumaPositivos++;
            }
            if(valoresFor<0){
                sumaNegativos++;
            }
        }
        System.out.println("El total de ceros es "+sumaCeros+"\nel total de positivos "+sumaPositivos
                +"\ny el total de negativos "+sumaNegativos);
    }

    /**
     *  Se desea desarrollar un programa que permita introducir 10 numeros y que con ellos permita
     *  en una variable sumar los valores elevados al cubo de esos mismos.
     */
    public static void ejercicioDieciocho(){
        Scanner leer= new Scanner(System.in);
        int cantidadNumeros=0, sumaValoresCubo=0;
        while(cantidadNumeros<=0){
            System.out.println("Introduzca la cantidad de numeros: ");
            cantidadNumeros=leer.nextInt();
        }
        for(int i=1;i<=cantidadNumeros;i++){
            System.out.println("Introduzca el numero "+i+": ");
            sumaValoresCubo+=Math.pow(leer.nextInt(),3);
        }
        System.out.println("La suma de los valores al cubo es "+sumaValoresCubo);
    }
    /**
     *Se desea desarrollar el programa que haga el calculo de todos los productos desde
     * el 1 al numero que hayamos puesto
     */
    public static void ejercicioDiecinueve(){
        Scanner leer= new Scanner(System.in);
        int numero=0, totalMultiNum=1;
        while(numero<=0 || numero>16){
            System.out.println("Indicar el numero final menor de 16: ");
            numero= leer.nextInt();
        }
        for(int i=1;i<=numero;i++){
            totalMultiNum*=i;
            System.out.println(i+" "+totalMultiNum);
        }
        System.out.println("El total es "+totalMultiNum);
    }
    /**
     *  Desarrollar un programa que muestre X numeros de la sucesion de Fibonacci que nosotros indiquemos por teclado
     */
    public static void ejercicioVeinte(){
        Scanner leer=new Scanner(System.in);
        //Se guardan las dos variables que se asignan 0 y 1 acordes a la sucesion
        int numeroFibo=0, fiboNMenos1=0,fiboNMenos2=1,fiboN=0;
        while(numeroFibo<=0){
            System.out.println("Indique cuantos numeros queremos sacar de la sucesion de Fibonacci: ");
            numeroFibo=leer.nextInt();
        }
        for(int i=0; i<=numeroFibo; i++){
            if(i==0 || i==1) {
                System.out.println(i);
            }else if(i==2){
                fiboN=fiboNMenos1+fiboNMenos2;
                System.out.println(fiboN);
            }else{
                fiboNMenos1=fiboNMenos2;
                fiboNMenos2=fiboN;
                fiboN=fiboNMenos1+fiboNMenos2;
                System.out.println(fiboN);
            }

        }
    }
}
