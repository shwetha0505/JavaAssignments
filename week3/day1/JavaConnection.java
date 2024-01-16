package week3.day1;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		
		System.out.println("The connection is established");
	}

	@Override
	public void disconnect() {

System.out.println("Connection disconnected");
		
	}

	@Override
	public void executeUpdate() {

System.out.println("Java connects with Database");

		
	}
	public static void main(String[] args) {
		
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.executeUpdate();
		jc.disconnect();
	}

}
