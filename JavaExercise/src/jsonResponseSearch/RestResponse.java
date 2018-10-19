package jsonResponseSearch;

public class RestResponse {
	
	private String[] messages;
	
	public String[] getMessages() {
		return messages;
	}
	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	
	private onestateblock[] result;

	public onestateblock[] getResult() {
		return result;
	}
	public void setResult(onestateblock[] result) {
		this.result = result;
	}
	
}
