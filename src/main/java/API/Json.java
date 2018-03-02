package API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Json {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getDemonym() {
		return demonym;
	}
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public String getNumericCode() {
		return numericCode;
	}
	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}
	public String[] getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String[] getTimezones() {
		return timezones;
	}
	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}
	public String[] getBorders() {
		return borders;
	}
	public void setBorders(String[] borders) {
		this.borders = borders;
	}
	/**
	 * @return the currencies
	 */
	public currencies[] getCurrencies() {
		return currencies;
	}
	/**
	 * @param currencies the currencies to set
	 */
	public void setCurrencies(currencies[] currencies) {
		this.currencies = currencies;
	}
	private String name,capital,region,population,demonym,area,nativeName,numericCode;
	private String[]altSpellings= new String [100];
	private String[]timezones= new String [50];
	private String[]borders= new String [50];
	private currencies[]currencies= new currencies[50];

}
