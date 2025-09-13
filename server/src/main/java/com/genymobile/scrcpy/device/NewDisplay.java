package com.genymobile.scrcpy.device;

public final class NewDisplay {
    private Size size;
    private int dpi;
    private final boolean resizable;
    private float resolutionFactor;

    public NewDisplay() {
        // Auto size and dpi, not resizable
        this.resizable = false;
        this.resolutionFactor = 1.0f;
    }

    public NewDisplay(Size size, int dpi, boolean resizable) {
        this(size, dpi, resizable, 1.0f);
    }
    
    public NewDisplay(Size size, int dpi, boolean resizable, float resolutionFactor) {
        this.size = size;
        this.dpi = dpi;
        this.resizable = resizable;
        this.resolutionFactor = resolutionFactor;
    }

    public Size getSize() {
        return size;
    }

    public int getDpi() {
        return dpi;
    }

    public boolean isResizable() {
        return resizable;
    }

    public boolean hasExplicitSize() {
        return size != null;
    }

    public boolean hasExplicitDpi() {
        return dpi != 0;
    }
    
    public float getResolutionFactor() {
        return resolutionFactor;
    }
    
    public boolean hasResolutionFactor() {
        return resolutionFactor != 1.0f;
    }
}
