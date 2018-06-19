package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
    @Test
    public void t0(){
        // 0 node linked list
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    @Test
    public void t1() {
        // 1 node valid linked list
        SLList l = new SLList();
        Node n = new Node();
        l.header = n;
        assertTrue(l.repOk());
    }

    @Test
    public void t2(){
       // 1 node invalid list
       SLList l = new SLList();
       Node n = new Node();
       n.next = n;
       l.header = n;
       assertFalse(l.repOk());
    }

    @Test
    public void t3() {
        // 2 node valid list
        SLList l = new SLList();
        Node n1 = new Node();
        Node n2 = new Node();
        n2.next = n1;
        l.header = n2;
    }

    @Test
    public void t4() {
        // 2 node invalid list
        SLList l = new SLList();
        Node n1 = new Node();
        Node n2 = new Node();

        n2.next = n1;
        n1.next = n2;
        l.header = n2;
        assertFalse(l.repOk());
    }
}
