package com.krld.model.flora;

import com.krld.model.Unit;

public abstract class AbstractTree extends Unit {

    private boolean cutDown;

    public AbstractTree() {
        cutDown = false;
    }

    public boolean isCutDown() {
        return cutDown;
    }

    public void setCutDown(boolean cutDown) {
        if (cutDown) {
            setMakeCollisions(false);
        } else {
            setMakeCollisions(true);
        }
        this.cutDown = cutDown;
    }
}
