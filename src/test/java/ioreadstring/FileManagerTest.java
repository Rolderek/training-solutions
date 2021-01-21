package ioreadstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    //ez a sor is másolás, mert nem tudtam eddig hogy hogy is kell
    private FileManager fm = new FileManager("C:\\training-solutions\\training-solution\\name.txt");

    @Test
    void createClassTest() {
        assertEquals("name.txt", fm.getPath().getFileName().toString());
        assertEquals(0, fm.getHumans().size());
    }

    @Test
    void readFromFilesTest() {
        fm.readFromFile();
        assertEquals(6, fm.getHumans().size());
        assertEquals("Banka", fm.getHumans().get(5).getFirstName());
        assertEquals("Búbos", fm.getHumans().get(5).getLastName());
        assertEquals("Mikorka", fm.getHumans().get(3).getLastName());
    }
}