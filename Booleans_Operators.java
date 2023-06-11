package co.develhope.introduction._8;

public class Booleans_Operators {
    public static void main(String[] args) {
        System.out.println(" controlliamo che output fornisce la seguente condizione : ");
        System.out.println(" 2<=2 && !true ");
        System.out.println(" ragionamento : ");
        System.out.println(" 2<=2 = true , !true = false  => true && false = false , quindi mi aspetto come risultato false");
        if (2 <= 2 && !true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(" ");
        System.out.println(" controlliamo che output fornisce la seguente condizione : ");
        System.out.println(" !false && 3>2");
        System.out.println(" ragionamento : ");
        System.out.println(" !false = true , 3>2 = true  => true && true = true , quindi mi aspetto come risultato true");
        if (!false && 3 > 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean t = false;
        boolean f = true;
        System.out.println(" ");
        System.out.println(" consideriamo t=false e f=true");
        System.out.println(" controlliamo che output fornisce la seguente condizione : ");
        System.out.println(" !( !t  || f )");
        System.out.println(" ragionamento : ");
        System.out.println(" !t = true , f = true  =>  true || true = true => ! true = false , quindi mi aspetto come risultato false");
        if (!( !t  || f )) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(" ");
        System.out.println(" controlliamo che output fornisce la seguente condizione : ");
        System.out.println("( 6>6 ^ !(true && true ) ) ");
        System.out.println(" ragionamento : ");
        System.out.println(" 6>6 = false , true && true = true => !true = false , quindi false ^ false = false , mi aspetto come risultato false");
        if (6>6 ^ !(true && true )) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
