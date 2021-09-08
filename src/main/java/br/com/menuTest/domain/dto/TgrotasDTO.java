package br.com.menuTest.domain.dto;

import java.io.Serializable;

public class TgrotasDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idrota;
    private String href;
    private int rota;
    
	public TgrotasDTO() {
		super();
	}

	public TgrotasDTO(int idrota, String href, int rota) {
		super();
		this.idrota = idrota;
		this.href = href;
		this.rota = rota;
	}

	public int getIdrota() {
		return idrota;
	}

	public void setIdrota(int idrota) {
		this.idrota = idrota;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public int getRota() {
		return rota;
	}

	public void setRota(int rota) {
		this.rota = rota;
	}

}
