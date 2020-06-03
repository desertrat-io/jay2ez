package io.desertrat.ez.files;

import java.io.File;

public class EZFile {

    public enum EZFileAttributes {
        NEW, APPEND, PREPEND, REPLACE
    }

    public File touch(String filename) {
        return null;
    }

    public File putContents(String fileName, String content) {
        return null;
    }

    public File putContents(String fileName, String content, int mode) {
        return null;
    }

    public File putContents(String fileName, String content, String mode) {
        return null;
    }
    public File putContents(String fileName, String content, EZFileAttributes mode) {
        return null;
    }

    public File putContents(String fileName, byte[] content, EZFileAttributes mode) {
        return null;
    }
    public File putContents(String fileName, byte[] content, int mode) {
        return null;
    }

    public File putContents(String fileName, byte[] content) {
        return null;
    }
}
