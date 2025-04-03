import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Graphics {
    File redx = new File("src/redx.png");
    BufferedImage redximg = ImageIO.read(redx);
    ArrayList <String> hitlist = new ArrayList<>();

    public Graphics() throws IOException {
    }

    public void displayWindow(){

        JFrame frame = new JFrame();
        frame.setBounds(540,540,495,518 );
        frame.setVisible(true);
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                hitlist.add("123");
                System.out.println("Mouse clicked");
                printgridlocation(e);
                checkhit(e);
            }
            public void printgridlocation(MouseEvent e){
                System.out.println((int)Math.floor(e.getX()/60) + " " + (int)Math.floor(e.getY()/60));
            }
            public void checkhit(MouseEvent e){
                if (Game.b.boardacsess((int)Math.floor(e.getX()/60),(int)Math.floor(e.getY()/60))==true){
                    System.out.println("Hit");


                } else{
                    System.out.println("Miss");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);

                for (int i=0;i<9;i++) {
                    g.drawLine(i*60,0, (i*60),480);
                    g.drawLine(0,i*60, 480,(i*60));
                }
                g.drawImage(redximg,0,0,60,60,null);

            }
        };
        frame.add(panel);
        frame.addMouseListener(mouseListener);

    }









}


