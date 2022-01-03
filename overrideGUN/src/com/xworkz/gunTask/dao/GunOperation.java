package com.xworkz.gunTask.dao;

import com.xworkz.gunTask.dto.GunDetailsDTO;
import com.xworkz.gunTask.dto.Types;

public class GunOperation {
	
	GunDetailsDTO[] operation = new GunDetailsDTO[4];
	int index=0;
	
	public String save(GunDetailsDTO names) {
	if(index<operation.length) {
		operation[index]=names;
		index++;
	  return "value inserted";
	}
	return "value not inserted";
	}
	
	public void printAll() {
		for (int index = 0; index < operation.length; index++) {
			System.out.println(operation[index]);
			
		}
	}
	
	public GunDetailsDTO[] getAllByTypes(Types type) {
		GunDetailsDTO[] detail = new GunDetailsDTO[operation.length];
		int j=0;
		for (int index = 0; index < operation.length; index++) {
			if(operation[index]!=null) {
			if(type.equals(operation[index].getTypes())) {
				detail[j]= operation[index];
				j++;
			}
			}
			
		}
		return detail;
	}
	
	public GunDetailsDTO[] getByBarrelmaterial(String barrelMaterial) {
		GunDetailsDTO[] detail1 = new GunDetailsDTO[operation.length];
		int k=0;
		for (int index = 0; index < operation.length; index++) {
			if(operation[index]!=null) {
			if(barrelMaterial.equals(operation[index].getBarrelMaterial())) {
				detail1[k]=operation[index];
				k++;
			}
			}
			
		}
		return detail1;
	}
	
	public GunDetailsDTO updateComponentByGunName(String component,String gunName) {
		for (int index = 0; index < operation.length; index++) {
			if(gunName.equals(operation[index].getGunName())) {
				operation[index].getBullet().setComponent(component);
				return operation[index];
			}
			
		}
		return null;
	}
	
	public GunDetailsDTO updateLocationByGunName(String gunName,String location) {
		for (int index = 0; index < operation.length; index++) {
			if(gunName.equals(operation[index].getGunName())) {
				operation[index].getCompany().setLocation(location);
				return operation[index];
			}
			
		}
		return null;
	}
	public GunDetailsDTO[] getAllByScope(byte scope) {
		GunDetailsDTO[] scop = new GunDetailsDTO[operation.length];
		int s=0;
		for (int index = 0; index < scop.length; index++) {
			if(scope == (operation[index].getScope())) {
				operation[index].setScope(scope);
				scop[s]= operation[index];
				s++;
			}
			
		}
		return scop;
		
	}
	public GunDetailsDTO deleteByName(String gunName) {
		for (int index = 0; index < operation.length; index++) {
			if(operation[index]!=null) {
			if(gunName.equals(operation[index].getGunName())) {
				operation[index]=null;
			}
			}
			
		}
		return null;
	}

}
