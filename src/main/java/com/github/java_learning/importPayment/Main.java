package com.github.java_learning.importPayment;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        equipment Collider = new equipment(1000000);
        materials Rope = new materials(80000);


        List<importedProduct> myProducts = asList(
                Collider,
                Rope
        );

        for (importedProduct myProduct : myProducts) {
            System.out.println("НДС" + " " + myProduct.VATTax());
            System.out.println("Пошлина" + " " + myProduct.CustomsDuty());
            System.out.println("Транспорт" + " " + myProduct.CostOfFreight());
            System.out.print("Сумма расходов за доставку товара ");
            System.out.println(myProduct.VATTax() + myProduct.CustomsDuty() + myProduct.CostOfFreight());
        }
    }
}
