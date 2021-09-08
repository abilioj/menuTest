/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
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
public class Tgcep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer cep;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean ativo;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String bairro;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String logradouro;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String uf;
    @JoinColumn(name = "idtgibgemunicipio", referencedColumnName = "idtgibgemunicipio", nullable = false)
    @ManyToOne(optional = false)
    private Tgibgemunicipio idtgibgemunicipio;
    @JoinColumn(name = "idtipolog", referencedColumnName = "idtipolog", nullable = false)
    @ManyToOne(optional = false)
    private Tgtipologradouro idtipolog;
    @OneToMany(mappedBy = "idcep")
    private List<Recpaciente> recpacienteList;

    public Tgcep() {
    }

    public Tgcep(Integer cep) {
        this.cep = cep;
    }

    public Tgcep(Integer cep, boolean ativo, String bairro, String logradouro, String uf) {
        this.cep = cep;
        this.ativo = ativo;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Tgibgemunicipio getIdtgibgemunicipio() {
        return idtgibgemunicipio;
    }

    public void setIdtgibgemunicipio(Tgibgemunicipio idtgibgemunicipio) {
        this.idtgibgemunicipio = idtgibgemunicipio;
    }

    public Tgtipologradouro getIdtipolog() {
        return idtipolog;
    }

    public void setIdtipolog(Tgtipologradouro idtipolog) {
        this.idtipolog = idtipolog;
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
        hash += (cep != null ? cep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgcep)) {
            return false;
        }
        Tgcep other = (Tgcep) object;
        if ((this.cep == null && other.cep != null) || (this.cep != null && !this.cep.equals(other.cep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgcep[ cep=" + cep + " ]";
    }

}
