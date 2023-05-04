import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Eleccion();
    }

    //Metodo para seleccionar la operacion que se quiera hacer con las matricez
    public static void Eleccion() {
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        System.out.println("Practiquemos con las matricez");
        System.out.println("Seleccione una opcion: " +
                "\n 1:Sumar matricez " +
                "\n 2:Restar matricez" +
                "\n 3:Multiplicar matricez");
        eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            default:
                System.out.println("Eleccion incorrecta \n vuelva a intentar");

        }
    }

    public static void suma() {

        System.out.println("    *****SUMA DE MATRICEZ*****");
        //Crear arreglo de 2 x 2
        int [][] arregloA = new int [2][2];
        int [][] arregloB = new int [2][2];
        int [][] arregloSuma = new int [2][2];

        //LLenar arregloA con numeros aleatorios
        for (int fila = 0; fila < arregloA.length; fila++) {
            for (int columna = 0; columna < arregloA[fila].length; columna++) {
                arregloA[fila][columna] = (int)Math.floor(Math.random()*5);
            }
        }
        //LLenar arregloB con numeros aleatorios
        for (int fila = 0; fila < arregloB.length; fila++) {
            for (int columna = 0; columna < arregloB[fila].length; columna++) {
                arregloB[fila][columna] = (int)Math.floor(Math.random()*5);
            }
        }
        //Sumar arreglos A y B, almacenar los valores en arregloSuma
        for (int fila = 0; fila < arregloSuma.length; fila++) {
            for (int columna = 0; columna < arregloSuma[fila].length; columna++) {
                //Almacena la suma de cada posicion en arreglo suma
                arregloSuma[fila][columna] = arregloA[fila][columna] + arregloB[fila][columna];
            }
        }
        System.out.println("*****Primera Matriz*****");
        //Imprimir arregloA
        for (int fila = 0; fila < arregloA.length; fila++) {
            for (int columna = 0; columna < arregloA[fila].length; columna++) {
                System.out.print("[" + arregloA[fila][columna]+ "]" +" ");
            }
            System.out.println();
        }
        System.out.println("*****Segunda Matriz*****");
        //Imprimir arregloB
        for (int fila = 0; fila < arregloB.length; fila++) {
            for (int columna = 0; columna < arregloB[fila].length; columna++) {
                System.out.print("[" + arregloB[fila][columna]+ "]"+" ");
            }
         System.out.println();
        }
        System.out.println("*****Resultado*****");
        //Imprimir ArregloSuma
        for (int fila = 0; fila < arregloSuma.length; fila++) {
            for (int columna = 0; columna < arregloSuma[fila].length; columna++) {
                System.out.print("[" + arregloSuma[fila][columna]+ "]" + " ");
            }
            System.out.println();
        }
    }
    public static void resta() {
        System.out.println("resta");
    }

    public static void multiplicacion() {

        //creacion de matricez
        int m1[][] = new int[2][2];  //matriz uno
        int m2[][] = new int[2][2];  //matriz dos
        int mR[][] = new int[2][2];  //matriz resultante

        //llenado matriz uno
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 5); // genera numero al azar no mayores a 5
            }
        }
        //llenado matriz dos
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = (int) (Math.random() * 5); // genera numero al azar no mayores a 5
            }
        }
        //multiplicacion de matricez
        for (int i = 0; i < 4; i++) {

//se va a llenar el primer espacio de la matriz resultante al multiplicar filas por columnas en su respectivo orden
            if (mR[0][0] == 0) {
                int temporal = (m1[0][0] * m2[0][0]) +
                        (m1[0][1] * m2[1][0]);

                mR[0][0] = temporal;
//llenado del segundo resultado
            } else if (mR[1][0] == 0) {
                int temporal = (m1[1][0] * m2[0][0]) +
                        (m1[1][1] * m2[1][0]);

                mR[1][0] = temporal;
//llenado del tercer resultado
            } else if (mR[0][1] == 0) {
                int temporal = (m1[0][0] * m2[0][1]) +
                        (m1[0][1] * m2[1][1]);

                mR[0][1] = temporal;
//llenado del cuarto resultado
            } else if (mR[1][1] == 0) {
                int temporal = (m1[1][0] * m2[0][1]) +
                        (m1[1][1] * m2[1][1]);

                mR[1][1] = temporal;
            }

        }
        //imprecion de resultados

                               //matriz uno                               //matriz dos
        System.out.println("["+m1[0][0]+"]"+"["+m1[0][1]+"]"+" x "+"["+m2[0][0]+"]"+"["+m2[0][1]+"]"+" = "+"["+mR[0][0]+"]"+"["+mR[0][1]+"]"+
                         "\n["+m1[1][0]+"]"+"["+m1[1][1]+"]"+"   "+"["+m2[1][0]+"]"+"["+m2[1][1]+"]"+"   "+"["+mR[0][0]+"]"+"["+mR[0][1]+"]");
    }


}

