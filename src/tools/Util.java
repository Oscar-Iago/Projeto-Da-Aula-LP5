/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Oscar Iago
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (JComponent component : vetComp) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            }
            if (component instanceof JFormattedTextField) {
                ((JFormattedTextField) component).setText("");
            }
            if (component instanceof JPasswordField) {
                ((JPasswordField) component).setText("");
            }
            if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(-1);
            }
            if (component instanceof JCheckBox) {
                ((JCheckBox) component).setSelected(false);
            }

        }
    }
}
