/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.helloworld.ejb;

import com.dmr.helloworld.jpaentity.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author fgaurat
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "HelloWorldPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    
    public Users findByLoginPassword(String login,String password){
        Query q = getEntityManager().createQuery("select u from Users u where u.login= :login and u.password = :password");
        q.setParameter("login", login);
        q.setParameter("password", password);
        return (Users)q.getSingleResult();
    }
    
}
