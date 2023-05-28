import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    public void MultipleConditionMethod() {

        // if (user==null || user.getPassword()==null || user.getEmail()==null){
        RuntimeException isk;

        isk = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Sara", "sara1234", null), new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Vnesete informacii"));

        isk = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Stefan", null, "finki"), new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Vnesete informacii"));

        isk = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Natalija", null, null), new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Vnesete informacii"));

        isk = assertThrows(RuntimeException.class, () -> SILab2.function(null, new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Vnesete informacii"));
    }

    @Test
    public void EveryBranchMethod() {
        RuntimeException isk;

        //Dali posoti user so toa ime
        isk = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Sara", "sara123", null), new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Greska"));

        //dali postoi user i email
        isk = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Stefan", null, "finki.ukim@mail.com"), new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Greska"));

        // ako nema vneseno podatoci
        isk = assertThrows(RuntimeException.class, () -> SILab2.function(null, new LinkedList<User>()));
        assertTrue(isk.getMessage().contains("Greska"));

        //lozikata nema 8 karakteri
        assertFalse(SILab2.function(new User("Teo", "saraaaa", "finki.ukim@mail.com"), new LinkedList<User>()));

        //lozinkata prazno mesto i ima povekje od 8 karakteri
        assertFalse(SILab2.function(new User("Kristijan ", "sara123!", "finkiukim"), new LinkedList<User>()));

        // ne e vneseno ima na korisncik i lozinkata e so pomalku od 8 karkateri
        assertFalse(SILab2.function(new User(null, "a11", "finkiukim@mail.com"), new LinkedList<User>()));

        // userot go ima vo listata na user
        assertFalse(SILab2.function(new User("Elena", "12345678", "finkiukim@mail.mk"), List.of(new User("Elena", "12345678", "finki.ukim@mail.mk"), new User("unknown", "1233", "finki"))));
    }
}