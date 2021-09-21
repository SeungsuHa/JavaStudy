package getsetter;

import java.util.Scanner;

/* 한국 소프트웨어 산업 은행이 있습니다.
 * 이 은행에 계좌를 개설하고, 예금 입금, 출금, 종료하는 프로그램을 작성 합니다.
 * 1.계좌생성 : 계좌번호, 계좌주인이름, 초기입금액  
 * 2.계좌목록(리스트) :  계좌번호, 계좌주인이름, 잔액  
 * 3.입금: 계좌번호, 입금액
 * 4.출금: 계좌번호, 출금액
 * 5.종료: 프로그램 종료
 *  
 */
public class BankAccount {
	private static Scanner sc = new Scanner(System.in);

	private static Account[] aArray = new Account[1000];

	public static void main(String[] args) {
		boolean running = true;

		while (running) {

			System.out.println("-------------------");
			System.out.println("----Menu Select---");
			System.out.println("1.계좌생성----------");
			System.out.println("2.계좌목록----------");
			System.out.println("3.입금-------------");
			System.out.println("4.출금-------------");
			System.out.println("5.프로그램 종료-------");
			System.out.println("-------------------");

			int selectNO = sc.nextInt();

			switch (selectNO) {
			case 1:
				CreateAccount();
				break;
			case 2:
				AccountList();
				break;
			case 3: Deposit(); break;
			case 4: withDraw(); break;
			// case 5: System.out.println("프로그램 종료.!!!");

			}
		}
	}

	
	


	// 1.account create
	private static void CreateAccount() {

		System.out.println("-----------------------");
		System.out.println("----Account Create-----");
		System.out.println("-----------------------");

		System.out.println("계좌번호 : ");
		String accountnumber = sc.next();

		System.out.println("계좌주인 : ");
		String accountname = sc.next();

		System.out.println("초기입금액 : ");
		int initValue = sc.nextInt();

		Account newAccount = new Account(accountnumber, accountname, initValue);

		for(int i=0; i < aArray.length; i++) {
			
			if(aArray[i] == null) {
				aArray[i] = newAccount;
				System.out.println("계좌를 생성했습니다.");
				break;
			}
		}
		
	}

	// 2.AccountList
	private static void AccountList() {
		System.out.println("-----------------------");
		System.out.println("----Account List-----");
		System.out.println("-----------------------");

		for (int i = 0; i < aArray.length; i++) {

			Account account = aArray[i];

			if (account != null) {
				System.out.println(account.getAccountnumber());
				System.out.println(account.getAccountname());
				System.out.println(account.getInitValue());
			}
		}
		
	}
		
	//3.Deposit
	private static void Deposit() {
		System.out.println("-----------------------");
		System.out.println("---- Deposit -----");
		System.out.println("-----------------------");
		System.out.println("계좌번호: ");
		String accountnumber = sc.next();
		System.out.println("입금액: ");
		int money = sc.nextInt();
		
		Account account = findAccount(accountnumber);
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			 return ;
		}
		
		account.setInitValue(account.getInitValue() + money); 
		System.out.println("입금액을 성공적으로 저축했습니다.");
		
	}


	private static Account findAccount(String accountnumber) {
		Account account  = null;
		
		for(int i=0; i < aArray.length; i++) {
			
			if(aArray[i] != null) {
				
				String DBacountnumber = aArray[i].getAccountnumber();
				
				if(DBacountnumber.equals(accountnumber)) {
					account = aArray[i];
					break;
				}				
			}
		}
			
		return account;
	}

	//4.
	private static void withDraw() {
		System.out.println("-----------------------");
		System.out.println("---- withDraw -----");
		System.out.println("-----------------------");
		System.out.println("계좌번호: ");
		String accountnumber = sc.next();
		System.out.println("출금액: ");
		int money = sc.nextInt();
	
		Account account = findAccount(accountnumber);
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			 return;
		}
		
		account.setInitValue(account.getInitValue() - money); 
		System.out.println("출금액을 성공적으로 찾았습니다.");
		
		
	}
	
	

}// class end
