package task14Seriazable;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    transient String any = "Any";
    private String touchpad;

    public Notebook(String pc, int ram, int hd, int core,String any,String touchpad) {
        super(pc,ram,hd,core);
        this.any = any;
        this.touchpad = touchpad;
    }
}
