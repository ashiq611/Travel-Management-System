/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Prity
 */
public class Payment extends JFrame{
    
    public Payment(){
        
        setLayout(null);
        setBounds(600, 220, 800, 600);
        
        JLabel label=new JLabel("Payment Method");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paym.png"));
        Image i8 = i7.getImage().getScaledInstance(700, 175, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 150, 800, 600);
        add(l4);
        
        JButton pay = new JButton("Cash");
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PayCash().setVisible(true);
            }
        });
        pay.setBounds(420, 20, 80, 40);
        add(pay);
    
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(600, 100, 80, 40);
        add(back);
        
        JButton bkash;
        bkash = new JButton("Bkash");
        bkash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        bkash.setBounds(510, 20, 80, 40);
        add(bkash);
        
        JButton nagad;
        nagad = new JButton("Nagad");
        bkash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        nagad.setBounds(600, 20, 80, 40);
        add(nagad);
        
        JButton upay;
        upay = new JButton("Upay");
        upay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        upay.setBounds(700, 20, 80, 40);
        add(upay);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
        JButton card;
        card = new JButton("Card");
        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        card.setBounds(510, 100, 80, 40);
        add(card);

    }

    public static void main(String[] args){
        new Payment().setVisible(true);
    }
    
}