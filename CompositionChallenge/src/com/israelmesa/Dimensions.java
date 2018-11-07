package com.israelmesa;

public class Dimensions {

    private int interiorWidthInches;
    private int interiorHeightInches;
    private int interiorDepthInches;

    public Dimensions(int interiorWidthInches, int interiorHeightInches, int interiorDepthInches) {
        this.interiorWidthInches = interiorWidthInches;
        this.interiorHeightInches = interiorHeightInches;
        this.interiorDepthInches = interiorDepthInches;
    }

    public int getInteriorWidthInches() {
        return interiorWidthInches;
    }

    public int getInteriorHeightInches() {
        return interiorHeightInches;
    }

    public int getInteriorDepthInches() {
        return interiorDepthInches;
    }
}
