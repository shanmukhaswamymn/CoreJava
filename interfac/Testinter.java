package com.xworkz.interfac;

public class Testinter {

	public static void main(String[] args) {
		
		WalletDTO wallet=new WalletDTO();
		WalletDTO wallet1=new WalletDTO();
		WalletDTO wallet2=new WalletDTO();
		wallet.setName("paytm");
		wallet.setCurrentbalance((byte)32);
		wallet.setNooftransaction((byte)10);
		wallet.setMaximumlimit(1545522222);
		

	wallet1.setName("googlepay");
	wallet1.setCurrentbalance((byte)45);
	wallet1.setNooftransaction((byte)12);
	wallet1.setMaximumlimit(1625522222);
	
	wallet2.setName("phnpay");
	wallet2.setCurrentbalance((byte)75);
	wallet2.setNooftransaction((byte)13);
	wallet2.setMaximumlimit(1725522222);
	
	
	Walletimplent impliment = new Walletimplent();
	impliment.createwallet(wallet);
	impliment.createwallet(wallet1);
	impliment.createwallet(wallet2);
	impliment.printAll();
	System.out.println();
	byte res=(byte) impliment.getcurrentbalance("phnpay");
	System.out.println("current balance in phonePE wallet \t"+res);
	System.out.println();
	float response=impliment.addmoney(5000, "paytm");
	System.out.println("total balance after credit \t"+response);
	System.out.println();
	float res1=impliment.pay(5200.5f, "googlepay");
	System.out.println("total balance after debit \t"+res1);
	System.out.println();
	byte res2=impliment.remainingtransaction( "paytm");
	System.out.println("remaining transactions today \t"+res2 );
	System.out.println();
//	byte res3 =impliment.getTotalTodaysTransaction();
//	System.out.println("total today transactions \t"+res3);
//	System.out.println();
//	double res4=impliment.totalAmountTransaction();
//	System.out.println("total amount transaction done today \t"+res4);
//	
 byte res3 = impliment.todaytotaltransaction("googlepay");
 System.out.println("toaday total transaction \t" +res3);
	}	

}
