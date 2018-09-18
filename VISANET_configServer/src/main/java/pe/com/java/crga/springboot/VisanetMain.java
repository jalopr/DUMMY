package pe.com.java.crga.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer; 

/**
 * VisanetMain
 * @author cguerra
 **/
 @EnableConfigServer       //Para: 'CONFIG-SERVER'  
 @EnableDiscoveryClient    //Para 'EUREKA' (CLIENTE).
 @SpringBootApplication
 public class VisanetMain{
	
		public static void main( String[] argumentos ){
			   SpringApplication.run( VisanetMain.class, argumentos ); 
		}	
 
 }
