package org.mxhc;

import org.mxhc.facade.VideoConversionFacade;

import java.io.File;

public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}