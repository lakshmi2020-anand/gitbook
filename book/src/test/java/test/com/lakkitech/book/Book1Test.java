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
public class Book1Test {
    Book Book;
    
    public Book1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
           Book = new Book(); 
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBook() {
            
         Book.setId("A123");
         Book.setPrice("$20");
         Book.setRating("4.5");
         Book.setTitel("Toy Story");

         assertEquals("A123",Book.getId());
         assertEquals("$20",Book.getPrice());
         assertEquals("4.5",Book.getRating());
         assertEquals("Toy Story",Book.getTitel());
         
    }
}
