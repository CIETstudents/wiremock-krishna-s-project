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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpFetch {

	public static final int PORT = 8083;
	public static final String HOST = "http://localhost:";
	public static final String URL = "/fil.json";
        public static final String current = "Current File from Krishna Brucelee";
        public static final String updated = "07-09-2014";
        public static final String version = "v2.0";
//        private final String current= "This is me Krishna";
//	private final String updated = "hello";
  //      private final String version = "v2.0";
	private final List<String> list;
        private String root;
    public HttpFetch(String apiroot) {
        this.root = apiroot;
        this.list = new ArrayList<String>() {
            {
                add("Status");
                add("update");
                add("id");
            }
        }; 
                }
	public String httpPost() {
            //Url = "C:\\Users\\sony\\Documents\\NetBeansProjects\\Wiremock-Krishna\\src\\test\\resources\\__files\\fil.json"; 
		DefaultHttpClient httpClient = new DefaultHttpClient();
		try {
			HttpGet getRequest = new HttpGet(HOST+PORT+URL);
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);
                       // GsonConverted conv = new GsonConverted();
                        //Url = "";
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));

			StringBuffer out = new StringBuffer();
			String output;
			System.out.println("This is my new Wiremock-krishna sample file \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				out.append(output);
			}

			httpClient.getConnectionManager().shutdown();
			return out.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	
        }

  public String httpPost_Notfound(String httplocalhost18089hogetxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  } 
}
        