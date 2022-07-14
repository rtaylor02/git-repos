package memorygames.numbersequence;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String...args){
        Gui gui = new Gui();
        gui.show();
    }
}

class Gui {
    private JFrame frame;
    private JButton btnGenerateSequence;
    private JTextField tfUserInput;
    private JLabel lblSequence, lblSpeed, lblUserInput;
    private JSlider sSpeed;
    private JPanel panel;
    private JRadioButton rbLevel1, rbLevel2, rbLevel3, rbLevel4, rbLevel5;
    private ButtonGroup buttonGroup;
    private int delay;
    private Timer timer;
    private static int totalSequences, correctAnswers;

    void init() {
        frame = new JFrame();
        frame.setLayout(new GridLayout(7,1));
        // 4 rows: label, textfield, speed slider, button
        btnGenerateSequence = new JButton("New sequence");
        tfUserInput = new JTextField();
        tfUserInput.setEditable(false);
        lblSequence = new JLabel();
        lblSequence.setFont(new Font("Serif", Font.BOLD,40));
        lblSequence.setHorizontalAlignment(JLabel.CENTER);
        sSpeed = new JSlider(JSlider.HORIZONTAL,50,1000,500);
        lblSpeed = new JLabel();
        lblSpeed.setHorizontalAlignment(JLabel.CENTER);
        lblUserInput = new JLabel("Answer: ");
        // Radio buttons: game level
        panel = new JPanel();
        rbLevel1 = new JRadioButton("Level 1 - Beginner");
        rbLevel2 = new JRadioButton("Level 2");
        rbLevel3 = new JRadioButton("Level 3",true);
        rbLevel4 = new JRadioButton("Level 4");
        rbLevel5 = new JRadioButton("Level 5 - Expert");
        panel.setLayout(new GridLayout(5,1));
        panel.add(rbLevel1);
        panel.add(rbLevel2);
        panel.add(rbLevel3);
        panel.add(rbLevel4);
        panel.add(rbLevel5);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbLevel1);
        buttonGroup.add(rbLevel2);
        buttonGroup.add(rbLevel3);
        buttonGroup.add(rbLevel4);
        buttonGroup.add(rbLevel5);
        rbLevel1.setActionCommand("1");
        rbLevel2.setActionCommand("2");
        rbLevel3.setActionCommand("3");
        rbLevel4.setActionCommand("4");
        rbLevel5.setActionCommand("5");
    }

    void addActionListeners() {
        // Slider action listener
        sSpeed.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                delay = sSpeed.getValue();
                lblSpeed.setText(String.valueOf(delay));
            }
        });

        // Buttons action listener
        btnGenerateSequence.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer = new Timer(sSpeed.getValue(), new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblSequence.setVisible(false);
                        timer.stop();
                        tfUserInput.setEditable(true);
                        tfUserInput.requestFocus();
                    }
                });

                // Get the sequence and show it to GUI
                SequenceHandler sh = new SequenceHandler(getSequenceNumber());
                lblSequence.setText(sh.toString());
                lblSequence.setVisible(true);

                totalSequences++;

                timer.start();
            }
        });

        // User input when pressing enter
        tfUserInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove all spaces
                String sequence = lblSequence.getText().replaceAll("\\s","");
                String input = tfUserInput.getText().replaceAll("\\s","");
                System.out.println(sequence);
                System.out.println(input);
                if(sequence.equals(input)) {
                    correctAnswers++;
                }
                System.out.println("Correct answers: " + correctAnswers
                        + "/" + totalSequences);

                tfUserInput.setText("");
                tfUserInput.setEditable(false);

                btnGenerateSequence.requestFocus();
            }
        });

        // User input only takes numerics
        tfUserInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                String value = tfUserInput.getText();
                int l = value.length();
                if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') ||
                        (e.getKeyCode() == 8) || (e.getKeyCode() == 127) ||
                        (e.getKeyCode() == 10)) {
                    tfUserInput.setEditable(true);
                    lblUserInput.setText("Answer:");
                } else {
                    tfUserInput.setEditable(false);
                    lblUserInput.setText("Answer: only numeric input (0-9)");
                }
            }
        });
    }

    void show() {
        // Initialisation
        init();

        // Add all necessary action listeners
        addActionListeners();

        // Adding components
        frame.add(lblSequence);
        frame.add(lblUserInput);
        frame.add(tfUserInput);
        frame.add(lblSpeed);
        frame.add(sSpeed);
        frame.add(panel);
        frame.add(btnGenerateSequence);

        // Build gui
        frame.setBounds(1000, 400, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private int getSequenceNumber() {
        int totalSequenceNumber = 0;

        switch(buttonGroup.getSelection().getActionCommand()) {
            case "1": totalSequenceNumber = 3; break;
            case "2": totalSequenceNumber = 4; break;
            case "3": totalSequenceNumber = 6; break;
            case "4": totalSequenceNumber = 8; break;
            case "5": totalSequenceNumber = 10; break;
            default: totalSequenceNumber = 3; break;
        }
        return totalSequenceNumber;
    }
}

class SequenceHandler {
    private List<Integer> li;
    private int numberOfSequence;
    public static final int MIN_SEQUENCE_NUMBER = 3;
    public static final int MAX_SEQUENCE_NUMBER = 10;
    public static final int TOTAL_LEVELS = 5;

    SequenceHandler(int numberOfSequence) {
        try {
            // Validate input
            if((MIN_SEQUENCE_NUMBER < 3) || (MAX_SEQUENCE_NUMBER > 10)) {
                throw new IllegalArgumentException();
            }

            this.numberOfSequence = numberOfSequence;
            li = sequenceProducer(numberOfSequence);
        } catch( IllegalArgumentException iae) {
            System.out.println("==================ERROR====================");
            System.out.println("Error: Total sequence number: outside range");
            System.out.println("              Min: 3. Max: 10              ");
            System.out.println("===========================================");
        }
    }

    private List<Integer> sequenceProducer(int numberOfSequence) {
        List<Integer> li = new ArrayList<>();

        // Create the sequence
        for(; numberOfSequence > 0; numberOfSequence--) {
            li.add(new Integer((int)(Math.random() * 10)));
        }

        return li;
    }

    @Override
    public String toString() {
        String result = "";

        try {
            for(int i = 0; i < li.size(); i++) {
                result += li.get(i).toString() + " ";
            }

            result = result.trim(); // Get rid of the trailing space
        } catch(NullPointerException npe) {
            System.out.println("No sequence to print");
        }

        return result;
    }
}
