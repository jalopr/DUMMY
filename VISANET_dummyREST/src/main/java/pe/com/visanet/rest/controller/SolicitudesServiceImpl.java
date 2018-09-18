package pe.com.visanet.rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosRequestPOSTType;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosResponseDELETEType;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosResponseGETType;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosResponsePOSTType;

/**
 * SolicitudesServiceImpl
 * @author cguerra
 **/
 @Slf4j 
 @RestController
 @RequestMapping( "/visanet" )
 public class SolicitudesServiceImpl implements SolicitudesService{
 
	   /**
	    * getSolicitudesById
	    * @param  soliciId 	
	    * @return ParametrosResponseGETType
	    **/
		@GetMapping( value="/services/get/solicitudes/{soliciId}",   
                     produces=MediaType.APPLICATION_JSON_VALUE ) 
		public ParametrosResponseGETType getSolicitudesById( @PathVariable( "soliciId" ) String soliciId ) throws Exception{
			   log.info( "====================== INICIO: [getSolicitudesById] ======================" ); 
			   
			   ParametrosResponseGETType objResponse = null; 
			   
			   try{
				   objResponse = new ParametrosResponseGETType();
				   
				   log.info( "- soliciId: [" + soliciId + "]" );
			   }
			   catch( Exception e ){
				      log.error( "ERROR: " + e.getMessage() );
				      throw e;
			   }
			   finally{
				       log.info ( "====================== FIN: [getSolicitudesById] ======================" );
			   }
			   
			   return objResponse;				   
		}
 
	   /**
	    * registerSolicitud
	    * @param  objRequest 	
	    * @return ParametrosResponsePOSTType
	    **/
		@PostMapping( value="/services/post/solicitudes",  
                      produces=MediaType.APPLICATION_JSON_VALUE ) 
		public ParametrosResponsePOSTType registerSolicitud( @RequestBody ParametrosRequestPOSTType objRequest ) throws Exception{
			   log.info ( "====================== INICIO: [registerSolicitud] ======================" ); 
			   
			   ParametrosResponsePOSTType objResponse = null; 
			   
			   try{
				   objResponse = new ParametrosResponsePOSTType();
			   }
			   catch( Exception e ){
				      log.error( "ERROR: " + e.getMessage() );
				      throw e;
			   }
			   finally{
				       log.info ( "====================== FIN: [getSolicitudesById] ======================" );
			   }
			   
			   return objResponse;	
		}

	   /**
	    * deleteSolicitud
	    * @param  soliciId 	
	    * @return ParametrosResponseDELETEType 
	    **/
		@DeleteMapping( value="/services/delete/solicitudes/{soliciId}",   
                        produces=MediaType.APPLICATION_JSON_VALUE ) 
		//@RequestMapping( value = "/services/delete/{soliciId}", method = RequestMethod.DELETE )
		public ParametrosResponseDELETEType deleteSolicitud( @PathVariable( "soliciId" ) String soliciId ) throws Exception{
			   log.info ( "====================== INICIO: [deleteSolicitud] ======================" ); 
			   
			   ParametrosResponseDELETEType objResponse = null; 
			   
			   try{
				   objResponse = new ParametrosResponseDELETEType();
				   
				   log.info( "- soliciId: [" + soliciId + "]" );  
			   }
			   catch( Exception e ){
				      log.error( "ERROR: " + e.getMessage() );
				      throw e;
			   }
			   finally{
				       log.info ( "====================== FIN: [getSolicitudesById] ======================" );
			   }
			   
			   return objResponse;	
		}	 
		
 }

 