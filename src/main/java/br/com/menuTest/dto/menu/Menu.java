package br.com.menuTest.dto.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

    private String href;
    private boolean header;
    Boolean hiddenOnCollapse;
    private String title;
    private Icon icon;
    private List<Menu> child;
    private Badge badge = null;
    private boolean hidden;
    private boolean disabled;
    
    public String getHref() {
		return href;
	}
    
	public void setHref(String href) {
		this.href = href;
	}

	public boolean isHeader() {
		return header;
	}

	public void setHeader(boolean header) {
		this.header = header;
	}

	public Boolean getHiddenOnCollapse() {
		return hiddenOnCollapse;
	}

	public void setHiddenOnCollapse(Boolean hiddenOnCollapse) {
		this.hiddenOnCollapse = hiddenOnCollapse;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public List<Menu> getChild() {
		return child;
	}

	public void setChild(List<Menu> child) {
		this.child = child;
	}

	public Badge getBadge() {
		return badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public void addChild(Menu child) {
        if (this.child == null) {
            this.child = new ArrayList<>();
        }
        this.child.add(child);
    }
  
}
