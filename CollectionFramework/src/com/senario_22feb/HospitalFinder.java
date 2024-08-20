package com.senario_22feb;

import java.util.ArrayList;
import java.util.List;

public class HospitalFinder {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("Surgery");
		lst.add("Bone Fracture");
		lst.add("Diabetics");
		Hospital yashoda =new Hospital(1, "Yashoda", "040-4561425", "Secunderabad",lst);
		Hospital gandhi =new Hospital(2, "Gandhi", "040-452145", "Secunderabad", lst);
		
		new HospitalService().addHospital(yashoda);
		new HospitalService().addHospital(gandhi);
	}

}
