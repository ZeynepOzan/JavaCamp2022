package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomer() {

		//Hangi veri tabanı sistemini verirsek o veritabanı çalışacak
		databaseManager.getData();
	
	}
}
