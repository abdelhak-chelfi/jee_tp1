package Output;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class dynamicMain {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassname = scanner.nextLine();
        Class cDao = Class.forName(daoClassname);
        IDao dao = (IDao) cDao.newInstance();
        // System.out.print(dao.getDate());
        String meierClassname = scanner.nextLine();
        Class cMetier = Class.forName(meierClassname);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method meth=cMetier.getMethod("setDao",IDao.class);
        meth.invoke(metier,dao);
        System.out.println(metier.calcul(12, 4));
    }
}
