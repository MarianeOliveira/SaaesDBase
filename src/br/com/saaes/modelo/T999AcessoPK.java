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
public class T999AcessoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "login")
    private String login;

    public T999AcessoPK() {
    }

    public T999AcessoPK(int id, String login) {
        this.id = id;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T999AcessoPK)) {
            return false;
        }
        T999AcessoPK other = (T999AcessoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T999AcessoPK[ id=" + id + ", login=" + login + " ]";
    }
    
}
