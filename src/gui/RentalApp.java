package gui;

import javax.swing.*;
import model.Vehicle;
import service.VehicleService;

public class RentalApp extends JFrame {
    //GUI components
    private JPanel panel;
    private JComboBox<String> vehicleDropdown;
    private JTextField daysTextField;
    private JButton calcButton;

    public RentalApp() {
        setTitle("Vehicle Rental");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        // Dropdown menu for selecting vehicle type
        vehicleDropdown = new JComboBox<>(new String[]{"Car", "Bike", "Truck", "InsuredCar"});
        //user input for days of rent
        daysTextField = new JTextField(10);
        // Button to see the calculation
        calcButton = new JButton("Calculate");

        //adding the buttons/menu
        panel.add(new JLabel("Vehicle:"));
        panel.add(vehicleDropdown);
        panel.add(new JLabel("Days:"));
        panel.add(daysTextField);
        panel.add(calcButton);

        add(panel);

        calcButton.addActionListener(e -> {
            try {
                // takes the vehicle user selection
                String type = (String) vehicleDropdown.getSelectedItem();
                int days = Integer.parseInt(daysTextField.getText());
                Vehicle vehicle = VehicleService.getVehicle(type);

                // Calculate total rental cost
                double cost = vehicle.calculateRent(days);
                // Display result
                JOptionPane.showMessageDialog(this, "Total Cost: $" + cost);
            } catch (NumberFormatException ex) {
                //Error handle for invalid input
                JOptionPane.showMessageDialog(this, "Enter valid number");
            }
        });

        setVisible(true);
    }
    /**
     * @param type - The vehicle that the user selects from the dropdown menu
     * @return - Will display how much they need to pay for rent depends how much days, or an error if invalid input
     */
}
