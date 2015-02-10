/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GameDemo;

/**
 *
 * @author mars
 */

/**
//import com.sun.lwuit.Font;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class LoadingBarSplash extends Canvas implements Runnable {

   private int canvasWidth, canvasHeight, scrollBar_width = 0;
   private Thread scrollingBarThread = null;
   private static int SCROLLING_BAR_LEN;
   private Image imgMathLogo = null;
   private Image img = null;
   private static final String IMG_MATH_LOGO = "/cover.jpg";
   Font mediumFont=Font.getFont(Font.FACE_SYSTEM,Font.STYLE_PLAIN,Font.SIZE_MEDIUM);


   public LoadingBarSplash() {

      setFullScreenMode(true);

      /* obtain the height and width dimensions of the canvas */
/**
      canvasWidth = getWidth();
      canvasHeight = getHeight();

      /* load the mathLogo image */
/**
      try {
         imgMathLogo = Image.createImage(IMG_MATH_LOGO);
      } catch (Exception e) {
         System.out.println("Unable to load splash Image");
      }

      /*
       * SCROLLING_BAR_LEN starts at val1=25 and finishes at canvasWidth-50
       * "subtracting 25 from both sides
       */

//      SCROLLING_BAR_LEN = canvasWidth - 50;

      /* create the thread and start it */
     // scrollingBarThread = new Thread(this);
      //scrollingBarThread.start();

  // }

   /* method that draws a scrolling bar on the screen */
   //protected void paint(Graphics g) {
      /* set color to white */
     /** g.setColor(255, 240, 124);//bgclor
      /* clear the screen */
     /** g.fillRect(0, 0, canvasWidth, canvasHeight);

      showNotify();
      /* draw the image at the center of screen */
    /**  if (imgMathLogo != null) {
         int imgH = imgMathLogo.getHeight();
         int imgW = imgMathLogo.getWidth();
         g.drawImage(imgMathLogo, (canvasWidth - imgW) / 2, (canvasHeight - (imgH + imgH / 2)) / 2, Graphics.TOP | Graphics.LEFT);
      }

      /* use a color to draw the scrolling bar */
     /** g.setColor(90, 45, 255);
      /* calculating the scrollBar_Ypos to be 3/4 of the screenHeight */
      /**int scrollBar_Ypos = ((canvasHeight * 3) / 4);

      g.fillRect(35, scrollBar_Ypos, scrollBar_width, 1);

      /* draw a blue rectangle around the scrolling bar */
    //  g.setColor(180, 30, 255);
      //g.drawRect(25, scrollBar_Ypos, SCROLLING_BAR_LEN, 5);

      /* draw a blue Loading...String below the loadingbar */
      
/**
      g.setColor(0,0, 255);
      String barStr = "*******";
      g.drawString(barStr, (canvasWidth - barStr.length()) / 2, scrollBar_Ypos +10, Graphics.HCENTER | Graphics.TOP);
      String IMG_MATH_LOGO = "/happy.png";
      g.setColor(0,0,0);
      
       
        //g.setFont(mediumFont);
        g.drawString ("", getWidth ()/2,  5, Graphics.TOP|Graphics.HCENTER);
        g.drawString ("", getWidth ()/2,  20, Graphics.TOP|Graphics.HCENTER);
       // g.drawString ("In advance", getWidth ()/2,  35, Graphics.TOP|Graphics.HCENTER);


        g.setColor(0,0,0);
       // g.setFont(mediumFont);
        g.drawString ("(C)2013", getWidth ()/2,  getHeight()-5, Graphics.BOTTOM|Graphics.HCENTER);

        g.setColor(0,0,0);
       // g.setFont(mediumFont);
       


      System.gc();
   }

   /*
    * method that increments the scrollBar_width to be drawn on the display
    */
/**
   public void run() {
      while (scrollBar_width < SCROLLING_BAR_LEN) {
          System.out.println("SplashScreen  -- scrollBar_width = " + scrollBar_width);
         /* increment the scrollingBar drawn on screen by 2 */
       /**  scrollBar_width = scrollBar_width + 2;

         /*
          * call repaint to redraw the scrolling Bar every time the Width changes
          */
         //repaint();

         /**try {
            /*
             * pause the thread to allow the user to see the drawing on the screen
             */
            //Thread.sleep(50);
         //} catch (InterruptedException interupt) {
           // System.out.println("Thread Interrupted : " + interupt.getMessage());
         //}
     // }
   //}


   /**protected void showNotify() {
        this.setFullScreenMode(true);
        canvasWidth = this.getWidth();
        canvasHeight = this.getHeight();
    }


}

**/