package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.CustomerEntity;

/**
 * Session Bean implementation class EmployeeEJB
 */
@Stateless
@LocalBean
public class CustomerEJB {

    @PersistenceContext
    private EntityManager twt;
    
    public CustomerEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNewCustomerEntity(CustomerEntity customerEntity){
    	System.out.println("-----adding tweet to database");
    	twt.persist(customerEntity);
 
    }
    
    public void test(){
    	System.out.println("it worked");
    
    }

}
