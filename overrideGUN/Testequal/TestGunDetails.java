package com.xworkz.guntask;

import com.xworkz.gunTask.dao.GunOperation;
import com.xworkz.gunTask.dto.BulletDTO;
import com.xworkz.gunTask.dto.CompanyDTO;
import com.xworkz.gunTask.dto.GunDetailsDTO;
import com.xworkz.gunTask.dto.Types;

public class TestGunDetails {
	public static void main(String[] args) {
		
		
		GunDetailsDTO dto = new GunDetailsDTO();
		dto.setBarrelMaterial("bronze");
		dto.setGunName("M416");
		dto.setPrice(45000);
		dto.setScope((byte)6);
		dto.setRange(588.65f);
		dto.setTypes(Types.ASSAULT_RIFELS);
		
		GunDetailsDTO dto1 = new GunDetailsDTO();
		dto1.setBarrelMaterial("gun metal");
		dto1.setGunName("AKM");
		dto1.setPrice(35000);
		dto1.setScope((byte)6);
		dto1.setRange(288.65f);
		dto1.setTypes(Types.ASSAULT_RIFELS);
		
		GunDetailsDTO dto2 = new GunDetailsDTO();
		dto2.setBarrelMaterial("bronze");
		dto2.setGunName("MK14");
		dto2.setPrice(85000);
		dto2.setScope((byte)8);
		dto2.setRange(888.65f);
		dto2.setTypes(Types.DMRS);
		
		GunDetailsDTO dto3 = new GunDetailsDTO();
		dto3.setBarrelMaterial("gunMetal");
		dto3.setGunName("AWM");
		dto3.setPrice(95000);
		dto3.setScope((byte)8);
		dto3.setRange(1000.65f);
		dto3.setTypes(Types.BOLTACTION_RIFELS);
		
		BulletDTO bullet = new BulletDTO();
		bullet.setComponent("nitrate_powder");
		bullet.setGrams(3.56f);
		bullet.setMm(5.56);
		
		BulletDTO bullet1 = new BulletDTO();
		bullet1.setComponent("nitrate_powder");
		bullet1.setGrams(2.56f);
		bullet1.setMm(3.56);
		
		BulletDTO bullet2 = new BulletDTO();
		bullet2.setComponent("nitrate_powder");
		bullet2.setGrams(5.56f);
		bullet2.setMm(7.56);
		
		BulletDTO bullet3 = new BulletDTO();
		bullet3.setComponent("phosporous nitrate");
		bullet3.setGrams(7.56f);
		bullet3.setMm(12.56);
		
		CompanyDTO company = new CompanyDTO();
		company.setFounder("johnLee");
		company.setName("bhargav arms");
		company.setLocation("jammu kashmir");
		company.setContact(96896343211);
		
		CompanyDTO company1 = new CompanyDTO();
		company1.setFounder("edward");
		company1.setName("NS corp");
		company1.setLocation("ukraine");
		company1.setContact(6362568972l);
		
		CompanyDTO company2 = new CompanyDTO();
		company2.setFounder("Lesner");
		company2.setName("GS corp");
		company2.setLocation("zimbabai");
		company2.setContact(8595628915l);
		
		CompanyDTO company3 = new CompanyDTO();
		company3.setFounder("bookler");
		company3.setName("janson's");
		company3.setLocation("srilanka");
		company3.setContact(8239451478l);
		
		dto.setBullet(bullet);
		dto.setCompany(company);
		
		dto1.setBullet(bullet1);
		dto1.setCompany(company1);
		
		dto2.setBullet(bullet2);
		dto2.setCompany(company2);
		
		dto3.setBullet(bullet3);
		dto3.setCompany(company3);
		
		GunOperation operations =new GunOperation();
		operations.save(dto);
		operations.save(dto1);
		operations.save(dto2);
		operations.save(dto3);
		operations.printAll();
		System.out.println();
		System.out.println("get by types--");
		GunDetailsDTO[] res=operations.getAllByTypes(Types.ASSAULT_RIFELS);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
			
		}
		System.out.println();
		System.out.println("get by barrelmaterial--");
		GunDetailsDTO[] response=operations.getByBarrelmaterial("bronze");
		for (int h = 0; h < response.length; h++) {
			System.out.println(response[h]);
			
		}
		System.out.println();
		System.out.println("update component by name------");
		GunDetailsDTO upd =operations.updateComponentByGunName("phosporous nitrate", "AKM");
		System.out.println(upd.toString());
		System.out.println();
		System.out.println("update location by name-----");
		GunDetailsDTO upd1 =operations.updateLocationByGunName("MK14", "Abudabi");
		System.out.println(upd1.toString());
		System.out.println();
		System.out.println("get by scope---");
		
		GunDetailsDTO[] get1=operations.getAllByScope((byte)8);
		for (int k = 0; k < get1.length; k++) {
			System.out.println(get1[k]);
			
		}
		System.out.println();
		GunDetailsDTO del =operations.deleteByName("AKM");
		System.out.println(del);
		System.out.println();
		operations.printAll();
		
		
	}

}
