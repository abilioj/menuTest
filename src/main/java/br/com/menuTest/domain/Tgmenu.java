package br.com.menuTest.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author AJF
 */
@Entity
public class Tgmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmenu;
    
    @Basic(optional = false)
    @Column(name = "ativo")
    private int ativo;
    
    @Basic(optional = false)   
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "class")
    private String class1;
    
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkmenu")
    private List<Tgmenu> tgmenuList;
    
    @JoinColumn(name = "fkmenu", referencedColumnName = "idmenu", nullable = false)
    @ManyToOne(optional = false)
    private Tgmenu fkmenu;
    
    @JoinColumn(name = "rotas", referencedColumnName = "idrota", nullable = false)
    @ManyToOne
    private Tgrotas rotas;
    
    @Transient
    private List<Gugmenugrupos> gugmenugruposList;

    public Tgmenu() {
    }

    public Tgmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public Tgmenu(Integer idmenu, int ativo, String descricao) {
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

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getclass() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

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
        return "entity.Tgmenu[ idmenu=" + idmenu + ", ativo="+ativo+", descricao='"+descricao+"', class1='"+class1+"', rotas="+rotas+" ]";
    }
    
}
