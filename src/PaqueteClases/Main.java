package PaqueteClases;

import PaqueteClases.PaquetePassword.Password;

import PaqueteClases.PaqueteElectrodomesticos.Electrodomestico;
import PaqueteClases.PaqueteElectrodomesticos.Lavadora;
import PaqueteClases.PaqueteElectrodomesticos.Television;

import PaqueteClases.PaqueteInterfaz.Serie;
import PaqueteClases.PaqueteInterfaz.Videojuego;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //ejercicioObjetoPersona();
        //ejercicioObjetoPassword();
        //ejercicioSuperclaseElectrodomestico();
        //ejercicioInterfaz();
        //ejercicioClaseLibro();
        //ejercicioClaseRaices();

        
    }

    /**
     * Sentencias para comprobar la funcionalidad de la clase Persona
     */
    public static void ejercicioObjetoPersona(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Vamos a crear un objeto persona y necesitamos ciertos atributos.\n\n");
        System.out.println("Introduzca el nombre de la persona:\n");
        String nombre= leer.next();
        System.out.println("Introduzca la edad de la persona:\n");
        int edad= leer.nextInt();
        System.out.println("Introduzca el sexo de la persona:\n");
        char sexo= leer.next().charAt(0);
        System.out.println("Introduzca el peso de la persona:\n");
        double peso= leer.nextDouble();
        System.out.println("Introduzca la altura de la persona:\n");
        double altura= leer.nextDouble();


        //Creacion de 3 instancias de la clase Persona

        //1 Con todos los valores pedidos anteriormente por teclado
        Persona primeraPersona= new Persona(nombre,edad,null,sexo,peso,altura);

        //2 Solo con nombre edad y sexo
        Persona segundaPersona= new Persona(nombre,edad,sexo);

        //3 Con valores por defecto y que se asignaran por metodos set
        Persona terceraPersona= new Persona();
        terceraPersona.setNombre(nombre);
        terceraPersona.setEdad(edad);
        terceraPersona.setSexo(sexo);
        terceraPersona.setPeso(peso);
        terceraPersona.setAltura(altura);

        //Se debe comprobar para cada intancia si esta en su peso ideal
        System.out.println("\n"+primeraPersona.devolverMC(peso,altura)+"");
        System.out.println(""+segundaPersona.devolverMC(peso,altura)+"");
        System.out.println(""+terceraPersona.devolverMC(peso,altura)+"");

        //Comprobar en cada objeto si es mayor de edad
        System.out.println(""+primeraPersona.esMayorDeEdad(edad)+"");
        System.out.println(""+segundaPersona.esMayorDeEdad(edad)+"");
        System.out.println(""+terceraPersona.esMayorDeEdad(edad)+"");
        //Mostrar toString de cada instancia
        System.out.println(""+primeraPersona.toString()+"");
        System.out.println(""+segundaPersona.toString()+"");
        System.out.println(""+terceraPersona.toString()+"");
    }

    /**
     * Ejercicios para comprobar la funcionalidad de la clase Password
     */
    public static void ejercicioObjetoPassword() {
        Scanner leer= new Scanner(System.in);
        System.out.println("Bienvenido a los ejercicios con la clase Password");
        System.out.println("Por favor, indique la cantidad de elementos de una matriz de objetos Password: ");
        byte longitudMatriz=leer.nextByte();
        Password[] matrizPW= new Password[longitudMatriz];
        boolean[] contadorFuerzaPW=new boolean[longitudMatriz];
        System.out.println("Por favor, indique la longitud de las contrasenias de la matriz de objetos: ");
        byte longitudMatrizPW=leer.nextByte();
        //Bucle para crear instancias e imprimir valores de las mismas por pantalla
        for(int i=0;i<longitudMatrizPW;i++){
            matrizPW[i]=new Password(longitudMatrizPW);
            contadorFuerzaPW[i]=matrizPW[i].esFuerte(matrizPW[i].getContrasenia());
            //Muestra por pantalla la contrasenia de la instancia en si y comprobacion si es ferte
            System.out.println(matrizPW[i].getContrasenia()+" "+contadorFuerzaPW[i]);
        }
    }

    /**
     * Ejercicios para comprobar funcionalidad de superclase Electrodomestico
     */
    public static void ejercicioSuperclaseElectrodomestico(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Bienvenido a la demostracion de la superclase ELETRODOMESTICO: \n");
        Electrodomestico[] matrizElectrodomesticos= new Electrodomestico[10];
        //Bucle para asignar valores a los electrodomesticos
        for(int i=0;i<10;i++){
            //Elegir de las 3 opciones que son posibles
            byte opcionClase=0,opcionConstructor=0;
            //Variables pertenecientes a los atributos clase Electrodomestico
             double precioBase=0.0;
             String color="";
             char consumoEnergetico=' ';
             double peso=0.0;
            //Variables pertenecientes a los atributos clase Lavadora
            double carga=0.0;
            //Variables pertenecientes a los atributos clase Television
            int resolucion=0;
            boolean sintonizadorTDT=false;
            //Variables que almacenan sumas de precios de las distintas clases
            double sumaPreciosElectrodomestico=0;
            double sumaPreciosLavadora=0;
            double sumaPreciosTelevision=0;
            System.out.println("Determine las opciones del objeto nº "+i+"\n");
            while(opcionClase<1 || opcionClase>3) {
                System.out.println("Elija una de las 3 opciones:\n\n1)Electrodomestico\n2)Lavadora\n3)Television\n\n");
                opcionClase = leer.nextByte();
            }
            switch (opcionClase){
                case 1://Electrodomestico
                    while(opcionConstructor<1 || opcionConstructor>3) {
                        System.out.println("Elija una de los 3 constructores de la clase Electrodomestico:" +
                                "\n\n1)Por defecto" +
                                "\n2)Parametros precio y peso, el resto por defecto" +
                                "\n3)Definir todos los parametros\n\n");
                        opcionConstructor = leer.nextByte();
                    }
                    switch (opcionConstructor){
                        case 1:
                            matrizElectrodomesticos[i]= new Electrodomestico();
                            break;
                        case 2:
                            System.out.println("Introduzca el peso base: ");
                            precioBase=leer.nextDouble();
                            System.out.println("Introduzca el peso: ");
                            peso=leer.nextDouble();
                            matrizElectrodomesticos[i]= new Electrodomestico(precioBase,peso);
                            break;
                        case 3:
                            System.out.println("Introduzca el peso base: ");
                            precioBase=leer.nextDouble();
                            System.out.println("Introduzca el peso: ");
                            peso=leer.nextDouble();
                            System.out.println("Introduzca el color: ");
                            color=leer.next();
                            System.out.println("Introduzca el consumo energetico: ");
                            consumoEnergetico=leer.next().charAt(0);
                            matrizElectrodomesticos[i]= new Electrodomestico(precioBase,color,peso,consumoEnergetico);
                            break;
                    }
                    sumaPreciosElectrodomestico=matrizElectrodomesticos[i].precioFinal();
                    break;
                case 2://Lavadora
                    while(opcionConstructor<1 || opcionConstructor>3) {
                        System.out.println("Elija una de los 3 constructores de la clase Lavadora:" +
                                "\n\n1)Por defecto+" +
                                "\n2)Parametros precio y peso, el resto por defecto+" +
                                "\n3)Definir todos los parametros\n\n");
                        opcionConstructor = leer.nextByte();
                    }
                    switch (opcionConstructor){
                        case 1:
                            matrizElectrodomesticos[i]= new Lavadora();
                            break;
                        case 2:
                            System.out.println("Introduzca el peso base: ");
                            precioBase=leer.nextDouble();
                            System.out.println("Introduzca el peso: ");
                            peso=leer.nextDouble();
                            matrizElectrodomesticos[i]= new Lavadora(precioBase,peso);
                            break;
                        case 3:
                            System.out.println("Introduzca el peso base: ");
                            precioBase=leer.nextDouble();
                            System.out.println("Introduzca el peso: ");
                            peso=leer.nextDouble();
                            System.out.println("Introduzca el color: ");
                            color=leer.next();
                            System.out.println("Introduzca el consumo energetico: ");
                            consumoEnergetico=leer.next().charAt(0);
                            System.out.println("Introduzca la carga: ");
                            carga=leer.nextDouble();
                            matrizElectrodomesticos[i]= new Lavadora(precioBase,color,peso,consumoEnergetico,carga);
                            break;
                    }
                    sumaPreciosElectrodomestico=matrizElectrodomesticos[i].precioFinal();
                    sumaPreciosLavadora=matrizElectrodomesticos[i].precioFinal();
                    break;
                case 3://Television
                    while(opcionConstructor<1 || opcionConstructor>3) {
                        System.out.println("Elija una de los 3 constructores de la clase Electrodomestico:" +
                                "\n\n1)Por defecto" +
                                "\n2)Parametros precio y peso, el resto por defectos" +
                                "\n3)Definir todos los parametros\n\n");
                        opcionConstructor = leer.nextByte();
                    }
                    switch (opcionConstructor){
                        case 1:
                            matrizElectrodomesticos[i]= new Television();
                            break;
                        case 2:
                            System.out.println("Introduzca el peso base: ");
                            precioBase=leer.nextDouble();
                            System.out.println("Introduzca el peso: ");
                            peso=leer.nextDouble();
                            matrizElectrodomesticos[i]= new Television(precioBase,peso);
                            break;
                        case 3:
                            System.out.println("Introduzca el peso base: ");
                            precioBase=leer.nextDouble();
                            System.out.println("Introduzca el peso: ");
                            peso=leer.nextDouble();
                            System.out.println("Introduzca el color: ");
                            color=leer.next();
                            System.out.println("Introduzca el consumo energetico: ");
                            consumoEnergetico=leer.next().charAt(0);
                            System.out.println("Introduzca la resolucion: ");
                            resolucion=leer.nextInt();
                            System.out.println("Introduzca el sintonizador TDT: ");
                            sintonizadorTDT=leer.nextBoolean();
                            matrizElectrodomesticos[i]= new Television(precioBase,color,peso,consumoEnergetico,resolucion,sintonizadorTDT);
                            break;
                    }
                    sumaPreciosElectrodomestico=matrizElectrodomesticos[i].precioFinal();
                    sumaPreciosTelevision=matrizElectrodomesticos[i].precioFinal();
                    break;
            }
            System.out.println("La suma de lo precios de los distintos productos es:\n" +
                    "Electrodomesticos: "+sumaPreciosElectrodomestico+"\nLavadoras: "+sumaPreciosLavadora+
                    "\nTelevisiones: "+sumaPreciosTelevision);
        }

    }

    /**
     * Ejercicios para comprobar funcionalidad de superclase Serie
     */
    public static void ejercicioInterfaz(){
        System.out.println("Bienvenido a la demostracion de una interfaz ");
        //Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
        Serie[] matrizSerie= new Serie[5];
        Videojuego[] matrizVideojuego=new Videojuego[5];
        //Crea un objeto en cada posicion del array, con los valores que desees, puedes usar distintos constructores.
        //Instancias de clase Serie
        matrizSerie[0]=new Serie();
        matrizSerie[1]=new Serie("Los SOPRANO", "DAvid chase");
        matrizSerie[2]=new Serie("supersecretos",2,"ANIMACION","CHINA");
        matrizSerie[3]=new Serie("Los SiMPsons", "Matt Groening");
        matrizSerie[4]=new Serie("twin peaks",12,"FANTASIA/TERROR","DAVID LYNCH");
        //Instancias de clase Videojuego
        matrizVideojuego[0]=new Videojuego();
        matrizVideojuego[1]=new Videojuego("YYYYYY", 5);
        matrizVideojuego[2]=new Videojuego("UUUUUU",122, "AVENTURA", "NINTENDO");
        matrizVideojuego[3]=new Videojuego("TBOFAB", 12);
        matrizVideojuego[4]=new Videojuego("UUASASASUUUU",22, "MIEDO", "NINTENDO");
        //Entrega algunos Videojuegos y Series con el método entregar()
        matrizSerie[0].entregar();
        //Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        byte contadorSeriesEntregadas=0, contadorVideojuegosEntregados=0;
        Object serieMasTemporadas = null,videojuegoMasHoras=null;
        for(int i=0;i<5;i++){
            if(matrizSerie[i].isEntregado()==true){
                contadorSeriesEntregadas++;
                matrizSerie[i].devolver();
            }
            if(matrizVideojuego[i].isEntregado()){
                contadorVideojuegosEntregados++;
                matrizVideojuego[i].devolver();
            }
            //indica el Videojuego tiene más horas estimadas y la serie con mas temporadas usando toString()
            if(i==0){
                //Al ser el primero se almacena en la variable objeto para empezar tanto serie como videojuego
                serieMasTemporadas=matrizSerie[i];
                videojuegoMasHoras=matrizVideojuego[i];
            }else{
                serieMasTemporadas=matrizSerie[i].compareTo(serieMasTemporadas);
                videojuegoMasHoras=matrizVideojuego[i].compareTo(videojuegoMasHoras);
            }
        }
        //Se imprime los objetos serie con mas temporadas y objeto videojuego con mas horas
        System.out.println(serieMasTemporadas.toString());
        System.out.println(videojuegoMasHoras.toString());





    }

    /**
     * Ejercicios para comprobar funcionalidad de clase libro
     */
    public static void ejercicioClaseLibro(){
        System.out.println("Bienvenido a la demostracion de la clase Libro");
        Libro libroUno= new Libro("6634hf8", "La biblia", "GOD",1234);
        Libro libroDos= new Libro("76636ggd", "FIGHT CLUB", "CHUK PALANIUJ",200);
        System.out.println("\n"+libroUno.toString()+"\n"+libroDos.toString()+"\n");
        //Se compara los libros
        if(libroUno.getNumPaginas()>libroDos.getNumPaginas()){
            System.out.println(libroUno.getTitulo()+" tiene mas paginas que "+libroDos.getTitulo());
        }else if(libroUno.getNumPaginas()<libroDos.getNumPaginas()){
            System.out.println(libroUno.getTitulo()+" tiene menos paginas que "+libroDos.getTitulo());
        }else{
            System.out.println(libroUno.getTitulo()+" tiene las mismas paginas que "+libroDos.getTitulo());
        }
    }

    public static void ejercicioClaseRaices(){////SIN ACABAR
        System.out.println("Demostracion de clase que hace ecuaciones de 2º grado: \n");
        Raices prueba= new Raices(7,7,7);
        System.out.println(prueba.tieneRaiz());
        prueba.calcular();
    }

    /**
     *Ejercicios para comprobar funcionalidad de clases de PaqueteInstituto
     */
    public static void ejercicioInstituto(){//SIN ACABAR

    }



}

