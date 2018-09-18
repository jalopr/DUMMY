package pe.com.visanet.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource; 

/**
 * VisanetMain
 * @author cguerra(soaint)
 **/
 @EnableDiscoveryClient    //Para 'EUREKA' (CLIENTE) 
 @SpringBootApplication 
 @ImportResource( { "classpath:spring/camel-context.xml" } )
 public class VisanetMain{
	
		public static void main( String[] argumentos ){
			   SpringApplication.run( VisanetMain.class, argumentos ); 
		}	
 
 }
