/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco.entity.sessionbean;

import br.com.banco.entity.Alternativas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kellen
 */
@Stateless
public class AlternativasFacade extends AbstractFacade<Alternativas> {

    @PersistenceContext(unitName = "BancoDeQuestoesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlternativasFacade() {
        super(Alternativas.class);
    }
    
}
