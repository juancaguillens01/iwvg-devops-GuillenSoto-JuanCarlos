package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(3, 4));
        user = new User("123", "John", "Doe", fractions);
    }

    @Test
    void testUser() {
        assertEquals("123", user.getId());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getFamilyName());
        assertEquals(2, user.getFractions().size());
    }

    @Test
    void testUserConstructorWithParameters() {
        assertEquals("123", user.getId());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getFamilyName());
        List<Fraction> fractions = user.getFractions();
        assertEquals(2, fractions.size());
        assertEquals(new Fraction(1, 2), fractions.get(0));
        assertEquals(new Fraction(3, 4), fractions.get(1));
    }

    @Test
    void testGetId() {
        assertEquals("123", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("John", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Jane");
        assertEquals("Jane", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Doe");
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        List<Fraction> fractions = user.getFractions();
        assertEquals(2, fractions.size());
        assertEquals(new Fraction(1, 2), fractions.get(0));
        assertEquals(new Fraction(3, 4), fractions.get(1));
    }

    @Test
    void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(5, 6));
        user.setFractions(newFractions);
        List<Fraction> fractions = user.getFractions();
        assertEquals(1, fractions.size());
        assertEquals(new Fraction(5, 6), fractions.get(0));
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction(5, 6));
        List<Fraction> fractions = user.getFractions();
        assertEquals(3, fractions.size());
        assertEquals(new Fraction(5, 6), fractions.get(2));
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", user.fullName());
    }

    @Test
    void testGetInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testToString() {
        String expectedToString = "User{id='123', name='John', familyName='Doe', fractions=[1/2, 3/4]}";
        assertEquals(expectedToString, user.toString());
    }
}
