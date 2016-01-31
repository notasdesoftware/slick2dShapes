import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Curve;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

public class Main extends BasicGame {
    private Rectangle rectangulo = null;
    private Circle circulo = null;
    private Curve curva = null;
    private Ellipse elipse = null;
    private Line linea = null;
    private Polygon poligono = null;
    
    public Main(String gamename){
        super(gamename);
    }
 
    @Override
    public void init(GameContainer gc) throws SlickException {
        this.rectangulo = new Rectangle(10, 50, 50, 40);
        this.circulo = new Circle(40, 150, 30);
        this.curva = new Curve(new Vector2f(10,212), new Vector2f(200,212), new Vector2f(200,240), new Vector2f(10,240));
        this.elipse = new Ellipse(90, 290, 85, 15);
        this.linea = new Line(10,340,150,340);
        this.poligono = new Polygon(new float[]{10,420,100,420,30,370});
    }
 
    @Override
    public void update(GameContainer gc, int i) throws SlickException {}
 
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.drawString("Rectángulo", 10, 30);
        g.draw(this.rectangulo);
        g.drawString("Círculo", 10, 100);
        g.draw(this.circulo);
        g.drawString("Curva",10, 190);
        g.draw(this.curva);
        g.drawString("Elipse", 10, 250);
        g.draw(this.elipse);
        g.drawString("Línea", 10, 310);
        g.draw(this.linea);
        g.drawString("Polígono", 10, 350);
        g.draw(this.poligono);
    }
 
    public static void main(String[] args){
        try{
            AppGameContainer appgc = new AppGameContainer(new Main("Formas y figuras"));
            appgc.setDisplayMode(200, 500, false);
            appgc.start();
        }
        catch (SlickException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}