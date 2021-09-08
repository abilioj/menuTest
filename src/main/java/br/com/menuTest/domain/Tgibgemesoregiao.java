/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author AJF
 */
@Entity
public class Tgibgemesoregiao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgibgemesoregiao;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cod;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtgibgemesoregiao")
    private List<Tgibgemacroregiao> tgibgemacroregiaoList;
    @JoinColumn(name = "idtgibgeuf", referencedColumnName = "idtgibgeuf", nullable = false)
    @ManyToOne(optional = false)
    private Tgibgeuf idtgibgeuf;

    public Tgibgemesoregiao() {
    }

    public Tgibgemesoregiao(Integer idtgibgemesoregiao) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
    }

    public Tgibgemesoregiao(Integer idtgibgemesoregiao, int cod, String nome) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
        this.cod = cod;
        this.nome = nome;
    }

    public Integer getIdtgibgemesoregiao() {
        return idtgibgemesoregiao;
    }

    public void setIdtgibgemesoregiao(Integer idtgibgemesoregiao) {
        this.idtgibgemesoregiao = idtgibgemesoregiao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tgibgemacroregiao> getTgibgemacroregiaoList() {
        return tgibgemacroregiaoList;
    }

    public void setTgibgemacroregiaoList(List<Tgibgemacroregiao> tgibgemacroregiaoList) {
        this.tgibgemacroregiaoList = tgibgemacroregiaoList;
    }

    public Tgibgeuf getIdtgibgeuf() {
        return idtgibgeuf;
    }

    public void setIdtgibgeuf(Tgibgeuf idtgibgeuf) {
        this.idtgibgeuf = idtgibgeuf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgibgemesoregiao != null ? idtgibgemesoregiao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgibgemesoregiao)) {
            return false;
        }
        Tgibgemesoregiao other = (Tgibgemesoregiao) object;
        if ((this.idtgibgemesoregiao == null && other.idtgibgemesoregiao != null) || (this.idtgibgemesoregiao != null && !this.idtgibgemesoregiao.equals(other.idtgibgemesoregiao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgibgemesoregiao[ idtgibgemesoregiao=" + idtgibgemesoregiao + " ]";
    }

}
