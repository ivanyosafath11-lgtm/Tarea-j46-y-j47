import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j46_ControlContador {
    // Variable de estado: aquí guardamos el valor numérico que irá cambiando
    private static int contador = 0;

    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j46_ControlContador - Contador Interactivo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(380, 220);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // 2. Creamos los componentes visuales (incluyendo los 2 nuevos botones)
        JButton btnSumar = new JButton("+ Sumar");
        JButton btnRestar = new JButton("- Restar");
        JButton btnReiniciar = new JButton("🔄 Reiniciar");
        JButton btnSumar10 = new JButton("+10");
        JLabel etiquetaValor = new JLabel("Valor actual: 0");

        // Evento para el botón de sumar (+1)
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                etiquetaValor.setText("Valor actual: " + contador);
            }
        });

        // Evento para el botón de restar (-1)
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador--;
                etiquetaValor.setText("Valor actual: " + contador);
            }
        });

        // Evento para el botón: Reiniciar a 0
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador = 0;
                etiquetaValor.setText("Valor actual: " + contador);
            }
        });

        // Evento para el boton: sumar 10
        btnSumar10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador += 10;
                etiquetaValor.setText("Valor actual: " + contador);
            }
        });

        ventana.add(btnSumar);
        ventana.add(btnRestar);
        ventana.add(btnReiniciar);
        ventana.add(btnSumar10);
        ventana.add(etiquetaValor);

        ventana.setVisible(true);
    }
}