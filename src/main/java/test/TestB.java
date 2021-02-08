package test;

import javafx.beans.binding.StringBinding;

public class TestB {
    public static void main(String[] args) {

        String[] bizNos = {};
//                {"KDJJH700002101220016","KDJJH700002101220015","KDJJH700002101220013","KDJJH700002101220010","KDJJH700002101220008","KDJJH700002101250016","KDJJH700002101280019","KDJJH700002102010055","KDJJH900002102010051","PPJH700002101120317","PBJH700002101270083","KDJJH700002101140024"};
        for (String outerNo : bizNos) {

            StringBuilder sb =new StringBuilder(10000);
            sb.append("select * from `soms_biz_pk_");
            sb.append(Math.abs(outerNo.hashCode()) % (128 * 16) / 128);
            sb.append("`.`biz_outer_");
            sb.append(Math.abs(outerNo.hashCode()) % 128);
            sb.append("` where outer_no ='").append(outerNo).append("';");
            System.out.println(sb);
        }

    }
}
