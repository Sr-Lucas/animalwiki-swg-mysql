package view;

import controller.AnimalController;
import controller.EspecieController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Animal;
import model.Especie;

public class AnimalListView extends javax.swing.JFrame {

    private static final String INSERCAO = "insercao";
    private static final String EDICAO = "edicao";
    
    private int linhaSelecionadaEditando;
    private int codigoEditando;
    private String modo;

    private ArrayList<Especie> especies;
    private ArrayList<Animal> animals;
    
    private AnimalController animalController;
    private EspecieController especieController;

    public AnimalListView() {
        animalController = new AnimalController();
        especieController = new EspecieController();
        
        initComponents();

        especies = new ArrayList<>();
        animals = new ArrayList<>();
        
        especies = especieController.listEspecie();
        especies.forEach((e) -> {
            especieCombo.addItem(e.getDescricao());
        });
        
        getAnimalsList();
        
        saveBtn.setVisible(false);
        
        setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        animalsTbl = new javax.swing.JTable();
        actionPanel = new javax.swing.JPanel();
        inserirBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        animalInfoPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        habitatTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tempVida = new javax.swing.JTextField();
        OtherInfo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        especieCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalheTxt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(205, 220, 65));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Animal WIKI");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(118, 118, 118))
        );

        animalsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Detalhes", "Habitat natural", "Tempo de vida", "Especie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(animalsTbl);

        actionPanel.setBackground(new java.awt.Color(254, 254, 254));

        inserirBtn.setText("Inserir");
        inserirBtn.setMargin(null);
        inserirBtn.setMaximumSize(null);
        inserirBtn.setMinimumSize(null);
        inserirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirBtnActionPerformed(evt);
            }
        });

        editarBtn.setText("Editar");
        editarBtn.setMargin(null);
        editarBtn.setMaximumSize(null);
        editarBtn.setMinimumSize(null);
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");
        excluirBtn.setMargin(null);
        excluirBtn.setMaximumSize(null);
        excluirBtn.setMinimumSize(null);
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Listagem de animais");

        saveBtn.setText("Save");
        saveBtn.setMargin(null);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inserirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel7.setText("Habitat natural");

        habitatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatTxtActionPerformed(evt);
            }
        });

        jLabel8.setText("Tempo de vida");

        tempVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempVidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout animalInfoPanelLayout = new javax.swing.GroupLayout(animalInfoPanel);
        animalInfoPanel.setLayout(animalInfoPanelLayout);
        animalInfoPanelLayout.setHorizontalGroup(
            animalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(animalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(animalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(habitatTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(tempVida))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        animalInfoPanelLayout.setVerticalGroup(
            animalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(animalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(habitatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addComponent(tempVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel6.setText("Espécie");

        detalheTxt.setColumns(20);
        detalheTxt.setRows(5);
        jScrollPane2.setViewportView(detalheTxt);

        jLabel9.setText("Detalhes");

        javax.swing.GroupLayout OtherInfoLayout = new javax.swing.GroupLayout(OtherInfo);
        OtherInfo.setLayout(OtherInfoLayout);
        OtherInfoLayout.setHorizontalGroup(
            OtherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OtherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(OtherInfoLayout.createSequentialGroup()
                        .addGroup(OtherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(especieCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OtherInfoLayout.setVerticalGroup(
            OtherInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherInfoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especieCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(OtherInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OtherInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(animalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirBtnActionPerformed
        setMode(INSERCAO);
    }//GEN-LAST:event_inserirBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        setMode(EDICAO);
    }//GEN-LAST:event_editarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        removerTabela(animalsTbl.getSelectedRow());
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void habitatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatTxtActionPerformed

    private void tempVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempVidaActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        saveBtn.setVisible(false);
        inserirBtn.setVisible(true);
        excluirBtn.setVisible(true);
        editarBtn.setVisible(true);
        
        saveAnimal();
        setEditable(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void getAnimalsList() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) animalsTbl.getModel();
        int size = animalsTbl.getRowCount();
        for(int i = size-1;i >= 0;i--) {
            defaultTableModel.removeRow(i);
        }
        animals = animalController.listAnimal();
        animals.forEach((e) -> {
            adicionarTabela(e);
        });
    }
    
    private void setMode(String mode) {
        this.modo = mode;
        
        if (mode.equals(EDICAO)) {
            getSelectedGridValues();
        }
        
        saveBtn.setVisible(true);
        inserirBtn.setVisible(false);
        editarBtn.setVisible(false);
        excluirBtn.setVisible(false);
        
        setEditable(true);
    }
    
    public void setEditable(boolean editable) {
        habitatTxt.setEditable(editable);
        tempVida.setEditable(editable);
        especieCombo.setEditable(editable);
        detalheTxt.setEditable(editable);
    }
    
    private void limparFields() {
        habitatTxt.setText("");
        detalheTxt.setText("");
        tempVida.setText("");
        especieCombo.setSelectedIndex(0);
    }

    private void saveAnimal() {
        Especie especie = new Especie(especieCombo.getSelectedItem().toString());
        Animal animal = new Animal(
                especie,
                tempVida.getText(),
                detalheTxt.getText(),
                habitatTxt.getText()
        );
        
        if(modo.equals(INSERCAO)) {
            animalController.criarAnimal(animal);
            getAnimalsList();
        } else {
            editarTabela(animal, linhaSelecionadaEditando);
            getAnimalsList();
        }
        
        this.modo = null;
        limparFields();
    }

    private void removerTabela(int index) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) animalsTbl.getModel();
        
        int animalCod = Integer.parseInt(defaultTableModel.getValueAt(index, 0).toString());
        
        animalController.deleteAnimal(animalCod);
        getAnimalsList();
    }
    
    private void editarTabela(Animal animal, int row) {
        animal.setCodigo(this.codigoEditando);
        animalController.updateAnimal(animal);
    }

    private void getSelectedGridValues() {
        this.linhaSelecionadaEditando = animalsTbl.getSelectedRow();
        TableModel model = animalsTbl.getModel();

        this.codigoEditando = Integer.parseInt(model.getValueAt(linhaSelecionadaEditando, 0).toString());
        detalheTxt.setText(model.getValueAt(linhaSelecionadaEditando, 1).toString());
        habitatTxt.setText(model.getValueAt(linhaSelecionadaEditando, 2).toString());
        tempVida.setText(model.getValueAt(linhaSelecionadaEditando, 3).toString());
        

        String especie = model.getValueAt(linhaSelecionadaEditando, 4).toString();
        int i = 0;
        for (Especie e : this.especies) {
            if(e.getDescricao().equals(especie)) {
                especieCombo.setSelectedIndex(i);
            }
            i++;
        }
    }

    private void adicionarTabela(Animal animal) {
        DefaultTableModel dados = (DefaultTableModel) animalsTbl.getModel();

        Object[] linha = new Object[dados.getColumnCount()];
        linha[0] = animal.getCodigo();
        linha[1] = animal.getDetalhes();
        linha[2] = animal.getHabitatNatural();
        linha[3] = animal.getTempoDeVida();
        linha[4] = animal.getEspecie().getDescricao();

        dados.addRow(linha);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnimalListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalListView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OtherInfo;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel animalInfoPanel;
    private javax.swing.JTable animalsTbl;
    private javax.swing.JTextArea detalheTxt;
    private javax.swing.JButton editarBtn;
    private javax.swing.JComboBox<String> especieCombo;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JTextField habitatTxt;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton inserirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tempVida;
    // End of variables declaration//GEN-END:variables
}
