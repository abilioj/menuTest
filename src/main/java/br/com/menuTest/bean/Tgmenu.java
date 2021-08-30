/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AJF
 */
@Entity
@Table(catalog = "whosp", schema = "public")
/*
 * @XmlRootElement
 * 
 * @NamedQueries({
 * 
 * @NamedQuery(name = "Tgmenu.findAll", query = "SELECT t FROM Tgmenu t")
 * , @NamedQuery(name = "Tgmenu.findByIdmenu", query =
 * "SELECT t FROM Tgmenu t WHERE t.idmenu = :idmenu") , @NamedQuery(name =
 * "Tgmenu.findByAtivo", query =
 * "SELECT t FROM Tgmenu t WHERE t.ativo = :ativo") , @NamedQuery(name =
 * "Tgmenu.findByClass1", query =
 * "SELECT t FROM Tgmenu t WHERE t.class1 = :class1") , @NamedQuery(name =
 * "Tgmenu.findByDescricao", query =
 * "SELECT t FROM Tgmenu t WHERE t.descricao = :descricao")})
 */
public class Tgmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idmenu;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private short ativo;
    
    @Column(name = "class", length = 255)
    private String class1;
    
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String descricao;
    @OneToMany(mappedBy = "fkmenu")
    private List<Tgmenu> tgmenuList;
    
    @JoinColumn(name = "fkmenu", referencedColumnName = "idmenu")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tgmenu fkmenu;
    
    @OneToMany(mappedBy = "fkmenu", fetch = FetchType.LAZY)
    private List<Tgmenu> children = new ArrayList<>();
    
    @JoinColumn(name = "rotas", referencedColumnName = "idrota")
    @ManyToOne
    private Tgrotas rotas;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMenu")
    private List<Gugmenugrupos> gugmenugruposList;

    public Tgmenu() {
    }

    public Tgmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public Tgmenu(Integer idmenu, short ativo, String descricao) {
        this.idmenu = idmenu;
        this.ativo = ativo;
        this.descricao = descricao;
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

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Tgmenu> getTgmenuList() {
        return tgmenuList;
    }

    public void setTgmenuList(List<Tgmenu> tgmenuList) {
        this.tgmenuList = tgmenuList;
    }

    public Tgmenu getFkmenu() {
        return fkmenu;
    }

    public void setFkmenu(Tgmenu fkmenu) {
        this.fkmenu = fkmenu;
    }

    public Tgrotas getRotas() {
        return rotas;
    }

    public void setRotas(Tgrotas rotas) {
        this.rotas = rotas;
    }

    @XmlTransient
    public List<Gugmenugrupos> getGugmenugruposList() {
        return gugmenugruposList;
    }

    public void setGugmenugruposList(List<Gugmenugrupos> gugmenugruposList) {
        this.gugmenugruposList = gugmenugruposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgmenu)) {
            return false;
        }
        Tgmenu other = (Tgmenu) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgmenu[ idmenu=" + idmenu + " ]";
    }

}
