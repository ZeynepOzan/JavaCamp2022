package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		//CustomerManagerda tanımladığımız değişkeni çalıştırmak istediğimiz Oracle a
		//Eşitledik. Bu şekilde oracle veri tabanını çalıştırdık.
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomer();
	}
}
