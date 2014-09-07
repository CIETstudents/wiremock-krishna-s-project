package com.krishna.wiremock.krishna;

import static com.fasterxml.jackson.core.json.CoreVersion.instance;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.junit.WireMockClassRule;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.apache.http.client.HttpResponseException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

public class HttpFetchTest {
//    @Rule
//    public WireMockRule wireMockRule = new WireMockRule(9080);
//    private HttpFetch instance;
    
	@ClassRule
	public static WireMockClassRule wireMockRule = new WireMockClassRule(HttpFetch.PORT);
	@Rule
	public WireMockClassRule instanceRule = wireMockRule;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testhttpPost(){
        //instance = new HttpFetch(); 
//		String current = "Current File from Krishna Brucelee";
//                String updated = "07-09-2014";
//                String version = "v2.0"; 
		instanceRule.stubFor(get(urlEqualTo(HttpFetch.URL))
	            .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "application/json")
	                .withBody("\"versions [status=\" +current+\", updated=\" +updated+\", id=\" +version+\", list=\" +list+\"]\";")));
               HttpFetch fetchString = new HttpFetch("http://localhost/fil.json");
                //String actual = instance.httpPost("http://localhost:");
		String result = fetchString.httpPost();
		Assert.assertNotNull(result);
 
    instanceRule.stubFor(get(urlEqualTo("/hi.html"))
            .willReturn(aResponse()
                    .withStatus(500)
                    .withHeader("Content-Type", "text/plain")
                    .withBody("File Not Found")));
//    //instanceRule.stubFor(get(urlEqualTo("/h1.html")).willReturn(
    //aResponse().withStatus(500).withHeader("Content-Type", "text/plain").withBody("Krishna")));
    //    }
    //stubFor(get(urlEqualTo("/503.txt")).willReturn(
    //aResponse().withStatus(503).withHeader("Content-Type", "text/plain").withBody("hoge")));

    //stubFor(get(urlEqualTo("/")).willReturn(
    //aResponse().withStatus(200).withHeader("Content-Type", "application/json").withBodyFile("get.json")));
    }
    //@Test
    //public void ok() throws Exception {
    //String actual = instance.httpPost("http://localhost:9080/hi.html");
    //String expected = "hi";
    //assertThat(actual, is(expected));
    //}

  // @Test
//    public void httpPost_Notfound(){
//    String actual =instance.httpPost_Notfound("http://localhost:8083/hi.html");
//    String expected = "Krishna";
//    assertThat(actual, is(expected));
//    }
//    @Test(expected = HttpResponseException.class)
//    public void httpPost() throws Exception {
//    instance.httpPost_Notfound("http://localhost:8083/hi.html");
//    }
    //@Test(expected = HttpResponseException.class)
    //public void internalServerError() throws Exception {
    //instance.httpPost("http://localhost:9080/hi.html");

    //@Test(expected = HttpResponseException.class)
    //public void serviceUnavailable() throws Exception {
    //instance.httpPost("http://localhost:9080/503.txt");
    //}

    

    }
