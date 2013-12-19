/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

/**
 *
 * @author Felix
 */
public interface TestLocalHome extends EJBLocalHome {
    
    test.TestLocal create() throws CreateException;
}
