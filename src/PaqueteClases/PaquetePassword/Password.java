package PaqueteClases.PaquetePassword;

public class Password {
    //Atributos
    private long longitud;
    private String contrasenia;
    //Constructores
    Password(){
        this.longitud=8;
    }
    public Password(long l){
        this.longitud=l;
        this.contrasenia=generarPassword(longitud);
    }
    //Metodos
    /**
     *
     * @param contrasenia contrasenia a comprobar
     * @return true si contrasenia corresponde para que sea fuerte debe tener mas de 2 mayusculas,
     * mas de 1 minuscula y mas de 5 numeros
     * Es decir que como minimo 9 caracteres
     */
    public boolean esFuerte(String contrasenia) {
        byte contadorNum=0, contadorLetrasMinus=0,contadorLetrasMayus=0;
        byte minNumeros=48,maxNumeros=57,minLetraMinus=97,maxLetraMinus=122, minLetraMayus=65,maxLetraMayus=90;
        //Bucle que cuenta numeros letras minusculas y letras mayusculas
        for(int i=0;i<contrasenia.length();i++){
            //Contador de numeros de la contrasenia
            if(contrasenia.charAt(i)>=minNumeros || contrasenia.charAt(i)<=maxNumeros){
                 contadorNum++;
            }
            //Contador de letras minusculas de la contrasenia
            if(contrasenia.charAt(i)>=minLetraMinus || contrasenia.charAt(i)<=maxLetraMinus){
                contadorLetrasMinus++;
            }
            //Contador de letras mayuscylas de la contrasenia
            if(contrasenia.charAt(i)>=minLetraMayus || contrasenia.charAt(i)<=maxLetraMayus){
                contadorLetrasMayus++;
            }
        }
        //Comprueba con los contadores cumplan a rajatabla los requisitos
        if(contadorNum<5 || contrasenia.length()<9 || contadorLetrasMinus<=1 || contadorLetrasMayus<=2){
            return false;
        }else{
            return true;
        }
    }
    /**
     *
     * @param longitud longitud que queramos de la contrasenia
     * @return contrasenia generada de forma aleatoria
     */
    public String generarPassword(long longitud){
        //Generador numeros aleatorios por un rango -> Math.floor(Math.random() *(max - min + 1) + min)
        //Posiciones en char de los numeros y letras en ASCII que se pueden usar en tipo de dato char
        byte minNumeros=48,maxNumeros=57,minLetraMinus=97,maxLetraMinus=122, minLetraMayus=65,maxLetraMayus=90;
        /**
         * Bucle que recorre de 1 en 1 los caracteres del la longitud del password con el fin de poner un numero,
         * una letra en minuscula o una letra en mayuscula
         */
        String cadenaPW="";
        for(int i=0;i<longitud;i++){
            //Calculo de numero aleatorio para determinar que caracter de la contrasenia queremos
            char caracter=(char)Math.floor(Math.random()*(3-1+1)+1);
            switch (caracter){
                //Numero aleatorio
                case 1:
                    caracter=(char)Math.floor(Math.random()*(maxNumeros-minNumeros+1)+minNumeros);
                    break;
                //Letra minuscula aleatoria
                case 2:
                    caracter=(char)Math.floor(Math.random()*(maxLetraMinus-minLetraMinus+1)+minLetraMinus);
                    break;
                //Letra mayuscula aleatoria
                case 3:
                    caracter=(char)Math.floor(Math.random()*(maxLetraMayus-minLetraMayus+1)+minLetraMayus);
                    break;
            }
            cadenaPW+=caracter;
        }
        return cadenaPW;
    }
    public long getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }
}
