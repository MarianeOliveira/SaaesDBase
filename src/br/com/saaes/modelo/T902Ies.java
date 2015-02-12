package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t902_ies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T902Ies.findAll", query = "SELECT t FROM T902Ies t")})
public class T902Ies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "nm_fantasia")
    private String nmFantasia;
    @Size(max = 20)
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "dt_inc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInc;
    @Column(name = "dt_fim")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFim;
    @Size(max = 8)
    @Column(name = "cd_usu_reg")
    private String cdUsuReg;

    public T902Ies() {
    }

    public T902Ies(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNmFantasia() {
        return nmFantasia;
    }

    public void setNmFantasia(String nmFantasia) {
        this.nmFantasia = nmFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDtInc() {
        return dtInc;
    }

    public void setDtInc(Date dtInc) {
        this.dtInc = dtInc;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getCdUsuReg() {
        return cdUsuReg;
    }

    public void setCdUsuReg(String cdUsuReg) {
        this.cdUsuReg = cdUsuReg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T902Ies)) {
            return false;
        }
        T902Ies other = (T902Ies) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T902Ies[ id=" + id + " ]";
    }
    
}
