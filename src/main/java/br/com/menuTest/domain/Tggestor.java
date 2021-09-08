package br.com.menuTest.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author AJF
 */
@Entity
public class Tggestor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idgestor;
    @Column(length = 255)
    private String bairro;
    @Column(length = 255)
    private String cidade;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String cnpj;
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
    private String inscestadual;
    @Column(length = 255)
    private String inscmunicipal;
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
    @ManyToMany(mappedBy = "tggestorList")
    private List<Gugusuarios> gugusuariosList;
    @OneToMany(mappedBy = "idgestor")
    private List<Tgunidade> tgunidadeList;

    public Tggestor() {
    }

    public Tggestor(Integer idgestor) {
        this.idgestor = idgestor;
    }

    public Tggestor(Integer idgestor, String cnpj, Date dtfinal, Date dtinicial, String fantasia, String nome) {
        this.idgestor = idgestor;
        this.cnpj = cnpj;
        this.dtfinal = dtfinal;
        this.dtinicial = dtinicial;
        this.fantasia = fantasia;
        this.nome = nome;
    }

    public Integer getIdgestor() {
        return idgestor;
    }

    public void setIdgestor(Integer idgestor) {
        this.idgestor = idgestor;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public List<Gugusuarios> getGugusuariosList() {
        return gugusuariosList;
    }

    public void setGugusuariosList(List<Gugusuarios> gugusuariosList) {
        this.gugusuariosList = gugusuariosList;
    }

    public List<Tgunidade> getTgunidadeList() {
        return tgunidadeList;
    }

    public void setTgunidadeList(List<Tgunidade> tgunidadeList) {
        this.tgunidadeList = tgunidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgestor != null ? idgestor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tggestor)) {
            return false;
        }
        Tggestor other = (Tggestor) object;
        if ((this.idgestor == null && other.idgestor != null) || (this.idgestor != null && !this.idgestor.equals(other.idgestor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tggestor[ idgestor=" + idgestor + " ]";
    }

}
