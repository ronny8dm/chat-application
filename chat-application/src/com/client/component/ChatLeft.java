package com.client.component;

import java.awt.Color;
import javax.swing.Icon;
import com.client.model.ModelReceiveImage;

public class ChatLeft extends javax.swing.JLayeredPane {

    public ChatLeft() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }

    public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }

    }

    public void setImage(Icon... image) {
        //  txt.setImage(false, image);
        //    Update next
    }

    public void setImage(ModelReceiveImage dataImage) {
        txt.setImage(false, dataImage);
    }

    public void setFile(String fileName, String fileSize) {
        txt.setFile(fileName, fileSize);
    }

    public void setEmoji(Icon icon) {
        txt.hideText();
        txt.setEmoji(false, icon);
    }

    public void setTime() {
        txt.setTime("10:30 PM");    //  Testing
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.client.component.ChatItem();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.client.component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
