package kuvankasittely.ui;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import kuvankasittely.domain.*;

/**
 * @author      kimpe
 * @version     4.0
 * @since       2013-09-24
 */

public class Paneeli extends JPanel {
    
    BufferedImage puskuroituKuva;
    
    public Paneeli() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) { 
         super.paintComponent(graphics);
         graphics.drawImage(puskuroituKuva, 0, 0, null);
    }
 
    public void setKuva(Kuva kuva) {
        this.puskuroituKuva = kuva.getPuskuroituKuva();
    }
    
    public BufferedImage getKuva() {
        return puskuroituKuva;
    }
    
}
