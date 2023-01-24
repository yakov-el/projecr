package Utilitis;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Base {
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject parma = new JSONObject();
    protected static JsonPath jp;

    protected static Map<String, String> val_dictionary = new HashMap<>();





}
