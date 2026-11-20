import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu frase: ");
        String frase=sc.nextLine();

        StringBuilder procesada= new StringBuilder();
        StringTokenizer st = new StringTokenizer(frase);
        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            if (palabra.length() < 4) {
                for (int i = 0; i < palabra.length(); i++) {
                    procesada.append("*");
                }
            } else {
                for (int i = 0; i < palabra.length(); i++) {
                    String chara = String.valueOf(palabra.charAt(i));
                    if (i == 0) {
                        procesada.append(chara.toUpperCase());
                    } else {
                        procesada.append(chara.toLowerCase());
                    }
                }
            }
            procesada.append(" ");
        }
        System.out.println(procesada);
    }
}
