/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.wellington.apresentacao;

import br.edu.ifnmg.wellington.entidade.Usuario;
import br.edu.ifnmg.wellington.exception.LoginInvalidoException;
import br.edu.ifnmg.wellington.exception.SenhaInvalidaException;
import br.edu.ifnmg.wellington.negocio.UsuarioBO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Were
 */
public class TelaDeUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeUsuarios
     */
    protected ListagemUsuarios telaListagemUsuarios;
    int estadoTela = 0;
    Usuario usuarioEmEdicao = new Usuario();

    public TelaDeUsuarios(ListagemUsuarios ListagemUsuarios) {
        initComponents();
        this.telaListagemUsuarios = ListagemUsuarios;
    }

    public TelaDeUsuarios(Usuario usuario, int estadoTela, ListagemUsuarios ListagemUsuarios) {
        initComponents();
        this.estadoTela = estadoTela;
        this.preecherCamposTela(usuario);
        this.telaListagemUsuarios = ListagemUsuarios;
    }

    public TelaDeUsuarios() {
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

        jPanel1 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        ckbGerente = new javax.swing.JCheckBox();
        ckbGestorCompras = new javax.swing.JCheckBox();
        ckbGestorEstoque = new javax.swing.JCheckBox();
        ckbCaixeiro = new javax.swing.JCheckBox();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Usuarios");
        setResizable(false);

        lblSenha.setText("Senha");

        lblLogin.setText("Login");

        lblNome.setText("Nome");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo de Trabalho"));

        ckbGerente.setText("Gerente");

        ckbGestorCompras.setText("Gestor de compras");

        ckbGestorEstoque.setText("Gestor de estoque");

        ckbCaixeiro.setText("Caixeiro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbGestorEstoque)
                    .addComponent(ckbGerente))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbGestorCompras)
                    .addComponent(ckbCaixeiro)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbGerente)
                    .addComponent(ckbGestorCompras))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbGestorEstoque)
                    .addComponent(ckbCaixeiro))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLogin)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenha))
                            .addComponent(txtNomeUsuario))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.limparCamposTela();
        try {
            if (this.telaListagemUsuarios != null) {
                this.telaListagemUsuarios.carregarTabelaDeUsuarios();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Pode haver perda de dados. Favor confirmar se quer executar esta ação. ", "Gerência de usuário", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.NO_OPTION) {
            //System.exit(0);
            this.dispose();
        } else {
            try {
                this.pesquisaUsuario();
                this.estadoTela = 1;
            } catch (LoginInvalidoException l) {
                String mensagem = "Aviso!\n" + l.getMessage();
                JOptionPane.showMessageDialog(this, mensagem, "Login", JOptionPane.WARNING_MESSAGE);
                l.printStackTrace(System.out);
            } catch (SQLException ex) {
                Logger.getLogger(TelaDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Pode haver perda de dados. Favor confirmar se quer executar esta ação. ", "Gerência de usuário", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.NO_OPTION) {
            //System.exit(0);
            this.dispose();
        } else {
            try {
                this.recuperarCamposTela();
            } catch (LoginInvalidoException l) {
                String mensagem = "Aviso!\n" + l.getMessage();
                JOptionPane.showMessageDialog(this, mensagem, "Login", JOptionPane.WARNING_MESSAGE);
            } catch (SenhaInvalidaException s) {
                String mensagem = "Aviso!\n" + s.getMessage();
                JOptionPane.showMessageDialog(this, mensagem, "Login", JOptionPane.WARNING_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(TelaDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (this.estadoTela == 1) {
            try {
                this.excluirUsuario();
                this.estadoTela = 0;
            } catch (SQLException ex) {
                Logger.getLogger(TelaDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckbCaixeiro;
    private javax.swing.JCheckBox ckbGerente;
    private javax.swing.JCheckBox ckbGestorCompras;
    private javax.swing.JCheckBox ckbGestorEstoque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void recuperarCamposTela() throws SQLException {
        if (txtLogin.getText().trim().equals(""))
            throw new LoginInvalidoException("O campo de login está vazio\n");
        else 
            this.usuarioEmEdicao.setLogin(txtLogin.getText().trim());        

        if (txtSenha.getText().trim().equals("")) 
            throw new SenhaInvalidaException("Campo Senha está vazio\n");
        else 
            this.usuarioEmEdicao.setSenha(txtSenha.getText().trim());        

        if (txtNomeUsuario.getText().equals("")) 
            throw new LoginInvalidoException("Campo Nome está vazio\n");
        else 
            this.usuarioEmEdicao.setNome(txtNomeUsuario.getText().trim());        

        if (ckbCaixeiro.isSelected()) 
            this.usuarioEmEdicao.setGrupoUsuario("Caixeiro");
        
        if (ckbGerente.isSelected()) 
            this.usuarioEmEdicao.setGrupoUsuario("Gerente");
        
        if (ckbGestorCompras.isSelected()) 
            this.usuarioEmEdicao.setGrupoUsuario("Gestor de compras");
        
        if (ckbGestorEstoque.isSelected())
            this.usuarioEmEdicao.setGrupoUsuario("Gestor de estoque");
        
        verificaEditarOuSalvar(estadoTela, usuarioEmEdicao);
    }

    public void verificaEditarOuSalvar(int estadoTela, Usuario usuarioEmEdicao) throws SQLException {
        if (this.estadoTela == 1) {
            this.atualizarUsuario(usuarioEmEdicao);
        } else {
            this.salvarUsuario(usuarioEmEdicao);
        }
    }

    private void salvarUsuario(Usuario usuario) throws SQLException {
        try {
            UsuarioBO usuarioBO = new UsuarioBO();
            usuarioBO.verificaDados(usuario, this.estadoTela);
            this.limparCamposTela();
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "Gerenciamento de usuário", JOptionPane.INFORMATION_MESSAGE);
        } catch (RuntimeException r) {
            JOptionPane.showMessageDialog(this, "algum campo está vazio", "Gerenciamento de usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void atualizarUsuario(Usuario usuarioEmEdicao) throws SQLException {
        try {
            UsuarioBO usuarioBO = new UsuarioBO();
            usuarioBO.verificaDados(usuarioEmEdicao, this.estadoTela);
            this.limparCamposTela();
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "Gerenciamento de usuário", JOptionPane.INFORMATION_MESSAGE);
        } catch (RuntimeException r) {
            JOptionPane.showMessageDialog(this, "algum campo está vazio", "Gerenciamento de usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void pesquisaUsuario() throws SQLException {
        UsuarioBO usuarioBO = new UsuarioBO();
        Usuario usuario = usuarioBO.buscarUsuarioPorLogin(txtLogin.getText().trim());
        if (usuario.getLogin() == null) {
            throw new LoginInvalidoException("O login de usuário não corresponde a nenhum usuário cadastrado.");
        }
        this.preecherCamposTela(usuario);
    }

    private void preecherCamposTela(Usuario usuario) {
        txtLogin.setText(usuario.getLogin());
        txtNomeUsuario.setText(usuario.getNome());
        txtSenha.setText(usuario.getSenha());
        this.usuarioEmEdicao.setId(usuario.getId());
    }

    private void limparCamposTela() {
        txtLogin.setText("");
        txtNomeUsuario.setText("");
        txtSenha.setText("");
        ckbCaixeiro.setSelected(false);
        ckbGerente.setSelected(false);
        ckbGestorCompras.setSelected(false);
        ckbGestorEstoque.setSelected(false);
    }

    private void excluirUsuario() throws SQLException {
        UsuarioBO usuarioBO = new UsuarioBO();
        if (txtLogin.getText().trim().equals("")) {
            throw new LoginInvalidoException("O campo de login está vazio\n");
        } else {
            int i = JOptionPane.showConfirmDialog(this, "Pode haver perda de dados. Favor confirmar se quer executar esta ação. ", "Deletar usuário", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.NO_OPTION) {
                this.dispose();
            } else {
                usuarioEmEdicao.setLogin(txtLogin.getText().trim());
                usuarioBO.excluirUsuario(usuarioEmEdicao);
                this.limparCamposTela();
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!", "Exclusão de usuário", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

}
