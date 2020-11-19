package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import application.Util;

@Named
@RequestScoped
public class RedirectController {

		public void toLogin(){
			Util.redirect("login.xhtml"); }
}