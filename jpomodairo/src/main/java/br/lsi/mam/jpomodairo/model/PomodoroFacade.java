/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lsi.mam.jpomodairo.model;

import br.lsi.mam.jpomodairo.entities.PersistenceManager;
import br.lsi.mam.jpomodairo.entities.Pomodoro;
import javax.persistence.EntityManager;

/**
 *
 * @author marcioam
 */
public class PomodoroFacade   extends AbstractFacade<Pomodoro> {

    public PomodoroFacade(Class<Pomodoro> entityClass) {
        super(entityClass);
    }

    @Override
    protected EntityManager getEntityManager() {
                return PersistenceManager.INSTANCE.getEntityManager();
                
    }


}
