# Java Calculator Documentation

## Introduction

This graphical calculator application developed using Java and Swing. This documentation offers an in-depth analysis of the code, focusing on the more intricate aspects of its architecture, the purpose of its components, and the complex logic that drives its functionality.
![Screenshot 2023-11-24 125833(1)](https://github.com/mykhaylo-zhovkevych/Calculator/assets/148889468/65ef53d8-a886-4982-a3cf-d2ce1ff92f06)


## Code Structure

The code is encapsulated within the `calculatorJava` class, which implements the ActionListener interface to handle user interactions. The structure of the code is well-organized, promoting clarity and maintainability. It creates a graphical user interface for a functional calculator, featuring buttons for numbers, arithmetic operators, and a display area for user input and results.

## Components

- `JFrame frame`: This is the primary application window, housing all other GUI components. It's meticulously configured to define the appearance and behavior of the calculator.

- `JTextField textfield`: The textfield is the heart of the calculator, serving as a display area for user input and results. It's customized to maintain a consistent look and prevent direct user modification.

- `JButton[] numberButtons`: An array of numeric buttons (0-9) allows users to input numbers with ease. These buttons are meticulously arranged for intuitive use.

- `JButton[] functionsButton`: Another array of buttons is designated for functions such as addition, subtraction, multiplication, division, decimal input, and advanced features.

- Individual `JButton` instances are used for functions like clearing the display, deleting characters, and changing the sign of a number, enhancing user experience.

- `Font myFont`: The custom font applied to text ensures an aesthetically pleasing and consistent presentation.

- Various variables are employed for storing temporary values and managing the calculator's state.

## Initialization

During initialization, the code performs meticulous configuration and setup:

- The main `JFrame` is meticulously designed with properties like its title, dimensions, and closing behavior, ensuring a polished user experience.

- The textfield, which serves as the user's primary interaction point, is meticulously tailored for proper display and to prevent unintended user input.

- Buttons for arithmetic operations, numeric input, and advanced functionality are generated and customized with the custom font, providing a cohesive look and feel to the interface.

## Event Handling

The calculator's functionality hinges on its event handling mechanisms. The ActionListener interface is expertly implemented to capture and respond to user interactions, both common and advanced:

- Number Buttons: The code adeptly appends the value of each number button to the textfield, enabling users to input numbers with precision.

- Arithmetic Operator Buttons: When an operator button (e.g., +, -, *, /) is clicked, the code stores the first number entered and the selected operator, meticulously preparing for subsequent calculations.

- Equals Button: The equals button acts as the catalyst for complex calculations. It orchestrates the extraction of the second number entered, performs the operation based on the selected operator, and displays the result with precision. Operator precedence is scrupulously maintained for accurate calculations.

- Clear and Delete Buttons: These buttons offer advanced interaction options, allowing users to start fresh or make surgical edits. The clear button erases the entire input for a clean slate, while the delete button assists in character-level adjustments.

- Negation Button: The negation button is a valuable addition, offering a nuanced feature that toggles the sign of a number. This functionality enhances the calculator's versatility for handling positive and negative values.

## Operations

The calculator flawlessly supports four fundamental arithmetic operations:

- Addition (+): Meticulously captures the first number and the addition operator, creating a foundation for precise calculations.

- Subtraction (-): Operates with precision by storing the first number and the subtraction operator for subsequent user input.

- Multiplication (*): Efficiently handles multiplication by capturing the first number and the multiplication operator, awaiting the second number for accurate results.

- Division (/): Executes division with utmost care, meticulously capturing the first number and the division operator. It guards against division by zero, a critical mathematical consideration.

## Usage

To harness the Java Calculator, download from the bin folder the exe file or jav if you have java installed.

## Conclusion

The Java Calculator is a simplified application that leverages the capabilities of Java and the Swing library to create a polished graphical user interface. This documentation has ventured deep into the intricacies of the code, unveiling its well-structured architecture, the nuanced roles of its components.
