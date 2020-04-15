package Ejercicio2;

    public class Jugador {
        private int x, y;

        public Jugador(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    class Game {

        Jugador p;

        public void movement(String m) {
            if (m.equalsIgnoreCase("Derecha")) {
                p.setX(p.getX() + 1);
            }
            if (m.equalsIgnoreCase("Izquierda")) {
                p.setX(p.getX() - 1);
            }
            if (m.equalsIgnoreCase("Arriba")) {
                p.setY(p.getY() - 1);
            }
            if (m.equalsIgnoreCase("Abajo")) {
                p.setY(p.getY() + 1);
            }
        }
    }

