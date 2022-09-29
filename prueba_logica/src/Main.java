import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese un numero decimal(Para finalizar digite 0,0)");
            String numero = userInput.next();
            if (numero.equals("0,0")) break;
            int numDeRepeticiones=Integer.parseInt(numero.split( ",")[0]);
            String decimales=numero.split(",")[1];

            String [][] displayArray=new String[decimales.length()][7];
            int [] arrayDeCifra=new int[decimales.length()];
            for (int i=0;i<decimales.length();i++){
                arrayDeCifra[i]=Integer.parseInt(String.valueOf(decimales.charAt(i)));
            }

            for (int i = 0; i < decimales.length(); i++) {
                switch (arrayDeCifra[i]) {
                    case 1: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }

                    case 2: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = " ";
                        displayArray[i][6] = "---";
                        break;
                    }

                    case 3: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "| ";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 4: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "";
                        break;
                    }
                    case 5: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 6: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 7: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 8: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 9: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                }
            }
            for (int j=0; j < numDeRepeticiones && j < 5; j++){
                for (int i = 0; i < decimales.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][0]);
                }
                System.out.println("");
                for (int i = 0; i < decimales.length(); i++) {
                    System.out.printf("%s   %s ", displayArray[i][1], displayArray[i][2]);
                }
                System.out.println("");
                for (int i = 0; i < decimales.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][3]);
                }
                System.out.println("");
                for (int i = 0; i < decimales.length(); i++) {
                    System.out.printf("%s   %s ", displayArray[i][4], displayArray[i][5]);
                }
                System.out.println("");
                for (int i = 0; i < decimales.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][6]);
                }
                System.out.println("");
            }
        }
    }
}

