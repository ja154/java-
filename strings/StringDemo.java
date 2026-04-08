package strings;

public class StringDemo {

    public static void main(String[]args){

        String srt= "jabaman"; //1 string stored in the scp
        srt.concat("Final boss");// trying to append to the jabbaman string

        System.out.println(srt);


         ///introducing mutable classes ie the Stringbuffer and the StringBuilder.

        // thread safe
        StringBuffer sb = new StringBuffer("Jabaling");
        sb.append("Time");
        System.out.println(sb);

        //not thread safe
        StringBuilder sb1 = new StringBuilder("Unfused");
        sb1.append("prime");

        System.out.println(sb1);
    }
}
