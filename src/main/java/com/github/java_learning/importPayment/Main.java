package com.github.java_learning.importPayment;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        com.github.java_learning.importPayment.Equipment Collider = new com.github.java_learning.importPayment.Equipment(1000000);
        com.github.java_learning.importPayment.Materials Rope = new com.github.java_learning.importPayment.Materials(80000);


        List<com.github.java_learning.importPayment.ImportedProduct> myProducts = asList(
                Collider,
                Rope
        );

        for (com.github.java_learning.importPayment.ImportedProduct myProduct : myProducts) {
            System.out.println("НДС" + " " + myProduct.vatTax());
            System.out.println("Пошлина" + " " + myProduct.customsDuty());
            System.out.println("Транспорт" + " " + myProduct.costOfFreight());
            System.out.print("Сумма расходов за доставку товара ");
            System.out.println(myProduct.vatTax() + myProduct.customsDuty() + myProduct.costOfFreight());
        }
    }
}
