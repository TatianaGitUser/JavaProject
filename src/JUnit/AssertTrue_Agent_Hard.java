//package JUnit;
//
//public class AssertTrue_Agent_Hard {
//}
//import org.junit.jupiter.api.Test;
//        import static org.junit.jupiter.api.Assertions.assertTrue;
//        import static org.junit.jupiter.api.Assertions.assertFalse;
//
//        import java.util.ArrayList;
//        import java.util.List;
//
//class Weapon {
//    private final String name;
//    private final int requiredLevel;
//    private final double price;
//
//    public Weapon(String name, int requiredLevel, double price) {
//        this.name = name;
//        this.requiredLevel = requiredLevel;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRequiredLevel() {
//        return requiredLevel;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//class Agent {
//    private static int agentIdCounter = 1;
//
//    private final String agentId;
//    private double bank;
//    private boolean isBanned;
//    private boolean isDriving;
//    private int level;
//
//    public Agent(double initialBank, int initialLevel) {
//        this.agentId = "Agent" + agentIdCounter++;
//        this.bank = initialBank;
//        this.isBanned = false;
//        this.isDriving = false;
//        this.level = initialLevel;
//    }
//
//    public String getAgentId() {
//        return agentId;
//    }
//
//    public boolean canDrive() {
//        boolean result = !(isDriving && isBanned);
//        System.out.println(agentId + " canDrive() = " + result);
//        assertTrue(result);
//        return result;
//    }
//
//    public void levelUp() {
//        if (!isBanned) {
//            level++;
//            System.out.println(agentId + " levelUp() to level " + level);
//        } else {
//            System.out.println(agentId + " levelUp() failed: Agent is banned.");
//        }
//    }
//
//    public void ban() {
//        isBanned = true;
//        System.out.println(agentId + " ban()");
//    }
//
//    public void purchase(Weapon weapon) {
//        int requiredLevel = weapon.getRequiredLevel();
//        if (level >= requiredLevel) {
//            double cost = weapon.getPrice();
//            if (bank >= cost) {
//                bank -= cost;
//                System.out.println(agentId + " purchased " + weapon.getName() + " for " + cost + " units.");
//            } else {
//                System.out.println(agentId + " purchase of " + weapon.getName() + " failed: Insufficient funds.");
//            }
//        } else {
//            System.out.println(agentId + " purchase of " + weapon.getName() + " failed: Insufficient level.");
//        }
//    }
//
//    public double getBank() {
//        return bank;
//    }
//
//    public boolean isBanned() {
//        return isBanned;
//    }
//
//    public boolean isDriving() {
//        return isDriving;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//    // public void setLevel(int level){
//    //     this.level = level;
//    // }
//}
//
//class MainTest {
//    @Test
//    public void testCanDrive(){
//        Agent one = new Agent(2.0, 5);
//        assertTrue(one.canDrive());
//        one.ban();
//        assertTrue(one.canDrive());
//    }
//    @Test
//    public void testLevelUp(){
//        Agent one = new Agent(2.0, 5);
//        int initialLevel = one.getLevel();
//        one.levelUp();
//        assertTrue(one.getLevel() == initialLevel+1);
//        Agent two = new Agent(2.0, 5);
//        two.ban();
//        two.levelUp();
//        assertTrue(two.getLevel()==initialLevel);
//    }
//    @Test
//    public void testBan(){
//        Agent one = new Agent(3.0, 1);
//        one.ban();
//        assertTrue(one.isBanned());
//        one.ban();
//        assertTrue(one.isBanned());
//    }
//    @Test
//    public void testPurchase(){
//        Agent one = new Agent(15.0, 2);
//        Weapon buttkick = new Weapon("buttkick", 2, 13.5);
//        one.purchase(buttkick);
//        assertTrue(one.getBank() == 1.5);
//
//        Agent two = new Agent(10.0, 2);
//        two.purchase(buttkick);
//        assertTrue(two.getBank() == 10.0);
//
//        Agent three = new Agent(15.0, 1);
//        three.purchase(buttkick);
//        assertTrue(three.getBank() == 15.0);
//
//        Agent four = new Agent(10.0, 1);
//        four.purchase(buttkick);
//        assertTrue(four.getBank() == 10.0);
//    }
//}
