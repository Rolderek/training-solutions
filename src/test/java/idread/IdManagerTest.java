package idread;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class IdManagerTest {

    @Test
    public void testReadIdsFromFile() {
        IdManager idm = new IdManager("idnumbers.txt");

        assertEquals ("[AC987456, DC654789, ED123654, SE753357]", idm.readIdsFromFile(idm.getFile()).toString());
    }

}