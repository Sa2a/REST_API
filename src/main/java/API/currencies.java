package API;

public class currencies {

	public String getCode() {
		return code;
	}

	public void setCode(String codex) {
		this.code = codex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	private String code,name,symbol;
}
