package pe.com.java.crga.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * VisanetMain
 * @author cguerra(soaint)
 **/
 @EnableEurekaServer      //Para 'EUREKA' (SERVER).
 @SpringBootApplication
 public class VisanetMain{
	
		public static void main( String[] argumentos ){
			   SpringApplication.run( VisanetMain.class, argumentos ); 
		}	
 
 }
