package edu.cursos.javaBasico;
public class Televisao {
    
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    /* public Televisao(boolean ligada, int canal, int volume){
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
    } */

    public void status() {
        System.out.println("A tv está ligada? "+ ligada+ " em qual canal? "+canal+ " com o volume "+ volume);
    }

    public void ligarTV(){
        setLigada(true);
    }

    public void desligarTV(){
        setLigada(false);
    }

    public void aumentarVolume(){
        if(getLigada() == false){
            System.out.println("TV desligada!");
        }else{
            setVolume(this.volume + 1);
            getVolume();
        }
        
    }

    public void diminuirVolume(){
        if(getLigada() == false){
            System.out.println("TV desligada!");
        }else{
            setVolume(this.volume - 1);
            getVolume();
        }
        
    }

    public void aumentarCanal(){
        if(getLigada() == false){
            System.out.println("TV desligada!");
        }else{
            setCanal(this.canal + 1);
            getCanal();
        }
        
    }

    public void escolherCanal(int canal){
        if(getLigada() == false){
            System.out.println("TV desligada!");
        }else{
            setCanal(canal);
            getCanal();
        }
        
    }

    public void diminuirCanal(){
        if(getLigada() == false){
            System.out.println("TV desligada!");
        }else{
             setCanal(this.canal - 1);
            getCanal();
        }
       
    }

    private boolean getLigada() {
		return this.ligada;
	}
	private void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

    private int getCanal() {
		return this.canal;
	}
	private void setCanal(int canal) {
		this.canal = canal;
	}

     private int getVolume() {
		return this.volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
}
