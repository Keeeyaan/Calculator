package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Kean
 */
public class CalculatorController implements Initializable {

    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button mul;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button min;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button add;
    @FXML
    private Button negate;
    @FXML
    private Button equal;
    @FXML
    private Button ce;
    @FXML
    private Button c;
    @FXML
    private Button x;
    @FXML
    private Button div;
    @FXML
    private Button zero;
    @FXML
    private Button dot;
    @FXML
    private TextField displayResult;
    @FXML
    private TextField focused;

    double input1, input2, result;
    int op, point = 0;
    boolean checker = false, finalChecker = false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        displayResult.setText("0");
    }

    @FXML
    private void calculation(ActionEvent event) {

        /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
        if (finalChecker == true) {
            focused.setText("");
            displayResult.setText("0");
        }

        if (event.getTarget() == zero) {
            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("0");
            } else {
                displayResult.appendText("0");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == one) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("1");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("1");
            } else {
                displayResult.appendText("1");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == two) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("2");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("2");
            } else {
                displayResult.appendText("2");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == three) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("3");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("3");
            } else {
                displayResult.appendText("3");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == four) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("4");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("4");
            } else {
                displayResult.appendText("4");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == five) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("5");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("5");
            } else {
                displayResult.appendText("5");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == six) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("6");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("6");

            } else {
                displayResult.appendText("6");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == seven) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("7");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("7");
            } else {
                displayResult.appendText("7");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == eight) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("8");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("8");
            } else {
                displayResult.appendText("8");
            }

            checker = false;
            finalChecker = false;
        } else if (event.getTarget() == nine) {

            /*CHECK IF IT HAS RESULT AND THEN CLEAR THE UPPER TEXT*/
            if (finalChecker == true) {
                focused.setText("");
                displayResult.setText("9");
            }

            if (displayResult.getText().equals("0") || checker == true) {
                displayResult.setText("9");
            } else {
                displayResult.appendText("9");
            }
            checker = false;
            finalChecker = false;

        } else if (event.getTarget() == dot && point == 0) {
            displayResult.appendText(".");
            point = 1;

        } else if (event.getTarget() == ce) {
            if (finalChecker != true) {
                displayResult.setText("0");
            } else {
                focused.setText("");
                displayResult.setText("0");
                point = 0;
                op = 0;
                result = 0;
            }

            finalChecker = false;
        } else if (event.getTarget() == c) {
            displayResult.setText("0");
            focused.setText("");
            point = 0;
            input1 = 0;
            input2 = 0;
            op = 0;
            result = 0;

        } else if (event.getTarget() == x) {
            String[] split = displayResult.getText().split("");
            String[] newCopy = new String[split.length - 1];
            StringBuffer sb = new StringBuffer();

            if (split.length == 1) {
                displayResult.setText("0");
            } else {
                for (int i = 0; i < newCopy.length; i++) {
                    sb.append(newCopy[i] = split[i]);
                }
                displayResult.setText(sb.toString());
            }

            point = 0;
            op = 0;
            result = 0;

        } else if (event.getTarget() == add) {
            if (point == 1) {
                input1 = Double.parseDouble(displayResult.getText());
                focused.setText(displayResult.getText() + " + ");
            } else {
                input1 = Integer.parseInt(displayResult.getText());
                focused.setText(displayResult.getText() + " + ");
            }
            op = 1;
            checker = true;
            point = 0;

        } else if (event.getTarget() == min) {
            if (point == 1) {
                input1 = Double.parseDouble(displayResult.getText());
                focused.setText(displayResult.getText() + " - ");
            } else {
                input1 = Integer.parseInt(displayResult.getText());
                focused.setText(displayResult.getText() + " - ");
            }
            op = 2;
            checker = true;
            point = 0;

        } else if (event.getTarget() == mul) {
            if (point == 1) {
                input1 = Double.parseDouble(displayResult.getText());
                focused.setText(displayResult.getText() + " * ");
            } else {
                input1 = Integer.parseInt(displayResult.getText());
                focused.setText(displayResult.getText() + " * ");
            }
            op = 3;
            checker = true;
            point = 0;

        } else if (event.getTarget() == div) {
            if (point == 1) {
                input1 = Double.parseDouble(displayResult.getText());
                focused.setText(displayResult.getText() + " / ");
            } else {
                input1 = Integer.parseInt(displayResult.getText());
                focused.setText(displayResult.getText() + " / ");
            }
            op = 4;
            checker = true;
            point = 0;

        } else if (event.getTarget() == equal && op > 0) {
            if (point == 1) {
                input2 = Double.parseDouble(displayResult.getText());
            } else {
                input2 = Integer.parseInt(displayResult.getText());
            }

            switch (op) {
                case 1:
                    result = input1 + input2;
                    if (point == 0) {
                        int IntValue = (int) Math.floor(result);
                        displayResult.setText(String.valueOf(IntValue));
                        int input2String = (int) Math.floor(input2);
                        focused.appendText(input2String + " = ");
                        checker = true;
                    } else {
                        focused.appendText(input2 + " = ");
                        displayResult.setText(String.valueOf(result));
                    }
                    input1 = 0;
                    input2 = 0;
                    op = 0;
                    point = 0;
                    break;
                case 2:
                    result = input1 - input2;
                    if (point == 0) {
                        int IntValue = (int) Math.floor(result);
                        displayResult.setText(String.valueOf(IntValue));
                        int input2String = (int) Math.floor(input2);
                        focused.appendText(input2String + " = ");
                        checker = true;
                    } else {
                        focused.appendText(input2 + " = ");
                        displayResult.setText(String.valueOf(result));
                    }
                    input1 = 0;
                    input2 = 0;
                    op = 0;
                    point = 0;
                    break;
                case 3:
                    result = input1 * input2;
                    if (point == 0) {
                        int IntValue = (int) Math.floor(result);
                        displayResult.setText(String.valueOf(IntValue));
                        int input2String = (int) Math.floor(input2);
                        focused.appendText(input2String + " = ");
                        checker = true;
                    } else {
                        focused.appendText(input2 + " = ");
                        displayResult.setText(String.valueOf(result));
                    }
                    input1 = 0;
                    input2 = 0;
                    op = 0;
                    point = 0;
                    break;
                case 4:
                    result = input1 / input2;
                    if (point == 0) {
                        int IntValue = (int) Math.floor(result);
                        displayResult.setText(String.valueOf(IntValue));
                        int input2String = (int) Math.floor(input2);
                        focused.appendText(input2String + " = ");
                        checker = true;
                    } else {
                        focused.appendText(input2 + " = ");
                        displayResult.setText(String.valueOf(result));
                    }
                    input1 = 0;
                    input2 = 0;
                    op = 0;
                    point = 0;
                    break;
            }

            finalChecker = true;
        }
    }
}
