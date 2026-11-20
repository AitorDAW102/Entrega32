import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una contraseña: ");
        String contrasenia = sc.nextLine();
        sc.close();
        boolean esLarga = false;
        boolean noEspacio = true;
        boolean mayus=false;
        boolean num=false;

        if (contrasenia.length() >= 8) {
            esLarga = true;
        }

        for (int i = 0; i < contrasenia.length(); i++) {
            char k = contrasenia.charAt(i);
            if (k == ' ') {
                noEspacio = false;
            }
            String numeros="0123456789";
            for(int x=0;x<numeros.length();x++){
                char numero=numeros.charAt(x);
                if (k==numero){
                    num=true;
                }
            }
            String mayusculas="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int j=0; j<mayusculas.length();j++){
                char letra=mayusculas.charAt(j);
                if(k==letra){
                    mayus=true;
                }
            }
        }


        if(esLarga){
            System.out.println("Longitud minima: SI");
        }else {
            System.out.println("Longitud minima: NO");
        }
        if (mayus){
            System.out.println("Tiene mayusculas: SI");
        }else{
            System.out.println("Tiene mayusculas: NO");
        }
        if (num){
            System.out.println("Tiene numero: SI");
        }else {
            System.out.println("Tiene numero: NO");
        }
        if (noEspacio){
            System.out.println("No contiene espacio: SI");
        }else {
            System.out.println("No contiene espacio: NO");
        }


        if(!esLarga||!mayus||!num||!noEspacio){
            System.out.println("====================");
            System.out.println("contraseña no valida");
            System.out.println("====================");
        } else {
            System.out.println("=================");
            System.out.println("contraseña valida");
            System.out.println("=================");
        }
    }
}
