package task14Seriazable;

import lombok.*;


import java.io.*;

@Setter
@Getter
@NoArgsConstructor
@ToString

public class Computer implements Serializable {

    private String pc;
    private int ram;
    private int hd;
    private int core;
    private static String video = "Nvidia";


    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public static String getVideo() {
        return video;
    }

    public static void setVideo(String video) {
        Computer.video = video;
    }

    public Computer(String pc, int ram, int hd, int core) {
        this.pc = pc;
        this.ram = ram;
        this.hd = hd;
        this.core = core;

    }


}

