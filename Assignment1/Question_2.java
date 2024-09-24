public class Question_2 {
    public static void main(String[] args) {

        //type- conversions
        byte b=27;
        short s=b;
        int i=s;
        long l=i;

        char c='a';
        int ch=c;

        long ln=9223372036854775807L;
        float f= ln;
        double d= f;

        //type-castings
        long lr= 123L;
        int ir=(int)lr;
        short sr =(short) ir;
        byte br= (byte) sr;

        int chr=97;
        char cr= (char) chr;

        double dr= 1245.056874;
        float fr= (float)dr;

        int ifr= (int)fr;
        long lfr= (long)fr;

        System.out.println(d);
    }
}
