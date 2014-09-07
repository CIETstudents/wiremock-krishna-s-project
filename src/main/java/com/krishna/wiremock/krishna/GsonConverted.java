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

import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
 
public class GsonConverted extends HttpFetch{
    public static void main(String[] args) {
 
	Gson gson = new Gson();
 
	try {
 
		BufferedReader br = new BufferedReader(
			new FileReader("/fil.json"));
 
		//convert the json string back to object
		DataObject obj = gson.fromJson(br, DataObject.class);
 
		System.out.println(obj);
 
	} catch (FileNotFoundException e) {
	}
 
    }

    public GsonConverted(String apiroot) {
        super(apiroot);
    }
}
