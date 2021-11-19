import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;



public class Controller {
	
	
	@FXML
	private ImageView color,color2,color3,color4,color5,color6,color7,color8,color9,color10,color11,color12,color13,color14,color15,color16;
	

	
	public void Sonido1(ActionEvent event){
		
		Sonido sonido_1 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio1.wav");
		Thread hilo = new Thread(sonido_1);
		hilo.start();
		if (color.isVisible()==false){
			color.setVisible(true);
			}
			else{
				color.setVisible(false);
			}
	}
		

	public void Sonido2(ActionEvent event){
		
		Sonido sonido_2 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio2.wav");
		Thread hilo = new Thread(sonido_2);
		hilo.start();
		if (color2.isVisible()==false){
			color2.setVisible(true);
			}
			else{
				color2.setVisible(false);
			}
	}

	
	public void Sonido3(ActionEvent event){
		
		Sonido sonido_3 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio3.wav");
		Thread hilo = new Thread(sonido_3);
		hilo.start();
		if (color3.isVisible()==false){
			color3.setVisible(true);
			}
			else{
				color3.setVisible(false);
			}
	}

	
	public void Sonido4(ActionEvent event){
		
		Sonido sonido_4 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio4.wav");
		Thread hilo = new Thread(sonido_4);
		hilo.start();
		if (color4.isVisible()==false){
			color4.setVisible(true);
			}
			else{
				color4.setVisible(false);
			}
	}

	
	public void Sonido5(ActionEvent event){
		
		Sonido sonido_5 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio5.wav");
		Thread hilo = new Thread(sonido_5);
		hilo.start();
		if (color5.isVisible()==false){
			color5.setVisible(true);
			}
			else{
				color5.setVisible(false);
			}
	}

	
	public void Sonido6(ActionEvent event){
		
		Sonido sonido_6 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio6.wav");
		Thread hilo = new Thread(sonido_6);
		hilo.start();
		if (color6.isVisible()==false){
			color6.setVisible(true);
			}
			else{
				color6.setVisible(false);
			}
	}

	
	public void Sonido7(ActionEvent event){
		
		Sonido sonido_7 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio7.wav");
		Thread hilo = new Thread(sonido_7);
		hilo.start();
		if (color7.isVisible()==false){
			color7.setVisible(true);
			}
			else{
				color7.setVisible(false);
			}
	}

	
	public void Sonido8(ActionEvent event){
		
		Sonido sonido_8 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio8.wav");
		Thread hilo = new Thread(sonido_8);
		hilo.start();
		if (color8.isVisible()==false){
			color8.setVisible(true);
			}
			else{
				color8.setVisible(false);
			}
	}

	
	
