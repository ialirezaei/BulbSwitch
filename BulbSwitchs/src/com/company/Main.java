import java.util.ArrayList;
import java.util.Scanner;


public class Bulb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some numbers.");

        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> calculus = new ArrayList<Integer>();

        input.add(0);
        input.add(input.lastIndexOf(8));

        while (sc.hasNextInt()) {
            int z = 0;
            z = sc.nextInt();
            input.add(z);
            if(input.size() == 9){
                break;
            }

        }
        if(input.indexOf(1)==1){
            equal.add(input.indexOf(1));
        }


        for (int j = 1; j <= 7; j++) {
                if (input.get(j + 1) > input.get(j) && input.get(j) > input.get(j - 1)) {
                    if (j == input.get(j) && j > input.indexOf(1)) {
                        equal.add(input.get(j));
                }
            }
        }
        for (int i = 1; i <= 7; i++) {
            if (input.get(i) < i) {
                if(input.get(i) < input.get(i+1)){
                    calculus.add(input.get(i));
                }
            }

        }

//        System.out.println(equal);
//        System.out.println(calculus);
        int b = equal.size() + calculus.size();
        System.out.println(b);
    }
}


