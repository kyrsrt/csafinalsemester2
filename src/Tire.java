public class Tire {
    //start of instance variables
    private String material;
    private int size;
    private boolean isSticky;
    //end of instance variables


    //start of constructors
    public Tire(String tireMaterial, int tireSize, boolean tireIsSticky)
    {
        material = tireMaterial;
        size = tireSize;
        isSticky = tireIsSticky;
    }
    //end of constructors


    //start of getters
    public String getMaterial(){ return material; }
    public int getSize(){ return size; }
    public boolean isSticky() { return isSticky; }
    public String toString() { return material + ", " + size + ", " + isSticky; }
}

