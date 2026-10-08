public class VideoJuego {
        private String nombre;
        private String genero;
        private double horasJugadas;

    public String getNombre() {
        return nombre;
    }

    public VideoJuego (String nombre, String genero, double horasJugadas) {
            this.nombre = nombre;
            this.genero = genero;

            if (horasJugadas >= 0) {
                this.horasJugadas = horasJugadas;
            } else {
                throw new IllegalArgumentException("Las horas no pueden ser negativas.");
            }
        }

        public void registrarSesion(double horas) {
            if (horas >= 0) {
                horasJugadas += horas;
            } else {
                System.out.println("Las horas no pueden ser negativas.");
            }
        }

        public boolean esJuegoProlongado() {
            return horasJugadas > 50;
        }
}
