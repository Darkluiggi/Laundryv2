/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.ArticleRequest;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author leons
 */
public class DAOArticleRequest extends GenericDAO<ArticleRequest>{
     private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LoginJPAPU");
     
      public DAOArticleRequest(EntityManagerFactory factory) {
        super(factory);
    }
     public DAOArticleRequest() {
        super(Persistence.createEntityManagerFactory("LoginJPAPU"));
    }
     
//      public List<String> findIds() {
//        
//        List list = new ArrayList();
//        EntityManager em = Provider();
//        Query q = em.createQuery("SELECT DISTINCT u.id FROM Request u");
//        try {
//            
//            list = q.getResultList();
//        } catch (Exception e) {
//        } finally {
//            em.close();
//            return list;
//        }
//    }
      public List<ArticleRequest> findByIDs(int id) {
        
        List list = new ArrayList();
        EntityManager em = Provider();
        Query q = em.createQuery("SELECT u FROM ArticleRequest u " 
                + "WHERE u.request.id = :id ")
                .setParameter("id", id);
        try {
            list = q.getResultList();
        } catch (Exception e) {
        } finally {
            em.close();
            return list;
        }
    }
    }
     

