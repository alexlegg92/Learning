import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Recap extends javax.swing.JFrame{
    // essential components
    private final JSplitPane splitPane;        // split the window into top and bottom
    private final JPanel topPanel;             // container panel for the top
    private final JPanel bottomPanel;          // container panel for the bottom
    private JTextArea questionTextArea;        // the question text area
    private JTextArea answerTextArea;          // the answer text area
    private final JButton showButton;          // and a "show" button
    private final JButton nextButton;          // and a "next" button
    public String currentQuestion;
    public String currentAnswer;

    public void myMethod(){
        HashMap<String, String> questionAndAnswer = new HashMap<String, String>();
        questionAndAnswer.put("Question1", "Answer1");
        questionAndAnswer.put("Question2", "Answer2");
        questionAndAnswer.put("Question3", "Answer3");
        questionAndAnswer.put("Question4", "Answer4");
        questionAndAnswer.put("Question5", "Answer5");

        for (String i : questionAndAnswer.keySet()){
            System.out.println("key: " + i + " value: " + questionAndAnswer.get(i));
            currentQuestion = i;
            showButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    currentAnswer = questionAndAnswer.get(i);
                }
            });
        }

        questionTextArea.setText(currentQuestion);
        answerTextArea.setText(currentAnswer);
    }

    public Recap(){
        // create containers. splitPane devides the window into two components (here: top and bottom)
        splitPane = new JSplitPane();

        // components
        topPanel = new JPanel(new BorderLayout());
        bottomPanel = new JPanel(new BorderLayout());

        questionTextArea = new JTextArea();
        answerTextArea = new JTextArea();
        showButton = new JButton("SHOW");
        nextButton = new JButton("NEXT");

        // define the default size of window
        setPreferredSize(new Dimension(500, 500));
        // contentPane is the container that holds all our components
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(splitPane); // due to the GridLayout, our splitPane will now fill the whole window

        // configure splitPane
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);    // split the window vertically
        splitPane.setDividerLocation(200);                      // position of the divider is 200 (window is 500 pixels high)
        splitPane.setTopComponent(topPanel);
        splitPane.setBottomComponent(bottomPanel);

        topPanel.add(questionTextArea, BorderLayout.CENTER);
        topPanel.add(showButton, BorderLayout.SOUTH);
        bottomPanel.add(answerTextArea, BorderLayout.CENTER);
        bottomPanel.add(nextButton, BorderLayout.SOUTH);

        // calling pack() at the end will ensure that every layout and size defined gets applied before the stuff becomes visible
        pack();
        myMethod();
    }

    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Recap().setVisible(true);
            }
        });
    }
}