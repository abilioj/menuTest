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
import javax.persistence.OneToMany;

/**
 *
 * @author AJF
 */
@Entity
public class Tgreligiao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idtgreligiao;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ididtgreligiao")
    private List<Recpaciente> recpacienteList;

    public Tgreligiao() {
    }

    public Tgreligiao(Integer idtgreligiao) {
        this.idtgreligiao = idtgreligiao;
    }

    public Tgreligiao(Integer idtgreligiao, String descricao) {
        this.idtgreligiao = idtgreligiao;
        this.descricao = descricao;
    }

    public Integer getIdtgreligiao() {
        return idtgreligiao;
    }

    public void setIdtgreligiao(Integer idtgreligiao) {
        this.idtgreligiao = idtgreligiao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtgreligiao != null ? idtgreligiao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgreligiao)) {
            return false;
        }
        Tgreligiao other = (Tgreligiao) object;
        if ((this.idtgreligiao == null && other.idtgreligiao != null) || (this.idtgreligiao != null && !this.idtgreligiao.equals(other.idtgreligiao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgreligiao[ idtgreligiao=" + idtgreligiao + " ]";
    }

}
