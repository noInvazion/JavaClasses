package packageone;

import java.util.Arrays;

public class IPAddress {
	static String[] ips = { "..213.123.34.25", "000.12.12.034", "666.666.23.23", ".213.123.23.32", "I.Am.not.an.ip",
			"000.12..12.034", "23.45.12.56" };

	public static void main(String[] args) {
//		System.out.println("Mr Jide said \"Mr Udoka can't help/\\assist himself");
		IPAddress ad = new IPAddress();
		boolean ipnum;
		for (String item : ips) {
			ipnum = ad.checkIP(item);
			System.out.println(item + " : " + ipnum);
		}
	}

	boolean checkIP(String ip) {
		boolean check = true;
		String[] arr = ip.split("\\."); // We are using double backslash because the
//		first backslash is escaping \.,\. is an inbuilt 
		if (arr.length > 4)
			return false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 3 || arr[i].length() == 0)
				return false;
			else if (arr[i].endsWith("."))
				return false;
			else if (arr[i].startsWith("."))
				return false;

			int ipnum = Integer.parseInt(arr[i]);
			if (ipnum < 0 || ipnum > 255)
				return false;
		}

		return check;
	}
}
