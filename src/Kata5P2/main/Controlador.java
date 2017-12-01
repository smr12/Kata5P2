package Kata5P2.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import Kata5P2.model.Histogram;
import Kata5P2.model.Mail;
import Kata5P2.view.HistogramDisplay;
import Kata5P2.view.MailHistogramBuilder;
import Kata5P2.view.MailListReader;

public class Controlador {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        String filename = "C:\\Users\\Entrar\\Desktop\\emails.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
