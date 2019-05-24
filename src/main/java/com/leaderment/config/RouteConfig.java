package com.leaderment.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "my.route")
public class RouteConfig {
    /**
     * 路径
     */
    //保存硬盘地址
    private String hardDisk;
    //默认图片类型文件夹
    private String imageFolder;
    //默认文件类型文件夹
    private String documentFolder;
    //默认的视频类型文件夹
    private String videoFolder;
    //默认的音频类型文件夹
    private String musicFolder;
    //允许上传的ip(上传白名单)
    private String[] IPs;
    /**
     * 类型
     */
    //图片类型
    private String[] imageType;
    //文件类型
    private String[] documentType;
    //视频类型
    private String[] videoType;
    //音频类型
    private String[] musicType;

    @Override
    public String toString() {
        return "RouteConfig{" +
                "hardDisk='" + hardDisk + '\'' +
                ", imageFolder='" + imageFolder + '\'' +
                ", documentFolder='" + documentFolder + '\'' +
                ", videoFolder='" + videoFolder + '\'' +
                ", musicFolder='" + musicFolder + '\'' +
                ", IPs=" + Arrays.toString(IPs) +
                ", imageType=" + Arrays.toString(imageType) +
                ", documentType=" + Arrays.toString(documentType) +
                ", videoType=" + Arrays.toString(videoType) +
                ", musicType=" + Arrays.toString(musicType) +
                '}';
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getImageFolder() {
        return imageFolder;
    }

    public void setImageFolder(String imageFolder) {
        this.imageFolder = imageFolder;
    }

    public String getDocumentFolder() {
        return documentFolder;
    }

    public void setDocumentFolder(String documentFolder) {
        this.documentFolder = documentFolder;
    }

    public String getVideoFolder() {
        return videoFolder;
    }

    public void setVideoFolder(String videoFolder) {
        this.videoFolder = videoFolder;
    }

    public String getMusicFolder() {
        return musicFolder;
    }

    public void setMusicFolder(String musicFolder) {
        this.musicFolder = musicFolder;
    }

    public String[] getIPs() {
        return IPs;
    }

    public void setIPs(String[] IPs) {
        this.IPs = IPs;
    }

    public String[] getImageType() {
        return imageType;
    }

    public void setImageType(String[] imageType) {
        this.imageType = imageType;
    }

    public String[] getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String[] documentType) {
        this.documentType = documentType;
    }

    public String[] getVideoType() {
        return videoType;
    }

    public void setVideoType(String[] videoType) {
        this.videoType = videoType;
    }

    public String[] getMusicType() {
        return musicType;
    }

    public void setMusicType(String[] musicType) {
        this.musicType = musicType;
    }
}
