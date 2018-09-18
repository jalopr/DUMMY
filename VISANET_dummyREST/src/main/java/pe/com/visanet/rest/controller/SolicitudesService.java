package pe.com.visanet.rest.controller;
 
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosRequestPOSTType;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosResponseDELETEType;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosResponseGETType;
import pe.com.visanet.rest.ventas.generatesolicitude.ws.types.ParametrosResponsePOSTType;

/**
 * SolicitudesService
 * @author cguerra
 **/
 public interface SolicitudesService{
 
	    public ParametrosResponseGETType    getSolicitudesById( String soliciId ) throws Exception;
	    public ParametrosResponsePOSTType   registerSolicitud( ParametrosRequestPOSTType  objRequest ) throws Exception;   
	    public ParametrosResponseDELETEType deleteSolicitud( String soliciId ) throws Exception;
	    
 }

