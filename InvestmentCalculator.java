
//Janani Rajan, 9/8/19
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

@SuppressWarnings("restriction")
public class InvestmentCalculator extends Application {
	public void start(Stage myStage) {
		// Set stage title
		myStage.setTitle("Future Value Calculator");

		// Create/configure a GridPane
		GridPane rootNode = new GridPane();
		rootNode.setAlignment(Pos.CENTER);
		rootNode.setHgap(5);
		rootNode.setVgap(10);
		Scene myScene = new Scene(rootNode, 500, 300);
		myStage.setScene(myScene);

		// Create text labels, text inputs, and buttons
		Label investmentLabel = new Label("Investment Amount:");
		Label yearsLabel = new Label("Number of Years:");
		Label annualInterestLabel = new Label("Annual Interest Rate:");
		Label futureValueLabel = new Label("Future Value:");
		TextField investmentAmt = new TextField();
		TextField numberOfYears = new TextField();
		TextField annualInterestRate = new TextField();
		TextField futureValue = new TextField();
		futureValue.setEditable(false);
		Button calculate = new Button("Calculate");
		Button reset = new Button("Reset");
		Label errorlabel = new Label();

		// Put controls on the GridPane and align appropriately
		rootNode.addColumn(0, investmentLabel, yearsLabel, annualInterestLabel, futureValueLabel, reset, errorlabel);
		rootNode.addColumn(1, investmentAmt, numberOfYears, annualInterestRate, futureValue, calculate);
		GridPane.setColumnSpan(errorlabel, 2);
		GridPane.setHalignment(calculate, HPos.RIGHT);

		// Handle buttons
		class ButtonHandler implements EventHandler<ActionEvent> {
			public void handle(ActionEvent e) {
				if (e.getSource() == calculate) {
					try {
						errorlabel.setText("");
						double p = Double.parseDouble(investmentAmt.getText()); // Initial investment amount
						double n = Double.parseDouble(numberOfYears.getText()); // Number of years
						double i = (Double.parseDouble(annualInterestRate.getText())) / 100; // Annual interest rate
						double fv = p * Math.pow((1 + i / 12), (12 * n)); // Future Value
						futureValue.setText(round(fv));
					} catch (Exception ex) {
						//Handle Exception
						errorlabel.setText("Please type numbers only.");
					}
				} else {
					//Reset code
					numberOfYears.setText("");
					investmentAmt.setText("");
					annualInterestRate.setText("");
					futureValue.setText("");
					errorlabel.setText("");
				}
			}
			
			//Round future value
			public String round(double d) {
				DecimalFormat df = new DecimalFormat("0.00");
				df.setRoundingMode(RoundingMode.HALF_UP);
				return df.format(d);
			}
		}

		// Set buttons on action
		calculate.setOnAction(new ButtonHandler());
		reset.setOnAction(new ButtonHandler());

		// Display stage
		myStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}