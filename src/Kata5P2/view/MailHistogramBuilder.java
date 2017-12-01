package Kata5P2.view;

import java.util.List;
import Kata5P2.model.Histogram;
import Kata5P2.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram();
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
}
