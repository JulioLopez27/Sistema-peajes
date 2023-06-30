/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBasicoRenderer implements ListCellRenderer<Renderizable> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Renderizable> list, Renderizable value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel();
        label.setText(value.getDescription());
        return label;
    }
}
