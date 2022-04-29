package com.xworkz.tv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tv-channel")
public class TVchennel {
	

	@Id
	@Column(name="channel-id")
	private int channelId;
	@Column(name="channel_Name")
	private String language;
	@Column(name="cost")
	private double price;
	@Column(name="is_free")
	private boolean isFree;

}
