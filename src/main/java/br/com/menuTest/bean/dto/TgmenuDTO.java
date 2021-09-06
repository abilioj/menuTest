package br.com.menuTest.bean.dto;

import java.io.Serializable;

public class TgmenuDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer idmenu;
	private short ativo;
	private String descricao;
	private String class1;
//	    private List<Tgmenu> tgmenuList;
//	    private Tgmenu fkmenu;
//	    private Tgrotas rotas;
//	    private List<Gugmenugrupos> gugmenugruposList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdmenu() {
		return idmenu;
	}

	public void setIdmenu(Integer idmenu) {
		this.idmenu = idmenu;
	}

	public short getAtivo() {
		return ativo;
	}

	public void setAtivo(short ativo) {
		this.ativo = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	/*
	 * public List<Tgmenu> getTgmenuList() { return tgmenuList; } public void
	 * setTgmenuList(List<Tgmenu> tgmenuList) { this.tgmenuList = tgmenuList; }
	 * 
	 * public Tgmenu getFkmenu() { return fkmenu; } public void setFkmenu(Tgmenu
	 * fkmenu) { this.fkmenu = fkmenu; }
	 * 
	 * public Tgrotas getRotas() { return rotas; } public void setRotas(Tgrotas
	 * rotas) { this.rotas = rotas; }
	 * 
	 * public List<Gugmenugrupos> getGugmenugruposList() { return gugmenugruposList;
	 * } public void setGugmenugruposList(List<Gugmenugrupos> gugmenugruposList) {
	 * this.gugmenugruposList = gugmenugruposList; }
	 */

}
