package br.com.saaes.autent;

import br.com.saaes.modelo.T900Usuario;
import br.com.saaes.dao.DAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.EntityManager;

public class Autenticacao {

    public T900Usuario validaT900Usuario(String nomeUsuario, String senha, EntityManager em) throws NoSuchAlgorithmException {
        String alg = "MD5";//"SHA"
        T900Usuario t900Usuario = (T900Usuario) DAO.getSingleResultFromFromNamedQuery(T900Usuario.BUSCA_USUARIO, T900Usuario.class, em, nomeUsuario);

        if (t900Usuario.getSenha().equals(criptografa(senha, alg))) {
            return t900Usuario;
        } else {
            return null;
        }
    }

    public static String criptografa(String plaintext, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest m = MessageDigest.getInstance(algorithm);
        m.reset();
        m.update(plaintext.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1, digest);
        String hashtext = bigInt.toString(16);
        // Now we need to zero pad it if you actually want the full 32 chars.
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        return hashtext;
    }
}
