public class main {
    static void main(String[] args) {
        VideoJuego juego1 = new VideoJuego(
                "Minecraft",
                "Supervivencia",
                20);

        VideoJuego juego2 = new VideoJuego(
                "GTA VI",
                "Accion",
                45);

        juego1.registrarSesion(15);
        juego2.registrarSesion(10);

        System.out.println(juego1.getNombre() + " es un juego prolongado: " + juego1.esJuegoProlongado());
        System.out.println(juego2.getNombre() + " es un juego prolongado: " + juego2.esJuegoProlongado());
    }
}
