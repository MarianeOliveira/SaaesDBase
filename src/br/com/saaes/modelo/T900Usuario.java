package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t900_usuario")
@NamedQueries({
    @NamedQuery(name = T900Usuario.BUSCA_TUDO, query = "SELECT t FROM T900Usuario t"),
    @NamedQuery(name = T900Usuario.BUSCA_NOME, query = "SELECT t FROM T900Usuario t WHERE t.nome = ?1")
})
public class T900Usuario implements Serializable {
    
    public static final String BUSCA_TUDO = "T900Usuario.findAll";
    public static final String BUSCA_NOME = "T900Usuario.findNome";
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nome")
    private String nome;

    @Size(min = 1, max = 20)
    @Column(name = "cpf_cnpj")

    private String cpfCnpj;
    @Column(name = "dt_inc")

    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInc;
    
    @Column(name = "dt_fim")
    @Temporal(TemporalType.DATE)
    private Date dtFim;
    
   
    @Column(name = "cd_usu_reg")
    private String cdUsuReg;
   
    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "senha")
    private String senha;

    public T900Usuario() {
    }
    
    
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
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

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final T900Usuario other = (T900Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
}
