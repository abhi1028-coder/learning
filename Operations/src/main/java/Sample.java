public class Sample {
    void sample2(int a, int b, int c){
        int sum = a+b;
        int Mul= a- b;
        int div= a/b;

        System.out.println("addition, Subtraction and Multiplication of a & b " + sum);
        System.out.println("addition, Subtraction and Multiplication of a & b " + Mul);
        System.out.println("addition, Subtraction and Multiplication of a & b " + div);

    }

    void sample3(int a, int b, int c){

        if ( a > b){
            System.out.println("a is greater than b");
        }
        else if (b > c) {
            System.out.println("b is greater than c");
        }
        else if ( c > a){

            System.out.println("c is greater than a");

        }
        else {
            System.out.println("not the Correct logic");
        }

    }

}
