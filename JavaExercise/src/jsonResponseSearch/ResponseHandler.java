package jsonResponseSearch;
import java.util.Scanner;
public class ResponseHandler {
	
	restAPIResponse data;
	
	public ResponseHandler(restAPIResponse resp){
		data = resp;
	}
	
	public void performSearch(){

		System.out.println("Enter state (abbr) or State name to search.. type 'exit' to complete search");
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext() == true ) {
			String abbr = sc.next();
			
			if(abbr.equalsIgnoreCase("exit")){
				System.exit(0);
			}
			
			onestateblock stateCity = getonestateblock(abbr);
			
			if(stateCity == null){
				System.out.println("Requested state does not exists..");
			}else{
				printonestateblock(stateCity);
			}
				
			System.out.println("\n Enter state (abbr)  or state name  to search.. type 'exit' to complete search");
		}
		sc.close();
	}
	
	private onestateblock getonestateblock(String abbr){
		
		onestateblock resp = null;
		
		for(onestateblock st : data.getRestResponse().getResult()){
			if(st.getAbbr().equalsIgnoreCase(abbr) || st.getName().equalsIgnoreCase(abbr))  {
				resp = st;
			}
		}
		return resp;
	}
	
	private void printonestateblock(onestateblock st){
		System.out.println("Response..... from the Rest API is  \n\n State : "+st.getName() +
							"\n Largest city :"+st.getLargest_city() +
							"\n Capital :"+st.getCapital());
	}
}
