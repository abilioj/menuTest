package br.com.menuTest.dto.menu;

import java.io.Serializable;

public class Badge implements Serializable {
	private static final long serialVersionUID = 1L;

    private String text;
    private String Class;

    public String getText() {
        return text;
    }

//    public Icon getIcon() {
//        return icon;
//    }
//
//    public void setIcon(Icon icon) {
//        this.icon = icon;
//    }

    public void setText(String text) {
        this.text = text;
    }

    public String getclass() {
        return Class;
    }

    public void setclass(String Class) {
        this.Class = Class;
    }
}
