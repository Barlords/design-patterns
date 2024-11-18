package fr.barlords;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationManagerTest {

    @Test
    void should_be_same_instance() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();
        assertSame(instance1, instance2, "Les instances doivent être identiques.");
    }

    @Test
    void should_have_only_one_instance() {
        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();
        assertEquals(1, manager2.getNbInstance(), "Il ne dois y avoir qu'une seul occurence de l'instance");
    }

    @Test
    void should_not_possible_to_access_constructor() throws NoSuchMethodException {
        // Récupérer le constructeur
        Constructor<ConfigurationManager> constructor = ConfigurationManager.class.getDeclaredConstructor();

        // Vérifier que le constructeur est privé
        assertTrue(!constructor.canAccess(null), "Nous ne devons pas avoir accès au constructeur en dehors du singleton");

    }
}
