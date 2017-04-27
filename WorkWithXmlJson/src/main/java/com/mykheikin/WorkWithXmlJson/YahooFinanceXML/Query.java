package com.mykheikin.WorkWithXmlJson.YahooFinanceXML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "query")
public class Query {

	private String yahoo;
	private String count;
	private String created;
	private String lang;
	private Results results;

	public Query() {
	}

	public Query(String yahoo, String count, String created, String lang, Results results) {
		super();
		this.yahoo = yahoo;
		this.count = count;
		this.created = created;
		this.lang = lang;
		this.results = results;
	}

	public String getYahoo() {
		return yahoo;
	}

	@XmlElement
	public void setYahoo(String yahoo) {
		this.yahoo = yahoo;
	}

	public String getCount() {
		return count;
	}

	@XmlElement
	public void setCount(String count) {
		this.count = count;
	}

	public String getCreated() {
		return created;
	}

	@XmlElement
	public void setCreated(String created) {
		this.created = created;
	}

	public String getLang() {
		return lang;
	}

	@XmlElement
	public void setLang(String lang) {
		this.lang = lang;
	}

	public Results getResults() {
		return results;
	}

	@XmlElement(name = "results")
	public void setResults(Results results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Query [yahoo=" + yahoo + ", count=" + count + ", created=" + created + ", lang=" + lang + ", results="
				+ results + "]";
	}
}
