package com.xworkz.interfac;

import java.util.Objects;

public class WalletDTO {

	private String name;
	private byte nooftransaction;
	private int maximumlimit;
	private byte currentbalance;
	private int getAvailableBalance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getNooftransaction() {
		return nooftransaction;
	}

	public void setNooftransaction(byte nooftransaction) {
		this.nooftransaction = nooftransaction;
	}

	public int getMaximumlimit() {
		return maximumlimit;
	}

	public void setMaximumlimit(int maximumlimit) {
		this.maximumlimit = maximumlimit;
	}

	public byte getCurrentbalance() {
		return currentbalance;
	}

	public void setCurrentbalance(byte currentbalance) {
		this.currentbalance = currentbalance;
	}

	public int getGetAvailableBalance() {
		return getAvailableBalance;
	}

	public void setGetAvailableBalance(int getAvailableBalance) {
		this.getAvailableBalance = getAvailableBalance;
	}

	@Override
	public String toString() {
		return "WalletDTO [name=" + name + ", nooftransaction=" + nooftransaction + ", maximumlimit=" + maximumlimit
				+ ", currentbalance=" + currentbalance + ", getAvailableBalance=" + getAvailableBalance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentbalance, getAvailableBalance, maximumlimit, name, nooftransaction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WalletDTO)) {
			return false;
		}
		WalletDTO other = (WalletDTO) obj;
		return currentbalance == other.currentbalance && getAvailableBalance == other.getAvailableBalance
				&& maximumlimit == other.maximumlimit && Objects.equals(name, other.name)
				&& nooftransaction == other.nooftransaction;
	}

}
