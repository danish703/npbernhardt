
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadDataDemo {
  public static void main(String[] args) {
      String op = getURLContent("http://asm.edu.np/");
      System.out.println(op);
    }
  
  
  public static String getURLContent(String url){
       StringBuilder content = new StringBuilder();
       
       try{
         URL theurl = new URL(url);
         URLConnection conn = theurl.openConnection();
           BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(conn.getInputStream())
           );
         String line;
         while((line=bufferedReader.readLine())!=null){
             content.append(line+"\n");
         }
         bufferedReader.close();
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
       return content.toString();
  }
    
}
