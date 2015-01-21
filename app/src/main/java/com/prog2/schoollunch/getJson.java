package com.prog2.schoollunch;

import org.json.JSONException;
import org.json.JSONObject;


public class getJson {

    JSONObject jObj = new JSONObject(data);

    JSONObject idObj = getObject ("id", jObj);
    JSONObject name = getObject("name", jObj);
    JSONObject picture = getObject ("bild",jObj);
    JSONObject location = getObject ("plats",jObj);

    private static JSONObject getObject  (String tagName, JSONObject jObj) throws JSONException {
        JSONObject subObj = jObj.getJSONObject(tagName);
        return subObj;
    }


}



