import java.util.ArrayList;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener
{
    // database 
    private ArrayList<StaffHire> database;

    // text fields
    private JTextField staffNameField;
    private JTextField vacancyNumberField;
    private JTextField designationTypeField;
    private JTextField jobTypeField;
    private JTextField joiningDateField;
    private JTextField qualificationField;
    private JTextField appointedByField;
    private JTextField salaryField;
    private JTextField weeklyFractionalHoursField;
    private JTextField workingHoursField;
    private JTextField wagesPerHourField;
    private JTextField startMessage;
    private JTextField displayNumberField;
    private JTextField employeeDisplayField;
    private JTextField newSalaryField;

    // JTextArea
    private JTextArea displayArea;

    // frames
    private JFrame frame;
    private JFrame mainScreenFrame; 
    private JFrame fullTimeFrame;
    private JFrame partTimeFrame;
    private JFrame displayEmployeesFrame;
    private JFrame salaryFrame;
    private JFrame shiftsFrame;

    // buttons
    private JButton addFTButton;
    private JButton addPTButton;
    private JButton clearFullButton;
    private JButton clearPartButton;
    private JButton nextPageButton;
    private JButton returnFromFullTimeButton;
    private JButton returnFromPartTimeButton;
    private JButton returnFromDisplayButton;
    private JButton fullTimeButton;
    private JButton partTimeButton;
    private JButton displayEmployeesButton;
    private JButton displayButton;
    private JButton setSalaryButton;
    private JButton setShiftsButton;
    private JButton terminateButton;
    private JButton confirmSalaryButton;
    private JButton confirmShiftsButton;

    //Button group
    private ButtonGroup group;
    private ButtonGroup group1;
    private ButtonGroup group2;

    // Radio buttons
    private JRadioButton joinedOption;
    private JRadioButton morningOption;
    private JRadioButton dayOption;
    private JRadioButton eveningOption;
    private JRadioButton terminatedOption;
    private JRadioButton permanent;
    private JRadioButton contract;
    private JRadioButton temporary;

    public GUI() {        
        database = new ArrayList<StaffHire>(); 

        frame = new JFrame("Staff Control System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(800, 600);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        JLabel backgroundLabel = new JLabel(icon);
        backgroundLabel.setLayout(new GridBagLayout()); 
        frame.setContentPane(backgroundLabel);
        
        JLabel startLabel = new JLabel("Welcome to staff control system!", JLabel.CENTER);
        startLabel.setFont(new Font("Lato", Font.BOLD, 22));

        GridBagConstraints c = new GridBagConstraints();

        c.ipadx = 10;
        c.ipady = 15;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 0, 50, 0);
        frame.add(startLabel, c);

        nextPageButton = new JButton("Next Page");
        nextPageButton.addActionListener(this);
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        frame.add(nextPageButton, c);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void mainScreen() {
        mainScreenFrame = new JFrame("Staff Control System");
        mainScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreenFrame.setLayout(new GridBagLayout());
        mainScreenFrame.setSize(800, 600);

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        JLabel backgroundLabel = new JLabel(icon);
        backgroundLabel.setLayout(new GridBagLayout()); 
        mainScreenFrame.setContentPane(backgroundLabel);        
        
        JLabel titleLabel = new JLabel("What would you like to do?");
        titleLabel.setFont(new Font("Lato", Font.BOLD, 18));
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3; 
        c.anchor = GridBagConstraints.CENTER;
        mainScreenFrame.add(titleLabel, c);

        c.gridwidth = 1;
        c.gridy = 1;
        c.ipadx = 10;
        c.ipady = 15;
        c.weightx = 0;
        c.insets = new Insets(50, 0, 0, 0);
        c.anchor = GridBagConstraints.CENTER;

        c.gridx = 0;
        fullTimeButton = new JButton("Add Full Time");
        fullTimeButton.addActionListener(this);
        mainScreenFrame.add(fullTimeButton, c);

        c.gridx = 1;
        partTimeButton = new JButton("Add Part Time");
        partTimeButton.addActionListener(this);
        mainScreenFrame.add(partTimeButton, c);

        c.gridx = 2;
        displayEmployeesButton = new JButton("Display Employees");
        displayEmployeesButton.addActionListener(this);
        mainScreenFrame.add(displayEmployeesButton, c);

        mainScreenFrame.setLocationRelativeTo(null);
        mainScreenFrame.setVisible(true);
    }

    public void fullTimeEmployee()
    {
        // initializing GUI interface
        fullTimeFrame = new JFrame("Register Full Time Employee");
        fullTimeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fullTimeFrame.setSize(800,600);
        fullTimeFrame.setLayout(new BorderLayout());
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        Image image = icon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setLayout(new BorderLayout());
        fullTimeFrame.setContentPane(backgroundLabel);

        JLabel titleLabel = new JLabel("Employee Details");
        titleLabel.setFont(new Font("Lato", Font.PLAIN, 16));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));

        JLabel staffNameLabel = new JLabel("Full name: ");
        staffNameField = new JTextField(20);
        JLabel vacancyNumberLabel = new JLabel("Vacancy number: ");
        vacancyNumberField = new JTextField(20);        
        JLabel designationTypeLabel = new JLabel("Designation: ");
        designationTypeField = new JTextField(20);
        JLabel joiningDateLabel = new JLabel("Joining date: ");
        joiningDateField = new JTextField(20);
        JLabel qualificationLabel = new JLabel("Qualification: ");;
        qualificationField = new JTextField(20);
        JLabel appointedByLabel = new JLabel("Appointed by: ");
        appointedByField = new JTextField(20);
        JLabel salaryLabel = new JLabel("Salary: ");
        salaryField = new JTextField(20);
        JLabel weeklyFractionalHoursLabel = new JLabel("Weekly fractional hours: ");
        weeklyFractionalHoursField = new JTextField(20);
        
        JLabel jobTypeLabel = new JLabel("Job type: ", JLabel.RIGHT);
        permanent = new JRadioButton("Permanent"); 
        contract = new JRadioButton("Contract"); 
        temporary = new JRadioButton("Temporary"); 
        permanent.setOpaque(false);
        contract.setOpaque(false);
        temporary.setOpaque(false);
        
        group1 = new ButtonGroup();
        group1.add(permanent);
        group1.add(contract);
        group1.add(temporary);
        
        JLabel joinedLabel = new JLabel("Joined:   ", JLabel.RIGHT);
        joinedOption = new JRadioButton(); 
        joinedOption.setOpaque(false); 
         
        group = new ButtonGroup();
        group.add(joinedOption);
        
        JPanel fieldsAndLabelsPanel = new JPanel();
        fieldsAndLabelsPanel.setLayout(new GridLayout(0,2));
        fieldsAndLabelsPanel.setOpaque(false);
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.setOpaque(false);

        addFTButton = new JButton("Submit Register");
        addFTButton.addActionListener(this);
        clearFullButton = new JButton("Clear");
        clearFullButton.addActionListener(this);
        returnFromFullTimeButton = new JButton("Return");
        returnFromFullTimeButton.addActionListener(this);

        fieldsAndLabelsPanel.add(staffNameLabel);
        fieldsAndLabelsPanel.add(staffNameField);
        fieldsAndLabelsPanel.add(vacancyNumberLabel);
        fieldsAndLabelsPanel.add(vacancyNumberField);
        fieldsAndLabelsPanel.add(designationTypeLabel);
        fieldsAndLabelsPanel.add(designationTypeField);
        fieldsAndLabelsPanel.add(joiningDateLabel);
        fieldsAndLabelsPanel.add(joiningDateField);
        fieldsAndLabelsPanel.add(qualificationLabel);
        fieldsAndLabelsPanel.add(qualificationField);
        fieldsAndLabelsPanel.add(appointedByLabel);
        fieldsAndLabelsPanel.add(appointedByField);
        fieldsAndLabelsPanel.add(salaryLabel);
        fieldsAndLabelsPanel.add(salaryField);
        fieldsAndLabelsPanel.add(weeklyFractionalHoursLabel);
        fieldsAndLabelsPanel.add(weeklyFractionalHoursField);
        fieldsAndLabelsPanel.add(jobTypeLabel);
        fieldsAndLabelsPanel.add(permanent);
        fieldsAndLabelsPanel.add(contract);
        fieldsAndLabelsPanel.add(temporary);
        fieldsAndLabelsPanel.add(joinedLabel);
        fieldsAndLabelsPanel.add(joinedOption);
        
        JPanel jobTypePanel = new JPanel();
        jobTypePanel.setLayout(new FlowLayout());
        jobTypePanel.setOpaque(false);
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        southPanel.setOpaque(false);
        
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout (new FlowLayout());
        eastPanel.setOpaque(false);
        
        JPanel westPanel = new JPanel();
        westPanel.setLayout (new FlowLayout());
        westPanel.setOpaque(false);
        
        jobTypePanel.add(jobTypeLabel);
        jobTypePanel.add(permanent);
        jobTypePanel.add(contract);
        jobTypePanel.add(temporary);
        
        buttonsPanel.add(addFTButton);
        buttonsPanel.add(clearFullButton);
        buttonsPanel.add(returnFromFullTimeButton);
        
        southPanel.add(jobTypePanel, BorderLayout.NORTH);
        southPanel.add(buttonsPanel, BorderLayout.SOUTH);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setOpaque(false);
        contentPanel.add(titleLabel, BorderLayout.NORTH);
        contentPanel.add(fieldsAndLabelsPanel, BorderLayout.CENTER);
        contentPanel.add(eastPanel, BorderLayout.EAST);
        contentPanel.add(westPanel, BorderLayout.WEST);
        contentPanel.add(southPanel, BorderLayout.SOUTH);
    
        backgroundLabel.add(contentPanel, BorderLayout.CENTER);

        fullTimeFrame.setLocationRelativeTo(null);
        fullTimeFrame.setVisible(true);
    }

    public void partTimeEmployee()
    {
        // Initialize GUI interface
        partTimeFrame = new JFrame("Register Part-Time Employee");
        partTimeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        partTimeFrame.setSize(800,600);
        partTimeFrame.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        Image image = icon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setLayout(new BorderLayout());
        partTimeFrame.setContentPane(backgroundLabel);
        
        JLabel titleLabel = new JLabel("Employee Details");
        titleLabel.setFont(new Font("Lato", Font.PLAIN, 16));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
        
        JLabel staffNameLabel = new JLabel("Full name: ");
        staffNameField = new JTextField(20);
        JLabel vacancyNumberLabel = new JLabel("Vacancy number: ");
        vacancyNumberField = new JTextField(20);  
        JLabel designationTypeLabel = new JLabel("Designation: ");
        designationTypeField = new JTextField(20);
        JLabel joiningDateLabel = new JLabel("Joining date: ");
        joiningDateField = new JTextField(20);
        JLabel qualificationLabel = new JLabel("Qualification: ");
        qualificationField = new JTextField(20);
        JLabel appointedByLabel = new JLabel("Appointed by: ");
        appointedByField = new JTextField(20);     
        JLabel workingHoursLabel = new JLabel("Daily working hours: ");
        workingHoursField = new JTextField(20);
        JLabel wagesPerHourLabel = new JLabel("Wages per hour: ");
        wagesPerHourField = new JTextField(20);
        
        JLabel joinedLabel = new JLabel("Joined:   ", JLabel.RIGHT);
        joinedOption = new JRadioButton();
        
        JLabel shiftsLabel = new JLabel("Shifts: ");
        morningOption = new JRadioButton("Morning");
        dayOption = new JRadioButton("Day");
        eveningOption = new JRadioButton("Evening");
        
        JLabel jobTypeLabel = new JLabel("Job type: ", JLabel.RIGHT);
        permanent = new JRadioButton("Permanent"); 
        contract = new JRadioButton("Contract"); 
        temporary = new JRadioButton("Temporary"); 
        
        joinedOption.setOpaque(false);
        morningOption.setOpaque(false);
        dayOption.setOpaque(false);
        eveningOption.setOpaque(false);
        permanent.setOpaque(false);
        contract.setOpaque(false);
        temporary.setOpaque(false);
        
        group = new ButtonGroup();
        group.add(morningOption);
        group.add(dayOption);
        group.add(eveningOption);

        group1 = new ButtonGroup();
        group1.add(joinedOption);

        group2 = new ButtonGroup();
        group2.add(permanent);
        group2.add(contract);
        group2.add(temporary);
        
        addPTButton = new JButton("Submit Register");
        addPTButton.addActionListener(this);
        clearPartButton = new JButton("Clear");
        clearPartButton.addActionListener(this);
        returnFromPartTimeButton = new JButton("Return");
        returnFromPartTimeButton.addActionListener(this);

        JPanel fieldsAndLabelsPanel = new JPanel();
        fieldsAndLabelsPanel.setLayout(new GridLayout(0,2));
        fieldsAndLabelsPanel.setOpaque(false);
        
        JPanel jobTypePanel = new JPanel();
        jobTypePanel.setLayout(new FlowLayout());
        jobTypePanel.setOpaque(false);
        
        JPanel shiftsPanel = new JPanel();
        shiftsPanel.setLayout(new FlowLayout());
        shiftsPanel.setOpaque(false);
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.setOpaque(false);
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        southPanel.setOpaque(false);
        
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new FlowLayout());
        eastPanel.setOpaque(false);
        
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new FlowLayout());
        westPanel.setOpaque(false);

        fieldsAndLabelsPanel.add(staffNameLabel);
        fieldsAndLabelsPanel.add(staffNameField);
        fieldsAndLabelsPanel.add(vacancyNumberLabel);
        fieldsAndLabelsPanel.add(vacancyNumberField);
        fieldsAndLabelsPanel.add(designationTypeLabel);
        fieldsAndLabelsPanel.add(designationTypeField);
        fieldsAndLabelsPanel.add(joiningDateLabel);
        fieldsAndLabelsPanel.add(joiningDateField);
        fieldsAndLabelsPanel.add(qualificationLabel);
        fieldsAndLabelsPanel.add(qualificationField);
        fieldsAndLabelsPanel.add(appointedByLabel);
        fieldsAndLabelsPanel.add(appointedByField);
        fieldsAndLabelsPanel.add(workingHoursLabel);
        fieldsAndLabelsPanel.add(workingHoursField);
        fieldsAndLabelsPanel.add(wagesPerHourLabel);
        fieldsAndLabelsPanel.add(wagesPerHourField);
        fieldsAndLabelsPanel.add(joinedLabel);
        fieldsAndLabelsPanel.add(joinedOption);
        
        jobTypePanel.add(jobTypeLabel);
        jobTypePanel.add(permanent);
        jobTypePanel.add(contract);
        jobTypePanel.add(temporary);

        shiftsPanel.add(shiftsLabel);
        shiftsPanel.add(morningOption);
        shiftsPanel.add(dayOption);
        shiftsPanel.add(eveningOption);

        buttonsPanel.add(addPTButton);
        buttonsPanel.add(clearPartButton);
        buttonsPanel.add(returnFromPartTimeButton);
        
        southPanel.add(jobTypePanel, BorderLayout.NORTH);
        southPanel.add(shiftsPanel, BorderLayout.CENTER);
        southPanel.add(buttonsPanel, BorderLayout.SOUTH);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setOpaque(false);
        
        contentPanel.add(titleLabel, BorderLayout.NORTH);
        contentPanel.add(fieldsAndLabelsPanel, BorderLayout.CENTER);
        contentPanel.add(eastPanel, BorderLayout.EAST);
        contentPanel.add(westPanel, BorderLayout.WEST);
        contentPanel.add(southPanel, BorderLayout.SOUTH);
    
        backgroundLabel.add(contentPanel, BorderLayout.CENTER);

        partTimeFrame.setLocationRelativeTo(null);
        partTimeFrame.setVisible(true);
    }

    public void displayEmployees()
    {
        displayEmployeesFrame = new JFrame("Check Employees");
        displayEmployeesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        displayEmployeesFrame.setSize(800,600);
        displayEmployeesFrame.setLayout(new BorderLayout());
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        Image image = icon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setLayout(new BorderLayout());
        displayEmployeesFrame.setContentPane(backgroundLabel);

        Font font = new Font("Lato", Font.PLAIN, 14);

        returnFromDisplayButton = new JButton("Return");
        returnFromDisplayButton.addActionListener(this);

        displayButton = new JButton("Display");
        displayButton.addActionListener(this);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(displayButton);
        buttonsPanel.add(returnFromDisplayButton);
        buttonsPanel.setOpaque(false);

        JLabel employeeDisplayLabel = new JLabel("Please insert a display number: ");
        employeeDisplayField = new JTextField(20);
        employeeDisplayLabel.setFont(font);
        employeeDisplayLabel.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 0));

        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout());
        displayPanel.add(employeeDisplayLabel);
        displayPanel.add(employeeDisplayField);
        displayPanel.setOpaque(false);


        setSalaryButton = new JButton("Update salary");
        setSalaryButton.addActionListener(this);
        setSalaryButton.setVisible(false);     

        setShiftsButton = new JButton("Update shifts");
        setShiftsButton.addActionListener(this);
        setShiftsButton.setVisible(false);

        terminateButton = new JButton("End enrollment");
        terminateButton.addActionListener(this);
        terminateButton.setVisible(false);

        JPanel fullTimeOptionsPanel = new JPanel();
        fullTimeOptionsPanel.setLayout(new FlowLayout());
        fullTimeOptionsPanel.add(setSalaryButton);
        fullTimeOptionsPanel.setOpaque(false);
        
        JPanel partTimeOptionsPanel = new JPanel();
        partTimeOptionsPanel.setLayout(new FlowLayout());
        partTimeOptionsPanel.add(setShiftsButton);
        partTimeOptionsPanel.add(terminateButton);
        partTimeOptionsPanel.setOpaque(false);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        southPanel.add(fullTimeOptionsPanel, BorderLayout.CENTER);
        southPanel.add(partTimeOptionsPanel, BorderLayout.SOUTH);
        southPanel.setOpaque(false);

        displayArea = new JTextArea(10, 30); 
        displayArea.setEditable(false);
        displayArea.setMargin(new Insets(15, 15, 15, 15));
        displayArea.setBackground(new Color(238, 238, 238));
        displayArea.setFont(font);
        displayArea.setOpaque(false);

        JPanel displayAreaPanel = new JPanel();
        displayAreaPanel.setLayout(new BorderLayout());
        displayAreaPanel.add(displayArea,BorderLayout.CENTER);
        displayAreaPanel.add(southPanel,BorderLayout.SOUTH);
        displayAreaPanel.setOpaque(false);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setOpaque(false);
        
        contentPanel.add(displayPanel, BorderLayout.NORTH);
        contentPanel.add(buttonsPanel, BorderLayout.SOUTH);
        contentPanel.add(displayAreaPanel, BorderLayout.CENTER);
    
        backgroundLabel.add(contentPanel, BorderLayout.CENTER);

        displayEmployeesFrame.setLocationRelativeTo(null);
        displayEmployeesFrame.setVisible(true);
    }

    public void newSalaryScreen()
    {
        salaryFrame = new JFrame("Update Salary");
        salaryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        salaryFrame.setSize(400,300);
        salaryFrame.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg"));
        Image image = icon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setLayout(new BorderLayout());
        salaryFrame.setContentPane(backgroundLabel);
        
        JLabel salaryInfoLabel = new JLabel ("Please, insert the new salary below", JLabel.CENTER);
        JLabel infoMessageLabel = new JLabel("press 'Display' again to refresh the page", JLabel.CENTER);

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        northPanel.add(salaryInfoLabel, BorderLayout.CENTER);
        northPanel.add(infoMessageLabel, BorderLayout.SOUTH);
        northPanel.setOpaque(false);

        confirmSalaryButton = new JButton("Confirm Salary");
        confirmSalaryButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(confirmSalaryButton);
        buttonPanel.setOpaque(false);

        JLabel newSalaryLabel = new JLabel ("New salary: ");
        newSalaryField = new JTextField(20);

        JPanel salaryPanel = new JPanel();
        salaryPanel.setLayout(new GridBagLayout());
        salaryPanel.setOpaque(false);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        salaryPanel.add(newSalaryLabel,c);
        c.gridy = 1;
        salaryPanel.add(newSalaryField,c); 

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setOpaque(false);
    
        contentPanel.add(northPanel, BorderLayout.NORTH);
        contentPanel.add(salaryPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        backgroundLabel.add(contentPanel, BorderLayout.CENTER);
        
        salaryFrame.setLocationRelativeTo(null);
        salaryFrame.setVisible(true);
    }

    public void setShiftsScreen(){
        shiftsFrame = new JFrame("Update Salary");
        shiftsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        shiftsFrame.setSize(400,300);
        shiftsFrame.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg.jpg")); 
        Image image = icon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setLayout(new BorderLayout());
        shiftsFrame.setContentPane(backgroundLabel);
        
        JLabel shiftsMessage = new JLabel("Please, select new shifts below", JLabel.CENTER);
        JLabel infoMessage = new JLabel("press 'Display' again to refresh the page", JLabel.CENTER);

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        northPanel.add(shiftsMessage, BorderLayout.CENTER);
        northPanel.add(infoMessage, BorderLayout.SOUTH);
        northPanel.setOpaque(false);

        JLabel shiftsLabel = new JLabel("Shifts: ");
        morningOption = new JRadioButton("Morning");
        dayOption = new JRadioButton("Day");
        eveningOption = new JRadioButton("Evening");
        morningOption.setOpaque(false);
        dayOption.setOpaque(false);
        eveningOption.setOpaque(false);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.add(morningOption);
        centerPanel.add(dayOption);
        centerPanel.add(eveningOption);
        centerPanel.setOpaque(false);

        group = new ButtonGroup();
        group.add(morningOption);
        group.add(dayOption);
        group.add(eveningOption);

        confirmShiftsButton = new JButton("Confirm Shifts");
        confirmShiftsButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(confirmShiftsButton);
        buttonPanel.setOpaque(false);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setOpaque(false);
        
        contentPanel.add(northPanel, BorderLayout.NORTH);
        contentPanel.add(centerPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);    

        backgroundLabel.add(contentPanel, BorderLayout.CENTER);

        shiftsFrame.setLocationRelativeTo(null);
        shiftsFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {   
        if (e.getSource() == nextPageButton){
            mainScreen();
            frame.dispose();
        }

        if(e.getSource() == fullTimeButton){
            fullTimeEmployee();
            mainScreenFrame.dispose();
        } else if (e.getSource() == partTimeButton){
            partTimeEmployee();
            mainScreenFrame.dispose();
        } else if (e.getSource() == displayEmployeesButton){
            displayEmployees();
            mainScreenFrame.dispose();
        }

        if(e.getSource() == addFTButton){   
            String designationType = designationTypeField.getText();
            String staffName = staffNameField.getText();
            String joiningDate = joiningDateField.getText();
            String qualification = qualificationField.getText();
            String appointedBy = appointedByField.getText();

            boolean joined = false;

            //checking which option from radio button was selected and attributing true or false value to it
            if (joinedOption.isSelected()){
                joined = true;
            }
            
            String jobType = "";
            if(permanent.isSelected()){
                jobType = "Permanent";
            } else if (contract.isSelected()){
                jobType = "Contract";
            } else {
                jobType = "Temporary";
            }

            int vacancyNumber = 0;
            double salary = 0.0;
            int weeklyFractionalHours = 0;

            try {
                vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                salary = Double.parseDouble(salaryField.getText());
                weeklyFractionalHours = Integer.parseInt(weeklyFractionalHoursField.getText());

                StaffHire full = new FullTimeStaffHire(vacancyNumber, designationType, jobType, staffName, 
                joiningDate, qualification, appointedBy, joined, salary, weeklyFractionalHours);
                database.add(full);

                // JOptionPane parameters: (relative to, "message", "title", type) 
                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit?", 
                "Submit register?", 
                JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION){
                    JOptionPane.showMessageDialog(null, "Employee registered successfully!", 
                    "Confirmation", 
                    JOptionPane.INFORMATION_MESSAGE);
                }        
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid values entered for either:\n- Vacancy number\n- Salary\n- Weekly hours \nPlease insert numbers only.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }

        } else if(e.getSource() == clearFullButton){
            vacancyNumberField.setText("");
            designationTypeField.setText("");
            staffNameField.setText("");
            joiningDateField.setText("");
            qualificationField.setText("");
            appointedByField.setText("");
            salaryField.setText("");
            weeklyFractionalHoursField.setText("");
            group.clearSelection();
            group1.clearSelection();
        }

        if (e.getSource() == addPTButton){

            String designationType = designationTypeField.getText();
            String staffName = staffNameField.getText();
            String joiningDate = joiningDateField.getText();
            String qualification = qualificationField.getText();
            String appointedBy = appointedByField.getText();

            boolean joined = false;

            //checking which option from radio button was selected and attributing true or false value to it
            if (joinedOption.isSelected()){
                joined = true;
            }
            
            String jobType = "";
            if(permanent.isSelected()){
                jobType = "Permanent";
            } else if (contract.isSelected()){
                jobType = "Contract";
            } else {
                jobType = "Temporary";
            }

            String shifts = "";
            if(morningOption.isSelected()){
                shifts = "morning";
            } else if (dayOption.isSelected()){
                shifts = "day";
            } else {
                shifts = "evening";
            }

            int vacancyNumber = 0;
            double wagesPerHour = 0.0;
            double workingHours = 0;

            try {
                vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                wagesPerHour = Double.parseDouble(wagesPerHourField.getText());
                workingHours = Double.parseDouble(workingHoursField.getText());

                StaffHire part = new PartTimeStaffHire(vacancyNumber, designationType, jobType, staffName, 
                joiningDate, qualification, appointedBy, joined, workingHours, wagesPerHour, shifts);
                database.add(part);

                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit?", 
                "Submit register?", 
                JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION){
                    JOptionPane.showMessageDialog(null, "Employee registered successfully!", 
                    "Confirmation", 
                    JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid values entered for either:\n- Vacancy number\n- Wages per hour\n- Working hours \nPlease insert numbers only.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }

        } else if(e.getSource() == clearPartButton)
        {
            vacancyNumberField.setText("");
            designationTypeField.setText("");
            staffNameField.setText("");
            joiningDateField.setText("");
            qualificationField.setText("");
            appointedByField.setText("");
            workingHoursField.setText("");
            wagesPerHourField.setText("");
            group.clearSelection();
            group1.clearSelection();
            group2.clearSelection();
        }     

        if(e.getSource() == returnFromFullTimeButton){
            mainScreen();
            if (fullTimeFrame != null) {
                fullTimeFrame.dispose();
            }
        } else if (e.getSource() == returnFromPartTimeButton){
            mainScreen();
            if (partTimeFrame != null) {
                partTimeFrame.dispose();
            }
        } else if(e.getSource() == returnFromDisplayButton){
            mainScreen();
            if (displayEmployeesFrame != null) {
                displayEmployeesFrame.dispose();
            }
        } 

        if (e.getSource() == displayButton)
        {
            try{
                int employeeNumber = Integer.parseInt(employeeDisplayField.getText());
                if (database == null || database.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No employee records found in the system.", 
                    "Empty Database", 
                    JOptionPane.WARNING_MESSAGE);
                } else if (employeeNumber < 0 || employeeNumber >= database.size()){
                    JOptionPane.showMessageDialog(null, "The number you entered was not found.\nPlease insert a number between 0 and " + (database.size() -1), 
                    "Error", 
                    JOptionPane.WARNING_MESSAGE);
                } else {
                    StaffHire employee = database.get(employeeNumber);
                    String employeeInfo = "";
                    if (employee instanceof FullTimeStaffHire) {
                        FullTimeStaffHire fullTimeEmployee = (FullTimeStaffHire) employee; //casting
                        employeeInfo = fullTimeEmployee.displayInfo();
                        setSalaryButton.setVisible(true);
                        setShiftsButton.setVisible(false);
                        terminateButton.setVisible(false);
                    } else if (employee instanceof PartTimeStaffHire) {
                        PartTimeStaffHire partTimeEmployee = (PartTimeStaffHire) employee;
                        employeeInfo = partTimeEmployee.displayInfo(); 
                        setShiftsButton.setVisible(true);
                        terminateButton.setVisible(true);
                        setSalaryButton.setVisible(false);
                    }            
                    displayArea.setText(employeeInfo);
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please, insert only integers.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        } else if(e.getSource() ==  setSalaryButton){
            newSalaryScreen();
        } else if(e.getSource() == confirmSalaryButton){
            try{
                double newSalary = Double.parseDouble(newSalaryField.getText());
                int employeeNumber = Integer.parseInt(employeeDisplayField.getText());
                if (employeeNumber >= 0 && employeeNumber < database.size()) {
                    StaffHire employee = database.get(employeeNumber);
                    if (employee instanceof FullTimeStaffHire) {
                        FullTimeStaffHire fullTimeEmployee = (FullTimeStaffHire) employee;
                        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to confirm?", 
                        "Confirm salary?", 
                        JOptionPane.OK_CANCEL_OPTION);
                        if (option == JOptionPane.OK_OPTION) {
                            fullTimeEmployee.setNewSalary(newSalary);
                            JOptionPane.showMessageDialog(null, "New salary updated successfully!", 
                            "Confirmation", 
                            JOptionPane.INFORMATION_MESSAGE);
                            salaryFrame.dispose();
                        }
                    }
                } 
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid salary value. Please, enter numbers only.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == setShiftsButton){
            setShiftsScreen();
        } else if (e.getSource() == confirmShiftsButton){
            int employeeNumber = Integer.parseInt(employeeDisplayField.getText());
            String shifts = "";
            if(morningOption.isSelected()){
                shifts = "morning";
            } else if (dayOption.isSelected()){
                shifts = "day";
            } else {
                shifts = "evening";
            }

            if (employeeNumber >= 0 && employeeNumber < database.size()) {
                StaffHire employee = database.get(employeeNumber);
                if (employee instanceof PartTimeStaffHire) {
                    PartTimeStaffHire partTimeEmployee = (PartTimeStaffHire) employee;
                    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to change shifts?", 
                    "Change shifts?", 
                    JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        partTimeEmployee.setWorkingShifts(shifts);
                        JOptionPane.showMessageDialog(null, "Shifts changed successfully!", 
                        "Confirmation", 
                        JOptionPane.INFORMATION_MESSAGE);
                        shiftsFrame.dispose();
                    }
                }
            } 
        }

        if (e.getSource() == terminateButton) {
            int employeeNumber = Integer.parseInt(employeeDisplayField.getText());
            if (employeeNumber >= 0 && employeeNumber < database.size()) {
                StaffHire employee = database.get(employeeNumber);
                if (employee instanceof PartTimeStaffHire) {
                    PartTimeStaffHire partTimeEmployee = (PartTimeStaffHire) employee;
                    if(partTimeEmployee.getTerminated() == false){
                        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to end this enrollment?", 
                        "End enrollment?", 
                        JOptionPane.OK_CANCEL_OPTION);
                        if (option == JOptionPane.OK_OPTION) {
                            partTimeEmployee.terminateStaff();
                            JOptionPane.showMessageDialog(null, "Enrollment ended successfully!", 
                            "Confirmation", 
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "This employee's enrollment has been already terminated.", 
                        "Information", 
                        JOptionPane.INFORMATION_MESSAGE);    
                    }
                }
            } 
        }
    }

    public static void main(String[] args){
        GUI gui = new GUI();
    } 
}
