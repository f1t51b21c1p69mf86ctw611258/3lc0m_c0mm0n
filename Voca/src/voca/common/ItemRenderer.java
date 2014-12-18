/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voca.common;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author manucian86
 */
public class ItemRenderer extends BasicComboBoxRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);

        if (value != null) {
            ListItem item = (ListItem) value;
            setText(item.getText().toUpperCase());
        }

        if (index == -1) {
            ListItem item = (ListItem) value;
            setText("" + item.getValue());
        }

        return this;
    }
    
}
