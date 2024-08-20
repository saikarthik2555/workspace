package com.senario_22feb;

import java.util.ArrayList;

public class HospitalService {
	ArrayList<Hospital> ar1=new ArrayList<>();
	public int addHospital(Hospital yas){
		ar1.add(yas.getHospitalCode(), yas);	
		return ar1.size()+100;
	}
	public Hospital<HospitalCode,HospitalName> getHospital(){
		
		return 
	}
	
	public Hospital getHospitalDetails(int hospitalCode) {
		
		if(ar1.contains(hospitalCode)) {
			return 
		}
		return null;
	}
}
