package br.com.menuTest.dto.menu;

import java.io.Serializable;

public class Modules implements Serializable {
	private static final long serialVersionUID = 1L;

    Boolean header = true;
    String title = "Modulos";
    Boolean hiddenOnCollapse = true;

    public Boolean getHeader() {
        return header;
    }

    public void setHeader(Boolean header) {
        this.header = header;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getHiddenOnCollapse() {
        return hiddenOnCollapse;
    }

    public void setHiddenOnCollapse(Boolean hiddenOnCollapse) {
        this.hiddenOnCollapse = hiddenOnCollapse;
    }
    
}
