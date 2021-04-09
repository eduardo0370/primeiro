/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogos;

import javax.swing.JOptionPane;

/**
 *
 * @author SESI_SENAI
 */
public class JogoDaVelha extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int VitoriaDoJogador1 = 0;
    int VitoriaDoJogador2 = 0;
    int PartidasEmpatadas = 0;

    public JogoDaVelha() {
        initComponents();
    }

    public void JogadorAtivo() {

        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
         }

        JogadorVencedor("X");
        JogadorVencedor("O");

    }

    public void JogadorVencedor(String Jogador) {

        // Verficando Linha
        
        if (Botao1.getText().equals(Jogador) &&
                 Botao2.getText().equals(Jogador) &&
                 Botao3.getText().equals(Jogador)) {

            System.out.println(Botao1.getText());
            if (Botao1.getText().equals("X")) {
                System.out.println("Entrou na verificacao");
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        if (Botao4.getText().equals(Jogador) &&
                 Botao5.getText().equals(Jogador) &&
                 Botao6.getText().equals(Jogador)) {

            if (Botao4.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        if (Botao7.getText().equals(Jogador) &&
                 Botao8.getText().equals(Jogador) &&
                 Botao9.getText().equals(Jogador)) {

            if (Botao7.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        //Verificando Coluna
        
        if (Botao1.getText().equals(Jogador) &&
                 Botao4.getText().equals(Jogador) &&
                 Botao7.getText().equals(Jogador)) {

            if (Botao1.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        if (Botao2.getText().equals(Jogador) &&
                 Botao5.getText().equals(Jogador) &&
                 Botao8.getText().equals(Jogador)) {

            if (Botao2.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        if (Botao3.getText().equals(Jogador) &&
                 Botao6.getText().equals(Jogador) &&
                 Botao9.getText().equals(Jogador)) {

            if (Botao3.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        // Verificando Diagonais
        
        if (Botao1.getText().equals(Jogador) &&
                 Botao5.getText().equals(Jogador) &&
                 Botao9.getText().equals(Jogador)) {

            if (Botao1.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        if (Botao3.getText().equals(Jogador) &&
                 Botao5.getText().equals(Jogador) &&
                 Botao7.getText().equals(Jogador)) {

            if (Botao3.getText().equals("X")) {
                Vencedor("Jogador  1");
            } else {
                Vencedor("Jogador 2");
            }

        }
        
        // Verificando Empate
        
        if (!Botao1.getText().equals("")&&
                !Botao2.getText().equals("")&&
                !Botao3.getText().equals("")&&
                !Botao4.getText().equals("")&&
                !Botao5.getText().equals("")&&
                !Botao6.getText().equals("")&&
                !Botao7.getText().equals("")&&
                !Botao8.getText().equals("")&&
                !Botao9.getText().equals("")){
            
            Vencedor("Empate");
        }
        
    }

    public void Vencedor(String JogadorVencedor) {

        if (JogadorVencedor.equals("Jogador  1")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Parabéns Jogador 1. Você venceu o Jogo!");
            VitoriaDoJogador1++;
            Jog1Vitoria.setText("Número de Vitórias: " + VitoriaDoJogador1);
            LimparCampos();
            
        }

        if (JogadorVencedor.equals("Jogador 2")) {
           JOptionPane.showMessageDialog(JogoDaVelha.this, "Parabéns Jogador 2. Você venceu o Jogo!");
            VitoriaDoJogador2++;
            Jog2Vitoria.setText("Número de Vitórias: " + VitoriaDoJogador2);
            LimparCampos();
            
        }
        
        if (JogadorVencedor.equals("Empate")){
           JOptionPane.showMessageDialog(JogoDaVelha.this, "O Jogo Empatou, Joguem Novamente");
            PartidasEmpatadas++;
            NumEmpate.setText("Número de Empates: " + PartidasEmpatadas);
            LimparCampos();
            
        }
        
    }
    
    public void LimparCampos() {
        
        Botao1.setText("");
        Botao2.setText("");
        Botao3.setText("");
        Botao4.setText("");
        Botao5.setText("");
        Botao6.setText("");
        Botao7.setText("");
        Botao8.setText("");
        Botao9.setText("");
        
        Jogador1Ativo = true;
        Jogador2Ativo = false;        
        
    }
    
    public void LimparPontuacao(){
        
        VitoriaDoJogador1 = 0;
        VitoriaDoJogador2 = 0;
        PartidasEmpatadas = 0;
        
        NumEmpate.setText("Número de Empates: 0");
        Jog1Vitoria.setText("Número de Vitórias: 0");
        Jog2Vitoria.setText("Número de Vitórias: 0");
        
    }
    
    
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Botao1 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        InfJogo = new javax.swing.JLabel();
        Jog1Simb = new javax.swing.JLabel();
        Jog1Vitoria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Jog2Simb = new javax.swing.JLabel();
        Jog2Vitoria = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NumEmpate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ControleJogo = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        SobreJogo = new javax.swing.JButton();
        SairJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EM BUSCA DO JOGO DA VELHA AUTOMÁTICO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Botao1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao5.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao6.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao7.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao8.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        InfJogo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        InfJogo.setText("Informações do Jogo");

        Jog1Simb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Jog1Simb.setText("Jogador 1            Simbolo: X");

        Jog1Vitoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Jog1Vitoria.setText("Número de Vitórias: 0");

        Jog2Simb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Jog2Simb.setText("Jogador 2                  Simbolo: O");

        Jog2Vitoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Jog2Vitoria.setText("Número de Vitórias: 0");

        NumEmpate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NumEmpate.setText("Número de Empates: 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfJogo)
                            .addComponent(Jog1Simb)
                            .addComponent(Jog1Vitoria)
                            .addComponent(Jog2Simb)
                            .addComponent(Jog2Vitoria)
                            .addComponent(NumEmpate))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(InfJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jog1Simb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jog1Vitoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jog2Simb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jog2Vitoria)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NumEmpate)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ControleJogo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ControleJogo.setText("Controle de Jogo");

        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SobreJogo.setText("Sobre o Jogo");
        SobreJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreJogoActionPerformed(evt);
            }
        });

        SairJogo.setText("Sair do Jogo");
        SairJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SobreJogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SairJogo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ControleJogo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ControleJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SobreJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SairJogo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao2.getText().equals("")) {
                Botao2.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao2.getText().equals("")) {
                Botao2.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao3.getText().equals("")) {
                Botao3.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao3.getText().equals("")) {
                Botao3.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao4.getText().equals("")) {
                Botao4.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao4.getText().equals("")) {
                Botao4.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao5.getText().equals("")) {
                Botao5.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao5.getText().equals("")) {
                Botao5.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao6.getText().equals("")) {
                Botao6.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao6.getText().equals("")) {
                Botao6.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao7.getText().equals("")) {
                Botao7.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao7.getText().equals("")) {
                Botao7.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao8.getText().equals("")) {
                Botao8.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao8.getText().equals("")) {
                Botao8.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao9.getText().equals("")) {
                Botao9.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao9.getText().equals("")) {
                Botao9.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao9ActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed

        if (Jogador1Ativo == true) {
            if (Botao1.getText().equals("")) {
                Botao1.setText("X");
                JogadorAtivo();
            }
        } else {
            if (Botao1.getText().equals("")) {
                Botao1.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_Botao1ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        
        LimparPontuacao();
        LimparCampos ();
        
       
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SobreJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreJogoActionPerformed
   
        new SobreOJogo(JogoDaVelha.this, true).setVisible(true);
    }//GEN-LAST:event_SobreJogoActionPerformed

    private void SairJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJogoActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairJogoActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JLabel ControleJogo;
    private javax.swing.JLabel InfJogo;
    private javax.swing.JLabel Jog1Simb;
    private javax.swing.JLabel Jog1Vitoria;
    private javax.swing.JLabel Jog2Simb;
    private javax.swing.JLabel Jog2Vitoria;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumEmpate;
    private javax.swing.JButton SairJogo;
    private javax.swing.JButton SobreJogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
