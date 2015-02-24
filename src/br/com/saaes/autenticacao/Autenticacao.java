package br.com.saaes.autenticacao;

import br.com.saaes.modelo.T900Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author F4679646
 */
public class Autenticacao {
    
    public T900Usuario validaT900Usuario(String nomeUsuario, String senha){
//        this.senhaUsuario = criptografa(senhaUsuario, "MD5");
//        this.senhaUsuario = criptografa(this.senhaUsuario, "SHA");
        
        T900Usuario t900Usuario = null;
        if ( nomeUsuario.equals("jean") && senha.equals("1234") ){
            t900Usuario = new T900Usuario();
            t900Usuario.setNome("Jean Fernandes");
        }
        return t900Usuario;
    }
        public String criptografa(String plaintext, String algorithm) throws NoSuchAlgorithmException {
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
