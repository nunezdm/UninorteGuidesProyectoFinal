package Ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;


public class Propiedades extends BasicComboBoxUI{
    
    
    public static ComboBoxUI createUI(JComponent com){
        return new Propiedades();
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        //btn.setIcon(new ImageIcon(getClass().getResource("/icons/CaretCircleDoubleDown.png")));
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CaretCircleDoubleDown.png")));
        btn.setBorder(BorderFactory.createLineBorder(Color.white,4));
        btn.setContentAreaFilled(false);
        return btn;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(Color.white);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }

    
    @Override
    protected ListCellRenderer createRenderer() {
        
        return new DefaultListCellRenderer(){

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                
                list.setSelectionBackground(Color.white);
                
                if(index!=-1){
                    setIcon(new ImageIcon(getClass().getResource("/icons/CaretRight.png")));
                }
                return this;
            }
        };
    }
}