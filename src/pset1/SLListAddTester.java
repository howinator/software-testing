package pset1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SLListAddTester {
    @Test
    public void test0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);

        assertTrue(l.header != null);
        assertTrue(l.header.elem);
        assertTrue(l.header.next == null);
    }
    @Test
    public void test1() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        assertTrue(l.repOk());
        l.add(false);
        assertTrue(l.repOk());

        assertTrue(l.header != null);
        SLList.Node node = l.header;

        assertTrue(!node.elem);
        assertTrue(node.next != null);

        node = node.next;
        assertTrue(node.elem);
        assertTrue(node.next == null);
    }
}
