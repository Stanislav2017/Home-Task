package com.mykheikin.WorkWithXmlJson.YahooFinanceXML;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "results")
public class Results {

	private List<Rate> rates;

	public Results() {
	}

	public Results(List<Rate> rates) {
		this.rates = rates;
	}

	public List<Rate> getRates() {
		return rates;
	}

	@XmlElement(name = "rate")
	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return "Results [rates=" + rates + "]";
	}
}
