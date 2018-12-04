package com.udev.lightning.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String transmitter;
	
	@Column(nullable = false)
	private String receiver;
	
	@Column(nullable = false)
	private LocalDate date;
	
	@Column(nullable = false)
	private String messageContent;
	
	public Message(String from, String to, LocalDate date, String message) {
		super();
		this.transmitter = from;
		this.receiver = to;
		this.date = date;
		this.messageContent = message;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return transmitter;
	}
	public void setFrom(String from) {
		this.transmitter = from;
	}
	public String getTo() {
		return receiver;
	}
	public void setTo(String to) {
		this.receiver = to;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getMessage() {
		return messageContent;
	}
	public void setMessage(String message) {
		this.messageContent = message;
	}
	
	
}