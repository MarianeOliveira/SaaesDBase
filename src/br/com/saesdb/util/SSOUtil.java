package br.com.saesdb.util;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Centraliza as implementações das requisições <tt>Rest<tt> de integração com o
 * Sistema de Gerenciamento de Acessos Web.
 */
public class SSOUtil {

    private static final String IDENTIFICADOR_CHAVE_ATRIBUTO = "userdetails.attribute.name=";
    private static final String IDENTIFICADOR_VALOR_ATRIBUTO = "userdetails.attribute.value=";
    private String servidorSSO = ConstantsSSO.SERVIDOR_SSO_PADRAO;

    public String getCookieValue(Cookie[] cookies, String nomeCookie) {
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            if (cookie.getName().equalsIgnoreCase(nomeCookie)) {
                return (cookie.getValue().toString());
            }
        }
        return null;
    }

    public Cookie excluirCookie(Cookie[] cookies, String nomeCookie) {
        Cookie remove = null;
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equalsIgnoreCase(nomeCookie)) {
                    remove = cookies[i];
                    break;
                }
            }
            remove.setMaxAge(0);
        }
        return remove;
    }

    public Usuario setAttrUsuario(Usuario usuario, Map<String, String> map) {

        return usuario;
    }

    /**
     * Serve pra detectar eventuais problemas no OpenAm
     * @param map
     * @param key
     * @return
     */
    public String getMapValue(Map<String, String> map, String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Logger.getLogger(SSOUtil.class.getName()).log(Level.SEVERE, "{0}{1}\nMAP:{2}", new Object[]{String.format("SSOUtil: Chave não encontrada na resposta do autenticador [%s] - ", key), map.containsKey("chavefuncionario") ? "Matrícula: [" + map.get("chavefuncionario") + "]" : "Matricula não encontrada", map.toString()});
            return null;
        }
    }

    public static String getURL_LOGIN(HttpServletRequest httpServletRequest) {
        return ConstantsSSO.URL_LOGIN + httpServletRequest.getRequestURL();
    }

    public void setServidorSSO(String servidorSSO) {
        this.servidorSSO = servidorSSO;
    }

    public String getServidorSSO() {
        return servidorSSO;
    }

}
