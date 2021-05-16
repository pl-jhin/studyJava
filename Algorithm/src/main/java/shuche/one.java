package shuche;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class one {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String data1 = in.nextLine();
        Date data = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm;ss");
        System.out.println(dataFormat.parse(data1));
    }
}
