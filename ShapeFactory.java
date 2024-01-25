public class ShapeFactory {
    
    private static final ShapeFactory instance = new ShapeFactory();
    private ShapeFactory() {
    }


    public static ShapeFactory getInstance() {
        return instance;
    }