	public void Sonido9(ActionEvent event){
		
		Sonido sonido_9 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio9.wav");
		Thread hilo = new Thread(sonido_9);
		hilo.start();
		if (color9.isVisible()==false){
			color9.setVisible(true);
			}
			else{
				color9.setVisible(false);
			}

	
	}
	public void Sonido10(ActionEvent event){
		
		Sonido sonido_10 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio10.wav");
		Thread hilo = new Thread(sonido_10);
		hilo.start();
		if (color10.isVisible()==false){
			color10.setVisible(true);
			}
			else{
				color10.setVisible(false);
			}

	
	}
	public void Sonido11(ActionEvent event){
		
		Sonido sonido_11 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio11.wav");
		Thread hilo = new Thread(sonido_11);
		hilo.start();
		if (color11.isVisible()==false){
			color11.setVisible(true);
			}
			else{
				color11.setVisible(false);
			}

	
	}
	public void Sonido12(ActionEvent event){
		
		Sonido sonido_12 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio17.wav");
		Thread hilo = new Thread(sonido_12);
		hilo.start();
		if (color12.isVisible()==false){
			color12.setVisible(true);
			}
			else{
				color12.setVisible(false);
			}

	
	}
	public void Sonido13(ActionEvent event){
		
		Sonido sonido_13 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio13.wav");
		Thread hilo = new Thread(sonido_13);
		hilo.start();
		if (color13.isVisible()==false){
			color13.setVisible(true);
			}
			else{
				color13.setVisible(false);
			}

	
	}
	public void Sonido14(ActionEvent event){
		
		Sonido sonido_14 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio12.wav");
		Thread hilo = new Thread(sonido_14);
		hilo.start();
		if (color14.isVisible()==false){
			color14.setVisible(true);
			}
			else{
				color14.setVisible(false);
			}

	
	}
	public void Sonido15(ActionEvent event){
		
		Sonido sonido_15 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio15.wav");
		Thread hilo = new Thread(sonido_15);
		hilo.start();
		if (color15.isVisible()==false){
			color15.setVisible(true);
			}
			else{
				color15.setVisible(false);
			}

	
	}
	public void Sonido16(ActionEvent event){
		
		Sonido sonido_16 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio16.wav");
		Thread hilo = new Thread(sonido_16);
		hilo.start();
		if (color16.isVisible()==false){
			color16.setVisible(true);
			}
			else{
				color16.setVisible(false);
			}

	
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
			if (color.isVisible()==true){
				color.setVisible(false);
				}
				else{
					color.setVisible(true);
				}
		}
		else if(evt.getCode()==KeyCode.W) {
			Sonido sonido_2 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio2.wav");
			Thread hilo = new Thread(sonido_2);
			hilo.start();
			if (color2.isVisible()==false){
				color2.setVisible(true);
				}
				else{
					color2.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.E) {
			Sonido sonido_3 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio3.wav");
			Thread hilo = new Thread(sonido_3);
			hilo.start();
			if (color3.isVisible()==false){
				color3.setVisible(true);
				}
				else{
					color3.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.R) {
			Sonido sonido_4 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio4.wav");
			Thread hilo = new Thread(sonido_4);
			hilo.start();
			if (color4.isVisible()==false){
				color4.setVisible(true);
				}
				else{
					color4.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.T) {
			Sonido sonido_5 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio5.wav");
			Thread hilo = new Thread(sonido_5);
			hilo.start();
			if (color5.isVisible()==false){
				color5.setVisible(true);
				}
				else{
					color5.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.Y) {
			Sonido sonido_6 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio6.wav");
			Thread hilo = new Thread(sonido_6);
			hilo.start();
			if (color6.isVisible()==false){
				color6.setVisible(true);
				}
				else{
					color6.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.U) {
			Sonido sonido_7 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio7.wav");
			Thread hilo = new Thread(sonido_7);
			hilo.start();
			if (color7.isVisible()==false){
				color7.setVisible(true);
				}
				else{
					color7.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.I) {
			Sonido sonido_8 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio8.wav");
			Thread hilo = new Thread(sonido_8);
			hilo.start();
			if (color8.isVisible()==false){
				color8.setVisible(true);
				}
				else{
					color8.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.O) {
			Sonido sonido_9 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio9.wav");
			Thread hilo = new Thread(sonido_9);
			hilo.start();
			if (color9.isVisible()==false){
				color9.setVisible(true);
				}
				else{
					color9.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.P) {
			Sonido sonido_10 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio10.wav");
			Thread hilo = new Thread(sonido_10);
			hilo.start();
			if (color10.isVisible()==false){
				color10.setVisible(true);
				}
				else{
					color10.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.A) {
			Sonido sonido_11 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio11.wav");
			Thread hilo = new Thread(sonido_11);
			hilo.start();
			if (color11.isVisible()==false){
				color11.setVisible(true);
				}
				else{
					color11.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.S) {
			Sonido sonido_12 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio12.wav");
			Thread hilo = new Thread(sonido_12);
			hilo.start();
			if (color12.isVisible()==false){
				color12.setVisible(true);
				}
				else{
					color12.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.D) {
			Sonido sonido_13 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio13.wav");
			Thread hilo = new Thread(sonido_13);
			hilo.start();
			if (color13.isVisible()==false){
				color13.setVisible(true);
				}
				else{
					color13.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.F) {
			Sonido sonido_14 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio14.wav");
			Thread hilo = new Thread(sonido_14);
			hilo.start();
			if (color14.isVisible()==false){
				color14.setVisible(true);
				}
				else{
					color14.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.G) {
			Sonido sonido_15 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio15.wav");
			Thread hilo = new Thread(sonido_15);
			hilo.start();
			if (color15.isVisible()==false){
				color15.setVisible(true);
				}
				else{
					color15.setVisible(false);
				}
		}
		else if(evt.getCode()==KeyCode.H) {
			Sonido sonido_16 = new Sonido("platillo","C:\\Users\\Fantasma3005\\Downloads\\Proyecto_3\\Audios\\audio16.wav");
			Thread hilo = new Thread(sonido_16);
			hilo.start();
			if (color16.isVisible()==false){
				color16.setVisible(true);
				}
				else{
					color16.setVisible(false);
				}
		}
}
}
