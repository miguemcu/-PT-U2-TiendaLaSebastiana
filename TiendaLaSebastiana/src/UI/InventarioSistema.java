/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Entities.Producto;
import Gestión.Caja;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.JToggleButton;

public class InventarioSistema extends javax.swing.JFrame {

    private void setearCampos(Producto producto) {
        txtNombre.setEditable(false);
        txtTipo.setEditable(false);
        txtID.setEditable(false);
        txtCantidad.setEditable(false);
        txtPrecio.setEditable(false);
        txtPrecioMayorista.setEditable(false);
        txtNombre.setText(producto.getNombre());
        txtTipo.setText(String.valueOf(producto.getTipoProducto()));
        txtID.setText(String.valueOf(producto.getId()));
        Double cantidad = parent.getCaja().getInventario().getCantidades().get(producto.getId());
        txtCantidad.setText(Double.toString(cantidad));
        txtPrecio.setText(String.valueOf(producto.getPrecio()));
        txtPrecioMayorista.setText(String.valueOf(producto.getPrecioMayorista()));
        txtFichaProducto.setText(producto.imprimirFicha());
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecioMayorista.setText("");
        txtPrecio.setText("");
        txtID.setText("");
        txtTipo.setText("");
        txtFichaProducto.setText("");
    }
    private Main parent;
    private Producto productoBuscado;

    public InventarioSistema(Main parent) {
        this.productoBuscado = null;
        this.parent = parent;
        initComponents();
    }

    public JToggleButton getBtnCrearProducto() {
        return btnCrearProducto;
    }

    public void setBtnCrearProducto(JToggleButton btnCrearProducto) {
        this.btnCrearProducto = btnCrearProducto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearProducto = new javax.swing.JToggleButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecioMayorista = new javax.swing.JLabel();
        lblPrecioMenor = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioMayorista = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtError = new javax.swing.JTextArea();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JToggleButton();
        txtCantidadAjustar = new javax.swing.JTextField();
        btnAjustarCantidad = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFichaProducto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblTipo.setText("Tipo");

        lblCantidad.setText("Cantidad");

        lblPrecioMayorista.setText("Precio Mayor");

        lblPrecioMenor.setText("Precio Menor");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtError.setColumns(20);
        txtError.setRows(5);
        jScrollPane1.setViewportView(txtError);

        lblID.setText("       ID");

        btnRegresar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtCantidadAjustar.setMaximumSize(new java.awt.Dimension(124, 22));
        txtCantidadAjustar.setMinimumSize(new java.awt.Dimension(124, 22));
        txtCantidadAjustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadAjustarActionPerformed(evt);
            }
        });

        btnAjustarCantidad.setText("Ajustar cantidad");
        btnAjustarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustarCantidadActionPerformed(evt);
            }
        });

        txtFichaProducto.setColumns(20);
        txtFichaProducto.setRows(5);
        jScrollPane2.setViewportView(txtFichaProducto);

        jLabel1.setText("Ficha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblNombre)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidad)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo)))
                    .addComponent(lblPrecioMayorista)
                    .addComponent(lblPrecioMenor)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrecioMayorista, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAjustarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadAjustar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRegresar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnCrearProducto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAjustarCantidad)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidadAjustar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCantidad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecioMayorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioMayorista))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioMenor))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        var crearProducto = new CreacionProducto(parent, parent.getCaja(), parent.getCaja().getInventario());
        crearProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarCampos();
        String busqueda = txtBuscar.getText();
        try {
            if (busqueda.isEmpty() || busqueda.isBlank()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            boolean encontrado = false;

            // Obtenemos la lista de productos
            List<Producto> productos = parent.getCaja().getInventario().getProductos();

            if (busqueda.matches("\\d+")) {
                long id = Long.parseLong(busqueda);
                for (Producto producto : productos) {
                    if (producto.getId() == id) {
                        this.productoBuscado = producto;
                        setearCampos(this.productoBuscado);
                        encontrado = true;
                        break;
                    }
                }
            } else {
                for (Producto producto : productos) {
                    if (producto.getNombre().equalsIgnoreCase(busqueda)) {
                        this.productoBuscado = producto;
                        setearCampos(producto);
                        encontrado = true;
                        break;
                    }
                }
            }

            if (!encontrado) {
                throw new NoSuchElementException("Producto no encontrado.");
            }

        } catch (IllegalArgumentException ex) {
            txtError.setText(ex.getMessage());
        } catch (Exception ex) {
            txtError.setText("Error inesperado: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCantidadAjustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadAjustarActionPerformed

    }//GEN-LAST:event_txtCantidadAjustarActionPerformed

    private void btnAjustarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustarCantidadActionPerformed

        try {
            String cantidad = txtCantidadAjustar.getText().trim();
            String busqueda = txtBuscar.getText();


            
            if (busqueda.isEmpty() || busqueda.isBlank() || cantidad.isBlank() || cantidad.isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");

            } else {
                if (!cantidad.matches("\\d+")) {
                throw new IllegalArgumentException("La cantidad solo debe contener números.");
            }
                if (this.productoBuscado == null) {
                    throw new IllegalArgumentException("Producto no encontrado.");
                }
            }
            Double cantidadAjustar = Double.valueOf(cantidad);
            parent.getCaja().getInventario().getCantidades().replace(this.productoBuscado.getId(), cantidadAjustar);
            
        } catch (IllegalArgumentException ex) {
            txtError.setText(ex.getMessage());
        } catch (Exception ex) {
            txtError.setText("Error inesperado: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAjustarCantidadActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAjustarCantidad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JToggleButton btnCrearProducto;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioMayorista;
    private javax.swing.JLabel lblPrecioMenor;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadAjustar;
    private javax.swing.JTextArea txtError;
    private javax.swing.JTextArea txtFichaProducto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioMayorista;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
