package br.com.menuTest.dto.menu;

import java.io.Serializable;

public class Icon implements Serializable {
	private static final long serialVersionUID = 1L;

    private String element;
    private String Class;

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getclass() {
        return Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }
}
