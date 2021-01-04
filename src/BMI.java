import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
	public static void main(String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter your height and weight: ");
		String text = buf.readLine();
		String[] data = text.split(" ");
		double res = getBMI(data);
		String dia = getDiagnosis(res);
		System.out.println(dia + " BMI: " + res);


	}

	public static double getBMI(String[] data) {
		// calculate the bmi
		double height=Double.parseDouble(data[0])*0.01;
		double weight=Double.parseDouble(data[1]);
		return weight/(height*height);
	}

	public static String getDiagnosis(double bmi) {
		// give comments depending on bmi
		if(bmi>=30){
			return "You're not in shape.Actually,you are not even close.";
		}else if(26<=bmi&&bmi<30) {
			return "To be honest,you're not in shape.";
		}else if(26>bmi&&bmi>=20) {
			return "You're in shape.";
		}else if(20<bmi) {
			return "You're under shape.";
		}
		return "";
	}
}
