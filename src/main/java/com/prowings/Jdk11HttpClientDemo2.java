package com.prowings;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class Jdk11HttpClientDemo2 {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {

		

		//Lets prepare the HttpRequest
		
		HttpRequest postReq = HttpRequest.newBuilder()
				.uri(new URI("http://localhost:8080/Student_REST_API_using_Spring_MVC/students"))
				.header("Content-type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString("{\"name\":\"xxxx\",\"address\":\"zzz\"}"))
				.build();
		
		HttpClient client = HttpClient.newBuilder()
				.build();
		
		//HttpResponse<String> response = client.send(postReq, BodyHandler.ofString());
		HttpResponse<String> response = client.send(postReq, BodyHandlers.ofString());
		
		System.out.println(response.body());
		System.out.println(response.statusCode());
		System.out.println("git test");
	}

}
