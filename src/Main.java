public class Main {
    public static void main(String[] args) {

        //1

        int a = 0;
        int m;

        if (a > 0){
            m = 1;
            for (int n = 1; n < a; n++)
                m *= 3;


        }
        else {
            m = 0;
        }

        System.out.println(3 * m);



        //2

        int b = -1;
        int x = 1;

        if(b >= 0){
            for (int c = 0; c != a; c++)
                x *= b;
        }
        else{
            for (int c = 0; c != a; c--){
                x *= b;
            }

        }

        System.out.println(b * x);
    }
}