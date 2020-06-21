package model;

import java.math.BigDecimal;

public class Venda {
	
	private Long operacao;
	private Long cliente;
	private Integer quantidadedeIngressos;
	private BigDecimal valorTotal;
	private String status;
	
	public Venda(Long operacao, Long cliente, Integer quantidadedeIngressos, BigDecimal valorTotal) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.quantidadedeIngressos = quantidadedeIngressos;
		this.valorTotal = valorTotal;
	}
	
	public Long getOperacao() {
		return operacao;
	}
	public void setOperacao(Long operacao) {
		this.operacao = operacao;
	}
	public Long getCliente() {
		return cliente;
	}
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	public Integer getQuantidadedeIngressos() {
		return quantidadedeIngressos;
	}
	public void setQuantidadedeIngressos(Integer quantidadedeIngressos) {
		this.quantidadedeIngressos = quantidadedeIngressos;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Venda [operacao=" + operacao + ", cliente=" + cliente + ", quantidadedeIngressos="
				+ quantidadedeIngressos + ", valorTotal=" + valorTotal + ", status=" + status + "]";
	}
	
	
	
	
}
