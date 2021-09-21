package getsetter;

public class Account {
//class variable define
	static String accountnumber;//자동 초기화, null => 
	static String accountname;//null => 
	static int initValue;//0 => 
	
	//생성자
	public Account(String accountnumber, String accountname, int initValue) { 
		this.accountnumber = accountnumber;
		this.accountname = accountname;
		this.initValue = initValue;
	}

	// getter & setter setting 
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public int getInitValue() {
		return initValue;
	}

	public void setInitValue(int initValue) {
		this.initValue = initValue;
	}

	

	
	
	
	
	


	//메소드 
	
	
	
	
	
}
