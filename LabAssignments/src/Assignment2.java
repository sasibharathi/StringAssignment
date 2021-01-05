
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "www.codegram.in/admin/reports/daywiseuser.php";
		String url2 = "www.codegram.in/guest/registration.php";
		String url3 = "www.codegram.in/about.php";
		String command=null;
		
		command = showCommand(url1);
		System.out.println("Command is : "+command);
		
		command = showCommand(url2);
		System.out.println("Command is : "+command);
		
		command = showCommand(url3);
		System.out.println("Command is : "+command);

	}
	private static String showCommand(String url1) {
		// TODO Write your code here
		String[] result=url1.split("/");
		String a=result[result.length-1];
		return a.split("[.]")[0];
		//return null;
	}

}
