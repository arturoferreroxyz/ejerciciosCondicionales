package EjerciciosEstructurasControl;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //EJERCICIO CONDICIONALES
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A LOS EJERCICIOS CONDICIONALES-");
        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
        //ejercicioSeis();
        //ejercicioSiete();
        //ejercicioOcho();
        //ejercicioNueve();

    }

    /**
     * Se desea hacer un programa que pida al usuario un numero de participacion,
     * en el caso de haber escrito un 100 se indica que es el boleto GANADOR, en caso
     * contrario, si se escribe 50 se indica que se devuelve el reintegro y en el resto
     * de casos, pierde totalmente.
     */

    public static void ejercicioUno(){
        int numeroParticipacion;
        Scanner leer =new Scanner(System.in);
        System.out.println("Por favor, introduzca el numero de participacion: ");
        numeroParticipacion=leer.nextInt();
        if(numeroParticipacion==100){
            System.out.println("Enhorabuena, tienes el BOLETO GANADOR");
        } else if (numeroParticipacion==50) {
            System.out.println("Enhorabiena, tienes el REINTEGRO");
        }else{
            System.out.println("HAS PERDIDO");
        }
    }
    /**
     * Escribir un programa que escriba dos numeros e indicar cual es el mayor y cual es el mayor
     * En caso de que los dos sea iguales
     */
    public static void ejercicioDos(){
        int num1,num2;
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        num1=leer.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2=leer.nextInt();

        if(num1==num2){
            System.out.println("Los dos numeros son identicos");
        }else if(num1>num2){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num1<num2){
            System.out.println(num2+" es mayor que "+num1);
        }
    }

    /**
     Requerir al usuario que ingrese un día de la semana e imprimir un mensaje si es lunes,
     otro mensaje diferente si es viernes, otro mensaje diferente si es sábado o domingo.
     Si el día ingresado no es ninguno de esos, imprimir otro mensaje.
     *
     *
     * Hacer un programa que obligue al usuario a indicar un dia de la semana
     * e indicar cual es, en caso de no ser ninguno de esos imprimir que ha
     * fallado el mensaje
     */
    public static void ejercicioTres(){
        int diaSemana;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, indique el dia de la semana, en caso contrario indicara fallo:");
        diaSemana= leer.nextInt();
        if(diaSemana==1){
            System.out.println("LUNES");
        }else if(diaSemana==2){
            System.out.println("MARTES");
        }
        else if(diaSemana==3){
            System.out.println("MIERCOLES");
        }
        else if(diaSemana==4){
            System.out.println("JUEVES");
        }
        else if(diaSemana==5){
            System.out.println("VIERNES");
        }
        else if(diaSemana==6){
            System.out.println("SABADO");
        }
        else if(diaSemana==7){
            System.out.printf("DOMINGO");
        }
        else if(diaSemana<1 || diaSemana>7){
            System.out.println("FALLO AL INDICAR DIA DE LA SEMANA");
        }
        /*
        switch(diaSemana){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default 1:break;
        }*/
    }
    /**
     *
     * Realiza un programa que tras escribir tres numeros enteros, muestre su valor absoluto de cada uno
     * (El valor absoluto de los numeros negativos es el positivo)
     * Tras esto se realizara la suma de los 3.
     *
     */
    public static void ejercicioCuatro(){
        int num1, num2, num3;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ahora puede escribir el primer numero: ");
        num1=leer.nextInt();
        System.out.println("Ahora puede escribir el segundo numero: ");
        num2=leer.nextInt();
        System.out.println("Ahora puede escribir el tercer numero: ");
        num3=leer.nextInt();
        System.out.println("Ahora vamos a convertir estos numeros en su valor absoluto");
        System.out.println("Los numeros en son "+num1+" "+num2+" y "+num3);
        if(num1<0){
            num1*=-1;
        }
        if(num2<0){
            num2*=-1;
        }
        if(num3<0){
            num3*=-1;
        }
        System.out.println("Los numeros en valor ABSOLUTO AHORA son "+num1+" "+num2+" y "+num3);
        System.out.println("La suma de ambos es "+(num1+num2+num3));
    }

    /**
     *  Crear programa que sea capaz de almacenar en dos variables el nombre de dos personas, buscando
     *  que en si empiezan en la misma letra, tambien si finalizan en la misma letra y finalmente si tanto
     *  han empezado como finalizado indicando doble coincidencia.
     */
    public static void ejercicioCinco(){//SIN ACABAR PORQUE NO FUNCIONA EL LECTOR DE LETRAS FINALES
        String nombre1, nombre2;
        int contador=0;
        Scanner leerNombres= new Scanner(System.in);
        System.out.println("DETECTOR DE LETRAS:");
        System.out.println("Escribe el primer nombre :");
        nombre1=leerNombres.next();
        System.out.println("Escribe el segundo nombre: ");
        nombre2=leerNombres.next();

        if(nombre1.substring(0,1)==nombre2.substring(0,1)){
            System.out.println("Coinciden las iniciales de los nombres");
            contador++;
        }

        if(nombre1.substring(nombre1.length()-1,nombre1.length())==nombre2.substring(nombre2.length()-1,nombre2.length())){
            System.out.println("Coinciden las letras finales de los nombres");
            contador++;
        }
        if(contador==2){
            System.out.println("DOBLE COINCIDENCIA");
        }
    }
    /**
     *
     *Desarrollar un programa que deje elegir la primera letra de un color especifico, con las
     * posibles opciones: R "Rojo" V "Verde" A "Azul" M "Morado".
     * En el caso de no elegir ninguna opcion de las anteriores se respondera
     * "No se ha escogido una opcion predeterminada"
     */

    public static void ejercicioSeis(){
        Scanner leerColor=new Scanner((System.in));
        System.out.println("Por favor elija un color");
        String color=leerColor.next();
        //OPcion if
        if(color=="R") {
            System.out.println("Se ha escogido el color ROJO");
        } else if (color=="V") {
            System.out.println("Se ha escogido el color VERDE");
        }else if (color=="A") {
            System.out.println("Se ha escogido el color AZUL");
        } else if (color=="M") {
            System.out.println("Se ha escogido el color MORADO");
        }else {
            System.out.println("No se ha escogido una opcion predeterminada ");
        }

        //Opcion Switch
        /*
        switch (color){
            case "R":
                System.out.println("Se ha escogido el color ROJO");
                break;
            case "V":
                System.out.println("Se ha escogido el color VERDE");
                break;
            case "A":
                System.out.println("Se ha escogido el color AZUL");
                break;
            case "M":
                System.out.println("Se ha escogido el color MORADO");
                break;
            default:
                System.out.println("No se ha escogido una opcion predeterminada ");
                break;
        }*/
    }

    /**
     *Desarrollar un programa que permita escribir al usuario un caracter, permitiendo detectar tres opciones:
     * "Es vocal", "Es una cifra de 0 a 9".
     * En el caso de no hacer escrito ningun caracter o de haber escrito mas de un caracter
     * se mostrara un mensaje de error "Solamente es posible leer vocales y cifras de 0 a 9"
     */
    public static void ejercicioSiete(){
        Scanner leerCaracter= new Scanner(System.in);
        System.out.println("Introduzca el caracter deseado: ");
        String caracter=leerCaracter.next();
        //Opcion if valores en ASCCI para las vocales cifras y demas movidas
        if(caracter.equals("1")||caracter.equals("2") ||caracter.equals("3")
                ||caracter.equals("4") ||caracter.equals("5") ||caracter.equals("6")
                ||caracter.equals("7") ||caracter.equals("8") ||caracter.equals("9") ||caracter.equals("0")){
            System.out.println("Se ha introducido una cifra de 0 a 9");
        } else if (caracter.equals("a") ||caracter.equals("e") ||caracter.equals("i")
                ||caracter.equals("o") ||caracter.equals("u")) {
            System.out.println("Se ha introducido una vocal");
        }else{
            System.out.println("Solamente es posible leer vocales y cifras de 0 a 9");
        }
        //Opcion switch SIN ACABAR
       /* switch (caracter){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("Se ha introducido una cifra de 0 a 9");
                break;
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Se ha introducido una vocal");
            default:
                System.out.println("Solamente es posible leer vocales y cifras");
                break;
        }*/
    }

    /**
     * Desarrollar un programa capaz de detectar que el anio introducido sea bisiesto o no
     * Existen dos formas de detectar el mismo, si es dividible de forma entera por 400 es bisiesto
     * y en otro caso, si es divisible por 4 de forma entera y a la vez divisible tambien entre 100 de forma entera
     **/

    public static void ejercicioOcho() {
        int year = 0;
        Scanner readYear = new Scanner(System.in);
        System.out.println("Introduzca el anio para detectar si es bisiesto: ");
        year = readYear.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 == 0)) {
            System.out.println("El anio " + year + " SI es bisiesto");
        } else {
            System.out.println("El anio " + year + " NO es bisiesto");
        }
    }
    /**
     *Se desea desarrollar un programa que permita introducir el sexo y la edad de un individo
     * mostrando por pantalla si es hombre, mujer, mayor, menor de edad
     */
    public static void ejercicioNueve(){
        Scanner leer= new Scanner(System.in);
        String sexo;
        int edad=0;
        System.out.println("Introduzca el sexo(M/F");
        sexo=leer.next();
        System.out.println("Introduzca la edad");
        edad=leer.nextInt();
        if(sexo.equals("M")){
            System.out.println("El sexo es Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("El sexo es femenino");
        }else {
            System.out.println("No se ha introducido un dato correcto respecto al sexo");
        }
        if(edad<18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    /**
     *Un instituto de enseñanza de inglés necesita un programa que le permita, cada día,
     *  procesar observaciones sobre las clases de ese día.
     *  El instituto dicta clases a estudiantes de distintos niveles y cada nivel tiene clases
     *  en un día de la semana diferente: los lunes se dicta el nivel inicial, los martes el nivel intermedio,
     *  los miércoles el nivel avanzado, los jueves son para práctica hablada y los viernes se dicta inglés para viajeros.
     *
     *  Se debe comenzar por solicitar al usuario que ingrese la fecha actual en formato "día, DD/MM",
     *  donde [día] es un día de la semana, DD es el número de día y MM es el número de mes.
     *  Si el usuario ingresa un día de la semana inexistente o una fecha cuyo día supere el número 31
     *  o el mes supere el número 12, finalizar el programa indicando que se produjo un error.
     *  Debe permitirse que ingrese el día de la semana en minúsculas o mayúsculas indistintamente.
     *  Como precondición se tiene que lo ingresado por el usuario tendrá la forma <[alfanumérico], [numérico]/[numérico]>.
     *
     *  Una vez indicada la fecha, el usuario necesita poder indicar si ese día se tomaron exámenes,
     *  pero eso sólo si se trata de los niveles inicial, intermedio o avanzado,
     *  ya que las prácticas habladas y el inglés para viajeros no tienen exámenes.
     *  Si hubo exámenes, el usuario ingresará cuántos alumnos aprobaron y cuántos no,
     *  y el programa le mostrará el porcentaje de aprobados.
     *
     *  Si el día fue el correspondiente a práctica hablada,
     *  el usuario deberá ingresar el porcentaje de asistencia a clase
     *  y el programa le indicará "asistió la mayoría" en caso
     *  de que la asistencia sea mayor al 50% o "no asistió la mayoría" si no es así.
     *
     *  Si se trata del inglés para viajeros y la fecha actual corresponde al día 1 del mes 1 o del mes 7,
     *  se deberá imprimir "Comienzo de nuevo ciclo" y solicitar al usuario que ingrese la cantidad de alumnos
     *  del nuevo ciclo y el arancel en $ por cada alumno, para luego imprimir el ingreso total en $.
     *
     *  -------
     *
     *
     */
    public static void ejercicioXXX(){

    }

}