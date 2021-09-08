package br.com.menuTest.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author AJF
 */
@Entity
public class Tgrotas implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idrota;
    @Column(length = 255)
    private String href;
    @Basic(optional = false)
    @Column(nullable = false)
    private int rota;
    @JsonIgnore
    @OneToMany(mappedBy = "rotas")
    private List<Tgmenu> tgmenuList;

    public Tgrotas() {
    }

    public Tgrotas(Integer idrota) {
        this.idrota = idrota;
    }

    public Integer getIdrota() {
        return idrota;
    }

    public void setIdrota(Integer idrota) {
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

//    @XmlTransient
    public List<Tgmenu> getTgmenuList() {
        return tgmenuList;
    }

    public void setTgmenuList(List<Tgmenu> tgmenuList) {
        this.tgmenuList = tgmenuList;
    }
    
    public Tgrotas getObjeto(Tgrotas obj) {
		return obj;
    	
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrota != null ? idrota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Tgrotas)) {
            return false;
        }
        Tgrotas other = (Tgrotas) object;
        if ((this.idrota == null && other.idrota != null) || (this.idrota != null && !this.idrota.equals(other.idrota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgrotas[ idrota=" + idrota + " ]";
    }

}
