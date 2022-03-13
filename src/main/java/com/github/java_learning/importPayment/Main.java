package com.github.java_learning.importPayment;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        Equipment Collider = new Equipment(1000000);
        Materials Rope = new Materials(80000);


        List<ImportedProduct> myProducts = asList(
                Collider,
                Rope
        );

        for (ImportedProduct myProduct : myProducts) {
            System.out.println("НДС" + " " + myProduct.vatTax());
            System.out.println("Пошлина" + " " + myProduct.customsDuty());
            System.out.println("Транспорт" + " " + myProduct.costOfFreight());
            System.out.print("Сумма расходов за доставку товара ");
            System.out.println(myProduct.vatTax() + myProduct.customsDuty() + myProduct.costOfFreight());
        }
    }
}
