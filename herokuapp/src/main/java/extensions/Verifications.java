package extensions;

import Utilitis.CommonOps;
import io.restassured.response.Response;
import org.testng.Assert;


public class Verifications extends CommonOps {

    //receives a  strings and  makes a comparison between them//
    public static void veryfiText(String actual,String expected) {
        Assert.assertEquals(actual, expected);

    }

    public static void veryfiStatusCode(Response response, int expected) {
        Assert.assertEquals(response.statusCode(), expected);

    }









}
