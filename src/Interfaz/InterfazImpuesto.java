/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import MisClases.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author snell
 */
public class InterfazImpuesto extends javax.swing.JFrame {

    public void CrearClones() throws CloneNotSupportedException {

        ImpuestoCarro imp = ImpuestoCarro.ObtenerInstancia();
        Prototype Clones = new Prototype();
            
        Clones.NuevoPrototipo();
        //Clones Chevrolet
        CarroBasico cloneChevro = Clones.Prochevrolet.clone();
        cloneChevro.setModelo("Aveo");
        cloneChevro.setLinea("2020");
        cloneChevro.setValor(80000000);
        CarroBasico cloneChevro2 = Clones.Prochevrolet.clone();
        cloneChevro2.setModelo("Beat");
        cloneChevro2.setLinea("2018");
        cloneChevro2.setValor(45000000);
        //Clones Lamborghini
        CarroBasico cloneLambo = Clones.Prolambo.clone();
        cloneLambo.setModelo("Murcielago");
        cloneLambo.setLinea("2020");
        cloneLambo.setValor(400000000);
        CarroBasico cloneLambo2 = Clones.Prolambo.clone();
        cloneLambo2.setModelo("Huracan");
        cloneLambo2.setLinea("2017");
        cloneLambo2.setValor(300000000);
        //Clones Ford
        CarroBasico cloneFord = Clones.ProFord.clone();
        cloneFord.setModelo("Fiesta");
        cloneFord.setLinea("2016");
        cloneFord.setValor(32000000);
        CarroBasico cloneFord2 = Clones.ProFord.clone();
        cloneFord2.setModelo("Puma");
        cloneFord2.setLinea("2014");
        cloneFord2.setValor(10000000);
        // Busqueda
        String marca2 = marca.getText(), modelo2 = modelo.getText(), linea2 = linea.getText();
        if (marca2.equals("Chevrolet")) {
            if (modelo2.equals("Aveo") && linea2.equals("2020")) {
                imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/CA2020.jpg"));
                valor.setText(String.valueOf(cloneChevro.getValor()));
                imp.AsignarDatos(Integer.valueOf(valor.getText()));
                ValImp.setText(String.valueOf(imp.ImpuestoTotal()));
            } else {
                if (modelo2.equals("Beat") && linea2.equals("2018")) {
                    imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/CB2018.jpg"));
                    valor.setText(String.valueOf(cloneChevro2.getValor()));
                    imp.AsignarDatos(Integer.valueOf(valor.getText()));
                    ValImp.setText(String.valueOf(imp.ImpuestoTotal()));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el Chevrolet modelo/linea que usted desea");
                }
            }
        }
        if (marca2.equals("Lamborghini")) {
            if (modelo2.equals("Murcielago") && linea2.equals("2020")) {
                imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/LM2020.jpg"));
                valor.setText(String.valueOf(cloneLambo.getValor()));
                imp.AsignarDatos(Integer.valueOf(valor.getText()));
                ValImp.setText(String.valueOf(imp.ImpuestoTotal()));
            } else {
                if (modelo2.equals("Huracan") && linea2.equals("2017")) {
                    imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/LH2017.jpg"));
                    valor.setText(String.valueOf(cloneLambo2.getValor()));
                    imp.AsignarDatos(Integer.valueOf(valor.getText()));
                    ValImp.setText(String.valueOf(imp.ImpuestoTotal()));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el Lamborghini del modelo/linea que usted desea");
                }
            }
        }
        if (marca2.equals("Ford")) {
            if (modelo2.equals("Fiesta") && linea2.equals("2016")) {
                imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/FF2016.jpg"));
                valor.setText(String.valueOf(cloneFord.getValor()));
                imp.AsignarDatos(Integer.valueOf(valor.getText()));
                ValImp.setText(String.valueOf(imp.ImpuestoTotal()));
            } else {
                if (modelo2.equals("Puma") && linea2.equals("2014")) {
                    imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/FP2014.jpg"));
                    valor.setText(String.valueOf(cloneFord2.getValor()));
                    imp.AsignarDatos(Integer.valueOf(valor.getText()));
                    ValImp.setText(String.valueOf(imp.ImpuestoTotal()));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el Ford del modelo/linea que usted desea");
                }
            }
        }
    }

    public InterfazImpuesto() {
        initComponents();
        this.setLocationRelativeTo(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imagenCarro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        linea = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Ppago = new javax.swing.JCheckBox();
        Trans = new javax.swing.JCheckBox();
        Spublico = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ValorImp = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        ValImp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Impuesto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 468));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 468));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 468));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenCarro.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        imagenCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Base.jpg"))); // NOI18N
        imagenCarro.setMaximumSize(new java.awt.Dimension(600, 470));
        imagenCarro.setMinimumSize(new java.awt.Dimension(600, 470));
        jPanel1.add(imagenCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel2.setText("Marca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel3.setText("Linea");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 187, -1, -1));

        jLabel4.setText("Modelo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 149, -1, -1));

        jLabel5.setText("Valor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 225, -1, -1));

        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 108, 101, -1));
        jPanel1.add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 184, 101, -1));
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 146, 101, -1));

        valor.setEditable(false);
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 222, 101, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Calculadora de Impuestos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 22, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Datos del Vehiculo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 88, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descuentos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 285, -1, -1));

        Ppago.setBackground(new java.awt.Color(153, 153, 153));
        Ppago.setText("Pronto Pago");
        jPanel1.add(Ppago, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 327, -1, -1));

        Trans.setBackground(new java.awt.Color(153, 153, 153));
        Trans.setText("Translado");
        jPanel1.add(Trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 327, -1, -1));

        Spublico.setBackground(new java.awt.Color(153, 153, 153));
        Spublico.setText("Servicio Público");
        jPanel1.add(Spublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("CALCULAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor impuesto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));
        jPanel1.add(ValorImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 488, 153, 25));

        Limpiar.setBackground(new java.awt.Color(204, 204, 204));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 80, -1));

        ValImp.setEditable(false);
        ValImp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ValImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 160, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            CrearClones();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(InterfazImpuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        marca.setText("");
        modelo.setText("");
        linea.setText("");
        valor.setText("");
        ValImp.setText("");
        imagenCarro.setIcon(new ImageIcon("C:/Users/snell/OneDrive/Escritorio/ProyectoFPoo/src/Imagenes/Base.jpg"));
    }//GEN-LAST:event_LimpiarActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazImpuesto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    public static javax.swing.JCheckBox Ppago;
    public static javax.swing.JCheckBox Spublico;
    public static javax.swing.JCheckBox Trans;
    public static javax.swing.JTextField ValImp;
    private javax.swing.JLabel ValorImp;
    private javax.swing.JLabel imagenCarro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField linea;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    public static javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
