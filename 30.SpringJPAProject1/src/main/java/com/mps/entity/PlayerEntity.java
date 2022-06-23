package com.mps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="PLAYERS")
public class PlayerEntity {

	@Id
	@Column(name="PLAYER_ID")
	private Integer playerid;
	@Column(name="PLAYER_NAME")
	private String playerName;
	@Column(name="PLAYER_AGE")
	private Integer playerAge;
	@Column(name="PLAYER_GENDER")
	private String playerGender;
	@Column(name="PLAYER_CITY")
	private String playerCity;
	
}
