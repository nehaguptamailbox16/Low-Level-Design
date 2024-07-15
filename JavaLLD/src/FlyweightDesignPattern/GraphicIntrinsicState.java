package FlyweightDesignPattern;



@IntrinsicState

public class GraphicIntrinsicState {
    public GraphicType getType() {
        return type;
    }

    public void setType(GraphicType type) {
        this.type = type;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private GraphicType type; // "text" or "image"
    private Image image; // Text content or image file path
    private int width, height; // Dimensions
    private String color; // Font color for text or image format for images
}
