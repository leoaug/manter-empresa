package br.com.bb.amb.tecnotour.util;





import javax.el.MethodExpression;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;



/**
* <h1>Util class that show a susscess , warning and error messages to the view</h1>
* @author  Leonardo Silva
* @version 1.0
* @since   2015-11-29
*/
public class FacesUtil {

	
	public static void showMessageSuccess(String sumario,String detalhe) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				sumario, detalhe);
		context.addMessage("info", message);
	}

	public static void showMessageSuccessFlash(String sumario,String detalhe) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				sumario, detalhe);
		context.addMessage("info", message);		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
	}
	
	public static void showMessageSuccessDetail(String mensagem) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"", mensagem);
		context.addMessage("info", message);
	}


	public static void showMessageWarning(String mensagem) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN,
				"Aviso!", mensagem);
		context.addMessage("warn", message);
	}

	public static void showMessageError(String mensagem) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Erro", mensagem);
		context.addMessage("error", message);

	}
	public static void showMessageErrorDetail(String menssage) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
				menssage, menssage);
		context.addMessage("error", message);

	}
	public static void showMessageErrorFlash(String menssage) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
				menssage, menssage);
		context.addMessage("error", message);
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);

	}
	public static HttpServletRequest getRequest() throws Exception {
		
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	
	}
	
	public static MethodExpression createMethodExpression(String expression, Class<?> returnType, Class<?>... parameterTypes) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
                
        return facesContext.getApplication().getExpressionFactory().createMethodExpression(
            facesContext.getELContext(), expression, returnType, parameterTypes);
    }
	
	public static UIComponent findComponent(UIComponent root , String id) {
		if(root.getId().equals(id)){
	        return root;
	    }
	    if(root.getChildCount() > 0){
	        for(UIComponent subUiComponent : root.getChildren()){
	                UIComponent returnComponent = findComponent(subUiComponent, id);
	                if(returnComponent != null){
	                    return returnComponent;
	            }
	        }
	    }
	    return null;
		
	}
	
	public static String findComponent2(String id) {
		//UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		//UIComponent component = viewRoot.findComponent(id);
		UIComponent finalId =	findComponent(FacesContext.getCurrentInstance().getViewRoot(),id);
		
		return finalId.getClientId();
		
	}
}

