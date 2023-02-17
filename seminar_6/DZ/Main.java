public class Main{
	
	public static void main(String[] args){
		User user = new User("Bob");
		Report report = new Report();
		Persister saveUser = new Persister(user);
		report.report(user);
		saveUser.save();
	}
}