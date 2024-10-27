package com.amazon.ata.statics;

public class Box {

    private double length;
    private double width;
    private double height;

    /**
     * Constructs a Box object if the dimensions are valid
     * @param length - length of box
     * @param width - width of box
     * @param height - height of box
     * @throws DimensionValueException if the provided dimensions exceed the max Box size
     */
    public Box(double length, double width, double height) throws DimensionValueException {
        validateBoxDimensions(length, width, height);

        this.length = length;
        this.height = height;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static boolean validateBoxDimensions(double height, double width, double length) throws DimensionValueException {
        if (height > 72 || width > 72 || length > 72) {
            throw new DimensionValueException("Provided Dimensions are illegal");
        }
        return true;
    }
}
