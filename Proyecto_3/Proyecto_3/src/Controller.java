import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;



public class Controller {
	
	
	public void Sonido1(MouseEvent event){
		
		Sonido sonido_1 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio1.wav");
		Thread hilo = new Thread(sonido_1);
		hilo.start();

		}
		

	public void Sonido2(ActionEvent event){
		
		Sonido sonido_2 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio2.wav");
		Thread hilo = new Thread(sonido_2);
		hilo.start();

	
	}
	public void Sonido3(ActionEvent event){
		
		Sonido sonido_3 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio3.wav");
		Thread hilo = new Thread(sonido_3);
		hilo.start();

	
	}
	public void Sonido4(ActionEvent event){
		
		Sonido sonido_4 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio4.wav");
		Thread hilo = new Thread(sonido_4);
		hilo.start();

	
	}
	public void Sonido5(ActionEvent event){
		
		Sonido sonido_5 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio5.wav");
		Thread hilo = new Thread(sonido_5);
		hilo.start();

	
	}
	public void Sonido6(ActionEvent event){
		
		Sonido sonido_6 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio6.wav");
		Thread hilo = new Thread(sonido_6);
		hilo.start();

	
	}
	public void Sonido7(ActionEvent event){
		
		Sonido sonido_7 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio7.wav");
		Thread hilo = new Thread(sonido_7);
		hilo.start();

	
	}
	public void Sonido8(ActionEvent event){
		
		Sonido sonido_8 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio8.wav");
		Thread hilo = new Thread(sonido_8);
		hilo.start();

	
	}
	public void Sonido9(ActionEvent event){
		
		Sonido sonido_9 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio9.wav");
		Thread hilo = new Thread(sonido_9);
		hilo.start();

	
	}
	public void Sonido10(ActionEvent event){
		
		Sonido sonido_10 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio10.wav");
		Thread hilo = new Thread(sonido_10);
		hilo.start();

	
	}
	public void Sonido11(ActionEvent event){
		
		Sonido sonido_11 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio11.wav");
		Thread hilo = new Thread(sonido_11);
		hilo.start();

	
	}
	public void Sonido12(ActionEvent event){
		
		Sonido sonido_12 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio17.wav");
		Thread hilo = new Thread(sonido_12);
		hilo.start();

	
	}
	public void Sonido13(ActionEvent event){
		
		Sonido sonido_13 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio13.wav");
		Thread hilo = new Thread(sonido_13);
		hilo.start();

	
	}
	public void Sonido14(ActionEvent event){
		
		Sonido sonido_14 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio12.wav");
		Thread hilo = new Thread(sonido_14);
		hilo.start();

	
	}
	public void Sonido15(ActionEvent event){
		
		Sonido sonido_15 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio15.wav");
		Thread hilo = new Thread(sonido_15);
		hilo.start();

	
	}
	public void Sonido16(ActionEvent event){
		
		Sonido sonido_16 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio16.wav");
		Thread hilo = new Thread(sonido_16);
		hilo.start();

	
	}
	public void Sonido17(ActionEvent event){
		
		Sonido sonido_17 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio17.wav");
		Thread hilo = new Thread(sonido_17);
		hilo.start();

	
	}
	public void teclasPanel(KeyEvent evt){
		if(evt.getCode()==KeyCode.Q) {
			Sonido sonido_1 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio1.wav");
			Thread hilo = new Thread(sonido_1);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.W) {
			Sonido sonido_2 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio2.wav");
			Thread hilo = new Thread(sonido_2);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.E) {
			Sonido sonido_3 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio3.wav");
			Thread hilo = new Thread(sonido_3);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.R) {
			Sonido sonido_4 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio4.wav");
			Thread hilo = new Thread(sonido_4);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.T) {
			Sonido sonido_5 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio5.wav");
			Thread hilo = new Thread(sonido_5);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.Y) {
			Sonido sonido_6 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio6.wav");
			Thread hilo = new Thread(sonido_6);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.U) {
			Sonido sonido_7 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio7.wav");
			Thread hilo = new Thread(sonido_7);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.I) {
			Sonido sonido_8 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio8.wav");
			Thread hilo = new Thread(sonido_8);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.O) {
			Sonido sonido_9 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio9.wav");
			Thread hilo = new Thread(sonido_9);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.P) {
			Sonido sonido_10 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio10.wav");
			Thread hilo = new Thread(sonido_10);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.A) {
			Sonido sonido_11 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio11.wav");
			Thread hilo = new Thread(sonido_11);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.S) {
			Sonido sonido_12 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio12.wav");
			Thread hilo = new Thread(sonido_12);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.D) {
			Sonido sonido_13 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio13.wav");
			Thread hilo = new Thread(sonido_13);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.F) {
			Sonido sonido_14 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio14.wav");
			Thread hilo = new Thread(sonido_14);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.G) {
			Sonido sonido_15 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio15.wav");
			Thread hilo = new Thread(sonido_15);
			hilo.start();
		}
		else if(evt.getCode()==KeyCode.H) {
			Sonido sonido_16 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio16.wav");
			Thread hilo = new Thread(sonido_16);
			hilo.start();
		}
}
}
