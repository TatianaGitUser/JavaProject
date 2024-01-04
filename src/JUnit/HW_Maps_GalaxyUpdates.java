//package JUnit;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
//import java.util.HashMap;
//import java.util.Map;
//
//class GalaxySystem {
//    private Map<String, Long> planetPopulationMap;
//
//    public GalaxySystem() {
//        this.planetPopulationMap = new HashMap<>();
//    }
//
//    public void addPlanet(String planetName, long population) {
//        planetPopulationMap.put(planetName, population);
//        System.out.println("New planet has been created, master");
//    }
//
//    public void removePlanet(String planetName) {
//        planetPopulationMap.remove(planetName);
//        System.out.println("One of your planets has been destroyed, master");
//    }
//
//    public void updatePlanetPopulation(String planetName, long newPopulation) {
//        planetPopulationMap.put(planetName, newPopulation);
//        System.out.println("One of your planet's population has been updated, master");
//    }
//
//    public Map<String, Long> getPlanetPopulationMap() {
//        return planetPopulationMap;
//    }
//}
//
//class MainTest {
//    @Test
//    public void testAddPlanet() {
//        GalaxySystem galaxySystem = new GalaxySystem();
//
//        // Create an expected map with the planets and populations
//        Map<String, Long> expectedMap = new HashMap<>();
//        expectedMap.put("Pluto", 384855930L);
//        expectedMap.put("AlphaCentaura", 854638920485L);
//        expectedMap.put("Zebulon", 9484737384L);
//
//        // Add a new planet
//        galaxySystem.addPlanet("Pluto", 384855930L);
//        galaxySystem.addPlanet("AlphaCentaura", 854638920485L);
//        galaxySystem.addPlanet("Zebulon", 9484737384L);
//
//        // Get the actual planet population map
//        Map<String, Long> actualMap = galaxySystem.getPlanetPopulationMap();
//
//        // Compare the actual and expected maps
//        assertEquals(expectedMap, actualMap);
//    }
//    @Test
//    public void testRemovePlanet() {
//        GalaxySystem galaxySystem = new GalaxySystem();
//
//        // Create an expected map with the planets and populations
//        Map<String, Long> expectedMap = new HashMap<>();
//        expectedMap.put("Pluto", 384855930L);
//        expectedMap.put("AlphaCentaura", 854638920485L);
//
//
//        galaxySystem.addPlanet("Pluto", 384855930L);
//        galaxySystem.addPlanet("AlphaCentaura", 854638920485L);
//        galaxySystem.addPlanet("Zebulon", 9484737384L);
//        galaxySystem.removePlanet("Zebulon");
//        // Get the actual planet population map
//        Map<String, Long> actualMap = galaxySystem.getPlanetPopulationMap();
//
//        // Compare the actual and expected maps
//        assertEquals(expectedMap, actualMap);
//    }
//    @Test
//    public void testUpdatePlanetPopulation() {
//        GalaxySystem galaxySystem = new GalaxySystem();
//
//        // Create an expected map with the planets and populations
//        Map<String, Long> expectedMap = new HashMap<>();
//        expectedMap.put("Pluto", 384855930L);
//        expectedMap.put("AlphaCentaura", 854638920485L);
//        expectedMap.put("Zebulon", 84893929L);
//
//        // Add a new planet
//        galaxySystem.addPlanet("Pluto", 384855930L);
//        galaxySystem.addPlanet("AlphaCentaura", 854638920485L);
//        galaxySystem.addPlanet("Zebulon", 9484737384L);
//        galaxySystem.updatePlanetPopulation("Zebulon", 84893929L);
//        // Get the actual planet population map
//        Map<String, Long> actualMap = galaxySystem.getPlanetPopulationMap();
//
//        // Compare the actual and expected maps
//        assertEquals(expectedMap, actualMap);
//    }
//}