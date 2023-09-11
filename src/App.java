import edu.cursos.javaBasico.Televisao;

public class App {
    public static void main(String[] args) throws Exception {
       Televisao lg = new Televisao();

       lg.ligarTV();
       lg.desligarTV();
       lg.aumentarVolume();
       lg.aumentarVolume();
       lg.aumentarVolume();
       lg.aumentarVolume();

       lg.escolherCanal(10);
       
       lg.status();

    }


}
