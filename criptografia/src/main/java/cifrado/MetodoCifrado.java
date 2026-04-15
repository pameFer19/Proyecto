package cifrado;

    public enum MetodoCifrado {
                CESAR("Cifrado de Cesar"+\n+"es un método de encriptación muy simple donde cada letra de un texto se desplaza un número fijo de posiciones en el alfabeto."),
                ATBASH("Cifrado Atbash es un método donde cada letra se sustituye por su opuesta en el alfabeto." ),
                VIGENERE(""),
                RAIL(""),
                PLAYFAIR("");


        private String descripcion;

        MetodoCifrado(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }

