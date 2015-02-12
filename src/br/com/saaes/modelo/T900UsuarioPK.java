package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author f4679646
 */
@Embeddable
public class T900UsuarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "cd_usu")
    private String cdUsu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tp_usu")
    private long idTpUsu;

    public T900UsuarioPK() {
    }

    public T900UsuarioPK(int id, String cdUsu, long idTpUsu) {
        this.id = id;
        this.cdUsu = cdUsu;
        this.idTpUsu = idTpUsu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCdUsu() {
        return cdUsu;
    }

    public void setCdUsu(String cdUsu) {
        this.cdUsu = cdUsu;
    }

    public long getIdTpUsu() {
        return idTpUsu;
    }

    public void setIdTpUsu(long idTpUsu) {
        this.idTpUsu = idTpUsu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (cdUsu != null ? cdUsu.hashCode() : 0);
        hash += (int) idTpUsu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T900UsuarioPK)) {
            return false;
        }
        T900UsuarioPK other = (T900UsuarioPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.cdUsu == null && other.cdUsu != null) || (this.cdUsu != null && !this.cdUsu.equals(other.cdUsu))) {
            return false;
        }
        if (this.idTpUsu != other.idTpUsu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T900UsuarioPK[ id=" + id + ", cdUsu=" + cdUsu + ", idTpUsu=" + idTpUsu + " ]";
    }
    
}
