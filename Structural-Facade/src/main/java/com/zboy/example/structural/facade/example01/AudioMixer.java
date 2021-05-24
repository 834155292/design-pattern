package com.zboy.example.structural.facade.example01;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
