/*
package com.bootcoding.basic.tasksm;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

public class Exa {
    public static void main(String[] args) throws IOException {
        // Set up the RASA server URL
        String rasaURL = "http://localhost:5005/webhooks/rest/webhook";

        // Set up the message to send to RASA
        String message = "Hi, how are you?";
        String encodedMessage = URLEncoder.encode(message, "UTF-8");

        // Send the message to RASA and receive the response
        URL url = new URL(rasaURL + "?message=" + encodedMessage);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Print the response from RASA
        System.out.println(response.toString());
    }
}
*/
