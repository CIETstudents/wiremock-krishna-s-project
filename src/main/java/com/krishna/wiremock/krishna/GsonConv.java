/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.krishna.wiremock.krishna;

/**
 *
 * @author sony
 */
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
public class GsonConv extends HttpFetch{
    

    public static void main(String[] args) {
 
	DataObject obj = new DataObject();
	Gson gson = new Gson();
 
	// convert java object to JSON format,
	// and returned as JSON formatted string
	String json = gson.toJson(obj);
 
	try {
            try ( //write converted json data to a file named "fil.json"
                    FileWriter writer = new FileWriter("/fil.json")) {
                writer.write(json);
            }
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.println(json);
 
    }

    public GsonConv(String apiroot) {
        super(apiroot);
    }

}
