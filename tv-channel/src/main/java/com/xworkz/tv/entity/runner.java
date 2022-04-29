package com.xworkz.tv.entity;

public class runner {

	public static void main(String[] args) {
	
		TVchennel ch =new TVchennel();
		TvChannelDAOImpl channel =new TvChannelDAOImpl();
		
		ch.setChannelId(6);
		ch.setLanguage("Kannnada");
		ch.setPrice(666.6);
		ch.setFree(true);
		
		channel.saveChannel(ch);
		System.out.println("Saved Successfully");

	}

}
