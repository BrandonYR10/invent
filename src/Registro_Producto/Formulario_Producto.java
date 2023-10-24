
package Registro_Producto;

import Appinvent.Menu;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario_Producto extends javax.swing.JFrame {
Proceso proceso=new Proceso();
Producto producto;

String ruta_txt="BD_Productos.txt";
    public Formulario_Producto() {
        initComponents();
        Cargar_txt();
        mostrarRegistros();
        estadoBotones(true);
        this.setLocationRelativeTo(this);
    }
//***********************************************************
    public void estadoBotones(boolean E){
        this.btnGrabar.setEnabled(E);
        this.btnModificar.setEnabled(!E);
        this.btnEliminar.setEnabled(!E);
        this.btnSalir.setEnabled(E);
    }
    public void Cargar_txt(){
        File ruta=new File(ruta_txt);
        FileReader fr;
        BufferedReader br;
        try {
            fr=new FileReader(ruta);
            br=new BufferedReader(fr);
            
            String linea=null;
            while((linea=br.readLine())!=null){
                StringTokenizer st=new StringTokenizer(linea,",");
                producto=new Producto();
                producto.setCodigo(Integer.parseInt(st.nextToken()));
                producto.setNombre(st.nextToken());
                producto.setPrecio(Double.parseDouble(st.nextToken()));
                producto.setDescripcion(st.nextToken());
                
                proceso.agregarRegistro(producto);
            }
             br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//***********************************************************
public void mostrarRegistros(){
    DefaultTableModel dtm=new DefaultTableModel();
    dtm.addColumn("Código");
    dtm.addColumn("Nombre");
    dtm.addColumn("Precio");
    dtm.addColumn("Categoría");
    
    Object[]fila=new Object[dtm.getColumnCount()];
    for(int i=0;i<proceso.cantidadRegistros();i++){
        producto=proceso.obtenerRegistro(i);
        
        fila[0]=producto.getCodigo();
        fila[1]=producto.getNombre();
        fila[2]=producto.getPrecio();
        fila[3]=producto.getDescripcion();
        dtm.addRow(fila);
    }
    this.tabla.setModel(dtm);
    this.tabla.setRowHeight(25);
}    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Producto:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Costo x KG:");

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Categoría:");

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGrabar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/update.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/out.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PRODUCTO");
        jLabel1.setOpaque(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/frutas_fondo.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salidamenu.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtDescripcion)
                    .addComponent(txtPrecio)
                    .addComponent(txtCodigo))
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnModificar)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(txtCodigo.getText().trim().length()==0||txtNombre.getText().trim().length()==0||txtPrecio.getText().trim().length()==0||txtDescripcion.getText().trim().length()==0){
        JOptionPane.showMessageDialog(null,"Ingrese Datos","DATOS",JOptionPane.ERROR_MESSAGE);
    }
        else{
        File ruta=new File(ruta_txt);
         grabarRegistro(ruta);
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        estadoBotones(false);       
        //int clic=tabla.rowAtPoint(evt.getPoint());
       int clic=tabla.getSelectedRow();
       int cod=Integer.parseInt(this.tabla.getValueAt(clic, 0).toString());
       String nom=this.tabla.getValueAt(clic, 1).toString();
       double pre=Double.parseDouble(this.tabla.getValueAt(clic, 2).toString());
       String descrip=this.tabla.getValueAt(clic,3).toString();
       
       this.txtCodigo.setText(""+cod);
       this.txtNombre.setText(nom);
       this.txtPrecio.setText(""+pre);
       this.txtDescripcion.setText(descrip);
       
    }//GEN-LAST:event_tablaMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
          int rpta=JOptionPane.showConfirmDialog(this,"¿Seguro de Salir?","SALIR",JOptionPane.YES_NO_OPTION);
        if(rpta==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         File ruta=new File(ruta_txt);
        
         int cod=Integer.parseInt(this.txtCodigo.getText());
         String nom=this.txtNombre.getText();
         double precio=Double.parseDouble(this.txtPrecio.getText());
         String descri=this.txtDescripcion.getText();
         
         int encontrado=proceso.buscarCodigo(cod);
         producto=new Producto(cod,nom,precio,descri);
         
         if(encontrado==-1) proceso.agregarRegistro(producto);
         else proceso.modificarRegistro(encontrado, producto);
         
        grabar_txt();
        mostrarRegistros();
        limpiarCajas();
        estadoBotones(true);
        this.txtCodigo.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
               int codigo=Integer.parseInt(this.txtCodigo.getText());
             int encontrado=proceso.buscarCodigo(codigo);
             if(encontrado==-1) JOptionPane.showMessageDialog(null, "El codigo no existe","CODIGO",JOptionPane.ERROR_MESSAGE);
             else{
                 int s=JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar?","ELIMINAR",JOptionPane.YES_NO_OPTION);
                 if(s==JOptionPane.YES_OPTION){
                     proceso.eliminarRegistro(encontrado);
                     
                     grabar_txt();
                     mostrarRegistros();
                     limpiarCajas();
                     estadoBotones(true);
                     this.txtCodigo.setEnabled(true);
                 }
                 else{
                      limpiarCajas();
                     estadoBotones(true);
                     this.txtCodigo.setEnabled(true);
                     this.tabla.clearSelection();
                 }
             }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        Menu sesion=new Menu ();
        sesion.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked
//******************************************************************************
    public void grabarRegistro(File ruta){
        int codigo=Integer.parseInt(this.txtCodigo.getText());
        String nombre=this.txtNombre.getText();
        double precio=Double.parseDouble(this.txtPrecio.getText());
        String descripcion=this.txtDescripcion.getText();
        
        
        producto=new Producto(codigo,nombre,precio,descripcion);
        if(proceso.buscarCodigo(codigo)!=-1){
            JOptionPane.showMessageDialog(null, "El código ya Existe","CODIGO",JOptionPane.WARNING_MESSAGE);
        }
        else{proceso.agregarRegistro(producto);}
        grabar_txt();
        mostrarRegistros();
        limpiarCajas();
    }
    //*******************************************************
    public void limpiarCajas(){
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtPrecio.setText("");
        this.txtDescripcion.setText("");
        this.txtCodigo.requestFocus();
    }
    //*******************************************************
    public void grabar_txt(){
        FileWriter fw;
        PrintWriter pw;
        try {
            fw=new FileWriter(ruta_txt);
            pw=new PrintWriter(fw);
            for(int i=0;i<proceso.cantidadRegistros();i++){
                producto=proceso.obtenerRegistro(i);
                pw.println(producto.getCodigo()+","+producto.getNombre()+","+producto.getPrecio()+","+producto.getDescripcion());
            }
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//******************************************************************************************    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
