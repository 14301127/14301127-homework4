
import java.io.*;
public class StaticResourceProcessor {
    public void process(Request requst, Response response){
        try {
            response.sendStaticResource();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
