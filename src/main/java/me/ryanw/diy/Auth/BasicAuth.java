package me.ryanw.diy.Auth;

import me.ryanw.diy.API.DiyGet;
import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public abstract class BasicAuth {

    public static void AuthMe(String USER, String PASS) {
        try {
            /**
             * Setting up credentials for shipment to DIY.
             */
            String authString = USER + ":" + PASS;
            byte[] authEncodeByte = Base64.encodeBase64(authString.getBytes());
            String authStringEncoded = new String(authEncodeByte);

            /**
             * Opens up a connection to DIY and communicates.
             */
            URL url = new URL(DiyGet.Authorization());
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Authorization", "Basic " + authStringEncoded);
            InputStream in = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);

            /**
             * Received a response, lets read it!
             */
            int numCharsRead;
            char[] charArray = new char[1024];
            StringBuffer sb = new StringBuffer();
            while ((numCharsRead = reader.read(charArray)) > 0) {
                sb.append(charArray, 0, numCharsRead);
            }
            String result = sb.toString();
            System.out.println(result);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
