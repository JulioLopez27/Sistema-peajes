/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import interfaces.ComboBasicoRenderer;
import java.awt.Color;
import modelo.Puesto;
import modelo.Tarifa;
import vista.celdas.CeldaEmularTransito;
import java.awt.Component;
import java.awt.Frame;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import vista.controladores.EmularTransitoControlador;


public class UIEmularTransito extends javax.swing.JDialog implements EmularTransitoVista {

    private EmularTransitoControlador controlador;

    public UIEmularTransito(Frame parent, boolean modal) {
        super(parent, modal);
        this.controlador = new EmularTransitoControlador(this);
        initComponents();
        jListTarifas.setCellRenderer(new DetalleTarifasRenderer());
        jComboPuestos.setRenderer(new ComboBasicoRenderer());
        this.controlador.cargarComboPuestos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboPuestos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        jButtonRegistrarTransito = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTarifas = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDatosTransito = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emular transito");

        jComboPuestos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPuestosItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Puesto:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tarifas:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese matricula:");

        jButtonRegistrarTransito.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarTransito.setText("Registrar");
        jButtonRegistrarTransito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarTransitoActionPerformed(evt);
            }
        });

        jButtonCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListTarifas);

        jLabel4.setText("Categoría");

        jLabel5.setText("Monto");

        jTextPaneDatosTransito.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        jTextPaneDatosTransito.setEnabled(false);
        jScrollPane1.setViewportView(jTextPaneDatosTransito);

        jLabel6.setText("Datos del tránsito registrado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboPuestos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(107, 107, 107))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonRegistrarTransito)
                                    .addComponent(jButtonCerrar))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarTransitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarTransitoActionPerformed
        this.controlador.registrarTransito((Puesto) jComboPuestos.getSelectedItem(), jTextMatricula.getText());
    }//GEN-LAST:event_jButtonRegistrarTransitoActionPerformed

    private void jComboPuestosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPuestosItemStateChanged
        this.controlador.cargarTarifasDePuesto((Puesto) jComboPuestos.getSelectedItem());
    }//GEN-LAST:event_jComboPuestosItemStateChanged

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonRegistrarTransito;
    private javax.swing.JComboBox jComboPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jListTarifas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextPane jTextPaneDatosTransito;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargarComboPuestos(List<Puesto> puestos) {
        for (Puesto p : puestos) {
            jComboPuestos.addItem(p);
        }
    }

    @Override
    public void mostrarTarifasDePuesto(List<Tarifa> tarifas) {
        jListTarifas.setListData(tarifas.toArray());
    }

    @Override
    public void mostrarDatosDeTransito(String datosTransitoAgregado) {
        jTextPaneDatosTransito.setText(datosTransitoAgregado);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    public class DetalleTarifasRenderer implements ListCellRenderer<Tarifa> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Tarifa> list, Tarifa tarifa, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaEmularTransito celdaEmularTransito = new CeldaEmularTransito();
            celdaEmularTransito.jCategoria.setText(tarifa.getCategoria().getNombre());
            celdaEmularTransito.jMonto.setText("" + tarifa.getMonto());
            celdaEmularTransito.setBackground((cellHasFocus) ? Color.lightGray : Color.white);
            return celdaEmularTransito;
        }

    }

}
