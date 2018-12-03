package com.udev.lightning.beans;

import java.time.LocalDate;

public class Message {
	private String from;
	private String to;
	private LocalDate date;
	private String message;
	
	public Message(String from, String to, LocalDate date, String message) {
		super();
		this.from = from;
		this.to = to;
		this.date = date;
		this.message = message;
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}