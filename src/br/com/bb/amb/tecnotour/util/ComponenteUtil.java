package br.com.bb.amb.tecnotour.util;



import java.util.Arrays;
import java.util.List;

import org.primefaces.context.RequestContext;


public class ComponenteUtil {

	
	/**
	 * 
	 * @param idComponente do arquivo COMPONENTESeuComponente.xhtml para poder esconder
	 * @throws Exception
	 */
	public static void esconderComponenteRetirandoEspaco(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("showHideComponente('none','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}	
			
	}
	
	/**
	 * 
	 * @param idComponente do arquivo COMPONENTESeuComponente.xhtml para poder habilitar
	 * @throws Exception
	 */
	public static void habilitarComponente(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("habilitarDesabilitarComponente('enabled','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/*
	public static void habilitarComReadyOnlyComponente(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("readOnlyComponente('false','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public static void desabilitarComReadyOnlyComponente(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("readOnlyComponente('true','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	*/
	/**
	 * 
	 * @param idComponente do arquivo COMPONENTESeuComponente.xhtml para poder habilitar
	 * @throws Exception
	 */
	public static void desabilitarComponente(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("habilitarDesabilitarComponente('disabled','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	  /**
	 * 
	 * @param idComponente do arquivo COMPONENTESeuComponente.xhtml para poder esconder
	 * @throws Exception
	 */
	public static void esconderComponenteMantendoEspaco(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("showHideComponente2('hidden','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}	
			
	}
	
	/**
	 * 
	 * @param idComponente do arquivo COMPONENTESeuComponente.xhtml para poder mostrar
	 * @throws Exception
	 */
	public static void mostrarComponenteMantendoEspaco(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("showHideComponente2('visible','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	
	/**
	 * 
	 * @param idComponente do arquivo COMPONENTESeuComponente.xhtml para poder mostrar
	 * @throws Exception
	 */
	public static void mostrarComponenteRetirandoEspaco(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().execute("showHideComponente('block','"+idComponente+"')");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void recarregar(String idComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().update(idComponente);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void recarregar(List<String> idsComponente) throws Exception {
		try {
			RequestContext.getCurrentInstance().update(idsComponente);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}


	/**
	 * 
	 * @param widgertVar do dialog
	 * @throws Exception
	 */
	public static void mostrarDialog(String widgertVar) throws Exception {
		RequestContext.getCurrentInstance().execute("PF('"+widgertVar+"').show()");
	}
	
	/**
	 * 
	 * @param widgertVar do dialog
	 * @throws Exception
	 */
	public static void esconderDialog(String widgertVar) throws Exception {
		RequestContext.getCurrentInstance().execute("PF('"+widgertVar+"').hide()");
	}
	
	public static List <String> adicionarIdsParaRecarregar(String... ids) {	
		return Arrays.asList(ids);	
	}


	public static void criarCSSClass(String classsNomes, String style) {
		RequestContext.getCurrentInstance().execute("createCSSSelector('"+ classsNomes +"', '"+style+"');");
		
	}


	public static void executarJavaScript(String javaScript) {
		RequestContext.getCurrentInstance().execute(javaScript);
		
	}
}
