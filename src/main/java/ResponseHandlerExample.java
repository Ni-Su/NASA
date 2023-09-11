import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ResponseHandlerExample {
    public static void main(String args[]) throws Exception{

        //Create an HttpClient object
        CloseableHttpClient httpclient = HttpClients.createDefault();

        //instantiate the response handler
        ResponseHandler<String> responseHandler = new MyResponseHandler();

        //Create an HttpGet object
        HttpGet httpget = new HttpGet("https://api.nasa.gov/planetary/apod?api_key=Zj7AsdiOzIGcbmLnpnw2LR3hHKQtPqn3HxTIrCHH");

        //Execute the Get request by passing the response handler object and HttpGet object
        String httpresponse = httpclient.execute(httpget, responseHandler);

        System.out.println(httpresponse);
    }
}
