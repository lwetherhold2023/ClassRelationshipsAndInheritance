// this interface allows a defining way to establish numeric priority between different object instances
interface Priority {
    public void setPriority(int inLevel);
    public int getPriority();
}

// this interface allows a defining way to establish numeric complexity between different object instances
interface Complexity {
    public void setComplexity(int inLevel);
    public int getComplexity();
}