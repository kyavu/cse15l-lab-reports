import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    
    int num = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                num += 1;
                return (num + ". " + parameters[1] + "\n");
            }
  
            return "404 Not Found!";
        }
        return "";
    }
}


import java.io.IOException;

class StringServer {
   StringServer() {
   }

   public static void main(String[] var0) throws IOException {
      if (var0.length == 0) {
         System.out.println("Missing port number! Try any number between 1024 to 49151");
      } else {
         int var1 = Integer.parseInt(var0[0]);
         Server.start(var1, new Handler());
      }
   }
}
