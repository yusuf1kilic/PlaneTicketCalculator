package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Merhaba lütfen alacağınız bilet değerlerin doğru giriniz");

        int km,age,travelOfType;
        double travelFee;
        System.out.print("lütfen gidiceğeniz km değerini yazınız :");
        km= input.nextInt();
        System.out.print("lütfen yaşınızı giriniz :");
        age= input.nextInt();
        System.out.print("lütfen seyhat türünüzü yazınız.(eğer tek yönse 1 çift yönse 2'ye tıklayınız) :");
        travelOfType= input.nextInt();
        travelFee=km*0.10;

        if (km>0 && age>0 && travelOfType==2 || travelOfType==1){
            if (age<12){
                travelFee=travelFee -travelFee*0.5;
            }else if (age>12 && age<24){
                travelFee=travelFee -travelFee*0.1;

            }else if (age>65){
                travelFee=travelFee -travelFee*0.3;
            }if (travelOfType==2){
                travelFee=travelFee-travelFee*0.2;
                travelFee*=2;
            }



        }else{
            System.out.println("hatalı giriş yaptınız");
        }

        System.out.println("İndirimli fiyat :"+travelFee);







    }
}
