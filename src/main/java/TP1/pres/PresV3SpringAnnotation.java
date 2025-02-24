package TP1.pres;

import TP1.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresV3SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("TP1.dao","TP1.ext","TP1.metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res="+metier.calcul());
    }
}
