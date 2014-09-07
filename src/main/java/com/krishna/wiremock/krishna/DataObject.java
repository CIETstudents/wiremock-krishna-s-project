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

import java.util.ArrayList;
import java.util.List;

public class DataObject {
    private final String current= "This is me Krishna";
	private final String updated = "hello";
        private final String version = "v2.0";
	private final List<String> list = new ArrayList<String>() {
        {
            add("current");
            add("updated");
            add("id");
        }
        };

                                            
       
	//getter and setter methods

    
	public String toString() {
            return "versions [status=" +current+", updated=" +updated+", id=" +version+", list=" +list+"]";
	}

}


