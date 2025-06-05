import java.awt.*;
import java.awt.event.*;

// Implementing ActionListener and MouseListener
public class EventHandlingExample extends Frame implements ActionListener, MouseListener {
    
    // Components
    Label label;
    TextField textField;
    Button button;

    // Constructor
    public EventHandlingExample() {
        // Frame properties
        setTitle("AWT Event Handling");
        setSize(500, 300);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        
        // Label
        label = new Label("Enter your name:");
        label.setBounds(50, 50, 200, 30);
        add(label);
        
        // TextField
        textField = new TextField();
        textField.setBounds(50, 90, 200, 30);
        add(textField);

        // Button
        button = new Button("Submit");
        button.setBounds(50, 130, 80, 30);
        button.addActionListener(this); // Registering ActionListener
        button.addMouseListener(this);  // Registering MouseListener
        add(button);

        // Window Closing Event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    // 🔹 ActionListener method (Handles button click event)
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        if (!name.isEmpty()) {
            label.setText("Hello, " + name + "!");
        } else {
            label.setText("Please enter your name!");
        }
    }

    // 🔹 MouseListener methods (Handles mouse events)
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked on Button!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Button!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Button!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed on Button!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released on Button!");
    }

    public static void main(String[] args) {
        new EventHandlingExample();
    }
}
