
package com.webshop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.webshop.controller.UserController;
/**
 * 
 * @author Petter Löfgren
 */
public class MainAction extends MappingDispatchAction {
    public ActionForward enterApp(ActionMapping actionMapping, 
                                ActionForm actionForm,
                                HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse){
        System.out.println("New connection!");
        
        return actionMapping.findForward("welcome_page");
    }
    
     public ActionForward placeItemInShoppingCart(ActionMapping actionMapping, 
                                ActionForm actionForm,
                                HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse){
//        UserController.addItemToShoppingCart(httpServletRequest.getAttribute("itemPK"));
//        
//        httpServletRequest.getSession().
        
        return actionMapping.findForward("welcome_page");
    }
}
