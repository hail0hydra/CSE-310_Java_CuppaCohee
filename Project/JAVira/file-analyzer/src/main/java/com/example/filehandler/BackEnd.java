/*

Developers         : Avinash Sharma (12114980), Anjali Singh(12114710), Sapna Bora(12115926)
Date               : 17 April 2023
Description        : This project extracts Data using an API provided by VirusTotal that anyone can access after getting an API-KEY
Warnings           : Only works for files under 32 Mb

*/

package com.example.filehandler;

// For API Handling
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;


// For Hashing file
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;

//JSON parsing
import javax.json.JsonArray;
import javax.json.Json;
import javax.json.*;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;


// Just for fun
import java.util.Date;
import java.io.FileWriter;
import javax.json.JsonWriter;
import javax.json.stream.JsonGenerator;
import java.io.File;
import java.util.Scanner;


public class BackEnd{
    public static void main(String...args) throws IOException, InterruptedException, Exception {

    }

    // custom function to generate hash of file
    public static String getHash(String filePath) throws Exception{

        MessageDigest md = MessageDigest.getInstance("md5");
        Path path = Paths.get(filePath);

        byte[] data = Files.readAllBytes(path);
        md.update(data);

        byte[] hash = md.digest();

        StringBuilder sb = new StringBuilder();

        for (byte b: hash){
            sb.append(String.format("%02x", b));
        }

        String checksum = sb.toString();

        return checksum;
    };

    //create log
    public static void createLog(String filePath, int maliciousCount) throws IOException {
        File logFile = new File("./log.txt");
        FileWriter writer = new FileWriter(logFile, true);
        writer.write("File path: " + filePath + "\n");
        writer.write("Malicious count: " + maliciousCount + "\n");
        writer.write("Timestamp: " + new Date() + "\n\n");
        writer.close();
    };


    // dump json
    public static void dumpJson(String f, JsonObject jo) throws Exception{

        File dir = new File(".json_data");
        if (dir.exists()){
            // NOICE
        }
        else{
            dir.mkdir();
        }

        // extracting name of file from absolute path
        File abs = new File(f);
        String dumpF = abs.getName();
        // System.out.println(dumpF);


        FileWriter fw = new FileWriter("./.json_data/"+dumpF+".json");

        JsonWriterFactory wf = Json.createWriterFactory(java.util.Collections.singletonMap(JsonGenerator.PRETTY_PRINTING, true)); // formatting json

        JsonWriter jw = wf.createWriter(fw);

        jw.writeObject(jo);

        jw.close();    
        fw.close();

    }


    // recieve malicious value
    public static int checkVirus(JsonObject jsonObject){

        // int logging = 0; 
        int malicious = 0;
        Scanner sc = new Scanner(System.in);

        if(jsonObject.containsKey("error")){
            System.out.println("Hash was not found in the Data-Base. Most Probably Harmless, still, Use at your own risk");

            return malicious;
            // System.out.println(response.body());
        }

        else if (jsonObject.containsKey("data")){


            // main parsing
            JsonObject data = jsonObject.getJsonObject("data");



            JsonObject attrs = data.getJsonObject("attributes");

            try{
                JsonObject last_analysis_stats = attrs.getJsonObject("last_analysis_stats");

                malicious = last_analysis_stats.getInt("malicious");
            }
            catch(Exception e){
                e.printStackTrace();
            }
            // System.out.println(response.statusCode());

        }

        return malicious;

    }

    // returns Json Object of the response
    public static JsonObject handleAPI(String f) throws Exception{

        String md5Sum = getHash(f);


        // building request
        String api_key = "cc967c699f9acfb6c7b76f89faca354399b9847ab75bcc9a19e17594ad9e9231";

        var url = "https://www.virustotal.com/api/v3/files/" + md5Sum;

        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).headers("accept","application/json","X-APIkey",api_key).build();

        var client = HttpClient.newBuilder().build();



        // storing response
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());


        //json parsing
        String jsonString = response.body();


        JsonReader reader = Json.createReader(new StringReader(jsonString));
        JsonObject jsonObject = reader.readObject();

        return jsonObject;
    }
}
