package com.xworkz.interfac;

public class Walletimplent implements WalletDAO {
	WalletDTO[] dtos = new WalletDTO[5];
	int index = 0;
	static byte count = 0;
	float total_transaction = 0;

	@Override
	public String createwallet(WalletDTO dto) {
		dtos[index] = dto;
		index++;
		return "account created";
	}

	@Override
	public float getcurrentbalance(String name) {
		for (int index= 0; index<dtos.length; index++) {
			if (dtos[index] != null) {
				if (name.equals(dtos[index].getName())) {
					return dtos[index].getCurrentbalance();
				}

			}

		}

		return 0;
	}

	@Override
	public float addmoney(float credit, String name) {
		float totalBalance;
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null) {
				if (name.equals(dtos[index].getName())) {
					totalBalance = dtos[index].getGetAvailableBalance() + credit;
					dtos[index].setGetAvailableBalance((int) totalBalance);
					count++;
					total_transaction = credit;
					return totalBalance;

				}
			}

		}
		return 0;
	}

	@Override
	public float pay(float debit, String name) {
		float totalAvailable;
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null) {
				if (name.equals(dtos[index].getName())) {
					totalAvailable = dtos[index].getGetAvailableBalance() - debit;
					dtos[index].setGetAvailableBalance((int) totalAvailable);
					count++;
					total_transaction = debit;
					return totalAvailable;
				}
			}

		}
		return 0;
	}

	@Override
	public byte remainingtransaction( String name) {
		byte remainTrans;
		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null) {
				if (name.equals(dtos[index].getName())) {
					remainTrans = (byte) (dtos[index].getNooftransaction() - count);
					return remainTrans;
				}
			}

		}
		return 0;
	}

//	@Override
//	public byte todaytotaltransaction(byte totaltrans, String name) {
//		byte remainTrans;
//		for (int index = 0; index < dtos.length; index++) {
//			if (dtos[index] != null) {
//				if (name.equals(dtos[index].getName())) {
//					remainTrans = (byte) (dtos[index].getNooftransaction() - count);
//					return remainTrans;
//				}
//			}
//
//		}
//		return 0;
//	}

	@Override
	public void printAll() {

		for (int index = 0; index < dtos.length; index++) {
			if (dtos[index] != null) {
				System.out.println(dtos[index].toString());
			}
		}

	}

//	public byte getTotalTodaysTransaction(String name) {
//		for (int index = 0; index < dtos.length; index++) {
//			if(name.equals(dtos[index].getName())) {
//				dtos[index].getNooftransaction();
//				return count;
//				
//			}
//		}
//		
//		return 0;
//	}

//	public double totalAmountTransaction() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public byte todaytotaltransaction(String name) {
		for (int index = 0; index < dtos.length; index++) {
			if(dtos[index]!=null) {
				if(name.equals(dtos[index].getName()));
				return count;
			}
			
		}
		
		return 0;
	}

	

}
