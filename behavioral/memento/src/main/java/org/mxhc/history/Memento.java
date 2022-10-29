package org.mxhc.history;

import org.mxhc.editor.Editor;

public class Memento {
    private String backup;
    private Editor editor;
    
    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }
    
    public void restore() {
        editor.restore(backup);
    }
}
