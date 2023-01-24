package workflows;


import Utilitis.CommonOps;
import extensions.ApiAction;

import static utilities.GetData.getData;

public class ApiFlows extends CommonOps {

    public static String get_specific_value(String jPath){
        response =ApiAction.get("?firstname=sally&lastname=brown");
        return ApiAction.ExtractJson(response,jPath);

    }
    public static void post_booking(String firstname,String lastname,int totalprice,boolean depositpaid,String additionalneeds){
        val_dictionary.put("checkin" , "2018-01-01");
        val_dictionary.put("checkout" , "2019-01-01");
        parma.put("firstname" , firstname);
        parma.put("lastname" , lastname);
        parma.put("totalprice" , totalprice);
        parma.put("depositpaid" , depositpaid);
        parma.put("bookingdates",val_dictionary);
        parma.put("additionalneeds" , additionalneeds);
        ApiAction.post(parma,getData("Urlpost"));
    }

    public static void put_booking(String firstname,String lastname,int totalprice,boolean depositpaid,String additionalneeds,String id){
        val_dictionary.put("checkin" , "2018-01-01");
        val_dictionary.put("checkout" , "2019-01-01");
        parma.put("firstname" , firstname);
        parma.put("lastname" , lastname);
        parma.put("totalprice" , totalprice);
        parma.put("depositpaid" , depositpaid);
        parma.put("bookingdates",val_dictionary);
        parma.put("additionalneeds" , additionalneeds);
        ApiAction.put(parma,getData("Urlput"),id);
    }




}
