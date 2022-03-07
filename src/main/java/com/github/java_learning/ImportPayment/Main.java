package com.github.java_learning.ImportPayment;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        Equipment Collider = new Equipment(1000000);
        Materials Rope = new Materials(80000);


        List<Imported_product> myProducts = asList(
                Collider,
                Rope
        );

        for (Imported_product myProduct : myProducts) {
            System.out.println("НДС" + " " + myProduct.VAT_Tax());
            System.out.println("Пошлина" + " " + myProduct.CustomsDuty());
            System.out.println("Транспорт" + " " + myProduct.CostOfFreight());
            System.out.print("Сумма расходов за доставку товара ");
            System.out.println(myProduct.VAT_Tax() + myProduct.CustomsDuty() + myProduct.CostOfFreight());
        }
    }
}
