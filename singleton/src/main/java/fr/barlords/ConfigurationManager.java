package fr.barlords;

public class ConfigurationManager {


    static private int nbInstance = 0; // don't remove, it's used for test

    public ConfigurationManager() {
        nbInstance++; // don't remove, it's used for test
    }

    static public ConfigurationManager getInstance() {
        return new ConfigurationManager();
    }

    // don't remove, it's used for test
    public int getNbInstance() {
        return nbInstance;
    }

}
