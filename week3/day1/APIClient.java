package week3.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint:" +endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("Status of the API:" +endpoint+ ","+requestBody+ ","+requestStatus);
	}
	public static void main(String[] args) {
		
		APIClient api=new APIClient();
		
		api.sendRequest("HTTPresponse"," HTTPrequest", true);
		api.sendRequest("HTTPEnd");

	}

}
