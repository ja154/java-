import java.io.*;


public class ExceptDemo {
    public static void main(String[] args) throws IOException{

        System.out.println("please enter name and age");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int age = 0;
        String name = null;
        try{
        name = br.readLine();
        age = Integer.parseInt(br.readLine());

        }
        catch(Exception e){
            System.err.println(e);

        }
        finally{
            //finally block to close resources

            if(br!= null)
            br.close();
            System.out.println("Resources closed");
        }
        System.out.println(name+" "+age);
        System.out.println("jaba continues");
    }
}
