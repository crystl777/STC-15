package ru.butenko.task15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;


public class Serialize {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://official-joke-api.appspot.com/jokes/programming/random");
            try (InputStream is = url.openStream();
                 Reader reader = new InputStreamReader(is);
                 BufferedReader br = new BufferedReader(reader);
            ) {
                ObjectMapper objectMapper = new ObjectMapper();
                Joke[] joke = objectMapper.readValue(br.readLine(), Joke[].class);

                System.out.println(joke[0].getSetup());
                System.out.println(joke[0].getPunchline());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






