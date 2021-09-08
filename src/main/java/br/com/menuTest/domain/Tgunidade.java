/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.menuTest.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AJF
 */
@Entity
public class Tgunidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer idunidade;
    @Column(length = 255)
    private String bairro;
    @Column(length = 255)
    private String cidade;
    @Column(length = 255)
    private String cnes;
    @Column(length = 255)
    private String cnpjunidade;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfinal;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinicial;
    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String endereco;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String fantasia;
    @Column(length = 255)
    private String ibge;
    @Column(length = 255)
    private String inscestadual;
    @Column(length = 255)
    private String inscmunicipal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 19, scale = 2)
    private BigDecimal logo;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @Column(length = 255)
    private String pais;
    @Column(length = 255)
    private String telefone;
    @Column(length = 255)
    private String uf;
    @JoinColumn(name = "idgestor", referencedColumnName = "idgestor")
    @ManyToOne
    private Tggestor idgestor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Recpaciente> recpacienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Guggrupos> guggruposList;

    public Tgunidade() {
    }

    public Tgunidade(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public Tgunidade(Integer idunidade, Date dtfinal, Date dtinicial, String fantasia, String nome) {
        this.idunidade = idunidade;
        this.dtfinal = dtfinal;
        this.dtinicial = dtinicial;
        this.fantasia = fantasia;
        this.nome = nome;
    }

    public Integer getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCnes() {
        return cnes;
    }

    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    public String getCnpjunidade() {
        return cnpjunidade;
    }

    public void setCnpjunidade(String cnpjunidade) {
        this.cnpjunidade = cnpjunidade;
    }

    public Date getDtfinal() {
        return dtfinal;
    }

    public void setDtfinal(Date dtfinal) {
        this.dtfinal = dtfinal;
    }

    public Date getDtinicial() {
        return dtinicial;
    }

    public void setDtinicial(Date dtinicial) {
        this.dtinicial = dtinicial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getInscestadual() {
        return inscestadual;
    }

    public void setInscestadual(String inscestadual) {
        this.inscestadual = inscestadual;
    }

    public String getInscmunicipal() {
        return inscmunicipal;
    }

    public void setInscmunicipal(String inscmunicipal) {
        this.inscmunicipal = inscmunicipal;
    }

    public BigDecimal getLogo() {
        return logo;
    }

    public void setLogo(BigDecimal logo) {
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Tggestor getIdgestor() {
        return idgestor;
    }

    public void setIdgestor(Tggestor idgestor) {
        this.idgestor = idgestor;
    }

    @XmlTransient
    public List<Recpaciente> getRecpacienteList() {
        return recpacienteList;
    }

    public void setRecpacienteList(List<Recpaciente> recpacienteList) {
        this.recpacienteList = recpacienteList;
    }

    public List<Guggrupos> getGuggruposList() {
        return guggruposList;
    }

    public void setGuggruposList(List<Guggrupos> guggruposList) {
        this.guggruposList = guggruposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidade != null ? idunidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgunidade)) {
            return false;
        }
        Tgunidade other = (Tgunidade) object;
        if ((this.idunidade == null && other.idunidade != null) || (this.idunidade != null && !this.idunidade.equals(other.idunidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tgunidade[ idunidade=" + idunidade + " ]";
    }

}
