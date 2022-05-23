
package folder;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainClassCarRacing extends Application{
    public int ValeurX;
    public int ValeurY;
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        
        
        RacingCarPane car = new RacingCarPane(40,50);
        ValeurX = car.getX();
        ValeurY = car.getY();
        
        EventHandler<ActionEvent> eventHandler = e->{
            if(ValeurX<1000){
                ValeurX+=20;
            }
            else{
                ValeurX = car.getX();
            }
            car.DrawCar(ValeurX, ValeurY);
        };
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        car.setOnMousePressed(e->{
            animation.pause();
            
        });
        car.setOnMouseReleased(e->{
            animation.play();
        });
        Scene scene = new Scene(car,1000,car.y+1);
        scene.setOnKeyPressed(e->{
            if(e.getCode().equals(KeyCode.UP)){
                animation.setRate(animation.getRate()+1);
            }
            
            if(e.getCode().equals(KeyCode.DOWN)){
                animation.setRate(animation.getRate()-1);
            }

        });
        
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Racing Car");
        primaryStage.show();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
