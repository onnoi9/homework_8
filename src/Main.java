public class Main {
    public static void main(String[] args) {

        //1

        int a = 0;
        int m;

        if (a > 0)
            m = 1;
        else
            m = 0;

        for (int n = 1; n < a; n++)
            m *= 3;


        System.out.println(3 * m);



        //2

        int b = -2;
        int x;

        if(a > 0)
            x = 1;
        else
            x = 0;

        for (int c = 1; c < a; c++)
            x *= b;

        System.out.println(b * x);
    }
}