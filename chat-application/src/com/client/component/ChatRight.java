package com.client.component;

import java.awt.Color;
import javax.swing.Icon;

import com.client.model.ModelFileSender;

public class ChatRight extends javax.swing.JLayeredPane {

    public ChatRight() {
        initComponents();
        txt.setBackground(new Color(179, 233, 255));
    }

    public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }
        txt.seen();
    }

    public void setImage(ModelFileSender fileSender) {
        txt.setImage(true, fileSender);
    }

    public void setImage(String... image) {
       // txt.setImage(false, image);
    }

    public void setFile(String fileName, String fileSize) {
        txt.setFile(fileName, fileSize);
    }

    public void setEmoji(Icon icon) {
        txt.hideText();
        txt.setEmoji(true, icon);
    }

    public void setTime() {
        txt.setTime("10:30 PM");    //  Testing
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.client.component.ChatItem();

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.client.component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
