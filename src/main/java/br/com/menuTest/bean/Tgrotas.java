/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AJF
 */
@Entity
@Table(catalog = "whosp", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tgrotas.findAll", query = "SELECT t FROM Tgrotas t")
    , @NamedQuery(name = "Tgrotas.findByIdrota", query = "SELECT t FROM Tgrotas t WHERE t.idrota = :idrota")
    , @NamedQuery(name = "Tgrotas.findByHref", query = "SELECT t FROM Tgrotas t WHERE t.href = :href")
    , @NamedQuery(name = "Tgrotas.findByRota", query = "SELECT t FROM Tgrotas t WHERE t.rota = :rota")})
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
    @OneToMany(mappedBy = "rotas")
    private List<Tgmenu> tgmenuList;

    public Tgrotas() {
    }

    public Tgrotas(Integer idrota) {
        this.idrota = idrota;
    }

    public Tgrotas(Integer idrota, int rota) {
        this.idrota = idrota;
        this.rota = rota;
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

    @XmlTransient
    public List<Tgmenu> getTgmenuList() {
        return tgmenuList;
    }

    public void setTgmenuList(List<Tgmenu> tgmenuList) {
        this.tgmenuList = tgmenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrota != null ? idrota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
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
