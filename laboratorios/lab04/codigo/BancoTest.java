import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class BancoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BancoTest
{
    /**
     * Default constructor for test class BancoTest
     */
    public BancoTest()
    {
    }
    
    @Test
    public void TestSimular(){
        Queue<String> c1 = new LinkedList<String>();
        Queue<String> c2 = new LinkedList<String>();
        Queue<String> c3 = new LinkedList<String>();
        Queue<String> c4 = new LinkedList<String>();
        Queue<String> c5 = new LinkedList<String>();
        Queue<String> c6 = new LinkedList<String>();
        Queue<String> c7 = new LinkedList<String>();
        Queue<String> c8 = new LinkedList<String>();
        
        c1.add("Luis");
        c1.add("Carlos");
        c1.add("Erika");
        c1.add("Laura");
        
        c2.add("Camila");
        c2.add("Lucia");
        c2.add("Alejandro");
        
        c3.add("Camilo");
        c3.add("Lorena");
        c3.add("Jose");
        c3.add("Juan");
        
        c4.add(null);
        
        c5.add("Jessica");
        c5.add("Luz");
        c5.add("Paula");
        c5.add("Jean");
        c5.add("Sneyder");
        c5.add("Dayana");
        c5.add("Lesly");
        
        c6.add("Catalina");
        c6.add("Geraldin");
        c6.add("Julian");
        
        c7.add("Diana");
        c7.add("Juliana");
        c7.add("Ana");
        c7.add("Margarita");
        c7.add("Adelmo");
        
        c8.add("Victor");
        
        System.out.println("PRUEBA 1: ");
        Banco.simular(c1, c2, c3, c4);
        
        System.out.println("\nPRUEBA 2: ");
        Banco.simular(c5, c6, c7, c8);
    }
}
