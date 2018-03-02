/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.helloworld;

import com.dmr.helloworld.jpaentity.Projects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fgaurat
 */
@Stateless
public class ProjectsFacade extends AbstractFacade<Projects> {

    @PersistenceContext(unitName = "HelloWorldPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjectsFacade() {
        super(Projects.class);
    }
    
}
