/**
 * Tests the terrain classes.
 *
 * @author Mac Lawson
 * @version 2/27/23
 */
public class GameTerrainTester {

    public static void main(String args[]) {
        Terrain land = new Terrain(100, 100);
        Forest fLand = new Forest(100, 200, 100);
        Mountain mLand = new Mountain(300, 400, 25);
        WinterMountain wmLand = new WinterMountain(500, 600, 15, 10.0);
        System.out.println("Land " + land.getTerrainSize());
        System.out.println("Forest " + fLand.getTerrainSize() + " and has " + fLand.getTrees() + " trees.");
        System.out.println("Mountain " + mLand.getTerrainSize() + " and has " + mLand.getMountains() + " mountains.");
        System.out.println("Winter Mountain " + wmLand.getTerrainSize() + " and has temperature " + wmLand.getTemperature()
                + " and " + wmLand.getMountains() + " mountains.");
    }
}