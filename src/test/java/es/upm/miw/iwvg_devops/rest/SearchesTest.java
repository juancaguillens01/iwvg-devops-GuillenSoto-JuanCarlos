package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SearchesTest {

    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Paula", "Antonio", "Paula"),
                new Searches().findUserNameBySomeImproperFraction()
                        .collect(Collectors.toList()));

    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        assertEquals(0, new Searches().findFractionMultiplicationByUserFamilyName("Torres").getNumerator());
        assertEquals(0, new Searches().findFractionMultiplicationByUserFamilyName("Torres").getDenominator());
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Torres", "Blanco", "Torres"),
                new Searches().findUserFamilyNameBySomeImproperFraction()
                        .collect(Collectors.toList()));
    }
}

