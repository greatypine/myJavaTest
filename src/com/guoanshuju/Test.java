package com.guoanshuju;

import java.util.Date;


public class Test {
	public static void main(String[] args) {
		
		IdcardInfoExtractor idcardInfo=new IdcardInfoExtractor("11010519491231002X");
		System.out.println("��������:"+idcardInfo.getYear()+"-"+idcardInfo.getMonth()+"-"+idcardInfo.getDay());
		System.out.println("�Ա�:"+idcardInfo.getGender());
		System.out.println("����:"+idcardInfo.getAge());
		System.out.println("ʡ��:"+idcardInfo.getProvince());
		
	}
}
