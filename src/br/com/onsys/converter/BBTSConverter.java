package br.com.onsys.converter;


import java.io.Serializable;
import java.lang.reflect.Field;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.Id;




@FacesConverter("bbtsConverter")
public class BBTSConverter <T extends Serializable> implements Converter {

	public Object getAsObject(FacesContext ctx, UIComponent component,
			String value) {
		if (value != null) {
			return component.getAttributes().get(value);
		}
		return null;
	}
	public String getAsString(FacesContext ctx, UIComponent component,
			Object obj) {
		if (obj != null && !"".equals(obj)) {
			String id;
			try {
								
				id = this.getId(obj.getClass(), obj);
				if (id == null){
					id = "";
				}
				id = id.trim();
				component.getAttributes().put(id,obj.getClass().cast(obj));
				return id;
			} catch (SecurityException e) {
				e.printStackTrace(); // seu log aqui
			} catch (IllegalArgumentException e) {
				e.printStackTrace(); // seu log aqui
			} catch (NoSuchFieldException e) {
				e.printStackTrace(); // seu log aqui
			} catch (IllegalAccessException e) {
				e.printStackTrace(); // seu log aqui
			}
		}
		return null;
	}

	public String getId(Class<?> clazz, Object obj) throws SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException {
		for (Field field : clazz.getDeclaredFields()) {
			if ((field.getAnnotation(Id.class)) != null) {
				Field privateField = clazz.getDeclaredField(field.getName());
				privateField.setAccessible(true);
				if (privateField.get(clazz.cast(obj)) != null) {
					return (String)field.getType()
							.cast(privateField.get(clazz.cast(obj))).toString();
				} else {
					return null;
				}
			}
		}
		return null;
	}
	
	
}
