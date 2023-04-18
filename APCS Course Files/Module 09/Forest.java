/**
 * Extends the Terrain Class to create a Forest.
 *
 * @author Mac Lawson
 * @version 2/27/23
 */

public class Forest extends Terrain {

    private int trees;

    /**
     * Constructor for the Forest Class
     */
    public Forest(int l, int w, int trees) {
        super(l, w);
        this.trees = trees;
    }

    /**
     * @return the trees
     */
    public int getTrees() {
        return trees;
    }
}