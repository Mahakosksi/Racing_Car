
package folder;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class RacingCarPane extends Pane {
    protected int x;
    protected int y;
    
    public RacingCarPane(){
        x=0;
        y=x;
        DrawCar(x,y);
    }
    public RacingCarPane(int x, int y){
        this.x=x;
        this.y= y;
        DrawCar(x,y);
    }
    
    public void DrawCar(int x, int y){
        
        Circle c1 = new Circle(x+15,y-5,5);
        c1.setFill(Color.BLACK);
        c1.setStroke(Color.BLACK);
        Circle c2 = new Circle(x+35,y-5,5);
        c2.setFill(Color.BLACK);
        c2.setStroke(Color.BLACK);
        Rectangle rec1 = new Rectangle(x,y-20,50,10);// x mte3 l point eli chyebda menha, y mte l point eli chyoufqa biha
        rec1.setFill(Color.BLUE);
        rec1.setStroke(Color.BLUE);
        Polygon poly = new Polygon();
        poly.getPoints().addAll(new Double[]{
            x+10.0,y-20.0,
            x+20.0,y-30.0,
            x+30.0,y-30.0,
            x+40.0,y-20.0
            
            
        });
        poly.setFill(Color.BLUE);
        Pane pane = new Pane();
        pane.getChildren().addAll(c1,c2,rec1,poly);
                
        getChildren().clear();
        getChildren().addAll(pane);
        
        
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int b){
        y=b;
    }
    
    
    
}
