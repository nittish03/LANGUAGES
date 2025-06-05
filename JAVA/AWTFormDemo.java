import java.awt.*;
import java.awt.event.*;

public class AWTFormDemo extends Frame implements ActionListener, AdjustmentListener {
    TextField nameField;
    TextArea addressArea;
    Checkbox cbReading, cbTraveling, cbGaming;
    CheckboxGroup genderGroup;
    Choice countryChoice;
    List skillsList;
    Scrollbar scrollbar;
    Label scrollbarLabel;  // Label to show scrollbar % value
    Canvas drawingCanvas;
    Button submitButton, showDialogButton;
    Dialog messageDialog;

    public AWTFormDemo() {
        // Frame Properties
        setTitle("AWT Components Demo");
        setSize(600, 600);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        // Labels
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);

        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 90, 100, 30);
        add(genderLabel);

        Label countryLabel = new Label("Country:");
        countryLabel.setBounds(50, 130, 100, 30);
        add(countryLabel);

        Label hobbiesLabel = new Label("Hobbies:");
        hobbiesLabel.setBounds(50, 170, 100, 30);
        add(hobbiesLabel);

        Label skillsLabel = new Label("Skills:");
        skillsLabel.setBounds(50, 210, 100, 30);
        add(skillsLabel);

        Label addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 260, 100, 30);
        add(addressLabel);

        // TextField
        nameField = new TextField();
        nameField.setBounds(150, 50, 200, 30);
        add(nameField);

        // Gender Radio Buttons
        genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        male.setBounds(150, 90, 60, 30);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        female.setBounds(220, 90, 70, 30);
        add(male);
        add(female);

        // Choice (Dropdown)
        countryChoice = new Choice();
        countryChoice.setBounds(150, 130, 200, 30);
        countryChoice.add("USA");
        countryChoice.add("Canada");
        countryChoice.add("UK");
        countryChoice.add("India");
        countryChoice.add("Australia");
        add(countryChoice);

        // Checkboxes for hobbies
        cbReading = new Checkbox("Reading");
        cbReading.setBounds(150, 170, 80, 30);
        cbTraveling = new Checkbox("Traveling");
        cbTraveling.setBounds(230, 170, 80, 30);
        cbGaming = new Checkbox("Gaming");
        cbGaming.setBounds(310, 170, 80, 30);
        add(cbReading);
        add(cbTraveling);
        add(cbGaming);

        // List for skills
        skillsList = new List(4, true);
        skillsList.setBounds(150, 210, 200, 40);
        skillsList.add("Java");
        skillsList.add("Python");
        skillsList.add("C++");
        skillsList.add("JavaScript");
        add(skillsList);

        // TextArea with ScrollPane
        addressArea = new TextArea("", 3, 30);
        ScrollPane addressScroll = new ScrollPane();
        addressScroll.add(addressArea);
        addressScroll.setBounds(150, 260, 200, 60);
        add(addressScroll);

        // Scrollbar
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100);
        scrollbar.setBounds(150, 330, 200, 20);
        scrollbar.addAdjustmentListener(this);
        add(scrollbar);

        // Label to show scrollbar value as percentage
        scrollbarLabel = new Label("Scrollbar Value: 50%");
        scrollbarLabel.setBounds(370, 330, 150, 20);
        add(scrollbarLabel);

        // Canvas (for drawing)
        drawingCanvas = new Canvas() {
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillOval(30, 30, 50, 50);
            }
        };
        drawingCanvas.setBounds(400, 50, 100, 100);
        drawingCanvas.setBackground(Color.WHITE);
        add(drawingCanvas);

        // Submit Button
        submitButton = new Button("Submit");
        submitButton.setBounds(150, 370, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        // Show Dialog Button
        showDialogButton = new Button("Show Dialog");
        showDialogButton.setBounds(270, 370, 100, 30);
        showDialogButton.addActionListener(this);
        add(showDialogButton);

        // Dialog (Pop-up message)
        messageDialog = new Dialog(this, "Message", true);
        messageDialog.setSize(300, 150);
        messageDialog.setLayout(new FlowLayout());
        Label dialogLabel = new Label("This is a sample AWT dialog!");
        messageDialog.add(dialogLabel);
        Button closeDialog = new Button("Close");
        closeDialog.addActionListener(e -> messageDialog.setVisible(false));
        messageDialog.add(closeDialog);

        // Menu Bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setMenuBar(menuBar);

        // Window Closing Event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("Form Submitted!");
            System.out.println("Name: " + nameField.getText());
            System.out.println("Gender: " + genderGroup.getSelectedCheckbox().getLabel());
            System.out.println("Country: " + countryChoice.getSelectedItem());
            System.out.println("Hobbies: " +
                    (cbReading.getState() ? "Reading " : "") +
                    (cbTraveling.getState() ? "Traveling " : "") +
                    (cbGaming.getState() ? "Gaming " : ""));
            System.out.println("Skills: ");
            for (String skill : skillsList.getSelectedItems()) {
                System.out.println(" - " + skill);
            }
            System.out.println("Address: " + addressArea.getText());
            System.out.println("Scrollbar Value: " + scrollbar.getValue() + "%");
        } else if (e.getSource() == showDialogButton) {
            messageDialog.setVisible(true);
        }
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int percentage = scrollbar.getValue();
        scrollbarLabel.setText("Scrollbar Value: " + percentage + "%");
    }

    public static void main(String[] args) {
        new AWTFormDemo();
    }
}
