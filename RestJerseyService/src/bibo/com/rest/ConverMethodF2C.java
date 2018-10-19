package bibo.com.rest;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/F2Capi")
public class ConverMethodF2C {

	@GET
	@Produces("application/json")
	public Response converF2C() throws JSONException{
		
		JSONObject jsonObj = new JSONObject();
		
		Double f = 100.0;
		Double c;
		
		c = (f-32)*5/9;
		
		jsonObj.put("F temp", f);
		jsonObj.put("c temp", c);
		
		
		return Response.status(200).entity(jsonObj.toString()).build();

		
	}
	
	 @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") Double f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double c;
		c =  (f - 32)*5/9; 
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", c);

		return Response.status(200).entity(jsonObject.toString()).build();
	  }
	
}
