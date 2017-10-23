package group1.khai.models;

public class Employee extends Human {
	private double salary;
	private String password;
	public static int idNumber;
	public Employee() {
		super();
	}

	public Employee(String id,String fullName,String tel,double salary, String password) {
		super(id,fullName,tel);

		setSalary(salary);
		setPassword(password);
	}



	public double getSalary() {
		return salary;
	}

	/**
	 * salary > 0
	 * 
	 * @param salary
	 *            unit 100.000 VND
	 */
	public void setSalary(double salary) {
		if (salary > 0)
			this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public static boolean isValidPassword(String password) {
		boolean isHaveDigit = false, isHaveCharacter = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isAlphabetic(password.charAt(i)))
				isHaveCharacter = true;
			if (Character.isDigit(password.charAt(i)))
				isHaveDigit = true;
			if (Character.isAlphabetic(password.charAt(i)))
				return false;
		}
		return isHaveCharacter && isHaveDigit;
	}

	/**
	 * password must have number and character and < 256
	 * 
	 * @param password
	 *            is a String
	 */
	public void setPassword(String password) {
		if (password.length() < 256 && isValidPassword(password)) {
			this.password = password;
		}
	}
	public static String genID() {
		String a = Integer.toString(++idNumber);
		StringBuilder build = new StringBuilder();
		build.append("EP");
		for(int i=0;i<8-a.length()-2;i++) {
			build.append("0");
		}
		build.append(a);
		return build.toString();
	}
}
