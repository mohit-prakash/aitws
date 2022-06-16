package com.mps;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		
		String url="http://localhost:9090/welcome";
		String uname="admin";
		String pwd="admin@123";
		String unamePwd=uname+":"+pwd;
		
		Encoder encoder = Base64.getEncoder();
		String encodedUnamePwd = encoder.encodeToString(unamePwd.getBytes());
		String authHeaderName="Authorization";
		String authHeaderValue="Basic "+encodedUnamePwd;
		
		HttpHeaders headers=new HttpHeaders();
		headers.add(authHeaderName,authHeaderValue);
		HttpEntity entity=new HttpEntity<>(headers);
		
		ResponseEntity<String> responseEntity = rt.exchange(url, HttpMethod.GET, entity, String.class);
		Integer statusCode=responseEntity.getStatusCodeValue();
		String body=responseEntity.getBody();
		
		System.out.println("Status Code: "+statusCode);
		System.out.println("Body: "+body);
	}

}
