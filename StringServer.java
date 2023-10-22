import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    
    int num = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                num += 1;
                return (num + ". " + parameters[1] + "\n") 
            }
  
            return "404 Not Found!";
        }
        return "";
    }
}
