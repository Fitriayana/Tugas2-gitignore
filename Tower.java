import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor Plane = getOneIntersectingObject(Plane.class);
        if (Plane != null) {
            int PlaneX = Plane.getX();
            int PlaneY = Plane.getY();
            World world = getWorld(); 
            if (world != null) {
                world.removeObject(this);
                world.addObject(new Boom(), PlaneX, PlaneY);
            }
        }
    }
}
