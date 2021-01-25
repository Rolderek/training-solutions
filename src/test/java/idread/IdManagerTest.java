package idread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdManagerTest {

    @Test
    public void testReadIdsFromFile() {
        IdManager idm = new IdManager("idnumbers.txt");

        assertEquals ("[AC987456, DC654789, ED123654, SE753357]", idm.readIdsFromFile(idm.getFile()).toString());
    }

}