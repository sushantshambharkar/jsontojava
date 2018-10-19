package jsonResponseSearch;

import org.codehaus.jackson.map.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class allStates {

	public static void main(String[] args) 
	
	{

       // refer web http://www.mkyong.com/webservices/jax-rs/restful-java-client-with-jersey-client/
		
		Client client = Client.create();

		WebResource webResource = client.resource("http://services.groupkt.com/state/get/USA/all");

		System.out.println(webResource);
		
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		
		System.out.println(response);
		
		String output = response.getEntity(String.class);
		
		System.out.println(output);
		
		
		// refer web http://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/?utm_source=mkyong&utm_medium=author&utm_campaign=related-post&utm_content=1		
		
		ObjectMapper mapper = new ObjectMapper();
		output = output.replaceAll("RestResponse", "restResponse");
		
		try 
		{
		restAPIResponse resp = mapper.readValue(output,restAPIResponse.class);	
		//System.out.println(mapper.readValue(output,restAPIResponse.class));
		//System.out.println(resp.getRestResponse().getResult());
	    
		ResponseHandler a = new ResponseHandler (resp);
		
		a.performSearch();
		
		} catch (Exception e) 
		{ 
			e.printStackTrace();
		}
	
		
		
	}
	
}

	

		
