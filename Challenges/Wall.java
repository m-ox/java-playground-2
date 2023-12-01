package Challenges;

public class Wall {
    private double height;
    private double width;
    
    public Wall() {}
    
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setWidth(double newWidth) {
        this.width = newWidth > 0 ? newWidth : 0;
    }
    
    public void setHeight(double newHeight) {
        this.height = newHeight > 0 ? newHeight : 0;
    }
    
    public double getArea() {
        return width * height;
    }
}
