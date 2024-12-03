//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int N;
        int i;
        System.out.print("Inserisci il numero di cifre" );
        N = in.nextInt();
        i=0;
        Int [] U[] = next.Int(N);
        Int [] R[] = next.Int(N);
        Int [] S[] = next.Int(N);
        Int [] M[] = next.Int(N);

        while (i<N) {
            do {
                System.out.println("Inserisci " +i+1+ " numero");
                U[i]=in.nextInt();
            }while (U[i] < 0);
            R[i]=random(11);
            System.out.println("R[" +i+1+ "]:" +R[i]);
            S[i]=random(8-3+1)+3;
            System.out.println("S[" +i+1+ "]:" +S[i]);
            M[i]=U[i]+R[i]+S[i];
            System.out.println("M[" +i+1+ "]:" +M[i]);
        }
        int T;
        System.out.print("Inserisco un numero intero" );
        T=in.nextInt();
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md