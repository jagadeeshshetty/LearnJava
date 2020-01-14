package com.designPatterns.memento;

/**
 *
 */
public class Editor {
    // Store current content of the Editor
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
