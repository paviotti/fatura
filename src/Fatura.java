
public class Fatura {
	private Integer numerItem;
	private String descricao;
	private Integer quantidade;
	private Double precoItem;

	public Fatura() {
		numerItem = 1;
		descricao = "Prego 15x15";
		quantidade = 10;
		precoItem = 15.00;
	}

	public Fatura(Integer numerItem, String descricao, Integer quantidade, Double precoItem) {
		super();
		this.numerItem = numerItem;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoItem = precoItem;
	}

	public Integer getNumerItem() {
		return numerItem;
	}

	public void setNumerItem(Integer numerItem) {
		this.numerItem = numerItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}

	public Double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(Double precoItem) {
		if (precoItem < 0) {
			this.precoItem = 0.0;
		} else{
			this.precoItem = precoItem;
		}
	}

	public Double getValorFatura() {
		return this.quantidade * this.precoItem;
	}

}
