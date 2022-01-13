package com.xworkz.interfac;

public interface WalletDAO {

	String createwallet(WalletDTO dto);

	float getcurrentbalance(String name);

	float addmoney(float credit, String name);

	float pay(float debit, String name);

	void printAll();

	byte remainingtransaction( String name);

	byte todaytotaltransaction( String name);
}