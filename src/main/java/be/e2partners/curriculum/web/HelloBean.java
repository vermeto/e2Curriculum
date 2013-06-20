package be.e2partners.curriculum.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class HelloBean {

	public String getMessage() {
		return "This is a bean message";
	}

}
