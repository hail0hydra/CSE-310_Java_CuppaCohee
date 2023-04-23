/*

   Developed By    : Avinash Sharma (12114980), Anjali Singh(), Sapna Bora()
Date            : 17 April 2023
Description     : This project extracts Data using an API provided by VirusTotal that anyone can access after getting an API-KEY
Warnings        : Only works for files under 32 Mb

*/


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
import java.io.FileWriter;
import javax.json.JsonWriter;
import javax.json.stream.JsonGenerator;
import java.io.File;
import java.util.Scanner;

public class BackEnd{
    public static void main(String...args) throws IOException, InterruptedException, Exception {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path(absolute): ");
        String f = sc.nextLine();
        // String sha256Sum = getHash("./hashX.java");
        // String sha256Sum = getHash("F:/Language(s)/Python3/Projects/Virustotal-Project/test/virus.bat");
        String sha256Sum = getHash(f);


        // building request
        String api_key = "cc967c699f9acfb6c7b76f89faca354399b9847ab75bcc9a19e17594ad9e9231";

        var url = "https://www.virustotal.com/api/v3/files/" + sha256Sum;

        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).headers("accept","application/json","X-APIkey",api_key).build();

        var client = HttpClient.newBuilder().build();



        // storing response
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());


        //json parsing
        String jsonString = response.body();

        JsonReader reader = Json.createReader(new StringReader(jsonString));
        JsonObject jsonObject = reader.readObject();




        // storing json object recieved in a json file
        //
        // dir for json
        File dir = new File(".json_data");
        if (dir.exists()){
            // NOICE
        }
        else{
            dir.mkdir();
        }
        System.out.println("Enter name of json file: ");
        String jf = sc.nextLine();
        FileWriter fw = new FileWriter("./.json_data/"+jf);

        JsonWriterFactory wf = Json.createWriterFactory(java.util.Collections.singletonMap(JsonGenerator.PRETTY_PRINTING, true)); // formatting json

        JsonWriter jw = wf.createWriter(fw);

        jw.writeObject(jsonObject);

        jw.close();    
        fw.close();



        // Hash not found
        if(jsonObject.containsKey("error")){
            System.out.println("Hash was not found in the Data-Base. Most Probably Harmless, still, Use at your own risk");

            System.out.println(response.body());
        }

        else if (jsonObject.containsKey("data")){


            // main parsing
            JsonObject data = jsonObject.getJsonObject("data");



            JsonObject attrs = data.getJsonObject("attributes");

            JsonObject last_analysis_stats = attrs.getJsonObject("last_analysis_stats");

            int malicious = last_analysis_stats.getInt("malicious");

            System.out.println(malicious);
            // try{
            //     JsonObject popTclass = attrs.getJsonObject("popular_threat_classification");
            //
            //     JsonArray popTnameArray = popTclass.getJsonArray("popular_threat_name");
            //     JsonObject first = popTnameArray.getJsonObject(0);
            //
            //     int count = first.getInt("count");
            //
            //     if (count > 0){
            //
            //         System.out.println("Marked Malicous by: " + count + " entities.");
            //     }
            //     else{
            //         System.out.println("File Is Safe :)");
            //     }
            // }

            // catch(NullPointerException npe){
            //     System.out.println("File is Safe :)");
            // }
        }

        // System.out.println(response.statusCode());

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

    public static void createLog(){

    }
}
