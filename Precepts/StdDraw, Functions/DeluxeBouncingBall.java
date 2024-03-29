/*************************************************************************
 * Name:
 * Login:
 * Precepts:
 *
 * Description: Implementation of a 2-d bouncing ball in the box from
 * (-1, -1) to (1, 1).
 *
 * Dependencies: StdDraw.java StdAudio.java
 *                http://www.cs.princeton.edu/introcs/15inout/laser.wav
 *                http://www.cs.princeton.edu/introcs/15inout/pop.wav
 *                http://www.cs.princeton.edu/introcs/15inout/earth.gif
 *************************************************************************/

public class DeluxeBouncingBall { 
    public static void main(String[] args) {
        StdAudio.play("2001.mid");
        
        double rx = .480, ry = .860;     // position
        double vx = .015, vy = .023;     // velocity
        double radius = .03;             // a hack since "earth.gif" is in pixels

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);


        // main animation loop
        while (true) { 
            if (Math.abs(rx + vx) + radius > 1.0) { vx = -vx; StdAudio.play("laser.wav"); }
            if (Math.abs(ry + vy) + radius > 1.0) { vy = -vy; StdAudio.play("pop.wav");   }
            rx = rx + vx; 
            ry = ry + vy; 
            StdDraw.clear();
            StdDraw.picture(rx, ry, "earth.gif");
            StdDraw.show(20); 
        } 
    } 
}