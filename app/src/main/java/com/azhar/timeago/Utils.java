package com.azhar.timeago;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Azhar Rivaldi on 29-05-2023
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class Utils {

    public static String covertTimeAgo(String strDate) {
        String convTime = "";

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            Date pasTime = dateFormat.parse(strDate);

            Date nowTime = new Date();

            long dateDiff = nowTime.getTime() - pasTime.getTime();

            long detik = TimeUnit.MILLISECONDS.toSeconds(dateDiff);
            long menit = TimeUnit.MILLISECONDS.toMinutes(dateDiff);
            long jam = TimeUnit.MILLISECONDS.toHours(dateDiff);
            long hari = TimeUnit.MILLISECONDS.toDays(dateDiff);

            //convert date time
            if (detik < 60) {
                convTime = detik + " detik yang lalu";
            } else if (menit < 60) {
                convTime = menit + " menit yang lalu";
            } else if (jam < 24) {
                convTime = jam + " jam yang lalu";
            } else if (hari >= 7) {
                if (hari > 30) {
                    convTime = (hari / 30) + " bulan lalu";
                } else if (hari > 365) {
                    convTime = (hari / 365) + " tahun lalu";
                } else {
                    convTime = (hari / 7) + " minggu lalu";
                }
            } else if (hari < 7) {
                convTime = hari + " hari yang lalu";
            } else {
                return "Lebih dari sebulan yang lalu";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return convTime;
    }

}
