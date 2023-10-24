
package Registro_Salida;


import Appinvent.Menu;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario_Salida extends javax.swing.JFrame {
Proceso_salida proceso=new Proceso_salida ();
Util_Salida entrada;

String ruta_txt="BD_Entradas.txt";
    public Formulario_Salida() {
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
                entrada=new Util_Salida();
                entrada.setId_entrada(Integer.parseInt(st.nextToken()));
                entrada.setProducto(st.nextToken());
                entrada.setStock(Integer.parseInt(st.nextToken()));
                entrada.setFecha(st.nextToken());
                
                
                proceso.agregarRegistro(entrada);
            }
             br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//***********************************************************
public void mostrarRegistros(){
    DefaultTableModel dtm=new DefaultTableModel();
    dtm.addColumn("N_Operación");
    dtm.addColumn("Producto");
    dtm.addColumn("Cantidad");
    dtm.addColumn("Fecha");
    
    Object[]fila=new Object[dtm.getColumnCount()];
    for(int i=0;i<proceso.cantidadRegistros();i++){
        entrada=proceso.obtenerRegistro(i);
        
        fila[0]=entrada.getId_entrada();
        fila[1]=entrada.getProducto();
        fila[2]=entrada.getStock();
        fila[3]=entrada.getFecha();
        dtm.addRow(fila);
    }
    this.tabla.setModel(dtm);
    this.tabla.setRowHeight(25);
}    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollBar1 = new javax.swing.JScrollBar();
        txtOperacion = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtOperacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
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
        jLabel1.setText("REGISTRO DE SALIDA");
        jLabel1.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("n° Operación:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Producto:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salidamerca.jpg"))); // NOI18N

        txtProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manzana", "Platano", "Sandia", "Melon", "Mandarina", "Maracuya", "Naranja", "Uva", "Lechuga", "Zanahoria", "Tomate", "Limon" }));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salidamenu.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10))
                            .addComponent(jLabel8))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtOperacion)
                                .addComponent(txtStock)
                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
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
        if(txtOperacion.getText().trim().length()==0||txtStock.getText().trim().length()==0){
        JOptionPane.showMessageDialog(null,"Ingrese Datos","DATOS",JOptionPane.ERROR_MESSAGE);
    }
        else{
        File ruta=new File(ruta_txt);
         grabarRegistro(ruta);
        }
    }//GEN-LAST:event_btnGrabarActionPerformed
//set obtener valor get mostrar
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
         estadoBotones(false);       
        //int clic=tabla.rowAtPoint(evt.getPoint());
       int clic=tabla.getSelectedRow();
       int id=Integer.parseInt(this.tabla.getValueAt(clic, 0).toString());
       String pro=this.tabla.getValueAt(clic, 1).toString();
       int st=Integer.parseInt(this.tabla.getValueAt(clic, 2).toString());
       String cos=this.tabla.getValueAt(clic,3).toString();
       
       this.txtOperacion.setText(""+id);
       //this.txtProducto.setText(getSelectedItem().toString());
       this.txtStock.setText(""+st);
       this.txtFecha.setText(""+cos);
    }//GEN-LAST:event_tablaMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
          int rpta=JOptionPane.showConfirmDialog(this,"¿Seguro de Salir?","SALIR",JOptionPane.YES_NO_OPTION);
        if(rpta==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         File ruta=new File(ruta_txt);
        
         int id=Integer.parseInt(this.txtOperacion.getText());
         String pro= this.txtProducto.getSelectedItem().toString();
         int st=Integer.parseInt(this.txtStock.getText());
         String cos=this.txtFecha.getText();
         
         int encontrado=proceso.buscarCodigo(id);
         //Util_Entrada entrada;
         entrada=new Util_Salida(id,pro,st,cos);
         
         if(encontrado==-1) proceso.agregarRegistro(entrada);
         else proceso.modificarRegistro(encontrado, entrada);
         
        grabar_txt();
        mostrarRegistros();
        limpiarCajas();
        estadoBotones(true);
        this.txtOperacion.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
               int codigo=Integer.parseInt(this.txtOperacion.getText());
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
                     this.txtOperacion.setEnabled(true);
                 }
                 else{
                      limpiarCajas();
                     estadoBotones(true);
                     this.txtOperacion.setEnabled(true);
                     this.tabla.clearSelection();
                 }
             }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        Menu sesion=new Menu ();
        sesion.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked
//******************************************************************************
    public void grabarRegistro(File ruta){
        int id=Integer.parseInt(this.txtOperacion.getText());
        String pro=this.txtProducto.getSelectedItem().toString();
       
        int st=Integer.parseInt(this.txtStock.getText());
        String cos=this.txtFecha.getText();
        //this.txtProducto.setText(getSelectedItem().toString());
        
        entrada=new Util_Salida(id,pro,st,cos);
        if(proceso.buscarCodigo(id)!=-1){
            JOptionPane.showMessageDialog(null, "El código ya Existe","CODIGO",JOptionPane.WARNING_MESSAGE);
        }
        else{proceso.agregarRegistro(entrada);}
        grabar_txt();
        mostrarRegistros();
        limpiarCajas();
    }
    //*******************************************************
    public void limpiarCajas(){
        this.txtOperacion.setText("");
        
        this.txtStock.setText("");
        this.txtFecha.setText("");
        this.txtOperacion.requestFocus();
    }
    //*******************************************************
    public void grabar_txt(){
        FileWriter fw;
        PrintWriter pw;
        try {
            fw=new FileWriter(ruta_txt);
            pw=new PrintWriter(fw);
            for(int i=0;i<proceso.cantidadRegistros();i++){
                entrada=proceso.obtenerRegistro(i);
                pw.println(entrada.getId_entrada()+","+entrada.getProducto()+","+entrada.getStock()+","+entrada.getFecha());
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
                new Formulario_Salida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JComboBox<String> txtProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
