
package Registro_Proveedor;


import Appinvent.Menu;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario_Proveedor extends javax.swing.JFrame {
Proceso_proveedor proceso=new Proceso_proveedor ();
Proveedor proveedor;

String ruta_txt="BD_Proveedor.txt";
    public Formulario_Proveedor() {
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
                proveedor=new Proveedor();
                proveedor.setRuc(Integer.parseInt(st.nextToken()));
                proveedor.setNombre(st.nextToken());
                proveedor.setApellidos(st.nextToken());
                proveedor.setCategoria(st.nextToken());
                
                proceso.agregarRegistro(proveedor);
            }
             br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//***********************************************************
public void mostrarRegistros(){
    DefaultTableModel dtm=new DefaultTableModel();
    dtm.addColumn("RUC");
    dtm.addColumn("Nombre");
    dtm.addColumn("Apellidos");
    dtm.addColumn("Local");
    
    Object[]fila=new Object[dtm.getColumnCount()];
    for(int i=0;i<proceso.cantidadRegistros();i++){
        proveedor=proceso.obtenerRegistro(i);
        
        fila[0]=proveedor.getRuc();
        fila[1]=proveedor.getNombre();
        fila[2]=proveedor.getApellidos();
        fila[3]=proveedor.getCategoria();
        dtm.addRow(fila);
    }
    this.tabla.setModel(dtm);
    this.tabla.setRowHeight(25);
}    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtRuc = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        jLabel1.setText("REGISTRO DE PROVEEDOR");
        jLabel1.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nombres:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Apellidos:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("RUC:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Local:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor_fondo.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salidamenu.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtCategoria)
                            .addComponent(txtApellidos)
                            .addComponent(txtRuc))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        if(txtRuc.getText().trim().length()==0||txtNombre.getText().trim().length()==0||txtApellidos.getText().trim().length()==0||txtCategoria.getText().trim().length()==0){
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
       String apell=this.tabla.getValueAt(clic, 2).toString();
       String cate=this.tabla.getValueAt(clic,3).toString();
       
       this.txtRuc.setText(""+cod);
       this.txtNombre.setText(nom);
       this.txtApellidos.setText(""+apell);
       this.txtCategoria.setText(cate);
       
    }//GEN-LAST:event_tablaMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
          int rpta=JOptionPane.showConfirmDialog(this,"¿Seguro de Salir?","SALIR",JOptionPane.YES_NO_OPTION);
        if(rpta==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         File ruta=new File(ruta_txt);
        
         int cod=Integer.parseInt(this.txtRuc.getText());
         String nom=this.txtNombre.getText();
         String apell=this.txtApellidos.getText();
         String cate=this.txtCategoria.getText();
         
         int encontrado=proceso.buscarCodigo(cod);
         proveedor=new Proveedor(cod,nom,apell,cate);
         
         if(encontrado==-1) proceso.agregarRegistro(proveedor);
         else proceso.modificarRegistro(encontrado, proveedor);
         
        grabar_txt();
        mostrarRegistros();
        limpiarCajas();
        estadoBotones(true);
        this.txtRuc.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
               int codigo=Integer.parseInt(this.txtRuc.getText());
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
                     this.txtRuc.setEnabled(true);
                 }
                 else{
                      limpiarCajas();
                     estadoBotones(true);
                     this.txtRuc.setEnabled(true);
                     this.tabla.clearSelection();
                 }
             }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        Menu sesion=new Menu ();
        sesion.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked
//******************************************************************************
    public void grabarRegistro(File ruta){
        int codigo=Integer.parseInt(this.txtRuc.getText());
        String nombre=this.txtNombre.getText();
        String apell=this.txtApellidos.getText();
        String cate=this.txtCategoria.getText();
        
        
        proveedor=new Proveedor(codigo,nombre,apell,cate);
        if(proceso.buscarCodigo(codigo)!=-1){
            JOptionPane.showMessageDialog(null, "El código ya Existe","CODIGO",JOptionPane.WARNING_MESSAGE);
        }
        else{proceso.agregarRegistro(proveedor);}
        grabar_txt();
        mostrarRegistros();
        limpiarCajas();
    }
    //*******************************************************
    public void limpiarCajas(){
        this.txtRuc.setText("");
        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.txtCategoria.setText("");
        this.txtRuc.requestFocus();
    }
    //*******************************************************
    public void grabar_txt(){
        FileWriter fw;
        PrintWriter pw;
        try {
            fw=new FileWriter(ruta_txt);
            pw=new PrintWriter(fw);
            for(int i=0;i<proceso.cantidadRegistros();i++){
                proveedor=proceso.obtenerRegistro(i);
                pw.println(proveedor.getRuc()+","+proveedor.getNombre()+","+proveedor.getApellidos()+","+proveedor.getCategoria());
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
                new Formulario_Proveedor().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
