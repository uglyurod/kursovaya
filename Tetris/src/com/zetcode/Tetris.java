package com.zetcode;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {


	private static final long serialVersionUID = 1L;
	private JLabel statusbar;

    public Tetris() {

        initUI();
    }

    //Настройка окна
    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        Board board = new Board(this);
        add(board);
        board.start();

        setTitle("Тетрис Самойлов БСУ1901");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Tetris game = new Tetris();
            game.setVisible(true);
        });
    }
}