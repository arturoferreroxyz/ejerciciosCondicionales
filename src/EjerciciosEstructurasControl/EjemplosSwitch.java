package EjerciciosEstructurasControl;

import java.util.Scanner;

public class EjemplosSwitch {
    //EJERCICIOS SWITCH(ATENCION LOS EJERCICIOS SON DELIBERADAMENTE NO EFECTIVOS SINO EFECTIVOS DEL SWITCH)
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A LOS EJERCICIOS DE SWITCH");

        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
    }

    /**
     *  Ingresar 2 números y luego un carácter indicando la operación a realizar (+,-,*,/)
     *  y reportar el resultado de la operación.
     *
     *  Hacer un programa que permita escribir por teclado la operacion a realizar
     *  Suma +
     *  Resta -
     *  Division /
     *  Multiplicacion *
     *  Modulo %
     *  Potencia ^
     *
     *  Luego escribir dos numeros y realizar la aterior mencionada
     */
    public static void ejercicioUno(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Por favor introduzca la operacion");
        System.out.println("Suma +");
        System.out.println(" Resta -");
        System.out.println("Division /");
        System.out.println("Multiplicacion *");
        System.out.println("Modulo %");
        System.out.println("Potencia ^");
        String operacion=leer.next();
        System.out.println("Ahora introduce el primero numero");
        int num1=leer.nextInt();
        System.out.println("Ahora introduce el segundo numero");
        int num2=leer.nextInt();

        switch (operacion){
            case"+": {
                System.out.println("Se va a realizar la suma de "+num1+" y "+num2);
                System.out.println(num1+num2);
                break;
            }
            case"-":{
                System.out.println("Se va a realizar la resta de "+num1+" y "+num2);
                System.out.println(num1-num2);
                break;
            }
            case"/":{
                System.out.println("Se va a realizar la division de"+num1+" y "+num2);
                System.out.println(num1/num2);
                break;
            }
            case"*":{
                System.out.println("Se va a realizar la multiplicacion de"+num1+" y "+num2);
                System.out.println(num1*num2);
                break;
            }
            case"%":{
                System.out.println("Se va a realizar el modulo de"+num1+" y "+num2);
                System.out.println(num1%num2);
                break;
            }
            case "^":{
                System.out.println("Se va a realizar la potencia de"+num1+" y "+num2);
                System.out.println(Math.pow(num1,num2));
            }
            default: {
                System.out.println("No se ha introducido un operador correcto");
                break;
            }
        }


    }

    /**
     * Hacer un programa para ingresar un número entre 1 y 12 y reportar el mes que le corresponde.
     *
     * Desarrollar un programa que pida el numero corresondiente al mes del anio,
     * en caso de haber elegido un numero erroneo se notificara
     */

    public static void ejercicioDos(){
    Scanner leer= new Scanner(System.in);
        System.out.println("Elija si desea averiguar num dias por meses(dias) o elegir un mes en particular(mes): \n");
    String eleccion=leer.next();
    switch(eleccion){
        case"dias":
            System.out.println("Por favor indique el num dias(28/29/30/31): ");
            int numDias=leer.nextInt();
                switch (numDias){
                    case 28:
                    case 29:
                        System.out.println(numDias+" dias tiene el mes de Febrero");
                        break;
                    case 30:
                        System.out.println(numDias+" dias tiene el mes de Abril/Junio/Septiembre/Noviembre");
                        break;
                    case 31:
                        System.out.println(numDias+" dias tiene el mes de Enero/Marzo/Mayo/Julio/Agosto/Octubre/Diciembre");
                        break;
                    default:
                        System.out.println("No ha elegido un num de dias correcto");
                        }
            break;
        case"mes":
            System.out.println("Por favor indique el num mes(1-12): ");
            int numMes=leer.nextInt();
                switch (numMes){
                    case 1:
                        System.out.println(numMes+" Pertenece al mes de Enero");
                        break;
                    case 2:
                        System.out.println(numMes+" Pertenece al mes de Febrero");
                        break;
                    case 3:
                        System.out.println(numMes+" Pertenece al mes de Marzo");
                        break;
                    case 4:
                        System.out.println(numMes+" Pertenece al mes de Abril");
                        break;
                    case 5:
                        System.out.println(numMes+" Pertenece al mes de Mayo");
                        break;
                    case 6:
                        System.out.println(numMes+" Pertenece al mes de Junio");
                        break;
                    case 7:
                        System.out.println(numMes+" Pertenece al mes de Julio");
                        break;
                    case 8:
                        System.out.println(numMes+" Pertenece al mes de Agosto");
                        break;
                    case 9:
                        System.out.println(numMes+" Pertenece al mes de Septiembre");
                        break;
                    case 10:
                        System.out.println(numMes+" Pertenece al mes de Octubre");
                        break;
                    case 11:
                        System.out.println(numMes+" Pertenece al mes de Noviembre");
                        break;
                    case 12:
                        System.out.println(numMes+" Pertenece al mes de Diciembre");
                        break;
                    default:
                        System.out.println("ERROR No se ha introducido un num de mes correcto ERROR");
                                }
            break;
        default:
            System.out.println("ERROR No ha elegido ni dias, ni meses ERROR");
            break;
    }


    }

    /**
     * Se desea desarrollar un programa que haga incrementos en la paga de un emplead@
     * por alcanzar objetivos predeterminados en la empresa de forma extra:
     *
     *nivelObjetivo1->55€
     *nivelObjetivo2->80€
     *nivelObjetivo3->120€
     *nivelObjetivo4->200€
     *
     * Tambien se incluira mas paga extra si a partir del primer logro el sujeto es mujer
     * con un incremento de 50€ y si alcanza el ultimo objetivo predeterminado de otros 50€
     */
    public static void ejercicioTres(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Por favor indique el sexo del empleado:");
        String sexo=leer.next();
        System.out.println("Por favor, diga el nivel de objetivo alcanzado: ");
        int nivelObjetivo=leer.nextInt();
        switch (sexo){
            case"mujer":
                switch (nivelObjetivo){
                    case 1:
                        System.out.println("La paga extra es de € 105");
                        break;
                    case 2:
                        System.out.println("La paga extra es de € 130");
                        break;
                    case 3:
                        System.out.println("La paga extra es de € 170");
                        break;
                    case 4:
                        System.out.println("La paga extra es de € 300");
                        break;
                    default:
                        System.out.println("ERROR A LA HORA DE INTRODUCIR EL NIVEL OBJETIVO PAGA EXTRA");
                        break;
                }
                break;
            case"hombre":
                switch (nivelObjetivo){
                    case 1:
                        System.out.println("La paga extra es de € 55");
                        break;
                    case 2:
                        System.out.println("La paga extra es de € 80");
                        break;
                    case 3:
                        System.out.println("La paga extra es de € 120");
                        break;
                    case 4:
                        System.out.println("La paga extra es de € 200");
                        break;
                    default:
                        System.out.println("ERROR A LA HORA DE INTRODUCIR EL NIVEL OBJETIVO PAGA EXTRA");
                        break;
                }
                break;
            default:
                System.out.println("ERROR No se ha introducido un sexo correcto ERROR");
                break;
        }





    }

    /**
     * Hacer un programa que por medio de un menu permita hacer las siguientes opciones:
     *     1.- Area triangulo (base y altura) ->(base*altura)/2
     *     2.- Area Cuadrado (lado) ->lado^2
     *     3.- Area Circulo (radio) ->3.14*radio^2
     *     4.- Area Rectángulo (base y altura) ->base*altura
     */
    public static void ejercicioCuatro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija una de las opciones del menu(1-4): " +
                "1.- Area triangulo (base y altura) ->(base*altura)/2\n"+
                "2.- Area Cuadrado (lado) ->lado^2 \n"+
                "3.- Area Circulo (radio) ->3.14*radio^2 \n"+
                "4.- Area Rectángulo (base y altura) ->base*altura\n");
        int opcionMenu=leer.nextInt();
        int baseLadoRadio=0,altura=0;
        switch (opcionMenu){
            case 1://base altura
                System.out.println("Se va a calcular el area del triangulo\n"
                +"Por favor indique la base: ");
                baseLadoRadio=leer.nextInt();
                System.out.println("Ahora, indique a altura: ");
                altura=leer.nextInt();
                System.out.println("(Base*Altura)/2 -> "+(baseLadoRadio*altura)/2);
                break;
            case 2://lado
                System.out.println("Se va a calcular el area del cuadrado\n"
                        +"Por favor indique el lado: ");
                baseLadoRadio=leer.nextInt();
                System.out.println("Lado^2 -> "+Math.pow(baseLadoRadio,2));
                break;
            case 3://radio
                System.out.println("Se va a calcular el area del circulo\n"
                        +"Por favor indique el radio: ");
                baseLadoRadio=leer.nextInt();
                System.out.println("3.14*radio^2 -> "+3.14*(Math.pow(baseLadoRadio,2)));
                break;
            case 4://base altura
                System.out.println("Se va a calcular el area del rectangulo\n"
                        +"Por favor indique la base: ");
                baseLadoRadio=leer.nextInt();
                System.out.println("Ahora, indique a altura: ");
                altura=leer.nextInt();
                System.out.println("Base*altura -> "+baseLadoRadio*altura);
                break;
            default:
                System.out.println("No ha elegido la opcion correcta");
        }

    }
    /**
     * Desarrollar programa que pueda calcular el sueldo de trabajadores acorde a su categoria, al num horas, la edad y sexo:
     *
     * 1. 5€ hora
     * 2. 15€ hora
     * 3. 25€ hora
     * 4. 35€ hora
     * 5. 50€ hora
     *
     * edad:
     * Si tiene justamente entre 35 y 40 anios de edad se la hace un incremente de 12€ mas a la hora
     * sexo:
     * Si es mujer, ganará el doble del sueldo acordado.
     *Horas:
     *Si supera el numero de horas llega a 40, se incrementa en 40€ el sueldo de forma extra
     */
    public static void ejercicioCinco(){
        Scanner leer= new Scanner(System.in);
        int sueldo=0;
        int valorCategoria=0;//valor el cual se va a multiplicar la categoria
        int valorEdad=0;//Valor por el cual se va a multiplicar el sueldo al tener edad entre 35-40
        System.out.println("Por favor indique el num de categoria del empleado 1-5: ");
        int categoria=leer.nextInt();
        System.out.println("Por favor indique el numero de horas trabajadas: ");
        int horas=leer.nextInt();
        System.out.println("Por favor indique la edad del empleado: ");
        int edad=leer.nextInt();
        System.out.println("Por favor indique el sexo: ");
        String sexo=leer.next();
        switch (edad){
            case 35:case 36:case 37:case 38:case 39:case 40:
                System.out.println("La edad del empleado es "+edad+" anios");
                valorEdad=12;
                break;
            default:
                System.out.println("EL EMPLEADO NO TIENE ENTRE 25-40 anios");
                break;
        }
        switch (horas){
            case 40:
                System.out.println("El numero de horas ha llegado a "+horas+" con la consecuente bonificacion de 40€");
                sueldo+=40;
                break;
            default:
                System.out.println("EL EMPLEADO NO HA CUMPLIDO 40 HORAS DE TRABAJO");
        }
        switch(categoria){
            case 1:
                System.out.println("El empleado es categoria "+categoria);
                sueldo+=((5+valorEdad)*horas);
                break;
            case 2:
                System.out.println("El empleado es categoria "+categoria);
                valorCategoria+=((15+valorEdad)*horas);
                break;
            case 3:
                System.out.println("El empleado es categoria "+categoria);
                valorCategoria+=((25+valorEdad)*horas);
                break;
            case 4:
                System.out.println("El empleado es categoria "+categoria);
                valorCategoria+=((35+valorEdad)*horas);
                break;
            case 5:
                System.out.println("El empleado es categoria "+categoria);
                valorCategoria+=((50+valorEdad)*horas);
                break;
            default:
                System.out.println("ERROR CATEGORIA EMPLEADO INCORRECTA");
                break;
        }
        switch(sexo){
            case "mujer":
                System.out.println("El empleado es "+sexo);
                sueldo*=2;
                break;
            default:
                System.out.println("ERROR AL INTRODUCIR SEXO");
                break;
        }

        System.out.println("El sueldo total es "+sueldo);


    }

    /**
     *Se desea desarrollar un menu con las siguientes opciones:
     * a) pasar nombre a mayusculas
     * b) pasar nombre a miyusculas
     * d)salir
     */
    public static void ejercicioSeis(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Elija una de las siguientes opciones:\n"
        +" 1) pasar nombre a mayusculas\n"
        +" 2) pasar nombre a minusculas\n"
        +" 3) salir ");
        int eleccion=leer.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("Indique el nombre que quiera pasar a mayusculas: ");
                String nombreMayus=leer.next();
                System.out.println("El nombre "+nombreMayus+" en mayusculas es "+nombreMayus.toUpperCase());
                break;
            case 2:
                System.out.println("Indique el nombre que quiera pasar a minusculas: ");
                String nombreMinus=leer.next();
                System.out.println("El nombre "+nombreMinus+" en minusculas es "+nombreMinus.toLowerCase());
                break;
            case 3:
                System.out.println("SALIENDO DEL PROGRAMA");
                break;
            default:
                System.out.println("ERROR OPCION DEL MENU ERRONEA");
        }

    }
}
