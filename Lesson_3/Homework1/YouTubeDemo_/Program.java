package YouTubeDemo_;

public class Program {

	public static void main(String[] args) {

	
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();

	}

}



