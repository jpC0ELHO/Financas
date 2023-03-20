package com.ganhoseperdas.Financas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class FinancasApplication {
//extends JFrame
//	public FinancasApplication() {
//
//		setTitle("Finanças");
//		setSize(1024, 728);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//		this.setResizable(true);
//		setVisible(true);
//
//	}

	public static void main(String[] args) {
//		new FinancasApplication();
		SpringApplication.run(FinancasApplication.class, args);
	}

}
