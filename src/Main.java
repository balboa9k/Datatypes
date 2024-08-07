import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<Long> numbers = new ArrayList<>();

        for (int i=0; i<t; i++){
            try {
                numbers.add(sc.nextLong());
            }catch (Exception e ){
                numbers.add(null);
                sc.next();
            }
        }

        for(Long x: numbers){
            if(x ==null){
                System.out.println(x + " can't be fitted anywhere.");
            }else {
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>= -Math.pow(2,31) && x<=Math.pow(2,31)-1) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>= -Math.pow(2,63) && x<=Math.pow(2,63)-1) {
                    System.out.println("* long");
                }
            }
        }
    }
}

// variables a tomar en cuenta : byte, short, int, long