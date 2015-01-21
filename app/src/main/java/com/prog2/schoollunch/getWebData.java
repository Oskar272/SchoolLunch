package com.prog2.schoollunch;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by peter.bergman on 2014-12-10.
 */
public class getWebData {

    private static String BASE_URL = "http://eedat13.tk/test.html";

    public String fetchMeTS()
    {
        HttpURLConnection connection = null;
        InputStream is = null;

        try {

            connection = (HttpURLConnection)( new URL(BASE_URL)).openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.connect();

            StringBuffer buffel = new StringBuffer();
            is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;

            while( (line = br.readLine() ) != null ) {
                buffel.append(line + "\r\n");
            }
            is.close();
            connection.disconnect();

            return buffel.toString();


        } catch(Throwable T) {

        } finally {
            try { is.close(); } catch(Throwable T){}
            try { connection.disconnect(); } catch(Throwable T){}

        }


        return null;
    }

}
