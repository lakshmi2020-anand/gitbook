/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.lakkitech.book;

import com.lakkitech.book.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toola
 */
public class BookTest {
    Book Book; 
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
      public void testBook() {
      
      Book.setId("a123");
      Book.setPrice("20$");
      Book.setRating("5");
      Book.setTitel("toystory");
      
        assertEquals("a123",Book.getId());
        assertEquals("20$",Book.getPrice());
        assertEquals("5",Book.getRating());
        assertEquals("toystory",Book.getTitel());
       
      
      }

}