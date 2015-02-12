package br.com.saesdb.util;

/**
 * Declara as constantes que serão usadas pelo Filtro de Seguran�a SSO.
 * 
 * Conforme http://wiki.bb.com.br/index.php/OpenAM, o servidor de produção é: <br/>
 * https://login.intranet.bb.com.br/distAuth/UI/Login
 *  
 * 
 * @author Ditec/Diges
 * @author F0411579
 * @author F8369006
 * @author Carlos Cariello <F1765038>
 * @version 1.1, 04/09/2012
 */
public class ConstantsSSO
{
        public static  final  String            USUARIO_OPENAM          = "usuario_openam";
        public static  final  String            USUARIO_DIRAO           = "usuario";
        public static  final  String            USUARIO_TESTADOR        = "usuario_testador";
	public static  final  String    	PROTOCOLO		= "http";
	public static  final  String            DOMINIO_LOGIN           = "esbsa038595gt02.df.intrabb.bb.com.br/saes/login.xhtml";
	public static  final  String            PORTA			= "80";
	public static  final  String            NOME_COOKIE_SSO         = "BBSSOToken";
	public static  final  String            NOME_COOKIE_ACR 	= "ssoacr";
	public static /*var*/ String            URL_LOGIN		= PROTOCOLO + "://" + DOMINIO_LOGIN;
	public static  final  String            SERVIDOR_SSO_PADRAO	= "esbsa038595gt02.df.intrabb.bb.com.br";

	private ConstantsSSO() {
		throw new AssertionError();
	}

}
