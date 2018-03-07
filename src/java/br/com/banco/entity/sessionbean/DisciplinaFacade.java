/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco.entity.sessionbean;

import br.com.banco.entity.Disciplina;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kellen
 */
@Stateless
public class DisciplinaFacade extends AbstractFacade<Disciplina> {

    @PersistenceContext(unitName = "BancoDeQuestoesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DisciplinaFacade() {
        super(Disciplina.class);
    }
    
}
