public class Main {
    public static void main(String[] args) {

        specialPizza p = new specialPizza(false);
       
        p.getBill();
    }
}





// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Main {
//     public static void main(String[] args) {
//         // Create the frame
//         JFrame frame = new JFrame("Pizza Order");
//         frame.setSize(400, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(new GridLayout(6, 1));

//         // Checkbox for pizza type
//         JCheckBox vegCheckbox = new JCheckBox("Vegetarian Pizza");
//         frame.add(vegCheckbox);

//         JCheckBox nonvegCheckbox = new JCheckBox("NonVegetarian Pizza");
//         frame.add(nonvegCheckbox);

//         // Checkbox for extra cheese
//         JCheckBox cheeseCheckbox = new JCheckBox("Add Extra Cheese (+₹100)");
//         frame.add(cheeseCheckbox);

//         // Checkbox for extra toppings
//         JCheckBox toppingsCheckbox = new JCheckBox("Add Extra Toppings (+₹150)");
//         frame.add(toppingsCheckbox);

//         // Checkbox for takeaway
//         JCheckBox takeawayCheckbox = new JCheckBox("Takeaway (+₹30)");
//         frame.add(takeawayCheckbox);

//         // Button to calculate bill
//         JButton calculateButton = new JButton("Calculate Bill");
//         frame.add(calculateButton);

//         // Text area to display the bill
//         JTextArea billTextArea = new JTextArea();
//         billTextArea.setEditable(false);
//         frame.add(new JScrollPane(billTextArea));

//         // Action listener for the "Calculate Bill" button
//         calculateButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 boolean isVeg = vegCheckbox.isSelected();
//                 Pizza pizza = new Pizza(isVeg);

//                 if (cheeseCheckbox.isSelected()) {
//                     pizza.addExtraCheese();
//                 }
//                 if (toppingsCheckbox.isSelected()) {
//                     pizza.addExtraToppings();
//                 }
//                 if (takeawayCheckbox.isSelected()) {
//                     pizza.takeAway();
//                 }

//                 // Display the bill
//                 billTextArea.setText(""); // Clear previous bill
//                 billTextArea.append("Base Pizza Price: ₹" + pizza.getBasePizzaPrice() + "\n");

//                 if (cheeseCheckbox.isSelected()) {
//                     billTextArea.append("Extra Cheese: ₹100\n");
//                 }
//                 if (toppingsCheckbox.isSelected()) {
//                     billTextArea.append("Extra Toppings: ₹150\n");
//                 }
//                 if (takeawayCheckbox.isSelected()) {
//                     billTextArea.append("Takeaway: ₹30\n");
//                 }

//                 billTextArea.append("Total Bill: ₹" + pizza.getPrice() + "\n");
//             }
//         });

//         // Make the frame visible
//         frame.setVisible(true);
//     }
// }
