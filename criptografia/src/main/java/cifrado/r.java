package cifrado;

public class r {

    private MetodoCifrado metodo;

    cesar.addActionListener(e -> {
        metodo = MetodoCifrado.CESAR;
        descripcion.setText("El cifrado César es un método de encriptación...");
    });

atbash.addActionListener(e -> metodo = MetodoCifrado.ATBASH);
vigenere.addActionListener(e -> metodo = MetodoCifrado.VIGENERE);
rail.addActionListener(e -> metodo = MetodoCifrado.RAIL);
playfair.addActionListener(e -> metodo = MetodoCifrado.PLAYFAIR);

    private void cifrarTexto() {
        String texto = inputText.getText();
        String resultado = "";

        if (metodo == null) {
            resultado = "Selecciona un método";
        } else {
            switch (metodo) {
                case CESAR:
                    resultado = cifradoCesar(texto, 3);
                    break;
                case ATBASH:
                    resultado = cifradoAtbash(texto);
                    break;
                case VIGENERE:
                    resultado = "Vigenere (falta implementar)";
                    break;
                case RAIL:
                    resultado = "Rail Fence (falta implementar)";
                    break;
                case PLAYFAIR:
                    resultado = "Playfair (falta implementar)";
                    break;
            }
        }

        outputText.setText(resultado);
    }

    public enum MetodoCifrado {
        CESAR("El cifrado César es un método de encriptación..."),
        ATBASH("Cifrado que invierte el alfabeto"),
        VIGENERE("Método basado en clave"),
        RAIL("Transposición en zig-zag"),
        PLAYFAIR("Cifrado por pares de letras");

        private String descripcion;

        MetodoCifrado(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    cesar.addActionListener(e -> {
        metodo = MetodoCifrado.CESAR;
        descripcion.setText(metodo.getDescripcion());
    });
}
