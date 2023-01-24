package extensions;
import Utilitis.CommonOps;
import io.restassured.response.Response;
import org.json.simple.JSONObject;



public class ApiAction extends CommonOps {

    //receives a url and makes a get methode//
    public static Response get (String url){
        response = httpRequest.get(url);
        response.prettyPrint();
        return response;
    }


    //receives a obj  + url and makes a post methode//
    public static void   post (JSONObject obj,String url){
        httpRequest.header("Content-Type" , "application/json");
        httpRequest.body(obj.toJSONString());
        response = httpRequest.post(url);
        response.prettyPrint();
    }

    public static void   put (JSONObject obj,String url,String id){
        httpRequest.header("Content-Type" , "application/json");
        httpRequest.body(obj.toJSONString());
        response = httpRequest.put(url+"/"+id);
        response.prettyPrint();
    }

    public static void   delete (String url,String id){
        response = httpRequest.delete(url+"/"+id);
        response.prettyPrint();
    }



    //receives a response and makes a ExtractJson//
    public static String ExtractJson (Response response,String path){
        jp = response.jsonPath();
        return jp.get(path);
    }



}
