/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.celdas;


public class CeldaBonificacion extends javax.swing.JPanel {

    /**
     * Creates new form CeldaBonificaciones
     */
    public CeldaBonificacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNombreBonificacion = new javax.swing.JLabel();
        jPuesto = new javax.swing.JLabel();
        jFechaAsignada = new javax.swing.JLabel();

        jNombreBonificacion.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jNombreBonificacion.setText("Nombre Bonificacion");

        jPuesto.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jPuesto.setText("Puesto");

        jFechaAsignada.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jFechaAsignada.setText("Fecha Asignada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jNombreBonificacion)
                .addGap(169, 169, 169)
                .addComponent(jPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jFechaAsignada)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jNombreBonificacion)
                .addComponent(jPuesto)
                .addComponent(jFechaAsignada))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jFechaAsignada;
    public javax.swing.JLabel jNombreBonificacion;
    public javax.swing.JLabel jPuesto;
    // End of variables declaration//GEN-END:variables
}
