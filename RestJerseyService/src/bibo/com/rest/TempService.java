package bibo.com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/apiService")
public class TempService {

	@GET
	@Produces("application/xml")
	public String converMethod() {
		
		Double f ;
		Double c = 39.0;
		
		f = ((c * 9) / 5) + 32;
		
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + f;

		
		return "<apiService>" + "<celsius>" + c + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</apiService>";
		}
	
	
}
