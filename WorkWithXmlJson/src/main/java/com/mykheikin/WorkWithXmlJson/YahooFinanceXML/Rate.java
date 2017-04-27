package com.mykheikin.WorkWithXmlJson.YahooFinanceXML;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rate")
public class Rate {

	private String id;
	private String name;
	private double rate;
	private String date;
	private String time;
	private double ask;
	private double bid;

	public Rate() {
	}

	public Rate(String id, String name, double rate, String date, String time, double ask, double bid) {
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.date = date;
		this.time = time;
		this.ask = ask;
		this.bid = bid;
	}

	public String getId() {
		return id;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	@XmlElement
	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getDate() {
		return date;
	}

	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	@XmlElement
	public void setTime(String time) {
		this.time = time;
	}

	public double getAsk() {
		return ask;
	}

	@XmlElement
	public void setAsk(double ask) {
		this.ask = ask;
	}

	public double getBid() {
		return bid;
	}

	@XmlElement
	public void setBid(double bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Rate [id=" + id + ", name=" + name + ", rate=" + rate + ", date=" + date + ", time=" + time + ", ask="
				+ ask + ", bid=" + bid + ", getId()=" + getId() + ", getName()=" + getName() + ", getRate()="
				+ getRate() + ", getDate()=" + getDate() + ", getTime()=" + getTime() + ", getAsk()=" + getAsk()
				+ ", getBid()=" + getBid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
